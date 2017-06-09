
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

import org.openecomp.ncomp.core.CorePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * -
 * ============LICENSE_START==========================================
 * OPENECOMP - DCAE
 * ===================================================================
 * Copyright (c) 2017 AT&T Intellectual Property. All rights reserved.
 * ===================================================================
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *  *        http://www.apache.org/licenses/LICENSE-2.0
 *  * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * ============LICENSE_END============================================
 * <!-- end-model-doc -->
 * @see org.openecomp.ncomp.cdap.CdapFactory
 * @model kind="package"
 *        annotation="http://www.eclipse.org/emf/2002/GenModel modelDirectory='/ncomp-cdap-model/src/main/xcore-gen' basePackage='org.openecomp.ncomp'"
 * @generated
 */
public interface CdapPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "cdap";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "org.openecomp.ncomp.cdap";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "cdap";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	CdapPackage eINSTANCE = org.openecomp.ncomp.cdap.impl.CdapPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.cdap.impl.CdapAdaptorImpl <em>Adaptor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.cdap.impl.CdapAdaptorImpl
	 * @see org.openecomp.ncomp.cdap.impl.CdapPackageImpl#getCdapAdaptor()
	 * @generated
	 */
	int CDAP_ADAPTOR = 0;

	/**
	 * The number of structural features of the '<em>Adaptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_ADAPTOR_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Adaptor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_ADAPTOR_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.cdap.impl.CdapClusterImpl <em>Cluster</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.cdap.impl.CdapClusterImpl
	 * @see org.openecomp.ncomp.cdap.impl.CdapPackageImpl#getCdapCluster()
	 * @generated
	 */
	int CDAP_CLUSTER = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER__NAME = CorePackage.NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER__LAST_POLLED = CorePackage.NAMED_ENTITY__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER__LAST_CHANGED = CorePackage.NAMED_ENTITY__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER__CREATED = CorePackage.NAMED_ENTITY__CREATED;

	/**
	 * The feature id for the '<em><b>Base Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER__BASE_URL = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Polling Frequency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER__POLLING_FREQUENCY = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Remote</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER__REMOTE = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Configurations</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER__CONFIGURATIONS = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Namespaces</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER__NAMESPACES = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Cluster</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER_FEATURE_COUNT = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The operation id for the '<em>Create Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER___CREATE_NAMESPACE__STRING = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Delete Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER___DELETE_NAMESPACE__STRING = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Deploy App</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER___DEPLOY_APP__STRING_STRING = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Load Artifact</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER___LOAD_ARTIFACT__STRING_STRING_STRING_STRING = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Load Artifact With Config</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER___LOAD_ARTIFACT_WITH_CONFIG__STRING_STRING_STRING_STRING_STRING = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 4;

	/**
	 * The operation id for the '<em>Delete Artifact</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER___DELETE_ARTIFACT__STRING_STRING_STRING = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 5;

	/**
	 * The operation id for the '<em>Start Flow</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER___START_FLOW__STRING_STRING_STRING_STRING = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 6;

	/**
	 * The operation id for the '<em>Start Worker</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER___START_WORKER__STRING_STRING_STRING_STRING = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 7;

	/**
	 * The operation id for the '<em>Start Service</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER___START_SERVICE__STRING_STRING_STRING_STRING = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 8;

	/**
	 * The operation id for the '<em>Start App</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER___START_APP__STRING_STRING = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 9;

	/**
	 * The operation id for the '<em>Stop App</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER___STOP_APP__STRING_STRING_STRING = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 10;

	/**
	 * The operation id for the '<em>Delete App</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER___DELETE_APP__STRING_STRING = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 11;

	/**
	 * The operation id for the '<em>Load Preferences App</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER___LOAD_PREFERENCES_APP__STRING_STRING_STRING = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 12;

	/**
	 * The operation id for the '<em>Load Preferences Flow</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER___LOAD_PREFERENCES_FLOW__STRING_STRING_STRING_STRING = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 13;

	/**
	 * The operation id for the '<em>Load Preferences Name Space</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER___LOAD_PREFERENCES_NAME_SPACE__STRING_STRING = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 14;

	/**
	 * The operation id for the '<em>Set Preferences App</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER___SET_PREFERENCES_APP__STRING_STRING_STRING = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 15;

	/**
	 * The operation id for the '<em>Set Preferences Flow</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER___SET_PREFERENCES_FLOW__STRING_STRING_STRING_STRING = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 16;

	/**
	 * The operation id for the '<em>Set Preferences Worker</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER___SET_PREFERENCES_WORKER__STRING_STRING_STRING_STRING = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 17;

	/**
	 * The operation id for the '<em>Set Preferences Service</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER___SET_PREFERENCES_SERVICE__STRING_STRING_STRING_STRING = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 18;

	/**
	 * The operation id for the '<em>Set Preferences Name Space</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER___SET_PREFERENCES_NAME_SPACE__STRING_STRING = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 19;

	/**
	 * The operation id for the '<em>Set Flow Run Time Args</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER___SET_FLOW_RUN_TIME_ARGS__STRING_STRING_STRING_STRING = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 20;

	/**
	 * The operation id for the '<em>Set Flowlet Instances</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER___SET_FLOWLET_INSTANCES__STRING_STRING_STRING_STRING_INT = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 21;

	/**
	 * The operation id for the '<em>Stop Flow</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER___STOP_FLOW__STRING_STRING_STRING = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 22;

	/**
	 * The operation id for the '<em>Stop Worker</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER___STOP_WORKER__STRING_STRING_STRING = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 23;

	/**
	 * The operation id for the '<em>Stop Service</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER___STOP_SERVICE__STRING_STRING_STRING = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 24;

	/**
	 * The operation id for the '<em>Truncate Data Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER___TRUNCATE_DATA_SET__STRING_STRING = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 25;

	/**
	 * The operation id for the '<em>Delete Dataset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER___DELETE_DATASET__STRING_STRING = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 26;

	/**
	 * The operation id for the '<em>Create Stream</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER___CREATE_STREAM__STRING_STRING = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 27;

	/**
	 * The operation id for the '<em>Delete Stream</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER___DELETE_STREAM__STRING_STRING = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 28;

	/**
	 * The operation id for the '<em>Get Stream Events</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER___GET_STREAM_EVENTS__STRING_STRING_STRING_STRING_INT = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 29;

	/**
	 * The operation id for the '<em>Get Stream Stats</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER___GET_STREAM_STATS__STRING_STRING_STRING_STRING_INT = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 30;

	/**
	 * The operation id for the '<em>Send Event To Stream</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER___SEND_EVENT_TO_STREAM__STRING_STRING_STRING = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 31;

	/**
	 * The operation id for the '<em>Trucate Stream</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER___TRUCATE_STREAM__STRING_STRING = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 32;

	/**
	 * The operation id for the '<em>Set Stream Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER___SET_STREAM_PROPERTIES__STRING_STRING_STRING = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 33;

	/**
	 * The operation id for the '<em>Restart App</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER___RESTART_APP__STRING_STRING_STRING = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 34;

	/**
	 * The operation id for the '<em>Create App</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER___CREATE_APP__STRING_STRING_STRING_STRING_STRING = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 35;

	/**
	 * The operation id for the '<em>Create App With Config</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER___CREATE_APP_WITH_CONFIG__STRING_STRING_STRING_STRING_STRING_STRING = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 36;

	/**
	 * The operation id for the '<em>Set Dataset Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER___SET_DATASET_PROPERTIES__STRING_STRING_STRING = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 37;

	/**
	 * The operation id for the '<em>Set Stream TTL</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER___SET_STREAM_TTL__STRING_STRING_INT = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 38;

	/**
	 * The operation id for the '<em>Suspend Schedule</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER___SUSPEND_SCHEDULE__STRING_STRING_STRING = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 39;

	/**
	 * The operation id for the '<em>Resume Schedule</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER___RESUME_SCHEDULE__STRING_STRING_STRING = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 40;

	/**
	 * The operation id for the '<em>Poll</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER___POLL = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 41;

	/**
	 * The number of operations of the '<em>Cluster</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CLUSTER_OPERATION_COUNT = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 42;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.cdap.impl.CdapApiImpl <em>Api</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.cdap.impl.CdapApiImpl
	 * @see org.openecomp.ncomp.cdap.impl.CdapPackageImpl#getCdapApi()
	 * @generated
	 */
	int CDAP_API = 2;

	/**
	 * The number of structural features of the '<em>Api</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_API_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Create Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_API___CREATE_NAMESPACE__STRING = 0;

	/**
	 * The operation id for the '<em>Delete Namespace</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_API___DELETE_NAMESPACE__STRING = 1;

	/**
	 * The operation id for the '<em>Deploy App</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_API___DEPLOY_APP__STRING_STRING = 2;

	/**
	 * The operation id for the '<em>Load Artifact</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_API___LOAD_ARTIFACT__STRING_STRING_STRING_STRING = 3;

	/**
	 * The operation id for the '<em>Load Artifact With Config</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_API___LOAD_ARTIFACT_WITH_CONFIG__STRING_STRING_STRING_STRING_STRING = 4;

	/**
	 * The operation id for the '<em>Delete Artifact</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_API___DELETE_ARTIFACT__STRING_STRING_STRING = 5;

	/**
	 * The operation id for the '<em>Start Flow</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_API___START_FLOW__STRING_STRING_STRING_STRING = 6;

	/**
	 * The operation id for the '<em>Start Worker</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_API___START_WORKER__STRING_STRING_STRING_STRING = 7;

	/**
	 * The operation id for the '<em>Start Service</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_API___START_SERVICE__STRING_STRING_STRING_STRING = 8;

	/**
	 * The operation id for the '<em>Start App</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_API___START_APP__STRING_STRING = 9;

	/**
	 * The operation id for the '<em>Stop App</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_API___STOP_APP__STRING_STRING_STRING = 10;

	/**
	 * The operation id for the '<em>Delete App</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_API___DELETE_APP__STRING_STRING = 11;

	/**
	 * The operation id for the '<em>Load Preferences App</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_API___LOAD_PREFERENCES_APP__STRING_STRING_STRING = 12;

	/**
	 * The operation id for the '<em>Load Preferences Flow</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_API___LOAD_PREFERENCES_FLOW__STRING_STRING_STRING_STRING = 13;

	/**
	 * The operation id for the '<em>Load Preferences Name Space</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_API___LOAD_PREFERENCES_NAME_SPACE__STRING_STRING = 14;

	/**
	 * The operation id for the '<em>Set Preferences App</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_API___SET_PREFERENCES_APP__STRING_STRING_STRING = 15;

	/**
	 * The operation id for the '<em>Set Preferences Flow</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_API___SET_PREFERENCES_FLOW__STRING_STRING_STRING_STRING = 16;

	/**
	 * The operation id for the '<em>Set Preferences Worker</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_API___SET_PREFERENCES_WORKER__STRING_STRING_STRING_STRING = 17;

	/**
	 * The operation id for the '<em>Set Preferences Service</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_API___SET_PREFERENCES_SERVICE__STRING_STRING_STRING_STRING = 18;

	/**
	 * The operation id for the '<em>Set Preferences Name Space</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_API___SET_PREFERENCES_NAME_SPACE__STRING_STRING = 19;

	/**
	 * The operation id for the '<em>Set Flow Run Time Args</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_API___SET_FLOW_RUN_TIME_ARGS__STRING_STRING_STRING_STRING = 20;

	/**
	 * The operation id for the '<em>Set Flowlet Instances</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_API___SET_FLOWLET_INSTANCES__STRING_STRING_STRING_STRING_INT = 21;

	/**
	 * The operation id for the '<em>Stop Flow</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_API___STOP_FLOW__STRING_STRING_STRING = 22;

	/**
	 * The operation id for the '<em>Stop Worker</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_API___STOP_WORKER__STRING_STRING_STRING = 23;

	/**
	 * The operation id for the '<em>Stop Service</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_API___STOP_SERVICE__STRING_STRING_STRING = 24;

	/**
	 * The operation id for the '<em>Truncate Data Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_API___TRUNCATE_DATA_SET__STRING_STRING = 25;

	/**
	 * The operation id for the '<em>Delete Dataset</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_API___DELETE_DATASET__STRING_STRING = 26;

	/**
	 * The operation id for the '<em>Create Stream</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_API___CREATE_STREAM__STRING_STRING = 27;

	/**
	 * The operation id for the '<em>Delete Stream</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_API___DELETE_STREAM__STRING_STRING = 28;

	/**
	 * The operation id for the '<em>Get Stream Events</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_API___GET_STREAM_EVENTS__STRING_STRING_STRING_STRING_INT = 29;

	/**
	 * The operation id for the '<em>Get Stream Stats</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_API___GET_STREAM_STATS__STRING_STRING_STRING_STRING_INT = 30;

	/**
	 * The operation id for the '<em>Send Event To Stream</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_API___SEND_EVENT_TO_STREAM__STRING_STRING_STRING = 31;

	/**
	 * The operation id for the '<em>Trucate Stream</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_API___TRUCATE_STREAM__STRING_STRING = 32;

	/**
	 * The operation id for the '<em>Set Stream Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_API___SET_STREAM_PROPERTIES__STRING_STRING_STRING = 33;

	/**
	 * The operation id for the '<em>Restart App</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_API___RESTART_APP__STRING_STRING_STRING = 34;

	/**
	 * The operation id for the '<em>Create App</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_API___CREATE_APP__STRING_STRING_STRING_STRING_STRING = 35;

	/**
	 * The operation id for the '<em>Create App With Config</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_API___CREATE_APP_WITH_CONFIG__STRING_STRING_STRING_STRING_STRING_STRING = 36;

	/**
	 * The operation id for the '<em>Set Dataset Properties</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_API___SET_DATASET_PROPERTIES__STRING_STRING_STRING = 37;

	/**
	 * The operation id for the '<em>Set Stream TTL</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_API___SET_STREAM_TTL__STRING_STRING_INT = 38;

	/**
	 * The operation id for the '<em>Suspend Schedule</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_API___SUSPEND_SCHEDULE__STRING_STRING_STRING = 39;

	/**
	 * The operation id for the '<em>Resume Schedule</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_API___RESUME_SCHEDULE__STRING_STRING_STRING = 40;

	/**
	 * The number of operations of the '<em>Api</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_API_OPERATION_COUNT = 41;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.cdap.impl.CdapConfigurationImpl <em>Configuration</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.cdap.impl.CdapConfigurationImpl
	 * @see org.openecomp.ncomp.cdap.impl.CdapPackageImpl#getCdapConfiguration()
	 * @generated
	 */
	int CDAP_CONFIGURATION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CONFIGURATION__NAME = CorePackage.NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CONFIGURATION__LAST_POLLED = CorePackage.NAMED_ENTITY__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CONFIGURATION__LAST_CHANGED = CorePackage.NAMED_ENTITY__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CONFIGURATION__CREATED = CorePackage.NAMED_ENTITY__CREATED;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CONFIGURATION__VALUE = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CONFIGURATION__SOURCE = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CONFIGURATION_FEATURE_COUNT = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Configuration</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_CONFIGURATION_OPERATION_COUNT = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.cdap.impl.CdapNamespaceImpl <em>Namespace</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.cdap.impl.CdapNamespaceImpl
	 * @see org.openecomp.ncomp.cdap.impl.CdapPackageImpl#getCdapNamespace()
	 * @generated
	 */
	int CDAP_NAMESPACE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_NAMESPACE__NAME = CorePackage.NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_NAMESPACE__LAST_POLLED = CorePackage.NAMED_ENTITY__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_NAMESPACE__LAST_CHANGED = CorePackage.NAMED_ENTITY__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_NAMESPACE__CREATED = CorePackage.NAMED_ENTITY__CREATED;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_NAMESPACE__DESCRIPTION = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Config</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_NAMESPACE__CONFIG = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Datasets</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_NAMESPACE__DATASETS = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Applications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_NAMESPACE__APPLICATIONS = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Cluster</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_NAMESPACE__CLUSTER = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Namespace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_NAMESPACE_FEATURE_COUNT = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Namespace</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_NAMESPACE_OPERATION_COUNT = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.cdap.impl.CdapKeyPairImpl <em>Key Pair</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.cdap.impl.CdapKeyPairImpl
	 * @see org.openecomp.ncomp.cdap.impl.CdapPackageImpl#getCdapKeyPair()
	 * @generated
	 */
	int CDAP_KEY_PAIR = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_KEY_PAIR__NAME = CorePackage.NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_KEY_PAIR__LAST_POLLED = CorePackage.NAMED_ENTITY__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_KEY_PAIR__LAST_CHANGED = CorePackage.NAMED_ENTITY__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_KEY_PAIR__CREATED = CorePackage.NAMED_ENTITY__CREATED;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_KEY_PAIR__VALUE = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Key Pair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_KEY_PAIR_FEATURE_COUNT = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Key Pair</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_KEY_PAIR_OPERATION_COUNT = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.cdap.impl.CdapEntityWithPreferencesImpl <em>Entity With Preferences</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.cdap.impl.CdapEntityWithPreferencesImpl
	 * @see org.openecomp.ncomp.cdap.impl.CdapPackageImpl#getCdapEntityWithPreferences()
	 * @generated
	 */
	int CDAP_ENTITY_WITH_PREFERENCES = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_ENTITY_WITH_PREFERENCES__NAME = CorePackage.NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_ENTITY_WITH_PREFERENCES__LAST_POLLED = CorePackage.NAMED_ENTITY__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_ENTITY_WITH_PREFERENCES__LAST_CHANGED = CorePackage.NAMED_ENTITY__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_ENTITY_WITH_PREFERENCES__CREATED = CorePackage.NAMED_ENTITY__CREATED;

	/**
	 * The feature id for the '<em><b>Preferences</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_ENTITY_WITH_PREFERENCES__PREFERENCES = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Entity With Preferences</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_ENTITY_WITH_PREFERENCES_FEATURE_COUNT = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Entity With Preferences</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_ENTITY_WITH_PREFERENCES_OPERATION_COUNT = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.cdap.impl.CdapDatasetImpl <em>Dataset</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.cdap.impl.CdapDatasetImpl
	 * @see org.openecomp.ncomp.cdap.impl.CdapPackageImpl#getCdapDataset()
	 * @generated
	 */
	int CDAP_DATASET = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_DATASET__NAME = CorePackage.NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_DATASET__LAST_POLLED = CorePackage.NAMED_ENTITY__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_DATASET__LAST_CHANGED = CorePackage.NAMED_ENTITY__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_DATASET__CREATED = CorePackage.NAMED_ENTITY__CREATED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_DATASET__TYPE = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_DATASET__PROPERTIES = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Schema</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_DATASET__SCHEMA = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Dataset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_DATASET_FEATURE_COUNT = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Dataset</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_DATASET_OPERATION_COUNT = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.cdap.impl.CdapDatasetSchemaImpl <em>Dataset Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.cdap.impl.CdapDatasetSchemaImpl
	 * @see org.openecomp.ncomp.cdap.impl.CdapPackageImpl#getCdapDatasetSchema()
	 * @generated
	 */
	int CDAP_DATASET_SCHEMA = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_DATASET_SCHEMA__NAME = CorePackage.NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_DATASET_SCHEMA__LAST_POLLED = CorePackage.NAMED_ENTITY__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_DATASET_SCHEMA__LAST_CHANGED = CorePackage.NAMED_ENTITY__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_DATASET_SCHEMA__CREATED = CorePackage.NAMED_ENTITY__CREATED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_DATASET_SCHEMA__TYPE = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fields</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_DATASET_SCHEMA__FIELDS = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Dataset Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_DATASET_SCHEMA_FEATURE_COUNT = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Dataset Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_DATASET_SCHEMA_OPERATION_COUNT = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.cdap.impl.CdapDatasetSchemaFieldImpl <em>Dataset Schema Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.cdap.impl.CdapDatasetSchemaFieldImpl
	 * @see org.openecomp.ncomp.cdap.impl.CdapPackageImpl#getCdapDatasetSchemaField()
	 * @generated
	 */
	int CDAP_DATASET_SCHEMA_FIELD = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_DATASET_SCHEMA_FIELD__NAME = CorePackage.NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_DATASET_SCHEMA_FIELD__LAST_POLLED = CorePackage.NAMED_ENTITY__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_DATASET_SCHEMA_FIELD__LAST_CHANGED = CorePackage.NAMED_ENTITY__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_DATASET_SCHEMA_FIELD__CREATED = CorePackage.NAMED_ENTITY__CREATED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_DATASET_SCHEMA_FIELD__TYPE = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Dataset Schema Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_DATASET_SCHEMA_FIELD_FEATURE_COUNT = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Dataset Schema Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_DATASET_SCHEMA_FIELD_OPERATION_COUNT = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.cdap.impl.CdapApplicationImpl <em>Application</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.cdap.impl.CdapApplicationImpl
	 * @see org.openecomp.ncomp.cdap.impl.CdapPackageImpl#getCdapApplication()
	 * @generated
	 */
	int CDAP_APPLICATION = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_APPLICATION__NAME = CorePackage.NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_APPLICATION__LAST_POLLED = CorePackage.NAMED_ENTITY__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_APPLICATION__LAST_CHANGED = CorePackage.NAMED_ENTITY__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_APPLICATION__CREATED = CorePackage.NAMED_ENTITY__CREATED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_APPLICATION__TYPE = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_APPLICATION__ID = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_APPLICATION__VERSION = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_APPLICATION__DESCRIPTION = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Artifact</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_APPLICATION__ARTIFACT = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_APPLICATION_FEATURE_COUNT = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Application</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_APPLICATION_OPERATION_COUNT = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link org.openecomp.ncomp.cdap.impl.CdapArtifactImpl <em>Artifact</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openecomp.ncomp.cdap.impl.CdapArtifactImpl
	 * @see org.openecomp.ncomp.cdap.impl.CdapPackageImpl#getCdapArtifact()
	 * @generated
	 */
	int CDAP_ARTIFACT = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_ARTIFACT__NAME = CorePackage.NAMED_ENTITY__NAME;

	/**
	 * The feature id for the '<em><b>Last Polled</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_ARTIFACT__LAST_POLLED = CorePackage.NAMED_ENTITY__LAST_POLLED;

	/**
	 * The feature id for the '<em><b>Last Changed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_ARTIFACT__LAST_CHANGED = CorePackage.NAMED_ENTITY__LAST_CHANGED;

	/**
	 * The feature id for the '<em><b>Created</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_ARTIFACT__CREATED = CorePackage.NAMED_ENTITY__CREATED;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_ARTIFACT__VERSION = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Scope</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_ARTIFACT__SCOPE = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_ARTIFACT_FEATURE_COUNT = CorePackage.NAMED_ENTITY_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Artifact</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CDAP_ARTIFACT_OPERATION_COUNT = CorePackage.NAMED_ENTITY_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.cdap.CdapAdaptor <em>Adaptor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adaptor</em>'.
	 * @see org.openecomp.ncomp.cdap.CdapAdaptor
	 * @generated
	 */
	EClass getCdapAdaptor();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.cdap.CdapCluster <em>Cluster</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cluster</em>'.
	 * @see org.openecomp.ncomp.cdap.CdapCluster
	 * @generated
	 */
	EClass getCdapCluster();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.cdap.CdapCluster#getBaseUrl <em>Base Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Base Url</em>'.
	 * @see org.openecomp.ncomp.cdap.CdapCluster#getBaseUrl()
	 * @see #getCdapCluster()
	 * @generated
	 */
	EAttribute getCdapCluster_BaseUrl();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.cdap.CdapCluster#getPollingFrequency <em>Polling Frequency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Polling Frequency</em>'.
	 * @see org.openecomp.ncomp.cdap.CdapCluster#getPollingFrequency()
	 * @see #getCdapCluster()
	 * @generated
	 */
	EAttribute getCdapCluster_PollingFrequency();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.cdap.CdapCluster#isRemote <em>Remote</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Remote</em>'.
	 * @see org.openecomp.ncomp.cdap.CdapCluster#isRemote()
	 * @see #getCdapCluster()
	 * @generated
	 */
	EAttribute getCdapCluster_Remote();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.ncomp.cdap.CdapCluster#getConfigurations <em>Configurations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Configurations</em>'.
	 * @see org.openecomp.ncomp.cdap.CdapCluster#getConfigurations()
	 * @see #getCdapCluster()
	 * @generated
	 */
	EReference getCdapCluster_Configurations();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.ncomp.cdap.CdapCluster#getNamespaces <em>Namespaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Namespaces</em>'.
	 * @see org.openecomp.ncomp.cdap.CdapCluster#getNamespaces()
	 * @see #getCdapCluster()
	 * @generated
	 */
	EReference getCdapCluster_Namespaces();

	/**
	 * Returns the meta object for the '{@link org.openecomp.ncomp.cdap.CdapCluster#poll() <em>Poll</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Poll</em>' operation.
	 * @see org.openecomp.ncomp.cdap.CdapCluster#poll()
	 * @generated
	 */
	EOperation getCdapCluster__Poll();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.cdap.CdapApi <em>Api</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Api</em>'.
	 * @see org.openecomp.ncomp.cdap.CdapApi
	 * @generated
	 */
	EClass getCdapApi();

	/**
	 * Returns the meta object for the '{@link org.openecomp.ncomp.cdap.CdapApi#createNamespace(java.lang.String) <em>Create Namespace</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Namespace</em>' operation.
	 * @see org.openecomp.ncomp.cdap.CdapApi#createNamespace(java.lang.String)
	 * @generated
	 */
	EOperation getCdapApi__CreateNamespace__String();

	/**
	 * Returns the meta object for the '{@link org.openecomp.ncomp.cdap.CdapApi#deleteNamespace(java.lang.String) <em>Delete Namespace</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Delete Namespace</em>' operation.
	 * @see org.openecomp.ncomp.cdap.CdapApi#deleteNamespace(java.lang.String)
	 * @generated
	 */
	EOperation getCdapApi__DeleteNamespace__String();

	/**
	 * Returns the meta object for the '{@link org.openecomp.ncomp.cdap.CdapApi#deployApp(java.lang.String, java.lang.String) <em>Deploy App</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Deploy App</em>' operation.
	 * @see org.openecomp.ncomp.cdap.CdapApi#deployApp(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getCdapApi__DeployApp__String_String();

	/**
	 * Returns the meta object for the '{@link org.openecomp.ncomp.cdap.CdapApi#loadArtifact(java.lang.String, java.lang.String, java.lang.String, java.lang.String) <em>Load Artifact</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Load Artifact</em>' operation.
	 * @see org.openecomp.ncomp.cdap.CdapApi#loadArtifact(java.lang.String, java.lang.String, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getCdapApi__LoadArtifact__String_String_String_String();

	/**
	 * Returns the meta object for the '{@link org.openecomp.ncomp.cdap.CdapApi#loadArtifactWithConfig(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String) <em>Load Artifact With Config</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Load Artifact With Config</em>' operation.
	 * @see org.openecomp.ncomp.cdap.CdapApi#loadArtifactWithConfig(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getCdapApi__LoadArtifactWithConfig__String_String_String_String_String();

	/**
	 * Returns the meta object for the '{@link org.openecomp.ncomp.cdap.CdapApi#deleteArtifact(java.lang.String, java.lang.String, java.lang.String) <em>Delete Artifact</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Delete Artifact</em>' operation.
	 * @see org.openecomp.ncomp.cdap.CdapApi#deleteArtifact(java.lang.String, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getCdapApi__DeleteArtifact__String_String_String();

	/**
	 * Returns the meta object for the '{@link org.openecomp.ncomp.cdap.CdapApi#startFlow(java.lang.String, java.lang.String, java.lang.String, java.lang.String) <em>Start Flow</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Start Flow</em>' operation.
	 * @see org.openecomp.ncomp.cdap.CdapApi#startFlow(java.lang.String, java.lang.String, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getCdapApi__StartFlow__String_String_String_String();

	/**
	 * Returns the meta object for the '{@link org.openecomp.ncomp.cdap.CdapApi#startWorker(java.lang.String, java.lang.String, java.lang.String, java.lang.String) <em>Start Worker</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Start Worker</em>' operation.
	 * @see org.openecomp.ncomp.cdap.CdapApi#startWorker(java.lang.String, java.lang.String, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getCdapApi__StartWorker__String_String_String_String();

	/**
	 * Returns the meta object for the '{@link org.openecomp.ncomp.cdap.CdapApi#startService(java.lang.String, java.lang.String, java.lang.String, java.lang.String) <em>Start Service</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Start Service</em>' operation.
	 * @see org.openecomp.ncomp.cdap.CdapApi#startService(java.lang.String, java.lang.String, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getCdapApi__StartService__String_String_String_String();

	/**
	 * Returns the meta object for the '{@link org.openecomp.ncomp.cdap.CdapApi#startApp(java.lang.String, java.lang.String) <em>Start App</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Start App</em>' operation.
	 * @see org.openecomp.ncomp.cdap.CdapApi#startApp(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getCdapApi__StartApp__String_String();

	/**
	 * Returns the meta object for the '{@link org.openecomp.ncomp.cdap.CdapApi#stopApp(java.lang.String, java.lang.String, java.lang.String) <em>Stop App</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Stop App</em>' operation.
	 * @see org.openecomp.ncomp.cdap.CdapApi#stopApp(java.lang.String, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getCdapApi__StopApp__String_String_String();

	/**
	 * Returns the meta object for the '{@link org.openecomp.ncomp.cdap.CdapApi#deleteApp(java.lang.String, java.lang.String) <em>Delete App</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Delete App</em>' operation.
	 * @see org.openecomp.ncomp.cdap.CdapApi#deleteApp(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getCdapApi__DeleteApp__String_String();

	/**
	 * Returns the meta object for the '{@link org.openecomp.ncomp.cdap.CdapApi#loadPreferencesApp(java.lang.String, java.lang.String, java.lang.String) <em>Load Preferences App</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Load Preferences App</em>' operation.
	 * @see org.openecomp.ncomp.cdap.CdapApi#loadPreferencesApp(java.lang.String, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getCdapApi__LoadPreferencesApp__String_String_String();

	/**
	 * Returns the meta object for the '{@link org.openecomp.ncomp.cdap.CdapApi#loadPreferencesFlow(java.lang.String, java.lang.String, java.lang.String, java.lang.String) <em>Load Preferences Flow</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Load Preferences Flow</em>' operation.
	 * @see org.openecomp.ncomp.cdap.CdapApi#loadPreferencesFlow(java.lang.String, java.lang.String, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getCdapApi__LoadPreferencesFlow__String_String_String_String();

	/**
	 * Returns the meta object for the '{@link org.openecomp.ncomp.cdap.CdapApi#loadPreferencesNameSpace(java.lang.String, java.lang.String) <em>Load Preferences Name Space</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Load Preferences Name Space</em>' operation.
	 * @see org.openecomp.ncomp.cdap.CdapApi#loadPreferencesNameSpace(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getCdapApi__LoadPreferencesNameSpace__String_String();

	/**
	 * Returns the meta object for the '{@link org.openecomp.ncomp.cdap.CdapApi#setPreferencesApp(java.lang.String, java.lang.String, java.lang.String) <em>Set Preferences App</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Preferences App</em>' operation.
	 * @see org.openecomp.ncomp.cdap.CdapApi#setPreferencesApp(java.lang.String, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getCdapApi__SetPreferencesApp__String_String_String();

	/**
	 * Returns the meta object for the '{@link org.openecomp.ncomp.cdap.CdapApi#setPreferencesFlow(java.lang.String, java.lang.String, java.lang.String, java.lang.String) <em>Set Preferences Flow</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Preferences Flow</em>' operation.
	 * @see org.openecomp.ncomp.cdap.CdapApi#setPreferencesFlow(java.lang.String, java.lang.String, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getCdapApi__SetPreferencesFlow__String_String_String_String();

	/**
	 * Returns the meta object for the '{@link org.openecomp.ncomp.cdap.CdapApi#setPreferencesWorker(java.lang.String, java.lang.String, java.lang.String, java.lang.String) <em>Set Preferences Worker</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Preferences Worker</em>' operation.
	 * @see org.openecomp.ncomp.cdap.CdapApi#setPreferencesWorker(java.lang.String, java.lang.String, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getCdapApi__SetPreferencesWorker__String_String_String_String();

	/**
	 * Returns the meta object for the '{@link org.openecomp.ncomp.cdap.CdapApi#setPreferencesService(java.lang.String, java.lang.String, java.lang.String, java.lang.String) <em>Set Preferences Service</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Preferences Service</em>' operation.
	 * @see org.openecomp.ncomp.cdap.CdapApi#setPreferencesService(java.lang.String, java.lang.String, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getCdapApi__SetPreferencesService__String_String_String_String();

	/**
	 * Returns the meta object for the '{@link org.openecomp.ncomp.cdap.CdapApi#setPreferencesNameSpace(java.lang.String, java.lang.String) <em>Set Preferences Name Space</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Preferences Name Space</em>' operation.
	 * @see org.openecomp.ncomp.cdap.CdapApi#setPreferencesNameSpace(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getCdapApi__SetPreferencesNameSpace__String_String();

	/**
	 * Returns the meta object for the '{@link org.openecomp.ncomp.cdap.CdapApi#setFlowRunTimeArgs(java.lang.String, java.lang.String, java.lang.String, java.lang.String) <em>Set Flow Run Time Args</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Flow Run Time Args</em>' operation.
	 * @see org.openecomp.ncomp.cdap.CdapApi#setFlowRunTimeArgs(java.lang.String, java.lang.String, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getCdapApi__SetFlowRunTimeArgs__String_String_String_String();

	/**
	 * Returns the meta object for the '{@link org.openecomp.ncomp.cdap.CdapApi#setFlowletInstances(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int) <em>Set Flowlet Instances</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Flowlet Instances</em>' operation.
	 * @see org.openecomp.ncomp.cdap.CdapApi#setFlowletInstances(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int)
	 * @generated
	 */
	EOperation getCdapApi__SetFlowletInstances__String_String_String_String_int();

	/**
	 * Returns the meta object for the '{@link org.openecomp.ncomp.cdap.CdapApi#stopFlow(java.lang.String, java.lang.String, java.lang.String) <em>Stop Flow</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Stop Flow</em>' operation.
	 * @see org.openecomp.ncomp.cdap.CdapApi#stopFlow(java.lang.String, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getCdapApi__StopFlow__String_String_String();

	/**
	 * Returns the meta object for the '{@link org.openecomp.ncomp.cdap.CdapApi#stopWorker(java.lang.String, java.lang.String, java.lang.String) <em>Stop Worker</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Stop Worker</em>' operation.
	 * @see org.openecomp.ncomp.cdap.CdapApi#stopWorker(java.lang.String, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getCdapApi__StopWorker__String_String_String();

	/**
	 * Returns the meta object for the '{@link org.openecomp.ncomp.cdap.CdapApi#stopService(java.lang.String, java.lang.String, java.lang.String) <em>Stop Service</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Stop Service</em>' operation.
	 * @see org.openecomp.ncomp.cdap.CdapApi#stopService(java.lang.String, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getCdapApi__StopService__String_String_String();

	/**
	 * Returns the meta object for the '{@link org.openecomp.ncomp.cdap.CdapApi#truncateDataSet(java.lang.String, java.lang.String) <em>Truncate Data Set</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Truncate Data Set</em>' operation.
	 * @see org.openecomp.ncomp.cdap.CdapApi#truncateDataSet(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getCdapApi__TruncateDataSet__String_String();

	/**
	 * Returns the meta object for the '{@link org.openecomp.ncomp.cdap.CdapApi#deleteDataset(java.lang.String, java.lang.String) <em>Delete Dataset</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Delete Dataset</em>' operation.
	 * @see org.openecomp.ncomp.cdap.CdapApi#deleteDataset(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getCdapApi__DeleteDataset__String_String();

	/**
	 * Returns the meta object for the '{@link org.openecomp.ncomp.cdap.CdapApi#createStream(java.lang.String, java.lang.String) <em>Create Stream</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Stream</em>' operation.
	 * @see org.openecomp.ncomp.cdap.CdapApi#createStream(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getCdapApi__CreateStream__String_String();

	/**
	 * Returns the meta object for the '{@link org.openecomp.ncomp.cdap.CdapApi#deleteStream(java.lang.String, java.lang.String) <em>Delete Stream</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Delete Stream</em>' operation.
	 * @see org.openecomp.ncomp.cdap.CdapApi#deleteStream(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getCdapApi__DeleteStream__String_String();

	/**
	 * Returns the meta object for the '{@link org.openecomp.ncomp.cdap.CdapApi#getStreamEvents(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int) <em>Get Stream Events</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Stream Events</em>' operation.
	 * @see org.openecomp.ncomp.cdap.CdapApi#getStreamEvents(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int)
	 * @generated
	 */
	EOperation getCdapApi__GetStreamEvents__String_String_String_String_int();

	/**
	 * Returns the meta object for the '{@link org.openecomp.ncomp.cdap.CdapApi#getStreamStats(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int) <em>Get Stream Stats</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Stream Stats</em>' operation.
	 * @see org.openecomp.ncomp.cdap.CdapApi#getStreamStats(java.lang.String, java.lang.String, java.lang.String, java.lang.String, int)
	 * @generated
	 */
	EOperation getCdapApi__GetStreamStats__String_String_String_String_int();

	/**
	 * Returns the meta object for the '{@link org.openecomp.ncomp.cdap.CdapApi#sendEventToStream(java.lang.String, java.lang.String, java.lang.String) <em>Send Event To Stream</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Send Event To Stream</em>' operation.
	 * @see org.openecomp.ncomp.cdap.CdapApi#sendEventToStream(java.lang.String, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getCdapApi__SendEventToStream__String_String_String();

	/**
	 * Returns the meta object for the '{@link org.openecomp.ncomp.cdap.CdapApi#trucateStream(java.lang.String, java.lang.String) <em>Trucate Stream</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Trucate Stream</em>' operation.
	 * @see org.openecomp.ncomp.cdap.CdapApi#trucateStream(java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getCdapApi__TrucateStream__String_String();

	/**
	 * Returns the meta object for the '{@link org.openecomp.ncomp.cdap.CdapApi#setStreamProperties(java.lang.String, java.lang.String, java.lang.String) <em>Set Stream Properties</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Stream Properties</em>' operation.
	 * @see org.openecomp.ncomp.cdap.CdapApi#setStreamProperties(java.lang.String, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getCdapApi__SetStreamProperties__String_String_String();

	/**
	 * Returns the meta object for the '{@link org.openecomp.ncomp.cdap.CdapApi#restartApp(java.lang.String, java.lang.String, java.lang.String) <em>Restart App</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Restart App</em>' operation.
	 * @see org.openecomp.ncomp.cdap.CdapApi#restartApp(java.lang.String, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getCdapApi__RestartApp__String_String_String();

	/**
	 * Returns the meta object for the '{@link org.openecomp.ncomp.cdap.CdapApi#createApp(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String) <em>Create App</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create App</em>' operation.
	 * @see org.openecomp.ncomp.cdap.CdapApi#createApp(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getCdapApi__CreateApp__String_String_String_String_String();

	/**
	 * Returns the meta object for the '{@link org.openecomp.ncomp.cdap.CdapApi#createAppWithConfig(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String) <em>Create App With Config</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create App With Config</em>' operation.
	 * @see org.openecomp.ncomp.cdap.CdapApi#createAppWithConfig(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getCdapApi__CreateAppWithConfig__String_String_String_String_String_String();

	/**
	 * Returns the meta object for the '{@link org.openecomp.ncomp.cdap.CdapApi#setDatasetProperties(java.lang.String, java.lang.String, java.lang.String) <em>Set Dataset Properties</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Dataset Properties</em>' operation.
	 * @see org.openecomp.ncomp.cdap.CdapApi#setDatasetProperties(java.lang.String, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getCdapApi__SetDatasetProperties__String_String_String();

	/**
	 * Returns the meta object for the '{@link org.openecomp.ncomp.cdap.CdapApi#setStreamTTL(java.lang.String, java.lang.String, int) <em>Set Stream TTL</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Stream TTL</em>' operation.
	 * @see org.openecomp.ncomp.cdap.CdapApi#setStreamTTL(java.lang.String, java.lang.String, int)
	 * @generated
	 */
	EOperation getCdapApi__SetStreamTTL__String_String_int();

	/**
	 * Returns the meta object for the '{@link org.openecomp.ncomp.cdap.CdapApi#suspendSchedule(java.lang.String, java.lang.String, java.lang.String) <em>Suspend Schedule</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Suspend Schedule</em>' operation.
	 * @see org.openecomp.ncomp.cdap.CdapApi#suspendSchedule(java.lang.String, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getCdapApi__SuspendSchedule__String_String_String();

	/**
	 * Returns the meta object for the '{@link org.openecomp.ncomp.cdap.CdapApi#resumeSchedule(java.lang.String, java.lang.String, java.lang.String) <em>Resume Schedule</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Resume Schedule</em>' operation.
	 * @see org.openecomp.ncomp.cdap.CdapApi#resumeSchedule(java.lang.String, java.lang.String, java.lang.String)
	 * @generated
	 */
	EOperation getCdapApi__ResumeSchedule__String_String_String();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.cdap.CdapConfiguration <em>Configuration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Configuration</em>'.
	 * @see org.openecomp.ncomp.cdap.CdapConfiguration
	 * @generated
	 */
	EClass getCdapConfiguration();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.cdap.CdapConfiguration#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.openecomp.ncomp.cdap.CdapConfiguration#getValue()
	 * @see #getCdapConfiguration()
	 * @generated
	 */
	EAttribute getCdapConfiguration_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.cdap.CdapConfiguration#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see org.openecomp.ncomp.cdap.CdapConfiguration#getSource()
	 * @see #getCdapConfiguration()
	 * @generated
	 */
	EAttribute getCdapConfiguration_Source();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.cdap.CdapNamespace <em>Namespace</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Namespace</em>'.
	 * @see org.openecomp.ncomp.cdap.CdapNamespace
	 * @generated
	 */
	EClass getCdapNamespace();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.cdap.CdapNamespace#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.openecomp.ncomp.cdap.CdapNamespace#getDescription()
	 * @see #getCdapNamespace()
	 * @generated
	 */
	EAttribute getCdapNamespace_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.ncomp.cdap.CdapNamespace#getConfig <em>Config</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Config</em>'.
	 * @see org.openecomp.ncomp.cdap.CdapNamespace#getConfig()
	 * @see #getCdapNamespace()
	 * @generated
	 */
	EReference getCdapNamespace_Config();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.ncomp.cdap.CdapNamespace#getDatasets <em>Datasets</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Datasets</em>'.
	 * @see org.openecomp.ncomp.cdap.CdapNamespace#getDatasets()
	 * @see #getCdapNamespace()
	 * @generated
	 */
	EReference getCdapNamespace_Datasets();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.ncomp.cdap.CdapNamespace#getApplications <em>Applications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Applications</em>'.
	 * @see org.openecomp.ncomp.cdap.CdapNamespace#getApplications()
	 * @see #getCdapNamespace()
	 * @generated
	 */
	EReference getCdapNamespace_Applications();

	/**
	 * Returns the meta object for the container reference '{@link org.openecomp.ncomp.cdap.CdapNamespace#getCluster <em>Cluster</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Cluster</em>'.
	 * @see org.openecomp.ncomp.cdap.CdapNamespace#getCluster()
	 * @see #getCdapNamespace()
	 * @generated
	 */
	EReference getCdapNamespace_Cluster();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.cdap.CdapKeyPair <em>Key Pair</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Key Pair</em>'.
	 * @see org.openecomp.ncomp.cdap.CdapKeyPair
	 * @generated
	 */
	EClass getCdapKeyPair();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.cdap.CdapKeyPair#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.openecomp.ncomp.cdap.CdapKeyPair#getValue()
	 * @see #getCdapKeyPair()
	 * @generated
	 */
	EAttribute getCdapKeyPair_Value();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.cdap.CdapEntityWithPreferences <em>Entity With Preferences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entity With Preferences</em>'.
	 * @see org.openecomp.ncomp.cdap.CdapEntityWithPreferences
	 * @generated
	 */
	EClass getCdapEntityWithPreferences();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.ncomp.cdap.CdapEntityWithPreferences#getPreferences <em>Preferences</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Preferences</em>'.
	 * @see org.openecomp.ncomp.cdap.CdapEntityWithPreferences#getPreferences()
	 * @see #getCdapEntityWithPreferences()
	 * @generated
	 */
	EReference getCdapEntityWithPreferences_Preferences();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.cdap.CdapDataset <em>Dataset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dataset</em>'.
	 * @see org.openecomp.ncomp.cdap.CdapDataset
	 * @generated
	 */
	EClass getCdapDataset();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.cdap.CdapDataset#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.openecomp.ncomp.cdap.CdapDataset#getType()
	 * @see #getCdapDataset()
	 * @generated
	 */
	EAttribute getCdapDataset_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.ncomp.cdap.CdapDataset#getProperties <em>Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Properties</em>'.
	 * @see org.openecomp.ncomp.cdap.CdapDataset#getProperties()
	 * @see #getCdapDataset()
	 * @generated
	 */
	EReference getCdapDataset_Properties();

	/**
	 * Returns the meta object for the containment reference '{@link org.openecomp.ncomp.cdap.CdapDataset#getSchema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Schema</em>'.
	 * @see org.openecomp.ncomp.cdap.CdapDataset#getSchema()
	 * @see #getCdapDataset()
	 * @generated
	 */
	EReference getCdapDataset_Schema();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.cdap.CdapDatasetSchema <em>Dataset Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dataset Schema</em>'.
	 * @see org.openecomp.ncomp.cdap.CdapDatasetSchema
	 * @generated
	 */
	EClass getCdapDatasetSchema();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.cdap.CdapDatasetSchema#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.openecomp.ncomp.cdap.CdapDatasetSchema#getType()
	 * @see #getCdapDatasetSchema()
	 * @generated
	 */
	EAttribute getCdapDatasetSchema_Type();

	/**
	 * Returns the meta object for the containment reference list '{@link org.openecomp.ncomp.cdap.CdapDatasetSchema#getFields <em>Fields</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fields</em>'.
	 * @see org.openecomp.ncomp.cdap.CdapDatasetSchema#getFields()
	 * @see #getCdapDatasetSchema()
	 * @generated
	 */
	EReference getCdapDatasetSchema_Fields();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.cdap.CdapDatasetSchemaField <em>Dataset Schema Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dataset Schema Field</em>'.
	 * @see org.openecomp.ncomp.cdap.CdapDatasetSchemaField
	 * @generated
	 */
	EClass getCdapDatasetSchemaField();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.cdap.CdapDatasetSchemaField#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.openecomp.ncomp.cdap.CdapDatasetSchemaField#getType()
	 * @see #getCdapDatasetSchemaField()
	 * @generated
	 */
	EAttribute getCdapDatasetSchemaField_Type();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.cdap.CdapApplication <em>Application</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Application</em>'.
	 * @see org.openecomp.ncomp.cdap.CdapApplication
	 * @generated
	 */
	EClass getCdapApplication();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.cdap.CdapApplication#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.openecomp.ncomp.cdap.CdapApplication#getType()
	 * @see #getCdapApplication()
	 * @generated
	 */
	EAttribute getCdapApplication_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.cdap.CdapApplication#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.openecomp.ncomp.cdap.CdapApplication#getId()
	 * @see #getCdapApplication()
	 * @generated
	 */
	EAttribute getCdapApplication_Id();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.cdap.CdapApplication#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.openecomp.ncomp.cdap.CdapApplication#getVersion()
	 * @see #getCdapApplication()
	 * @generated
	 */
	EAttribute getCdapApplication_Version();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.cdap.CdapApplication#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see org.openecomp.ncomp.cdap.CdapApplication#getDescription()
	 * @see #getCdapApplication()
	 * @generated
	 */
	EAttribute getCdapApplication_Description();

	/**
	 * Returns the meta object for the containment reference '{@link org.openecomp.ncomp.cdap.CdapApplication#getArtifact <em>Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Artifact</em>'.
	 * @see org.openecomp.ncomp.cdap.CdapApplication#getArtifact()
	 * @see #getCdapApplication()
	 * @generated
	 */
	EReference getCdapApplication_Artifact();

	/**
	 * Returns the meta object for class '{@link org.openecomp.ncomp.cdap.CdapArtifact <em>Artifact</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Artifact</em>'.
	 * @see org.openecomp.ncomp.cdap.CdapArtifact
	 * @generated
	 */
	EClass getCdapArtifact();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.cdap.CdapArtifact#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.openecomp.ncomp.cdap.CdapArtifact#getVersion()
	 * @see #getCdapArtifact()
	 * @generated
	 */
	EAttribute getCdapArtifact_Version();

	/**
	 * Returns the meta object for the attribute '{@link org.openecomp.ncomp.cdap.CdapArtifact#getScope <em>Scope</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scope</em>'.
	 * @see org.openecomp.ncomp.cdap.CdapArtifact#getScope()
	 * @see #getCdapArtifact()
	 * @generated
	 */
	EAttribute getCdapArtifact_Scope();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	CdapFactory getCdapFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.cdap.impl.CdapAdaptorImpl <em>Adaptor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.cdap.impl.CdapAdaptorImpl
		 * @see org.openecomp.ncomp.cdap.impl.CdapPackageImpl#getCdapAdaptor()
		 * @generated
		 */
		EClass CDAP_ADAPTOR = eINSTANCE.getCdapAdaptor();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.cdap.impl.CdapClusterImpl <em>Cluster</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.cdap.impl.CdapClusterImpl
		 * @see org.openecomp.ncomp.cdap.impl.CdapPackageImpl#getCdapCluster()
		 * @generated
		 */
		EClass CDAP_CLUSTER = eINSTANCE.getCdapCluster();

		/**
		 * The meta object literal for the '<em><b>Base Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CDAP_CLUSTER__BASE_URL = eINSTANCE.getCdapCluster_BaseUrl();

		/**
		 * The meta object literal for the '<em><b>Polling Frequency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CDAP_CLUSTER__POLLING_FREQUENCY = eINSTANCE.getCdapCluster_PollingFrequency();

		/**
		 * The meta object literal for the '<em><b>Remote</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CDAP_CLUSTER__REMOTE = eINSTANCE.getCdapCluster_Remote();

		/**
		 * The meta object literal for the '<em><b>Configurations</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CDAP_CLUSTER__CONFIGURATIONS = eINSTANCE.getCdapCluster_Configurations();

		/**
		 * The meta object literal for the '<em><b>Namespaces</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CDAP_CLUSTER__NAMESPACES = eINSTANCE.getCdapCluster_Namespaces();

		/**
		 * The meta object literal for the '<em><b>Poll</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CDAP_CLUSTER___POLL = eINSTANCE.getCdapCluster__Poll();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.cdap.impl.CdapApiImpl <em>Api</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.cdap.impl.CdapApiImpl
		 * @see org.openecomp.ncomp.cdap.impl.CdapPackageImpl#getCdapApi()
		 * @generated
		 */
		EClass CDAP_API = eINSTANCE.getCdapApi();

		/**
		 * The meta object literal for the '<em><b>Create Namespace</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CDAP_API___CREATE_NAMESPACE__STRING = eINSTANCE.getCdapApi__CreateNamespace__String();

		/**
		 * The meta object literal for the '<em><b>Delete Namespace</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CDAP_API___DELETE_NAMESPACE__STRING = eINSTANCE.getCdapApi__DeleteNamespace__String();

		/**
		 * The meta object literal for the '<em><b>Deploy App</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CDAP_API___DEPLOY_APP__STRING_STRING = eINSTANCE.getCdapApi__DeployApp__String_String();

		/**
		 * The meta object literal for the '<em><b>Load Artifact</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CDAP_API___LOAD_ARTIFACT__STRING_STRING_STRING_STRING = eINSTANCE.getCdapApi__LoadArtifact__String_String_String_String();

		/**
		 * The meta object literal for the '<em><b>Load Artifact With Config</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CDAP_API___LOAD_ARTIFACT_WITH_CONFIG__STRING_STRING_STRING_STRING_STRING = eINSTANCE.getCdapApi__LoadArtifactWithConfig__String_String_String_String_String();

		/**
		 * The meta object literal for the '<em><b>Delete Artifact</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CDAP_API___DELETE_ARTIFACT__STRING_STRING_STRING = eINSTANCE.getCdapApi__DeleteArtifact__String_String_String();

		/**
		 * The meta object literal for the '<em><b>Start Flow</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CDAP_API___START_FLOW__STRING_STRING_STRING_STRING = eINSTANCE.getCdapApi__StartFlow__String_String_String_String();

		/**
		 * The meta object literal for the '<em><b>Start Worker</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CDAP_API___START_WORKER__STRING_STRING_STRING_STRING = eINSTANCE.getCdapApi__StartWorker__String_String_String_String();

		/**
		 * The meta object literal for the '<em><b>Start Service</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CDAP_API___START_SERVICE__STRING_STRING_STRING_STRING = eINSTANCE.getCdapApi__StartService__String_String_String_String();

		/**
		 * The meta object literal for the '<em><b>Start App</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CDAP_API___START_APP__STRING_STRING = eINSTANCE.getCdapApi__StartApp__String_String();

		/**
		 * The meta object literal for the '<em><b>Stop App</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CDAP_API___STOP_APP__STRING_STRING_STRING = eINSTANCE.getCdapApi__StopApp__String_String_String();

		/**
		 * The meta object literal for the '<em><b>Delete App</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CDAP_API___DELETE_APP__STRING_STRING = eINSTANCE.getCdapApi__DeleteApp__String_String();

		/**
		 * The meta object literal for the '<em><b>Load Preferences App</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CDAP_API___LOAD_PREFERENCES_APP__STRING_STRING_STRING = eINSTANCE.getCdapApi__LoadPreferencesApp__String_String_String();

		/**
		 * The meta object literal for the '<em><b>Load Preferences Flow</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CDAP_API___LOAD_PREFERENCES_FLOW__STRING_STRING_STRING_STRING = eINSTANCE.getCdapApi__LoadPreferencesFlow__String_String_String_String();

		/**
		 * The meta object literal for the '<em><b>Load Preferences Name Space</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CDAP_API___LOAD_PREFERENCES_NAME_SPACE__STRING_STRING = eINSTANCE.getCdapApi__LoadPreferencesNameSpace__String_String();

		/**
		 * The meta object literal for the '<em><b>Set Preferences App</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CDAP_API___SET_PREFERENCES_APP__STRING_STRING_STRING = eINSTANCE.getCdapApi__SetPreferencesApp__String_String_String();

		/**
		 * The meta object literal for the '<em><b>Set Preferences Flow</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CDAP_API___SET_PREFERENCES_FLOW__STRING_STRING_STRING_STRING = eINSTANCE.getCdapApi__SetPreferencesFlow__String_String_String_String();

		/**
		 * The meta object literal for the '<em><b>Set Preferences Worker</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CDAP_API___SET_PREFERENCES_WORKER__STRING_STRING_STRING_STRING = eINSTANCE.getCdapApi__SetPreferencesWorker__String_String_String_String();

		/**
		 * The meta object literal for the '<em><b>Set Preferences Service</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CDAP_API___SET_PREFERENCES_SERVICE__STRING_STRING_STRING_STRING = eINSTANCE.getCdapApi__SetPreferencesService__String_String_String_String();

		/**
		 * The meta object literal for the '<em><b>Set Preferences Name Space</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CDAP_API___SET_PREFERENCES_NAME_SPACE__STRING_STRING = eINSTANCE.getCdapApi__SetPreferencesNameSpace__String_String();

		/**
		 * The meta object literal for the '<em><b>Set Flow Run Time Args</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CDAP_API___SET_FLOW_RUN_TIME_ARGS__STRING_STRING_STRING_STRING = eINSTANCE.getCdapApi__SetFlowRunTimeArgs__String_String_String_String();

		/**
		 * The meta object literal for the '<em><b>Set Flowlet Instances</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CDAP_API___SET_FLOWLET_INSTANCES__STRING_STRING_STRING_STRING_INT = eINSTANCE.getCdapApi__SetFlowletInstances__String_String_String_String_int();

		/**
		 * The meta object literal for the '<em><b>Stop Flow</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CDAP_API___STOP_FLOW__STRING_STRING_STRING = eINSTANCE.getCdapApi__StopFlow__String_String_String();

		/**
		 * The meta object literal for the '<em><b>Stop Worker</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CDAP_API___STOP_WORKER__STRING_STRING_STRING = eINSTANCE.getCdapApi__StopWorker__String_String_String();

		/**
		 * The meta object literal for the '<em><b>Stop Service</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CDAP_API___STOP_SERVICE__STRING_STRING_STRING = eINSTANCE.getCdapApi__StopService__String_String_String();

		/**
		 * The meta object literal for the '<em><b>Truncate Data Set</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CDAP_API___TRUNCATE_DATA_SET__STRING_STRING = eINSTANCE.getCdapApi__TruncateDataSet__String_String();

		/**
		 * The meta object literal for the '<em><b>Delete Dataset</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CDAP_API___DELETE_DATASET__STRING_STRING = eINSTANCE.getCdapApi__DeleteDataset__String_String();

		/**
		 * The meta object literal for the '<em><b>Create Stream</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CDAP_API___CREATE_STREAM__STRING_STRING = eINSTANCE.getCdapApi__CreateStream__String_String();

		/**
		 * The meta object literal for the '<em><b>Delete Stream</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CDAP_API___DELETE_STREAM__STRING_STRING = eINSTANCE.getCdapApi__DeleteStream__String_String();

		/**
		 * The meta object literal for the '<em><b>Get Stream Events</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CDAP_API___GET_STREAM_EVENTS__STRING_STRING_STRING_STRING_INT = eINSTANCE.getCdapApi__GetStreamEvents__String_String_String_String_int();

		/**
		 * The meta object literal for the '<em><b>Get Stream Stats</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CDAP_API___GET_STREAM_STATS__STRING_STRING_STRING_STRING_INT = eINSTANCE.getCdapApi__GetStreamStats__String_String_String_String_int();

		/**
		 * The meta object literal for the '<em><b>Send Event To Stream</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CDAP_API___SEND_EVENT_TO_STREAM__STRING_STRING_STRING = eINSTANCE.getCdapApi__SendEventToStream__String_String_String();

		/**
		 * The meta object literal for the '<em><b>Trucate Stream</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CDAP_API___TRUCATE_STREAM__STRING_STRING = eINSTANCE.getCdapApi__TrucateStream__String_String();

		/**
		 * The meta object literal for the '<em><b>Set Stream Properties</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CDAP_API___SET_STREAM_PROPERTIES__STRING_STRING_STRING = eINSTANCE.getCdapApi__SetStreamProperties__String_String_String();

		/**
		 * The meta object literal for the '<em><b>Restart App</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CDAP_API___RESTART_APP__STRING_STRING_STRING = eINSTANCE.getCdapApi__RestartApp__String_String_String();

		/**
		 * The meta object literal for the '<em><b>Create App</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CDAP_API___CREATE_APP__STRING_STRING_STRING_STRING_STRING = eINSTANCE.getCdapApi__CreateApp__String_String_String_String_String();

		/**
		 * The meta object literal for the '<em><b>Create App With Config</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CDAP_API___CREATE_APP_WITH_CONFIG__STRING_STRING_STRING_STRING_STRING_STRING = eINSTANCE.getCdapApi__CreateAppWithConfig__String_String_String_String_String_String();

		/**
		 * The meta object literal for the '<em><b>Set Dataset Properties</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CDAP_API___SET_DATASET_PROPERTIES__STRING_STRING_STRING = eINSTANCE.getCdapApi__SetDatasetProperties__String_String_String();

		/**
		 * The meta object literal for the '<em><b>Set Stream TTL</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CDAP_API___SET_STREAM_TTL__STRING_STRING_INT = eINSTANCE.getCdapApi__SetStreamTTL__String_String_int();

		/**
		 * The meta object literal for the '<em><b>Suspend Schedule</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CDAP_API___SUSPEND_SCHEDULE__STRING_STRING_STRING = eINSTANCE.getCdapApi__SuspendSchedule__String_String_String();

		/**
		 * The meta object literal for the '<em><b>Resume Schedule</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CDAP_API___RESUME_SCHEDULE__STRING_STRING_STRING = eINSTANCE.getCdapApi__ResumeSchedule__String_String_String();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.cdap.impl.CdapConfigurationImpl <em>Configuration</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.cdap.impl.CdapConfigurationImpl
		 * @see org.openecomp.ncomp.cdap.impl.CdapPackageImpl#getCdapConfiguration()
		 * @generated
		 */
		EClass CDAP_CONFIGURATION = eINSTANCE.getCdapConfiguration();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CDAP_CONFIGURATION__VALUE = eINSTANCE.getCdapConfiguration_Value();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CDAP_CONFIGURATION__SOURCE = eINSTANCE.getCdapConfiguration_Source();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.cdap.impl.CdapNamespaceImpl <em>Namespace</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.cdap.impl.CdapNamespaceImpl
		 * @see org.openecomp.ncomp.cdap.impl.CdapPackageImpl#getCdapNamespace()
		 * @generated
		 */
		EClass CDAP_NAMESPACE = eINSTANCE.getCdapNamespace();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CDAP_NAMESPACE__DESCRIPTION = eINSTANCE.getCdapNamespace_Description();

		/**
		 * The meta object literal for the '<em><b>Config</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CDAP_NAMESPACE__CONFIG = eINSTANCE.getCdapNamespace_Config();

		/**
		 * The meta object literal for the '<em><b>Datasets</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CDAP_NAMESPACE__DATASETS = eINSTANCE.getCdapNamespace_Datasets();

		/**
		 * The meta object literal for the '<em><b>Applications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CDAP_NAMESPACE__APPLICATIONS = eINSTANCE.getCdapNamespace_Applications();

		/**
		 * The meta object literal for the '<em><b>Cluster</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CDAP_NAMESPACE__CLUSTER = eINSTANCE.getCdapNamespace_Cluster();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.cdap.impl.CdapKeyPairImpl <em>Key Pair</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.cdap.impl.CdapKeyPairImpl
		 * @see org.openecomp.ncomp.cdap.impl.CdapPackageImpl#getCdapKeyPair()
		 * @generated
		 */
		EClass CDAP_KEY_PAIR = eINSTANCE.getCdapKeyPair();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CDAP_KEY_PAIR__VALUE = eINSTANCE.getCdapKeyPair_Value();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.cdap.impl.CdapEntityWithPreferencesImpl <em>Entity With Preferences</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.cdap.impl.CdapEntityWithPreferencesImpl
		 * @see org.openecomp.ncomp.cdap.impl.CdapPackageImpl#getCdapEntityWithPreferences()
		 * @generated
		 */
		EClass CDAP_ENTITY_WITH_PREFERENCES = eINSTANCE.getCdapEntityWithPreferences();

		/**
		 * The meta object literal for the '<em><b>Preferences</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CDAP_ENTITY_WITH_PREFERENCES__PREFERENCES = eINSTANCE.getCdapEntityWithPreferences_Preferences();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.cdap.impl.CdapDatasetImpl <em>Dataset</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.cdap.impl.CdapDatasetImpl
		 * @see org.openecomp.ncomp.cdap.impl.CdapPackageImpl#getCdapDataset()
		 * @generated
		 */
		EClass CDAP_DATASET = eINSTANCE.getCdapDataset();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CDAP_DATASET__TYPE = eINSTANCE.getCdapDataset_Type();

		/**
		 * The meta object literal for the '<em><b>Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CDAP_DATASET__PROPERTIES = eINSTANCE.getCdapDataset_Properties();

		/**
		 * The meta object literal for the '<em><b>Schema</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CDAP_DATASET__SCHEMA = eINSTANCE.getCdapDataset_Schema();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.cdap.impl.CdapDatasetSchemaImpl <em>Dataset Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.cdap.impl.CdapDatasetSchemaImpl
		 * @see org.openecomp.ncomp.cdap.impl.CdapPackageImpl#getCdapDatasetSchema()
		 * @generated
		 */
		EClass CDAP_DATASET_SCHEMA = eINSTANCE.getCdapDatasetSchema();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CDAP_DATASET_SCHEMA__TYPE = eINSTANCE.getCdapDatasetSchema_Type();

		/**
		 * The meta object literal for the '<em><b>Fields</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CDAP_DATASET_SCHEMA__FIELDS = eINSTANCE.getCdapDatasetSchema_Fields();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.cdap.impl.CdapDatasetSchemaFieldImpl <em>Dataset Schema Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.cdap.impl.CdapDatasetSchemaFieldImpl
		 * @see org.openecomp.ncomp.cdap.impl.CdapPackageImpl#getCdapDatasetSchemaField()
		 * @generated
		 */
		EClass CDAP_DATASET_SCHEMA_FIELD = eINSTANCE.getCdapDatasetSchemaField();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CDAP_DATASET_SCHEMA_FIELD__TYPE = eINSTANCE.getCdapDatasetSchemaField_Type();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.cdap.impl.CdapApplicationImpl <em>Application</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.cdap.impl.CdapApplicationImpl
		 * @see org.openecomp.ncomp.cdap.impl.CdapPackageImpl#getCdapApplication()
		 * @generated
		 */
		EClass CDAP_APPLICATION = eINSTANCE.getCdapApplication();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CDAP_APPLICATION__TYPE = eINSTANCE.getCdapApplication_Type();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CDAP_APPLICATION__ID = eINSTANCE.getCdapApplication_Id();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CDAP_APPLICATION__VERSION = eINSTANCE.getCdapApplication_Version();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CDAP_APPLICATION__DESCRIPTION = eINSTANCE.getCdapApplication_Description();

		/**
		 * The meta object literal for the '<em><b>Artifact</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CDAP_APPLICATION__ARTIFACT = eINSTANCE.getCdapApplication_Artifact();

		/**
		 * The meta object literal for the '{@link org.openecomp.ncomp.cdap.impl.CdapArtifactImpl <em>Artifact</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openecomp.ncomp.cdap.impl.CdapArtifactImpl
		 * @see org.openecomp.ncomp.cdap.impl.CdapPackageImpl#getCdapArtifact()
		 * @generated
		 */
		EClass CDAP_ARTIFACT = eINSTANCE.getCdapArtifact();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CDAP_ARTIFACT__VERSION = eINSTANCE.getCdapArtifact_Version();

		/**
		 * The meta object literal for the '<em><b>Scope</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CDAP_ARTIFACT__SCOPE = eINSTANCE.getCdapArtifact_Scope();

	}

} //CdapPackage
