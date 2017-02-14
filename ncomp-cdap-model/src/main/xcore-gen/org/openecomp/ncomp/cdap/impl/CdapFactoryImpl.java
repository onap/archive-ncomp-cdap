
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

import org.openecomp.ncomp.cdap.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CdapFactoryImpl extends EFactoryImpl implements CdapFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CdapFactory init() {
		try {
			CdapFactory theCdapFactory = (CdapFactory)EPackage.Registry.INSTANCE.getEFactory(CdapPackage.eNS_URI);
			if (theCdapFactory != null) {
				return theCdapFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new CdapFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CdapFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case CdapPackage.CDAP_ADAPTOR: return createCdapAdaptor();
			case CdapPackage.CDAP_CLUSTER: return createCdapCluster();
			case CdapPackage.CDAP_API: return createCdapApi();
			case CdapPackage.CDAP_CONFIGURATION: return createCdapConfiguration();
			case CdapPackage.CDAP_NAMESPACE: return createCdapNamespace();
			case CdapPackage.CDAP_KEY_PAIR: return createCdapKeyPair();
			case CdapPackage.CDAP_ENTITY_WITH_PREFERENCES: return createCdapEntityWithPreferences();
			case CdapPackage.CDAP_DATASET: return createCdapDataset();
			case CdapPackage.CDAP_DATASET_SCHEMA: return createCdapDatasetSchema();
			case CdapPackage.CDAP_DATASET_SCHEMA_FIELD: return createCdapDatasetSchemaField();
			case CdapPackage.CDAP_APPLICATION: return createCdapApplication();
			case CdapPackage.CDAP_ARTIFACT: return createCdapArtifact();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CdapAdaptor createCdapAdaptor() {
		CdapAdaptorImpl cdapAdaptor = new CdapAdaptorImpl();
		return cdapAdaptor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CdapCluster createCdapCluster() {
		CdapClusterImpl cdapCluster = new CdapClusterImpl();
		return cdapCluster;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CdapApi createCdapApi() {
		CdapApiImpl cdapApi = new CdapApiImpl();
		return cdapApi;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CdapConfiguration createCdapConfiguration() {
		CdapConfigurationImpl cdapConfiguration = new CdapConfigurationImpl();
		return cdapConfiguration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CdapNamespace createCdapNamespace() {
		CdapNamespaceImpl cdapNamespace = new CdapNamespaceImpl();
		return cdapNamespace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CdapKeyPair createCdapKeyPair() {
		CdapKeyPairImpl cdapKeyPair = new CdapKeyPairImpl();
		return cdapKeyPair;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CdapEntityWithPreferences createCdapEntityWithPreferences() {
		CdapEntityWithPreferencesImpl cdapEntityWithPreferences = new CdapEntityWithPreferencesImpl();
		return cdapEntityWithPreferences;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CdapDataset createCdapDataset() {
		CdapDatasetImpl cdapDataset = new CdapDatasetImpl();
		return cdapDataset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CdapDatasetSchema createCdapDatasetSchema() {
		CdapDatasetSchemaImpl cdapDatasetSchema = new CdapDatasetSchemaImpl();
		return cdapDatasetSchema;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CdapDatasetSchemaField createCdapDatasetSchemaField() {
		CdapDatasetSchemaFieldImpl cdapDatasetSchemaField = new CdapDatasetSchemaFieldImpl();
		return cdapDatasetSchemaField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CdapApplication createCdapApplication() {
		CdapApplicationImpl cdapApplication = new CdapApplicationImpl();
		return cdapApplication;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CdapArtifact createCdapArtifact() {
		CdapArtifactImpl cdapArtifact = new CdapArtifactImpl();
		return cdapArtifact;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CdapPackage getCdapPackage() {
		return (CdapPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static CdapPackage getPackage() {
		return CdapPackage.eINSTANCE;
	}

} //CdapFactoryImpl
