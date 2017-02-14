
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
	
/**
 */
package org.openecomp.ncomp.cdap.impl;

import org.openecomp.ncomp.cdap.CdapApi;
import org.openecomp.ncomp.cdap.CdapPackage;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Api</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class CdapApiImpl extends MinimalEObjectImpl.Container implements CdapApi {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CdapApiImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CdapPackage.Literals.CDAP_API;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createNamespace(String namespace) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String deleteNamespace(String namespace) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String deployApp(String namespace, String jarfile) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String loadArtifact(String namespace, String artifactName, String jarfile, String version) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String deleteArtifact(String namespace, String artifactName, String artifactVersion) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String startFlow(String namespace, String appName, String flowId, String extraArgs) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String startWorker(String namespace, String appName, String workerId, String extraArgs) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String startService(String namespace, String appName, String serviceId, String extraArgs) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String startApp(String namespace, String appName) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String stopApp(String namespace, String appName) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String deleteApp(String namespace, String appName) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String loadPreferencesApp(String namespace, String prefsFile, String appId) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String loadPreferencesFlow(String namespace, String prefsFile, String appId, String flowId) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String loadPreferencesNameSpace(String namespace, String prefsFile) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String setPreferencesApp(String namespace, String prefsString, String appId) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String setPreferencesFlow(String namespace, String prefsString, String appId, String flowId) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String setPreferencesWorker(String namespace, String prefsString, String appId, String workerId) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String setPreferencesService(String namespace, String prefsString, String appId, String serviceId) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String setPreferencesNameSpace(String namespace, String prefsString) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String setFlowRunTimeArgs(String namespace, String appId, String flowId, String args) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String setFlowletInstances(String namespace, String appId, String flowId, String flowletId, int nInstances) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String stopFlow(String namespace, String appId, String flowId) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String stopWorker(String namespace, String appId, String workerId) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String stopService(String namespace, String appId, String serviceId) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String truncateDataSet(String namespace, String datasetName) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String deleteDataset(String namespace, String datasetName) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createStream(String namespace, String newStreamId) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String deleteStream(String namespace, String streamId) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getStreamEvents(String namespace, String streamId, String startTime, String endTime, int limit) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getStreamStats(String namespace, String streamId, String startTime, String endTime, int limit) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String sendEventToStream(String namespace, String streamId, String event) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String trucateStream(String namespace, String streamId) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String setStreamProperties(String namespace, String streamId, String propsFile) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String restartApp(String namespace, String appId, String progTypes) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createApp(String namespace, String appId, String artifactName, String artifactVersion, String scope) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createAppWithConfig(String namespace, String appId, String artifactName, String artifactVersion, String scope, String appConfig) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String setDatasetProperties(String namespace, String datasetName, String datasetProperties) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String setStreamTTL(String namespace, String streamName, int ttlSeconds) {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case CdapPackage.CDAP_API___CREATE_NAMESPACE__STRING:
				return createNamespace((String)arguments.get(0));
			case CdapPackage.CDAP_API___DELETE_NAMESPACE__STRING:
				return deleteNamespace((String)arguments.get(0));
			case CdapPackage.CDAP_API___DEPLOY_APP__STRING_STRING:
				return deployApp((String)arguments.get(0), (String)arguments.get(1));
			case CdapPackage.CDAP_API___LOAD_ARTIFACT__STRING_STRING_STRING_STRING:
				return loadArtifact((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3));
			case CdapPackage.CDAP_API___DELETE_ARTIFACT__STRING_STRING_STRING:
				return deleteArtifact((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2));
			case CdapPackage.CDAP_API___START_FLOW__STRING_STRING_STRING_STRING:
				return startFlow((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3));
			case CdapPackage.CDAP_API___START_WORKER__STRING_STRING_STRING_STRING:
				return startWorker((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3));
			case CdapPackage.CDAP_API___START_SERVICE__STRING_STRING_STRING_STRING:
				return startService((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3));
			case CdapPackage.CDAP_API___START_APP__STRING_STRING:
				return startApp((String)arguments.get(0), (String)arguments.get(1));
			case CdapPackage.CDAP_API___STOP_APP__STRING_STRING:
				return stopApp((String)arguments.get(0), (String)arguments.get(1));
			case CdapPackage.CDAP_API___DELETE_APP__STRING_STRING:
				return deleteApp((String)arguments.get(0), (String)arguments.get(1));
			case CdapPackage.CDAP_API___LOAD_PREFERENCES_APP__STRING_STRING_STRING:
				return loadPreferencesApp((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2));
			case CdapPackage.CDAP_API___LOAD_PREFERENCES_FLOW__STRING_STRING_STRING_STRING:
				return loadPreferencesFlow((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3));
			case CdapPackage.CDAP_API___LOAD_PREFERENCES_NAME_SPACE__STRING_STRING:
				return loadPreferencesNameSpace((String)arguments.get(0), (String)arguments.get(1));
			case CdapPackage.CDAP_API___SET_PREFERENCES_APP__STRING_STRING_STRING:
				return setPreferencesApp((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2));
			case CdapPackage.CDAP_API___SET_PREFERENCES_FLOW__STRING_STRING_STRING_STRING:
				return setPreferencesFlow((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3));
			case CdapPackage.CDAP_API___SET_PREFERENCES_WORKER__STRING_STRING_STRING_STRING:
				return setPreferencesWorker((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3));
			case CdapPackage.CDAP_API___SET_PREFERENCES_SERVICE__STRING_STRING_STRING_STRING:
				return setPreferencesService((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3));
			case CdapPackage.CDAP_API___SET_PREFERENCES_NAME_SPACE__STRING_STRING:
				return setPreferencesNameSpace((String)arguments.get(0), (String)arguments.get(1));
			case CdapPackage.CDAP_API___SET_FLOW_RUN_TIME_ARGS__STRING_STRING_STRING_STRING:
				return setFlowRunTimeArgs((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3));
			case CdapPackage.CDAP_API___SET_FLOWLET_INSTANCES__STRING_STRING_STRING_STRING_INT:
				return setFlowletInstances((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3), (Integer)arguments.get(4));
			case CdapPackage.CDAP_API___STOP_FLOW__STRING_STRING_STRING:
				return stopFlow((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2));
			case CdapPackage.CDAP_API___STOP_WORKER__STRING_STRING_STRING:
				return stopWorker((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2));
			case CdapPackage.CDAP_API___STOP_SERVICE__STRING_STRING_STRING:
				return stopService((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2));
			case CdapPackage.CDAP_API___TRUNCATE_DATA_SET__STRING_STRING:
				return truncateDataSet((String)arguments.get(0), (String)arguments.get(1));
			case CdapPackage.CDAP_API___DELETE_DATASET__STRING_STRING:
				return deleteDataset((String)arguments.get(0), (String)arguments.get(1));
			case CdapPackage.CDAP_API___CREATE_STREAM__STRING_STRING:
				return createStream((String)arguments.get(0), (String)arguments.get(1));
			case CdapPackage.CDAP_API___DELETE_STREAM__STRING_STRING:
				return deleteStream((String)arguments.get(0), (String)arguments.get(1));
			case CdapPackage.CDAP_API___GET_STREAM_EVENTS__STRING_STRING_STRING_STRING_INT:
				return getStreamEvents((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3), (Integer)arguments.get(4));
			case CdapPackage.CDAP_API___GET_STREAM_STATS__STRING_STRING_STRING_STRING_INT:
				return getStreamStats((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3), (Integer)arguments.get(4));
			case CdapPackage.CDAP_API___SEND_EVENT_TO_STREAM__STRING_STRING_STRING:
				return sendEventToStream((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2));
			case CdapPackage.CDAP_API___TRUCATE_STREAM__STRING_STRING:
				return trucateStream((String)arguments.get(0), (String)arguments.get(1));
			case CdapPackage.CDAP_API___SET_STREAM_PROPERTIES__STRING_STRING_STRING:
				return setStreamProperties((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2));
			case CdapPackage.CDAP_API___RESTART_APP__STRING_STRING_STRING:
				return restartApp((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2));
			case CdapPackage.CDAP_API___CREATE_APP__STRING_STRING_STRING_STRING_STRING:
				return createApp((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3), (String)arguments.get(4));
			case CdapPackage.CDAP_API___CREATE_APP_WITH_CONFIG__STRING_STRING_STRING_STRING_STRING_STRING:
				return createAppWithConfig((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3), (String)arguments.get(4), (String)arguments.get(5));
			case CdapPackage.CDAP_API___SET_DATASET_PROPERTIES__STRING_STRING_STRING:
				return setDatasetProperties((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2));
			case CdapPackage.CDAP_API___SET_STREAM_TTL__STRING_STRING_INT:
				return setStreamTTL((String)arguments.get(0), (String)arguments.get(1), (Integer)arguments.get(2));
		}
		return super.eInvoke(operationID, arguments);
	}

} //CdapApiImpl
