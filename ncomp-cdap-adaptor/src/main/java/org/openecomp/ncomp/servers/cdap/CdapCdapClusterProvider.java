
/*-
 * ============LICENSE_START==========================================
 * OPENECOMP - DCAE
 * ===================================================================
 * Copyright (c) 2017 AT&T Intellectual Property. All rights reserved.
 * ===================================================================
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *        http://www.apache.org/licenses/LICENSE-2.0 
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * ============LICENSE_END============================================
 */
	
package org.openecomp.ncomp.servers.cdap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;

import org.openecomp.ncomp.sirius.manager.ISiriusServer;
import org.openecomp.ncomp.sirius.manager.Jetty8Client;
import org.openecomp.ncomp.sirius.manager.ManagementServer;
import org.openecomp.ncomp.sirius.manager.ManagementServerUtils;

import org.apache.log4j.Logger;
import org.eclipse.emf.common.util.EList;
import org.json.JSONArray;
import org.json.JSONObject;

import org.openecomp.ncomp.sirius.manager.BasicAdaptorProvider;
import org.openecomp.ncomp.cdap.CdapApplication;
import org.openecomp.ncomp.cdap.CdapCluster;
import org.openecomp.ncomp.cdap.CdapConfiguration;
import org.openecomp.ncomp.cdap.CdapDataset;
import org.openecomp.ncomp.cdap.CdapNamespace;
import org.openecomp.ncomp.cdap.CdapPackage;
import org.openecomp.ncomp.webservice.utils.FileUtils;

public class CdapCdapClusterProvider extends BasicAdaptorProvider {
	private static final Logger logger = Logger.getLogger(CdapCdapClusterProvider.class);
	CdapCluster o;
	protected Date lastPoll;

	public CdapCdapClusterProvider(ISiriusServer controller, CdapCluster o) {
		super(controller, o);
		this.o = o;
	}

	public void poll() {
//		System.err.println("XXXX poll");
		lastPoll = new Date();
		Jetty8Client c = new Jetty8Client("cdap.properties", "cluster");
		c.setBaseAddress(o.getBaseUrl());
		c.setDebug(true);
		HashMap<String, String> headers = new HashMap<String, String>();
		JSONObject json;
		// namespaces
		json = c.httpJsonTransaction("/namespaces", "GET", headers, null);
//		System.err.println("XXXX res:" + json.toString(2));
		updateNamespaces(json);
		json = c.httpJsonTransaction("/config/cdap", "GET", headers, null);
//		System.err.println("XXXX res:" + json.toString(2));
		updateConfig(json);
		for (CdapNamespace namespace : o.getNamespaces()) {
			String url = "/namespaces/" + namespace.getName() + "/data/datasets";
			json = c.httpJsonTransaction(url, "GET", headers, null);
//			System.err.println("XXXX res:" + json.toString(2));
			updateDatasets(namespace, json);
			url = "/namespaces/" + namespace.getName() + "/apps";
			json = c.httpJsonTransaction(url, "GET", headers, null);
//			System.err.println("XXXX res:" + json.toString(2));
			updateApps(namespace, json);
		}
	}

	private void updateConfig(JSONObject json) {
		JSONArray a = json.getJSONArray("$list");
		o.getConfigurations().clear();
		for (int i = 0; i < a.length(); i++) {
			JSONObject j = a.getJSONObject(i);
			CdapConfiguration configuration = (CdapConfiguration) controller.getServer().json2ecore(
					CdapPackage.eINSTANCE.getCdapConfiguration(), j);
//			System.err.println("XXXX " + ManagementServer.ecore2json(configuration, 100, null, true).toString(2));
			o.getConfigurations().add(configuration);
		}
	}

	private void updateApps(CdapNamespace namespace, JSONObject json) {
		JSONArray a = json.getJSONArray("$list");
		namespace.getApplications().clear();
		for (int i = 0; i < a.length(); i++) {
			JSONObject j = a.getJSONObject(i);
			CdapApplication application = (CdapApplication) controller.getServer().json2ecore(
					CdapPackage.eINSTANCE.getCdapApplication(), j);
//			System.err.println("XXXX " + ManagementServer.ecore2json(application, 100, null, true).toString(2));
			namespace.getApplications().add(application);
		}
	}

