
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
	

package org.openecomp.ncomp.servers.cdap.logging;

import org.openecomp.entity.EcompOperationEnum;

public enum CdapClusterOperationEnum implements EcompOperationEnum {

  createNamespace,
  deleteNamespace,
  deployApp,
  loadArtifact,
  deleteArtifact,
  startFlow,
  startWorker,
  startService,
  startApp,
  stopApp,
  deleteApp,
  loadPreferencesApp,
  loadPreferencesFlow,
  loadPreferencesNameSpace,
  setPreferencesApp,
  setPreferencesFlow,
  setPreferencesWorker,
  setPreferencesService,
  setPreferencesNameSpace,
  setFlowRunTimeArgs,
  setFlowletInstances,
  stopFlow,
  stopWorker,
  stopService,
  truncateDataSet,
  deleteDataset,
  createStream,
  deleteStream,
  getStreamEvents,
  getStreamStats,
  sendEventToStream,
  trucateStream,
  setStreamProperties,
  restartApp,
  createApp,
  createAppWithConfig,
  setDatasetProperties,
  setStreamTTL,
  poll,
  REMOTE_createNamespace,
  REMOTE_deleteNamespace,
  REMOTE_deployApp,
  REMOTE_loadArtifact,
  REMOTE_deleteArtifact,
  REMOTE_startFlow,
  REMOTE_startWorker,
  REMOTE_startService,
  REMOTE_startApp,
  REMOTE_stopApp,
  REMOTE_deleteApp,
  REMOTE_loadPreferencesApp,
  REMOTE_loadPreferencesFlow,
  REMOTE_loadPreferencesNameSpace,
  REMOTE_setPreferencesApp,
  REMOTE_setPreferencesFlow,
  REMOTE_setPreferencesWorker,
  REMOTE_setPreferencesService,
  REMOTE_setPreferencesNameSpace,
  REMOTE_setFlowRunTimeArgs,
  REMOTE_setFlowletInstances,
  REMOTE_stopFlow,
  REMOTE_stopWorker,
  REMOTE_stopService,
  REMOTE_truncateDataSet,
  REMOTE_deleteDataset,
  REMOTE_createStream,
  REMOTE_deleteStream,
  REMOTE_getStreamEvents,
  REMOTE_getStreamStats,
  REMOTE_sendEventToStream,
  REMOTE_trucateStream,
  REMOTE_setStreamProperties,
  REMOTE_restartApp,
  REMOTE_createApp,
  REMOTE_createAppWithConfig,
  REMOTE_setDatasetProperties,
  REMOTE_setStreamTTL,
  REMOTE_poll;
}
