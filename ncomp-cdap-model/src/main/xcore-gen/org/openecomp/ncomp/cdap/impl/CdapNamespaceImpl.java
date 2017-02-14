
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

import org.openecomp.ncomp.cdap.CdapApplication;
import org.openecomp.ncomp.cdap.CdapCluster;
import org.openecomp.ncomp.cdap.CdapDataset;
import org.openecomp.ncomp.cdap.CdapKeyPair;
import org.openecomp.ncomp.cdap.CdapNamespace;
import org.openecomp.ncomp.cdap.CdapPackage;

import org.openecomp.ncomp.core.impl.NamedEntityImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Namespace</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.openecomp.ncomp.cdap.impl.CdapNamespaceImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.openecomp.ncomp.cdap.impl.CdapNamespaceImpl#getConfig <em>Config</em>}</li>
 *   <li>{@link org.openecomp.ncomp.cdap.impl.CdapNamespaceImpl#getDatasets <em>Datasets</em>}</li>
 *   <li>{@link org.openecomp.ncomp.cdap.impl.CdapNamespaceImpl#getApplications <em>Applications</em>}</li>
 *   <li>{@link org.openecomp.ncomp.cdap.impl.CdapNamespaceImpl#getCluster <em>Cluster</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CdapNamespaceImpl extends NamedEntityImpl implements CdapNamespace {
	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConfig() <em>Config</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfig()
	 * @generated
	 * @ordered
	 */
	protected EList<CdapKeyPair> config;

	/**
	 * The cached value of the '{@link #getDatasets() <em>Datasets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatasets()
	 * @generated
	 * @ordered
	 */
	protected EList<CdapDataset> datasets;

	/**
	 * The cached value of the '{@link #getApplications() <em>Applications</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApplications()
	 * @generated
	 * @ordered
	 */
	protected EList<CdapApplication> applications;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CdapNamespaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return CdapPackage.Literals.CDAP_NAMESPACE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CdapPackage.CDAP_NAMESPACE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CdapKeyPair> getConfig() {
		if (config == null) {
			config = new EObjectContainmentEList<CdapKeyPair>(CdapKeyPair.class, this, CdapPackage.CDAP_NAMESPACE__CONFIG);
		}
		return config;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CdapDataset> getDatasets() {
		if (datasets == null) {
			datasets = new EObjectContainmentEList<CdapDataset>(CdapDataset.class, this, CdapPackage.CDAP_NAMESPACE__DATASETS);
		}
		return datasets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CdapApplication> getApplications() {
		if (applications == null) {
			applications = new EObjectContainmentEList<CdapApplication>(CdapApplication.class, this, CdapPackage.CDAP_NAMESPACE__APPLICATIONS);
		}
		return applications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CdapCluster getCluster() {
		if (eContainerFeatureID() != CdapPackage.CDAP_NAMESPACE__CLUSTER) return null;
		return (CdapCluster)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CdapCluster basicGetCluster() {
		if (eContainerFeatureID() != CdapPackage.CDAP_NAMESPACE__CLUSTER) return null;
		return (CdapCluster)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCluster(CdapCluster newCluster, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newCluster, CdapPackage.CDAP_NAMESPACE__CLUSTER, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCluster(CdapCluster newCluster) {
		if (newCluster != eInternalContainer() || (eContainerFeatureID() != CdapPackage.CDAP_NAMESPACE__CLUSTER && newCluster != null)) {
			if (EcoreUtil.isAncestor(this, newCluster))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newCluster != null)
				msgs = ((InternalEObject)newCluster).eInverseAdd(this, CdapPackage.CDAP_CLUSTER__NAMESPACES, CdapCluster.class, msgs);
			msgs = basicSetCluster(newCluster, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, CdapPackage.CDAP_NAMESPACE__CLUSTER, newCluster, newCluster));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case CdapPackage.CDAP_NAMESPACE__CLUSTER:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetCluster((CdapCluster)otherEnd, msgs);
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
			case CdapPackage.CDAP_NAMESPACE__CONFIG:
				return ((InternalEList<?>)getConfig()).basicRemove(otherEnd, msgs);
			case CdapPackage.CDAP_NAMESPACE__DATASETS:
				return ((InternalEList<?>)getDatasets()).basicRemove(otherEnd, msgs);
			case CdapPackage.CDAP_NAMESPACE__APPLICATIONS:
				return ((InternalEList<?>)getApplications()).basicRemove(otherEnd, msgs);
			case CdapPackage.CDAP_NAMESPACE__CLUSTER:
				return basicSetCluster(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case CdapPackage.CDAP_NAMESPACE__CLUSTER:
				return eInternalContainer().eInverseRemove(this, CdapPackage.CDAP_CLUSTER__NAMESPACES, CdapCluster.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case CdapPackage.CDAP_NAMESPACE__DESCRIPTION:
				return getDescription();
			case CdapPackage.CDAP_NAMESPACE__CONFIG:
				return getConfig();
			case CdapPackage.CDAP_NAMESPACE__DATASETS:
				return getDatasets();
			case CdapPackage.CDAP_NAMESPACE__APPLICATIONS:
				return getApplications();
			case CdapPackage.CDAP_NAMESPACE__CLUSTER:
				if (resolve) return getCluster();
				return basicGetCluster();
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
			case CdapPackage.CDAP_NAMESPACE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case CdapPackage.CDAP_NAMESPACE__CONFIG:
				getConfig().clear();
				getConfig().addAll((Collection<? extends CdapKeyPair>)newValue);
				return;
			case CdapPackage.CDAP_NAMESPACE__DATASETS:
				getDatasets().clear();
				getDatasets().addAll((Collection<? extends CdapDataset>)newValue);
				return;
			case CdapPackage.CDAP_NAMESPACE__APPLICATIONS:
				getApplications().clear();
				getApplications().addAll((Collection<? extends CdapApplication>)newValue);
				return;
			case CdapPackage.CDAP_NAMESPACE__CLUSTER:
				setCluster((CdapCluster)newValue);
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
			case CdapPackage.CDAP_NAMESPACE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case CdapPackage.CDAP_NAMESPACE__CONFIG:
				getConfig().clear();
				return;
			case CdapPackage.CDAP_NAMESPACE__DATASETS:
				getDatasets().clear();
				return;
			case CdapPackage.CDAP_NAMESPACE__APPLICATIONS:
				getApplications().clear();
				return;
			case CdapPackage.CDAP_NAMESPACE__CLUSTER:
				setCluster((CdapCluster)null);
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
			case CdapPackage.CDAP_NAMESPACE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case CdapPackage.CDAP_NAMESPACE__CONFIG:
				return config != null && !config.isEmpty();
			case CdapPackage.CDAP_NAMESPACE__DATASETS:
				return datasets != null && !datasets.isEmpty();
			case CdapPackage.CDAP_NAMESPACE__APPLICATIONS:
				return applications != null && !applications.isEmpty();
			case CdapPackage.CDAP_NAMESPACE__CLUSTER:
				return basicGetCluster() != null;
		}
		return super.eIsSet(featureID);
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
		result.append(" (description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //CdapNamespaceImpl