	private void updateDatasets(CdapNamespace namespace, JSONObject json) {
		JSONArray a = json.getJSONArray("$list");
		namespace.getDatasets().clear();
		for (int i = 0; i < a.length(); i++) {
			JSONObject j = a.getJSONObject(i);
			JSONObject jj = j.getJSONObject("properties");
//			System.err.println("XXXX jj:" + jj.toString(2));
			if (jj.has("schema")) {
				j.put("schema", new JSONObject(jj.getString("schema")));
				jj.remove("schema");
			}
			else {
				j.put("schema", new JSONObject());
			}
			fixMap(j, "properties");
//			System.err.println("XXXX schema:" + j.getJSONObject("schema").toString(2));
			CdapDataset dataset = (CdapDataset) controller.getServer().json2ecore(
					CdapPackage.eINSTANCE.getCdapDataset(), j);
//			System.err.println("XXXX " + ManagementServer.ecore2json(dataset, 100, null, true).toString(2));
			namespace.getDatasets().add(dataset);
		}
	}

	private void updateNamespaces(JSONObject json) {
		JSONArray a = json.getJSONArray("$list");
		o.getNamespaces().clear();
		for (int i = 0; i < a.length(); i++) {
			JSONObject j = a.getJSONObject(i);
			fixMap(j, "config");
			CdapNamespace namespace = (CdapNamespace) controller.getServer().json2ecore(
					CdapPackage.eINSTANCE.getCdapNamespace(), j);
//			System.err.println("XXXX " + ManagementServer.ecore2json(namespace, 100, null, true).toString(2));
			o.getNamespaces().add(namespace);
		}
	}

	@Override
	public void start() {
        if (o.isRemote()) return;
		Thread t = new Thread("cdap poller: " + o.getName()) {
			@Override
			public void run() {
				while (true) {
					try {
						if (lastPoll == null || lastPoll.getTime() + o.getPollingFrequency() < new Date().getTime())
							o.poll();
						Thread.sleep(5000); // sleep 5 seconds
					} catch (Exception e) {
						ManagementServerUtils.printStackTrace(e);
						logger.fatal("openstackPoller Thread DIED: " + e);
						try {
							Thread.sleep(30000);
						} catch (InterruptedException e1) {
						}
					}
				}
			};
		};
		t.start();
	}

	// change JSONObject to a JSONArray with name,value objects
	private void fixMap(JSONObject j, String key) {
		JSONArray a = new JSONArray();
		JSONObject jjj = j.getJSONObject(key);
		for (Iterator<String> i = jjj.keys(); i.hasNext();) {
			String k = i.next();
			Object v = jjj.get(k);
			JSONObject jj = new JSONObject();
			jj.put("name", k);
			jj.put("value", v);
			a.put(jj);
		}
		j.put(key, a);
	}
	
	
	private String encode(String s) {
		return "'" + s.replace(" ", "%SPACE%") + "'";
	}
	private String decode(String s) {
		return s.replace("%SPACE%", " ");
	}
	/**
	 * Use local CDAP CLI to invoke commands -- a simpler substitute for curl
	 * requests. Works only for single line commands. Copied from SDNL start
	 * shell script
	 * 
	 * Returns the output from the CLI as a String
	 * 
	 * TODO: For multi-line commands, send commands via STDIN TODO: Use the code
	 * from ScriptRunner.java
	 */
	public String customRunCDAPcliCommand(String namespace, String cdapCmdStr) {
		String cmd = "bin/cdap-cli.sh " + "-u localhost/" + namespace + " " + cdapCmdStr;
		String[] args = cmd.split(" ");
		for (int i =0; i<args.length; i++) {
			args[i] = decode(args[i]);
		}
		Runtime run = Runtime.getRuntime();
		Process pr;
		try {
			pr = run.exec(args);
			pr.waitFor();
			BufferedReader buf = new BufferedReader(new InputStreamReader(pr.getInputStream()));
			StringBuilder sb = new StringBuilder(4096);
			String line;

			while ((line = buf.readLine()) != null) {
				if (line.startsWith("Error:"))
					throw new RuntimeException(line);
				sb.append(line);
			}
			return sb.toString();
		} catch (InterruptedException e) {
			return (e.getMessage());
		} catch (IOException e) {
			return (e.getMessage());
		}
	}

	public String createNamespace(String namespace) {
		return customRunCDAPcliCommand("", "create namespace " + namespace);
	}
	
