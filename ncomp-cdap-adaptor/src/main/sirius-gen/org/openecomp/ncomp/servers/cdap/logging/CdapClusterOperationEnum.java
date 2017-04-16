
package org.openecomp.ncomp.servers.cdap.logging;

import org.openecomp.entity.EcompOperationEnum;

public enum CdapClusterOperationEnum implements EcompOperationEnum {

  CdapCluster_createNamespace("CdapCluster@createNamespace"),
  CdapCluster_deleteNamespace("CdapCluster@deleteNamespace"),
  CdapCluster_deployApp("CdapCluster@deployApp"),
  CdapCluster_loadArtifact("CdapCluster@loadArtifact"),
  CdapCluster_loadArtifactWithConfig("CdapCluster@loadArtifactWithConfig"),
  CdapCluster_deleteArtifact("CdapCluster@deleteArtifact"),
  CdapCluster_startFlow("CdapCluster@startFlow"),
  CdapCluster_startWorker("CdapCluster@startWorker"),
  CdapCluster_startService("CdapCluster@startService"),
  CdapCluster_startApp("CdapCluster@startApp"),
  CdapCluster_stopApp("CdapCluster@stopApp"),
  CdapCluster_deleteApp("CdapCluster@deleteApp"),
  CdapCluster_loadPreferencesApp("CdapCluster@loadPreferencesApp"),
  CdapCluster_loadPreferencesFlow("CdapCluster@loadPreferencesFlow"),
  CdapCluster_loadPreferencesNameSpace("CdapCluster@loadPreferencesNameSpace"),
  CdapCluster_setPreferencesApp("CdapCluster@setPreferencesApp"),
  CdapCluster_setPreferencesFlow("CdapCluster@setPreferencesFlow"),
  CdapCluster_setPreferencesWorker("CdapCluster@setPreferencesWorker"),
  CdapCluster_setPreferencesService("CdapCluster@setPreferencesService"),
  CdapCluster_setPreferencesNameSpace("CdapCluster@setPreferencesNameSpace"),
  CdapCluster_setFlowRunTimeArgs("CdapCluster@setFlowRunTimeArgs"),
  CdapCluster_setFlowletInstances("CdapCluster@setFlowletInstances"),
  CdapCluster_stopFlow("CdapCluster@stopFlow"),
  CdapCluster_stopWorker("CdapCluster@stopWorker"),
  CdapCluster_stopService("CdapCluster@stopService"),
  CdapCluster_truncateDataSet("CdapCluster@truncateDataSet"),
  CdapCluster_deleteDataset("CdapCluster@deleteDataset"),
  CdapCluster_createStream("CdapCluster@createStream"),
  CdapCluster_deleteStream("CdapCluster@deleteStream"),
  CdapCluster_getStreamEvents("CdapCluster@getStreamEvents"),
  CdapCluster_getStreamStats("CdapCluster@getStreamStats"),
  CdapCluster_sendEventToStream("CdapCluster@sendEventToStream"),
  CdapCluster_trucateStream("CdapCluster@trucateStream"),
  CdapCluster_setStreamProperties("CdapCluster@setStreamProperties"),
  CdapCluster_restartApp("CdapCluster@restartApp"),
  CdapCluster_createApp("CdapCluster@createApp"),
  CdapCluster_createAppWithConfig("CdapCluster@createAppWithConfig"),
  CdapCluster_setDatasetProperties("CdapCluster@setDatasetProperties"),
  CdapCluster_setStreamTTL("CdapCluster@setStreamTTL"),
  CdapCluster_suspendSchedule("CdapCluster@suspendSchedule"),
  CdapCluster_resumeSchedule("CdapCluster@resumeSchedule"),
  CdapCluster_poll("CdapCluster@poll") ; 


	private String n;
	
	private CdapClusterOperationEnum(String n) {
		this.n = n;
	}

	@Override
	public String toString() {
		return n;
	}

}
