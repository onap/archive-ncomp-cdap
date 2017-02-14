
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
import org.openecomp.ncomp.cdap.CdapCluster;
import org.openecomp.ncomp.cdap.CdapConfiguration;
import org.openecomp.ncomp.cdap.CdapNamespace;
import org.openecomp.ncomp.cdap.CdapPackage;

import org.openecomp.ncomp.core.impl.NamedEntityImpl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cluster</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openecomp.ncomp.cdap.impl.CdapClusterImpl#getBaseUrl <em>Base Url</em>}</li>
 *   <li>{@link org.openecomp.ncomp.cdap.impl.CdapClusterImpl#getPollingFrequency <em>Polling Frequency</em>}</li>
 *   <li>{@link org.openecomp.ncomp.cdap.impl.CdapClusterImpl#isRemote <em>Remote</em>}</li>
 *   <li>{@link org.openecomp.ncomp.cdap.impl.CdapClusterImpl#getConfigurations <em>Configurations</em>}</li>
 *   <li>{@link org.openecomp.ncomp.cdap.impl.CdapClusterImpl#getNamespaces <em>Namespaces</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CdapClusterImpl extends NamedEntityImpl implements CdapCluster {
	/**
	 * The default value of the '{@link #getBaseUrl() <em>Base Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseUrl()
	 * @generated
	 * @ordered
	 */
	protected static final String BASE_URL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBaseUrl() <em>Base Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseUrl()
	 * @generated
	 * @ordered
	 */
	protected String baseUrl = BASE_URL_EDEFAULT;

	/**
	 * The default value of the '{@link #getPollingFrequency() <em>Polling Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPollingFrequency()
	 * @generated
	 * @ordered
	 */
	protected static final long POLLING_FREQUENCY_EDEFAULT = 300000L;

	/**
	 * The cached value of the '{@link #getPollingFrequency() <em>Polling Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPollingFrequency()
	 * @generated
	 * @ordered
	 */
	protected long pollingFrequency = POLLING_FREQUENCY_EDEFAULT;

	/**
	 * The default value of the '{@link #isRemote() <em>Remote</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRemote()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REMOTE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isRemote() <em>Remote</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRemote()
	 * @generated
	 * @ordered
	 */
	protected boolean remote = REMOTE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConfigurations() <em>Configurations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfigurations()
	 * @generated
	 * @ordered
	 */
	protected EList<CdapConfiguration> configurations;

	/**
	 * The cached value of the '{@link #getNamespaces() <em>Namespaces</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNamespaces()
	 * @generated
	 * @ordered
	 */
	protected EList<CdapNamespace> namespaces;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CdapClusterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CdapPackage.Literals.CDAP_CLUSTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getBaseUrl() {
		return baseUrl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseUrl(String newBaseUrl) {
		String oldBaseUrl = baseUrl;
		baseUrl = newBaseUrl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CdapPackage.CDAP_CLUSTER__BASE_URL, oldBaseUrl, baseUrl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public long getPollingFrequency() {
		return pollingFrequency;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPollingFrequency(long newPollingFrequency) {
		long oldPollingFrequency = pollingFrequency;
		pollingFrequency = newPollingFrequency;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CdapPackage.CDAP_CLUSTER__POLLING_FREQUENCY, oldPollingFrequency, pollingFrequency));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isRemote() {
		return remote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemote(boolean newRemote) {
		boolean oldRemote = remote;
		remote = newRemote;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CdapPackage.CDAP_CLUSTER__REMOTE, oldRemote, remote));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CdapConfiguration> getConfigurations() {
		if (configurations == null) {
			configurations = new EObjectContainmentEList<CdapConfiguration>(CdapConfiguration.class, this, CdapPackage.CDAP_CLUSTER__CONFIGURATIONS);
		}
		return configurations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CdapNamespace> getNamespaces() {
		if (namespaces == null) {
			namespaces = new EObjectContainmentWithInverseEList<CdapNamespace>(CdapNamespace.class, this, CdapPackage.CDAP_CLUSTER__NAMESPACES, CdapPackage.CDAP_NAMESPACE__CLUSTER);
		}
		return namespaces;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void poll() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CdapPackage.CDAP_CLUSTER__NAMESPACES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getNamespaces()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CdapPackage.CDAP_CLUSTER__CONFIGURATIONS:
				return ((InternalEList<?>)getConfigurations()).basicRemove(otherEnd, msgs);
			case CdapPackage.CDAP_CLUSTER__NAMESPACES:
				return ((InternalEList<?>)getNamespaces()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CdapPackage.CDAP_CLUSTER__BASE_URL:
				return getBaseUrl();
			case CdapPackage.CDAP_CLUSTER__POLLING_FREQUENCY:
				return getPollingFrequency();
			case CdapPackage.CDAP_CLUSTER__REMOTE:
				return isRemote();
			case CdapPackage.CDAP_CLUSTER__CONFIGURATIONS:
				return getConfigurations();
			case CdapPackage.CDAP_CLUSTER__NAMESPACES:
				return getNamespaces();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case CdapPackage.CDAP_CLUSTER__BASE_URL:
				setBaseUrl((String)newValue);
				return;
			case CdapPackage.CDAP_CLUSTER__POLLING_FREQUENCY:
				setPollingFrequency((Long)newValue);
				return;
			case CdapPackage.CDAP_CLUSTER__REMOTE:
				setRemote((Boolean)newValue);
				return;
			case CdapPackage.CDAP_CLUSTER__CONFIGURATIONS:
				getConfigurations().clear();
				getConfigurations().addAll((Collection<? extends CdapConfiguration>)newValue);
				return;
			case CdapPackage.CDAP_CLUSTER__NAMESPACES:
				getNamespaces().clear();
				getNamespaces().addAll((Collection<? extends CdapNamespace>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case CdapPackage.CDAP_CLUSTER__BASE_URL:
				setBaseUrl(BASE_URL_EDEFAULT);
				return;
			case CdapPackage.CDAP_CLUSTER__POLLING_FREQUENCY:
				setPollingFrequency(POLLING_FREQUENCY_EDEFAULT);
				return;
			case CdapPackage.CDAP_CLUSTER__REMOTE:
				setRemote(REMOTE_EDEFAULT);
				return;
			case CdapPackage.CDAP_CLUSTER__CONFIGURATIONS:
				getConfigurations().clear();
				return;
			case CdapPackage.CDAP_CLUSTER__NAMESPACES:
				getNamespaces().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case CdapPackage.CDAP_CLUSTER__BASE_URL:
				return BASE_URL_EDEFAULT == null ? baseUrl != null : !BASE_URL_EDEFAULT.equals(baseUrl);
			case CdapPackage.CDAP_CLUSTER__POLLING_FREQUENCY:
				return pollingFrequency != POLLING_FREQUENCY_EDEFAULT;
			case CdapPackage.CDAP_CLUSTER__REMOTE:
				return remote != REMOTE_EDEFAULT;
			case CdapPackage.CDAP_CLUSTER__CONFIGURATIONS:
				return configurations != null && !configurations.isEmpty();
			case CdapPackage.CDAP_CLUSTER__NAMESPACES:
				return namespaces != null && !namespaces.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedOperationID(int baseOperationID, Class<?> baseClass) {
		if (baseClass == CdapApi.class) {
			switch (baseOperationID) {
				case CdapPackage.CDAP_API___CREATE_NAMESPACE__STRING: return CdapPackage.CDAP_CLUSTER___CREATE_NAMESPACE__STRING;
				case CdapPackage.CDAP_API___DELETE_NAMESPACE__STRING: return CdapPackage.CDAP_CLUSTER___DELETE_NAMESPACE__STRING;
				case CdapPackage.CDAP_API___DEPLOY_APP__STRING_STRING: return CdapPackage.CDAP_CLUSTER___DEPLOY_APP__STRING_STRING;
				case CdapPackage.CDAP_API___LOAD_ARTIFACT__STRING_STRING_STRING_STRING: return CdapPackage.CDAP_CLUSTER___LOAD_ARTIFACT__STRING_STRING_STRING_STRING;
				case CdapPackage.CDAP_API___DELETE_ARTIFACT__STRING_STRING_STRING: return CdapPackage.CDAP_CLUSTER___DELETE_ARTIFACT__STRING_STRING_STRING;
				case CdapPackage.CDAP_API___START_FLOW__STRING_STRING_STRING_STRING: return CdapPackage.CDAP_CLUSTER___START_FLOW__STRING_STRING_STRING_STRING;
				case CdapPackage.CDAP_API___START_WORKER__STRING_STRING_STRING_STRING: return CdapPackage.CDAP_CLUSTER___START_WORKER__STRING_STRING_STRING_STRING;
				case CdapPackage.CDAP_API___START_SERVICE__STRING_STRING_STRING_STRING: return CdapPackage.CDAP_CLUSTER___START_SERVICE__STRING_STRING_STRING_STRING;
				case CdapPackage.CDAP_API___START_APP__STRING_STRING: return CdapPackage.CDAP_CLUSTER___START_APP__STRING_STRING;
				case CdapPackage.CDAP_API___STOP_APP__STRING_STRING: return CdapPackage.CDAP_CLUSTER___STOP_APP__STRING_STRING;
				case CdapPackage.CDAP_API___DELETE_APP__STRING_STRING: return CdapPackage.CDAP_CLUSTER___DELETE_APP__STRING_STRING;
				case CdapPackage.CDAP_API___LOAD_PREFERENCES_APP__STRING_STRING_STRING: return CdapPackage.CDAP_CLUSTER___LOAD_PREFERENCES_APP__STRING_STRING_STRING;
				case CdapPackage.CDAP_API___LOAD_PREFERENCES_FLOW__STRING_STRING_STRING_STRING: return CdapPackage.CDAP_CLUSTER___LOAD_PREFERENCES_FLOW__STRING_STRING_STRING_STRING;
				case CdapPackage.CDAP_API___LOAD_PREFERENCES_NAME_SPACE__STRING_STRING: return CdapPackage.CDAP_CLUSTER___LOAD_PREFERENCES_NAME_SPACE__STRING_STRING;
				case CdapPackage.CDAP_API___SET_PREFERENCES_APP__STRING_STRING_STRING: return CdapPackage.CDAP_CLUSTER___SET_PREFERENCES_APP__STRING_STRING_STRING;
				case CdapPackage.CDAP_API___SET_PREFERENCES_FLOW__STRING_STRING_STRING_STRING: return CdapPackage.CDAP_CLUSTER___SET_PREFERENCES_FLOW__STRING_STRING_STRING_STRING;
				case CdapPackage.CDAP_API___SET_PREFERENCES_WORKER__STRING_STRING_STRING_STRING: return CdapPackage.CDAP_CLUSTER___SET_PREFERENCES_WORKER__STRING_STRING_STRING_STRING;
				case CdapPackage.CDAP_API___SET_PREFERENCES_SERVICE__STRING_STRING_STRING_STRING: return CdapPackage.CDAP_CLUSTER___SET_PREFERENCES_SERVICE__STRING_STRING_STRING_STRING;
				case CdapPackage.CDAP_API___SET_PREFERENCES_NAME_SPACE__STRING_STRING: return CdapPackage.CDAP_CLUSTER___SET_PREFERENCES_NAME_SPACE__STRING_STRING;
				case CdapPackage.CDAP_API___SET_FLOW_RUN_TIME_ARGS__STRING_STRING_STRING_STRING: return CdapPackage.CDAP_CLUSTER___SET_FLOW_RUN_TIME_ARGS__STRING_STRING_STRING_STRING;
				case CdapPackage.CDAP_API___SET_FLOWLET_INSTANCES__STRING_STRING_STRING_STRING_INT: return CdapPackage.CDAP_CLUSTER___SET_FLOWLET_INSTANCES__STRING_STRING_STRING_STRING_INT;
				case CdapPackage.CDAP_API___STOP_FLOW__STRING_STRING_STRING: return CdapPackage.CDAP_CLUSTER___STOP_FLOW__STRING_STRING_STRING;
				case CdapPackage.CDAP_API___STOP_WORKER__STRING_STRING_STRING: return CdapPackage.CDAP_CLUSTER___STOP_WORKER__STRING_STRING_STRING;
				case CdapPackage.CDAP_API___STOP_SERVICE__STRING_STRING_STRING: return CdapPackage.CDAP_CLUSTER___STOP_SERVICE__STRING_STRING_STRING;
				case CdapPackage.CDAP_API___TRUNCATE_DATA_SET__STRING_STRING: return CdapPackage.CDAP_CLUSTER___TRUNCATE_DATA_SET__STRING_STRING;
				case CdapPackage.CDAP_API___DELETE_DATASET__STRING_STRING: return CdapPackage.CDAP_CLUSTER___DELETE_DATASET__STRING_STRING;
				case CdapPackage.CDAP_API___CREATE_STREAM__STRING_STRING: return CdapPackage.CDAP_CLUSTER___CREATE_STREAM__STRING_STRING;
				case CdapPackage.CDAP_API___DELETE_STREAM__STRING_STRING: return CdapPackage.CDAP_CLUSTER___DELETE_STREAM__STRING_STRING;
				case CdapPackage.CDAP_API___GET_STREAM_EVENTS__STRING_STRING_STRING_STRING_INT: return CdapPackage.CDAP_CLUSTER___GET_STREAM_EVENTS__STRING_STRING_STRING_STRING_INT;
				case CdapPackage.CDAP_API___GET_STREAM_STATS__STRING_STRING_STRING_STRING_INT: return CdapPackage.CDAP_CLUSTER___GET_STREAM_STATS__STRING_STRING_STRING_STRING_INT;
				case CdapPackage.CDAP_API___SEND_EVENT_TO_STREAM__STRING_STRING_STRING: return CdapPackage.CDAP_CLUSTER___SEND_EVENT_TO_STREAM__STRING_STRING_STRING;
				case CdapPackage.CDAP_API___TRUCATE_STREAM__STRING_STRING: return CdapPackage.CDAP_CLUSTER___TRUCATE_STREAM__STRING_STRING;
				case CdapPackage.CDAP_API___SET_STREAM_PROPERTIES__STRING_STRING_STRING: return CdapPackage.CDAP_CLUSTER___SET_STREAM_PROPERTIES__STRING_STRING_STRING;
				case CdapPackage.CDAP_API___RESTART_APP__STRING_STRING_STRING: return CdapPackage.CDAP_CLUSTER___RESTART_APP__STRING_STRING_STRING;
				case CdapPackage.CDAP_API___CREATE_APP__STRING_STRING_STRING_STRING_STRING: return CdapPackage.CDAP_CLUSTER___CREATE_APP__STRING_STRING_STRING_STRING_STRING;
				case CdapPackage.CDAP_API___CREATE_APP_WITH_CONFIG__STRING_STRING_STRING_STRING_STRING_STRING: return CdapPackage.CDAP_CLUSTER___CREATE_APP_WITH_CONFIG__STRING_STRING_STRING_STRING_STRING_STRING;
				case CdapPackage.CDAP_API___SET_DATASET_PROPERTIES__STRING_STRING_STRING: return CdapPackage.CDAP_CLUSTER___SET_DATASET_PROPERTIES__STRING_STRING_STRING;
				case CdapPackage.CDAP_API___SET_STREAM_TTL__STRING_STRING_INT: return CdapPackage.CDAP_CLUSTER___SET_STREAM_TTL__STRING_STRING_INT;
				default: return -1;
			}
		}
		return super.eDerivedOperationID(baseOperationID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case CdapPackage.CDAP_CLUSTER___POLL:
				poll();
				return null;
			case CdapPackage.CDAP_CLUSTER___CREATE_NAMESPACE__STRING:
				return createNamespace((String)arguments.get(0));
			case CdapPackage.CDAP_CLUSTER___DELETE_NAMESPACE__STRING:
				return deleteNamespace((String)arguments.get(0));
			case CdapPackage.CDAP_CLUSTER___DEPLOY_APP__STRING_STRING:
				return deployApp((String)arguments.get(0), (String)arguments.get(1));
			case CdapPackage.CDAP_CLUSTER___LOAD_ARTIFACT__STRING_STRING_STRING_STRING:
				return loadArtifact((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3));
			case CdapPackage.CDAP_CLUSTER___DELETE_ARTIFACT__STRING_STRING_STRING:
				return deleteArtifact((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2));
			case CdapPackage.CDAP_CLUSTER___START_FLOW__STRING_STRING_STRING_STRING:
				return startFlow((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3));
			case CdapPackage.CDAP_CLUSTER___START_WORKER__STRING_STRING_STRING_STRING:
				return startWorker((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3));
			case CdapPackage.CDAP_CLUSTER___START_SERVICE__STRING_STRING_STRING_STRING:
				return startService((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3));
			case CdapPackage.CDAP_CLUSTER___START_APP__STRING_STRING:
				return startApp((String)arguments.get(0), (String)arguments.get(1));
			case CdapPackage.CDAP_CLUSTER___STOP_APP__STRING_STRING:
				return stopApp((String)arguments.get(0), (String)arguments.get(1));
			case CdapPackage.CDAP_CLUSTER___DELETE_APP__STRING_STRING:
				return deleteApp((String)arguments.get(0), (String)arguments.get(1));
			case CdapPackage.CDAP_CLUSTER___LOAD_PREFERENCES_APP__STRING_STRING_STRING:
				return loadPreferencesApp((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2));
			case CdapPackage.CDAP_CLUSTER___LOAD_PREFERENCES_FLOW__STRING_STRING_STRING_STRING:
				return loadPreferencesFlow((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3));
			case CdapPackage.CDAP_CLUSTER___LOAD_PREFERENCES_NAME_SPACE__STRING_STRING:
				return loadPreferencesNameSpace((String)arguments.get(0), (String)arguments.get(1));
			case CdapPackage.CDAP_CLUSTER___SET_PREFERENCES_APP__STRING_STRING_STRING:
				return setPreferencesApp((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2));
			case CdapPackage.CDAP_CLUSTER___SET_PREFERENCES_FLOW__STRING_STRING_STRING_STRING:
				return setPreferencesFlow((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3));
			case CdapPackage.CDAP_CLUSTER___SET_PREFERENCES_WORKER__STRING_STRING_STRING_STRING:
				return setPreferencesWorker((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3));
			case CdapPackage.CDAP_CLUSTER___SET_PREFERENCES_SERVICE__STRING_STRING_STRING_STRING:
				return setPreferencesService((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3));
			case CdapPackage.CDAP_CLUSTER___SET_PREFERENCES_NAME_SPACE__STRING_STRING:
				return setPreferencesNameSpace((String)arguments.get(0), (String)arguments.get(1));
			case CdapPackage.CDAP_CLUSTER___SET_FLOW_RUN_TIME_ARGS__STRING_STRING_STRING_STRING:
				return setFlowRunTimeArgs((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3));
			case CdapPackage.CDAP_CLUSTER___SET_FLOWLET_INSTANCES__STRING_STRING_STRING_STRING_INT:
				return setFlowletInstances((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3), (Integer)arguments.get(4));
			case CdapPackage.CDAP_CLUSTER___STOP_FLOW__STRING_STRING_STRING:
				return stopFlow((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2));
			case CdapPackage.CDAP_CLUSTER___STOP_WORKER__STRING_STRING_STRING:
				return stopWorker((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2));
			case CdapPackage.CDAP_CLUSTER___STOP_SERVICE__STRING_STRING_STRING:
				return stopService((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2));
			case CdapPackage.CDAP_CLUSTER___TRUNCATE_DATA_SET__STRING_STRING:
				return truncateDataSet((String)arguments.get(0), (String)arguments.get(1));
			case CdapPackage.CDAP_CLUSTER___DELETE_DATASET__STRING_STRING:
				return deleteDataset((String)arguments.get(0), (String)arguments.get(1));
			case CdapPackage.CDAP_CLUSTER___CREATE_STREAM__STRING_STRING:
				return createStream((String)arguments.get(0), (String)arguments.get(1));
			case CdapPackage.CDAP_CLUSTER___DELETE_STREAM__STRING_STRING:
				return deleteStream((String)arguments.get(0), (String)arguments.get(1));
			case CdapPackage.CDAP_CLUSTER___GET_STREAM_EVENTS__STRING_STRING_STRING_STRING_INT:
				return getStreamEvents((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3), (Integer)arguments.get(4));
			case CdapPackage.CDAP_CLUSTER___GET_STREAM_STATS__STRING_STRING_STRING_STRING_INT:
				return getStreamStats((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3), (Integer)arguments.get(4));
			case CdapPackage.CDAP_CLUSTER___SEND_EVENT_TO_STREAM__STRING_STRING_STRING:
				return sendEventToStream((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2));
			case CdapPackage.CDAP_CLUSTER___TRUCATE_STREAM__STRING_STRING:
				return trucateStream((String)arguments.get(0), (String)arguments.get(1));
			case CdapPackage.CDAP_CLUSTER___SET_STREAM_PROPERTIES__STRING_STRING_STRING:
				return setStreamProperties((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2));
			case CdapPackage.CDAP_CLUSTER___RESTART_APP__STRING_STRING_STRING:
				return restartApp((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2));
			case CdapPackage.CDAP_CLUSTER___CREATE_APP__STRING_STRING_STRING_STRING_STRING:
				return createApp((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3), (String)arguments.get(4));
			case CdapPackage.CDAP_CLUSTER___CREATE_APP_WITH_CONFIG__STRING_STRING_STRING_STRING_STRING_STRING:
				return createAppWithConfig((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2), (String)arguments.get(3), (String)arguments.get(4), (String)arguments.get(5));
			case CdapPackage.CDAP_CLUSTER___SET_DATASET_PROPERTIES__STRING_STRING_STRING:
				return setDatasetProperties((String)arguments.get(0), (String)arguments.get(1), (String)arguments.get(2));
			case CdapPackage.CDAP_CLUSTER___SET_STREAM_TTL__STRING_STRING_INT:
				return setStreamTTL((String)arguments.get(0), (String)arguments.get(1), (Integer)arguments.get(2));
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (baseUrl: ");
		result.append(baseUrl);
		result.append(", pollingFrequency: ");
		result.append(pollingFrequency);
		result.append(", remote: ");
		result.append(remote);
		result.append(')');
		return result.toString();
	}

} //CdapClusterImpl