	public String deleteNamespace(String namespace) {
		return customRunCDAPcliCommand("", "delete namespace " + namespace);
	}

	public String deploy(String namespace, String jarfile) {
		return customRunCDAPcliCommand(namespace, "deploy app " + jarfile);
	}

	public String loadArtifact(String namespace, String artifactName, String jarfile, String version) {
		return customRunCDAPcliCommand(namespace, "load artifact " + jarfile + " name " + artifactName + " version " + version);
	}

	public String startFlow(String namespace, String appName, String flowId, String extraArgs) {
		if (extraArgs != null) {
			return customRunCDAPcliCommand(namespace, "start flow " + appName + "." + flowId + " \"" + extraArgs + "\"");
		} else {
			return customRunCDAPcliCommand(namespace, "start flow " + appName + "." + flowId);
		}
	}

	public String startService(String namespace, String appName, String serviceId, String extraArgs) {
		if (extraArgs != null) {
			return customRunCDAPcliCommand(namespace, "start service " + appName + "." + serviceId + "\"" + extraArgs
					+ "\"");
		}
		return customRunCDAPcliCommand(namespace, "start service " + appName + "." + serviceId);
	}

	public String startApp(String namespace, String appName) {
		return customRunCDAPcliCommand(namespace, "start app " + appName);
	}

	public String deleteApp(String namespace, String appName) {
		return customRunCDAPcliCommand(namespace, "delete app " + appName);
	}

	public String loadPreferencesApp(String namespace, String prefsFile, String appId) {
		return customRunCDAPcliCommand(namespace, "load preferences " + prefsFile + " json " + appId);
	}

	public String loadPreferencesFlow(String namespace, String prefsFile, String appId, String flowId) {
		return customRunCDAPcliCommand(namespace, "load preferences flow " + prefsFile + " json " + appId + "."
				+ flowId);
	}

	public String loadPreferencesNameSpace(String namespace, String prefsFile) {
		return customRunCDAPcliCommand(namespace, "load preferences namespace " + prefsFile + " json ");
	}

	public String setPreferencesApp(String namespace, String prefsString, String appId) {
		return customRunCDAPcliCommand(namespace, "set preferences app " + encode(prefsString) + " " + appId);
	}

	public String setPreferencesFlow(String namespace, String prefsString, String appId, String flowId) {
		return customRunCDAPcliCommand(namespace, "set preferences flow " + encode(prefsString) + " " + appId + "."
				+ flowId);
	}
	
	public String setPreferencesWorker(String namespace, String prefsString, String appId, String workerId) {
		return customRunCDAPcliCommand(namespace, "set preferences worker " + encode(prefsString) + " " + appId + "."
				+ workerId);
	}

	public String setPreferencesNameSpace(String namespace, String prefsString) {
		return customRunCDAPcliCommand(namespace, "set preferences namespace " + encode(prefsString));
	}

	public String setFlowRunTimeArgs(String namespace, String appId, String flowId, String args) {
		return customRunCDAPcliCommand(namespace, "set flow runtimeargs " + appId + "." + flowId + " " + args);
	}

	public String setFlowletInstances(String namespace, String appId, String flowId, String flowletId, int nInstances) {
		return customRunCDAPcliCommand(namespace, "set flowlet instances " + appId + "." + flowId + "." + flowletId
				+ " " + nInstances);
	}

	public String stopFlow(String namespace, String appId, String flowId) {
		return customRunCDAPcliCommand(namespace, "stop flow " + appId + "." + flowId);
	}

	public String stopService(String namespace, String appId, String serviceId) {
		return customRunCDAPcliCommand(namespace, "stop service " + appId + "." + serviceId);
	}

	public String truncateDataSet(String namespace, String datasetName) {
		return customRunCDAPcliCommand(namespace, "truncate dataset instance " + datasetName);
	}

	public String createStream(String namespace, String newStreamId) {
		return customRunCDAPcliCommand(namespace, "create stream " + newStreamId);
	}

	public String deleteStream(String namespace, String streamId) {
		return customRunCDAPcliCommand(namespace, "delete stream " + streamId);
	}

	/**
	 * Time format can be a timestamp in milliseconds or a relative time in the
	 * form of [+|-][0-9][d|h|m|s]. Special constants "min" and "max" can be
	 * used to represent "0" and "max timestamp" respectively. From CDAP CLI
	 * help documentation.
	 */

