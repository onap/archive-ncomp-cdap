
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
package org.openecomp.ncomp.cdap;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Api</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openecomp.ncomp.cdap.CdapPackage#getCdapApi()
 * @model
 * @generated
 */
public interface CdapApi extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" namespaceUnique="false"
	 * @generated
	 */
	String createNamespace(String namespace);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" namespaceUnique="false"
	 * @generated
	 */
	String deleteNamespace(String namespace);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" namespaceUnique="false" jarfileUnique="false"
	 * @generated
	 */
	String deployApp(String namespace, String jarfile);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" namespaceUnique="false" artifactNameUnique="false" jarfileUnique="false" versionUnique="false"
	 * @generated
	 */
	String loadArtifact(String namespace, String artifactName, String jarfile, String version);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" namespaceUnique="false" artifactNameUnique="false" jarfileUnique="false" versionUnique="false" configUnique="false"
	 * @generated
	 */
	String loadArtifactWithConfig(String namespace, String artifactName, String jarfile, String version, String config);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" namespaceUnique="false" artifactNameUnique="false" artifactVersionUnique="false"
	 * @generated
	 */
	String deleteArtifact(String namespace, String artifactName, String artifactVersion);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" namespaceUnique="false" appNameUnique="false" flowIdUnique="false" extraArgsUnique="false"
	 * @generated
	 */
	String startFlow(String namespace, String appName, String flowId, String extraArgs);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" namespaceUnique="false" appNameUnique="false" workerIdUnique="false" extraArgsUnique="false"
	 * @generated
	 */
	String startWorker(String namespace, String appName, String workerId, String extraArgs);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" namespaceUnique="false" appNameUnique="false" serviceIdUnique="false" extraArgsUnique="false"
	 * @generated
	 */
	String startService(String namespace, String appName, String serviceId, String extraArgs);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" namespaceUnique="false" appNameUnique="false"
	 * @generated
	 */
	String startApp(String namespace, String appName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" namespaceUnique="false" appNameUnique="false"
	 * @generated
	 */
	String stopApp(String namespace, String appName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" namespaceUnique="false" appNameUnique="false"
	 * @generated
	 */
	String deleteApp(String namespace, String appName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" namespaceUnique="false" prefsFileUnique="false" appIdUnique="false"
	 * @generated
	 */
	String loadPreferencesApp(String namespace, String prefsFile, String appId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" namespaceUnique="false" prefsFileUnique="false" appIdUnique="false" flowIdUnique="false"
	 * @generated
	 */
	String loadPreferencesFlow(String namespace, String prefsFile, String appId, String flowId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" namespaceUnique="false" prefsFileUnique="false"
	 * @generated
	 */
	String loadPreferencesNameSpace(String namespace, String prefsFile);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" namespaceUnique="false" prefsStringUnique="false" appIdUnique="false"
	 * @generated
	 */
	String setPreferencesApp(String namespace, String prefsString, String appId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" namespaceUnique="false" prefsStringUnique="false" appIdUnique="false" flowIdUnique="false"
	 * @generated
	 */
	String setPreferencesFlow(String namespace, String prefsString, String appId, String flowId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" namespaceUnique="false" prefsStringUnique="false" appIdUnique="false" workerIdUnique="false"
	 * @generated
	 */
	String setPreferencesWorker(String namespace, String prefsString, String appId, String workerId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" namespaceUnique="false" prefsStringUnique="false" appIdUnique="false" serviceIdUnique="false"
	 * @generated
	 */
	String setPreferencesService(String namespace, String prefsString, String appId, String serviceId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" namespaceUnique="false" prefsStringUnique="false"
	 * @generated
	 */
	String setPreferencesNameSpace(String namespace, String prefsString);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" namespaceUnique="false" appIdUnique="false" flowIdUnique="false" argsUnique="false"
	 * @generated
	 */
	String setFlowRunTimeArgs(String namespace, String appId, String flowId, String args);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" namespaceUnique="false" appIdUnique="false" flowIdUnique="false" flowletIdUnique="false" nInstancesUnique="false"
	 * @generated
	 */
	String setFlowletInstances(String namespace, String appId, String flowId, String flowletId, int nInstances);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" namespaceUnique="false" appIdUnique="false" flowIdUnique="false"
	 * @generated
	 */
	String stopFlow(String namespace, String appId, String flowId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" namespaceUnique="false" appIdUnique="false" workerIdUnique="false"
	 * @generated
	 */
	String stopWorker(String namespace, String appId, String workerId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" namespaceUnique="false" appIdUnique="false" serviceIdUnique="false"
	 * @generated
	 */
	String stopService(String namespace, String appId, String serviceId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" namespaceUnique="false" datasetNameUnique="false"
	 * @generated
	 */
	String truncateDataSet(String namespace, String datasetName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" namespaceUnique="false" datasetNameUnique="false"
	 * @generated
	 */
	String deleteDataset(String namespace, String datasetName);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" namespaceUnique="false" newStreamIdUnique="false"
	 * @generated
	 */
	String createStream(String namespace, String newStreamId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" namespaceUnique="false" streamIdUnique="false"
	 * @generated
	 */
	String deleteStream(String namespace, String streamId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" namespaceUnique="false" streamIdUnique="false" startTimeUnique="false" endTimeUnique="false" limitUnique="false"
	 * @generated
	 */
	EList<String> getStreamEvents(String namespace, String streamId, String startTime, String endTime, int limit);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" namespaceUnique="false" streamIdUnique="false" startTimeUnique="false" endTimeUnique="false" limitUnique="false"
	 * @generated
	 */
	EList<String> getStreamStats(String namespace, String streamId, String startTime, String endTime, int limit);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" namespaceUnique="false" streamIdUnique="false" eventUnique="false"
	 * @generated
	 */
	String sendEventToStream(String namespace, String streamId, String event);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" namespaceUnique="false" streamIdUnique="false"
	 * @generated
	 */
	String trucateStream(String namespace, String streamId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" namespaceUnique="false" streamIdUnique="false" propsFileUnique="false"
	 * @generated
	 */
	String setStreamProperties(String namespace, String streamId, String propsFile);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" namespaceUnique="false" appIdUnique="false" progTypesUnique="false"
	 * @generated
	 */
	String restartApp(String namespace, String appId, String progTypes);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" namespaceUnique="false" appIdUnique="false" artifactNameUnique="false" artifactVersionUnique="false" scopeUnique="false"
	 * @generated
	 */
	String createApp(String namespace, String appId, String artifactName, String artifactVersion, String scope);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" namespaceUnique="false" appIdUnique="false" artifactNameUnique="false" artifactVersionUnique="false" scopeUnique="false" appConfigUnique="false"
	 * @generated
	 */
	String createAppWithConfig(String namespace, String appId, String artifactName, String artifactVersion, String scope, String appConfig);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" namespaceUnique="false" datasetNameUnique="false" datasetPropertiesUnique="false"
	 * @generated
	 */
	String setDatasetProperties(String namespace, String datasetName, String datasetProperties);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" namespaceUnique="false" streamNameUnique="false" ttlSecondsUnique="false"
	 * @generated
	 */
	String setStreamTTL(String namespace, String streamName, int ttlSeconds);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" namespaceUnique="false" appIdUnique="false" scheduleIdUnique="false"
	 * @generated
	 */
	String suspendSchedule(String namespace, String appId, String scheduleId);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model unique="false" namespaceUnique="false" appIdUnique="false" scheduleIdUnique="false"
	 * @generated
	 */
	String resumeSchedule(String namespace, String appId, String scheduleId);

} // CdapApi