	public EList<String> getStreamEvents(String namespace, String streamId, String startTime, String endTime, int limit) {
		// customRunCDAPcliCommand(namespace, "get stream " + streamId + " " +
		// startTime + " " + endTime + " " + limit);
		return null;
	}

	/**
	 * Time format can be a timestamp in milliseconds or a relative time in the
	 * form of [+|-][0-9][d|h|m|s]. Special constants "min" and "max" can be
	 * used to represent "0" and "max timestamp" respectively. From CDAP CLI
	 * help documentation.
	 */
	public EList<String> getStreamStats(String namespace, String streamId, String startTime, String endTime, int limit) {
		// customRunCDAPcliCommand(namespace, "get stream-stats " + streamId +
		// " " + limit + " " + startTime + " " + endTime);
		return null;
	}

	public String sendEventToStream(String namespace, String streamId, String event) {
		return customRunCDAPcliCommand(namespace, "send stream " + streamId + " " + event);
	}

	public String trucateStream(String namespace, String streamId) {
		return customRunCDAPcliCommand(namespace, "truncate stream " + streamId);
	}

	/**
	 * Sets the properties of a stream, such as TTL, format, and notification
	 * threshold.
	 */
	public String setStreamProperties(String namespace, String streamId, String propsFile) {
		return customRunCDAPcliCommand(namespace, "set stream properties " + streamId + " " + propsFile);
	}

	public String deployApp(String namespace, String jarfile) {
		return customRunCDAPcliCommand(namespace, "deploy app " + jarfile);
	}

	public String deleteArtifact(String namespace, String artifactName, String artifactVersion) {
		return customRunCDAPcliCommand(namespace, "delete artifact " + artifactName + " " + artifactVersion);
	}

	public String deleteDataset(String namespace, String datasetName) {
		return customRunCDAPcliCommand(namespace, "delete dataset instance " + datasetName);
	}

	public String createApp(String namespace, String appId, String artifactName, String artifactVersion, String scope) {
		return customRunCDAPcliCommand(namespace, "create app " + appId + " " + artifactName + " " + artifactVersion
				+ " " + scope);
	}

	public String createAppWithConfig(String namespace, String appId, String artifactName, String artifactVersion, String scope,
			String appConfig) {
    	Date now = new Date();
		String filename = "/tmp/"+ now.getTime() + ".appConfig";
        try {
    		OutputStreamWriter w = FileUtils.filename2writer(filename);
    		w.append(appConfig);
    		w.close();
        } catch (Exception e) {
            ManagementServerUtils.printStackTrace(e);
            logger.fatal("configurationChanged" + e);
        }
		return customRunCDAPcliCommand(namespace, "create app " + appId + " " + artifactName + " " + artifactVersion
				+ " " + scope + " " + filename);
	}

	public String restartApp(String namespace, String appId, String progTypes) {
		String extraOpts = " of type " + progTypes;
		if (progTypes == null || progTypes.equals(""))
			extraOpts = "";
		return customRunCDAPcliCommand(namespace, "restart app " + appId + " programs" + extraOpts);
	}

	public String setDatasetProperties(String namespace, String datasetName, String datasetProperties) {
		return customRunCDAPcliCommand(namespace, "set dataset instance properties " + datasetName + " "
				+ datasetProperties);
	}

	public String setStreamTTL(String namespace, String streamName, int ttlSeconds) {
		return customRunCDAPcliCommand(namespace, "set stream ttl " + streamName + " " + ttlSeconds);
	}

	public String stopApp(String namespace, String appName) {
		return customRunCDAPcliCommand(namespace, "stop app " + appName + " programs");
	}

	public String startWorker(String namespace, String appName,
			String workerId, String extraArgs) {
		if (extraArgs != null) {
			return customRunCDAPcliCommand(namespace, "start worker " + appName + "." + workerId + " \"" + extraArgs + "\"");
		} else {
			return customRunCDAPcliCommand(namespace, "start worker " + appName + "." + workerId);
		}

	}

	public String stopWorker(String namespace, String appId, String workerId) {
		return customRunCDAPcliCommand(namespace, "stop worker " + appId + "." + workerId);

	}

	public String setPreferencesService(String namespace, String prefsString, String appId, String serviceId) {
		return customRunCDAPcliCommand(namespace, "set preferences service " + "\"" + prefsString + "\" " + appId + "."
				+ serviceId);
	}

}
