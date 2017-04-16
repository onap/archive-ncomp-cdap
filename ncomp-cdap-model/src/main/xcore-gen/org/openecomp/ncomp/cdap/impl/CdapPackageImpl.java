
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

import org.openecomp.ncomp.cdap.CdapAdaptor;
import org.openecomp.ncomp.cdap.CdapApi;
import org.openecomp.ncomp.cdap.CdapApplication;
import org.openecomp.ncomp.cdap.CdapArtifact;
import org.openecomp.ncomp.cdap.CdapCluster;
import org.openecomp.ncomp.cdap.CdapConfiguration;
import org.openecomp.ncomp.cdap.CdapDataset;
import org.openecomp.ncomp.cdap.CdapDatasetSchema;
import org.openecomp.ncomp.cdap.CdapDatasetSchemaField;
import org.openecomp.ncomp.cdap.CdapEntityWithPreferences;
import org.openecomp.ncomp.cdap.CdapFactory;
import org.openecomp.ncomp.cdap.CdapKeyPair;
import org.openecomp.ncomp.cdap.CdapNamespace;
import org.openecomp.ncomp.cdap.CdapPackage;

import org.openecomp.ncomp.core.CorePackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class CdapPackageImpl extends EPackageImpl implements CdapPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdapAdaptorEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdapClusterEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdapApiEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdapConfigurationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdapNamespaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdapKeyPairEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdapEntityWithPreferencesEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdapDatasetEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdapDatasetSchemaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdapDatasetSchemaFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdapApplicationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cdapArtifactEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.openecomp.ncomp.cdap.CdapPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private CdapPackageImpl() {
		super(eNS_URI, CdapFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link CdapPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static CdapPackage init() {
		if (isInited) return (CdapPackage)EPackage.Registry.INSTANCE.getEPackage(CdapPackage.eNS_URI);

		// Obtain or create and register package
		CdapPackageImpl theCdapPackage = (CdapPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof CdapPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new CdapPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		CorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theCdapPackage.createPackageContents();

		// Initialize created meta-data
		theCdapPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theCdapPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(CdapPackage.eNS_URI, theCdapPackage);
		return theCdapPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCdapAdaptor() {
		return cdapAdaptorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCdapCluster() {
		return cdapClusterEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCdapCluster_BaseUrl() {
		return (EAttribute)cdapClusterEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCdapCluster_PollingFrequency() {
		return (EAttribute)cdapClusterEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCdapCluster_Remote() {
		return (EAttribute)cdapClusterEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCdapCluster_Configurations() {
		return (EReference)cdapClusterEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCdapCluster_Namespaces() {
		return (EReference)cdapClusterEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCdapCluster__Poll() {
		return cdapClusterEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCdapApi() {
		return cdapApiEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCdapApi__CreateNamespace__String() {
		return cdapApiEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCdapApi__DeleteNamespace__String() {
		return cdapApiEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCdapApi__DeployApp__String_String() {
		return cdapApiEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCdapApi__LoadArtifact__String_String_String_String() {
		return cdapApiEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCdapApi__LoadArtifactWithConfig__String_String_String_String_String() {
		return cdapApiEClass.getEOperations().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCdapApi__DeleteArtifact__String_String_String() {
		return cdapApiEClass.getEOperations().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCdapApi__StartFlow__String_String_String_String() {
		return cdapApiEClass.getEOperations().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCdapApi__StartWorker__String_String_String_String() {
		return cdapApiEClass.getEOperations().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCdapApi__StartService__String_String_String_String() {
		return cdapApiEClass.getEOperations().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCdapApi__StartApp__String_String() {
		return cdapApiEClass.getEOperations().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCdapApi__StopApp__String_String() {
		return cdapApiEClass.getEOperations().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCdapApi__DeleteApp__String_String() {
		return cdapApiEClass.getEOperations().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCdapApi__LoadPreferencesApp__String_String_String() {
		return cdapApiEClass.getEOperations().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCdapApi__LoadPreferencesFlow__String_String_String_String() {
		return cdapApiEClass.getEOperations().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCdapApi__LoadPreferencesNameSpace__String_String() {
		return cdapApiEClass.getEOperations().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCdapApi__SetPreferencesApp__String_String_String() {
		return cdapApiEClass.getEOperations().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCdapApi__SetPreferencesFlow__String_String_String_String() {
		return cdapApiEClass.getEOperations().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCdapApi__SetPreferencesWorker__String_String_String_String() {
		return cdapApiEClass.getEOperations().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCdapApi__SetPreferencesService__String_String_String_String() {
		return cdapApiEClass.getEOperations().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCdapApi__SetPreferencesNameSpace__String_String() {
		return cdapApiEClass.getEOperations().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCdapApi__SetFlowRunTimeArgs__String_String_String_String() {
		return cdapApiEClass.getEOperations().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCdapApi__SetFlowletInstances__String_String_String_String_int() {
		return cdapApiEClass.getEOperations().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCdapApi__StopFlow__String_String_String() {
		return cdapApiEClass.getEOperations().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCdapApi__StopWorker__String_String_String() {
		return cdapApiEClass.getEOperations().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCdapApi__StopService__String_String_String() {
		return cdapApiEClass.getEOperations().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCdapApi__TruncateDataSet__String_String() {
		return cdapApiEClass.getEOperations().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCdapApi__DeleteDataset__String_String() {
		return cdapApiEClass.getEOperations().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCdapApi__CreateStream__String_String() {
		return cdapApiEClass.getEOperations().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCdapApi__DeleteStream__String_String() {
		return cdapApiEClass.getEOperations().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCdapApi__GetStreamEvents__String_String_String_String_int() {
		return cdapApiEClass.getEOperations().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCdapApi__GetStreamStats__String_String_String_String_int() {
		return cdapApiEClass.getEOperations().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCdapApi__SendEventToStream__String_String_String() {
		return cdapApiEClass.getEOperations().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCdapApi__TrucateStream__String_String() {
		return cdapApiEClass.getEOperations().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCdapApi__SetStreamProperties__String_String_String() {
		return cdapApiEClass.getEOperations().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCdapApi__RestartApp__String_String_String() {
		return cdapApiEClass.getEOperations().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCdapApi__CreateApp__String_String_String_String_String() {
		return cdapApiEClass.getEOperations().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCdapApi__CreateAppWithConfig__String_String_String_String_String_String() {
		return cdapApiEClass.getEOperations().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCdapApi__SetDatasetProperties__String_String_String() {
		return cdapApiEClass.getEOperations().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCdapApi__SetStreamTTL__String_String_int() {
		return cdapApiEClass.getEOperations().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCdapApi__SuspendSchedule__String_String_String() {
		return cdapApiEClass.getEOperations().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCdapApi__ResumeSchedule__String_String_String() {
		return cdapApiEClass.getEOperations().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCdapConfiguration() {
		return cdapConfigurationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCdapConfiguration_Value() {
		return (EAttribute)cdapConfigurationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCdapConfiguration_Source() {
		return (EAttribute)cdapConfigurationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCdapNamespace() {
		return cdapNamespaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCdapNamespace_Description() {
		return (EAttribute)cdapNamespaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCdapNamespace_Config() {
		return (EReference)cdapNamespaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCdapNamespace_Datasets() {
		return (EReference)cdapNamespaceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCdapNamespace_Applications() {
		return (EReference)cdapNamespaceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCdapNamespace_Cluster() {
		return (EReference)cdapNamespaceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCdapKeyPair() {
		return cdapKeyPairEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCdapKeyPair_Value() {
		return (EAttribute)cdapKeyPairEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCdapEntityWithPreferences() {
		return cdapEntityWithPreferencesEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCdapEntityWithPreferences_Preferences() {
		return (EReference)cdapEntityWithPreferencesEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCdapDataset() {
		return cdapDatasetEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCdapDataset_Type() {
		return (EAttribute)cdapDatasetEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCdapDataset_Properties() {
		return (EReference)cdapDatasetEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCdapDataset_Schema() {
		return (EReference)cdapDatasetEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCdapDatasetSchema() {
		return cdapDatasetSchemaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCdapDatasetSchema_Type() {
		return (EAttribute)cdapDatasetSchemaEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCdapDatasetSchema_Fields() {
		return (EReference)cdapDatasetSchemaEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCdapDatasetSchemaField() {
		return cdapDatasetSchemaFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCdapDatasetSchemaField_Type() {
		return (EAttribute)cdapDatasetSchemaFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCdapApplication() {
		return cdapApplicationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCdapApplication_Type() {
		return (EAttribute)cdapApplicationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCdapApplication_Id() {
		return (EAttribute)cdapApplicationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCdapApplication_Version() {
		return (EAttribute)cdapApplicationEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCdapApplication_Description() {
		return (EAttribute)cdapApplicationEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCdapApplication_Artifact() {
		return (EReference)cdapApplicationEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCdapArtifact() {
		return cdapArtifactEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCdapArtifact_Version() {
		return (EAttribute)cdapArtifactEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCdapArtifact_Scope() {
		return (EAttribute)cdapArtifactEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CdapFactory getCdapFactory() {
		return (CdapFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		cdapAdaptorEClass = createEClass(CDAP_ADAPTOR);

		cdapClusterEClass = createEClass(CDAP_CLUSTER);
		createEAttribute(cdapClusterEClass, CDAP_CLUSTER__BASE_URL);
		createEAttribute(cdapClusterEClass, CDAP_CLUSTER__POLLING_FREQUENCY);
		createEAttribute(cdapClusterEClass, CDAP_CLUSTER__REMOTE);
		createEReference(cdapClusterEClass, CDAP_CLUSTER__CONFIGURATIONS);
		createEReference(cdapClusterEClass, CDAP_CLUSTER__NAMESPACES);
		createEOperation(cdapClusterEClass, CDAP_CLUSTER___POLL);

		cdapApiEClass = createEClass(CDAP_API);
		createEOperation(cdapApiEClass, CDAP_API___CREATE_NAMESPACE__STRING);
		createEOperation(cdapApiEClass, CDAP_API___DELETE_NAMESPACE__STRING);
		createEOperation(cdapApiEClass, CDAP_API___DEPLOY_APP__STRING_STRING);
		createEOperation(cdapApiEClass, CDAP_API___LOAD_ARTIFACT__STRING_STRING_STRING_STRING);
		createEOperation(cdapApiEClass, CDAP_API___LOAD_ARTIFACT_WITH_CONFIG__STRING_STRING_STRING_STRING_STRING);
		createEOperation(cdapApiEClass, CDAP_API___DELETE_ARTIFACT__STRING_STRING_STRING);
		createEOperation(cdapApiEClass, CDAP_API___START_FLOW__STRING_STRING_STRING_STRING);
		createEOperation(cdapApiEClass, CDAP_API___START_WORKER__STRING_STRING_STRING_STRING);
		createEOperation(cdapApiEClass, CDAP_API___START_SERVICE__STRING_STRING_STRING_STRING);
		createEOperation(cdapApiEClass, CDAP_API___START_APP__STRING_STRING);
		createEOperation(cdapApiEClass, CDAP_API___STOP_APP__STRING_STRING);
		createEOperation(cdapApiEClass, CDAP_API___DELETE_APP__STRING_STRING);
		createEOperation(cdapApiEClass, CDAP_API___LOAD_PREFERENCES_APP__STRING_STRING_STRING);
		createEOperation(cdapApiEClass, CDAP_API___LOAD_PREFERENCES_FLOW__STRING_STRING_STRING_STRING);
		createEOperation(cdapApiEClass, CDAP_API___LOAD_PREFERENCES_NAME_SPACE__STRING_STRING);
		createEOperation(cdapApiEClass, CDAP_API___SET_PREFERENCES_APP__STRING_STRING_STRING);
		createEOperation(cdapApiEClass, CDAP_API___SET_PREFERENCES_FLOW__STRING_STRING_STRING_STRING);
		createEOperation(cdapApiEClass, CDAP_API___SET_PREFERENCES_WORKER__STRING_STRING_STRING_STRING);
		createEOperation(cdapApiEClass, CDAP_API___SET_PREFERENCES_SERVICE__STRING_STRING_STRING_STRING);
		createEOperation(cdapApiEClass, CDAP_API___SET_PREFERENCES_NAME_SPACE__STRING_STRING);
		createEOperation(cdapApiEClass, CDAP_API___SET_FLOW_RUN_TIME_ARGS__STRING_STRING_STRING_STRING);
		createEOperation(cdapApiEClass, CDAP_API___SET_FLOWLET_INSTANCES__STRING_STRING_STRING_STRING_INT);
		createEOperation(cdapApiEClass, CDAP_API___STOP_FLOW__STRING_STRING_STRING);
		createEOperation(cdapApiEClass, CDAP_API___STOP_WORKER__STRING_STRING_STRING);
		createEOperation(cdapApiEClass, CDAP_API___STOP_SERVICE__STRING_STRING_STRING);
		createEOperation(cdapApiEClass, CDAP_API___TRUNCATE_DATA_SET__STRING_STRING);
		createEOperation(cdapApiEClass, CDAP_API___DELETE_DATASET__STRING_STRING);
		createEOperation(cdapApiEClass, CDAP_API___CREATE_STREAM__STRING_STRING);
		createEOperation(cdapApiEClass, CDAP_API___DELETE_STREAM__STRING_STRING);
		createEOperation(cdapApiEClass, CDAP_API___GET_STREAM_EVENTS__STRING_STRING_STRING_STRING_INT);
		createEOperation(cdapApiEClass, CDAP_API___GET_STREAM_STATS__STRING_STRING_STRING_STRING_INT);
		createEOperation(cdapApiEClass, CDAP_API___SEND_EVENT_TO_STREAM__STRING_STRING_STRING);
		createEOperation(cdapApiEClass, CDAP_API___TRUCATE_STREAM__STRING_STRING);
		createEOperation(cdapApiEClass, CDAP_API___SET_STREAM_PROPERTIES__STRING_STRING_STRING);
		createEOperation(cdapApiEClass, CDAP_API___RESTART_APP__STRING_STRING_STRING);
		createEOperation(cdapApiEClass, CDAP_API___CREATE_APP__STRING_STRING_STRING_STRING_STRING);
		createEOperation(cdapApiEClass, CDAP_API___CREATE_APP_WITH_CONFIG__STRING_STRING_STRING_STRING_STRING_STRING);
		createEOperation(cdapApiEClass, CDAP_API___SET_DATASET_PROPERTIES__STRING_STRING_STRING);
		createEOperation(cdapApiEClass, CDAP_API___SET_STREAM_TTL__STRING_STRING_INT);
		createEOperation(cdapApiEClass, CDAP_API___SUSPEND_SCHEDULE__STRING_STRING_STRING);
		createEOperation(cdapApiEClass, CDAP_API___RESUME_SCHEDULE__STRING_STRING_STRING);

		cdapConfigurationEClass = createEClass(CDAP_CONFIGURATION);
		createEAttribute(cdapConfigurationEClass, CDAP_CONFIGURATION__VALUE);
		createEAttribute(cdapConfigurationEClass, CDAP_CONFIGURATION__SOURCE);

		cdapNamespaceEClass = createEClass(CDAP_NAMESPACE);
		createEAttribute(cdapNamespaceEClass, CDAP_NAMESPACE__DESCRIPTION);
		createEReference(cdapNamespaceEClass, CDAP_NAMESPACE__CONFIG);
		createEReference(cdapNamespaceEClass, CDAP_NAMESPACE__DATASETS);
		createEReference(cdapNamespaceEClass, CDAP_NAMESPACE__APPLICATIONS);
		createEReference(cdapNamespaceEClass, CDAP_NAMESPACE__CLUSTER);

		cdapKeyPairEClass = createEClass(CDAP_KEY_PAIR);
		createEAttribute(cdapKeyPairEClass, CDAP_KEY_PAIR__VALUE);

		cdapEntityWithPreferencesEClass = createEClass(CDAP_ENTITY_WITH_PREFERENCES);
		createEReference(cdapEntityWithPreferencesEClass, CDAP_ENTITY_WITH_PREFERENCES__PREFERENCES);

		cdapDatasetEClass = createEClass(CDAP_DATASET);
		createEAttribute(cdapDatasetEClass, CDAP_DATASET__TYPE);
		createEReference(cdapDatasetEClass, CDAP_DATASET__PROPERTIES);
		createEReference(cdapDatasetEClass, CDAP_DATASET__SCHEMA);

		cdapDatasetSchemaEClass = createEClass(CDAP_DATASET_SCHEMA);
		createEAttribute(cdapDatasetSchemaEClass, CDAP_DATASET_SCHEMA__TYPE);
		createEReference(cdapDatasetSchemaEClass, CDAP_DATASET_SCHEMA__FIELDS);

		cdapDatasetSchemaFieldEClass = createEClass(CDAP_DATASET_SCHEMA_FIELD);
		createEAttribute(cdapDatasetSchemaFieldEClass, CDAP_DATASET_SCHEMA_FIELD__TYPE);

		cdapApplicationEClass = createEClass(CDAP_APPLICATION);
		createEAttribute(cdapApplicationEClass, CDAP_APPLICATION__TYPE);
		createEAttribute(cdapApplicationEClass, CDAP_APPLICATION__ID);
		createEAttribute(cdapApplicationEClass, CDAP_APPLICATION__VERSION);
		createEAttribute(cdapApplicationEClass, CDAP_APPLICATION__DESCRIPTION);
		createEReference(cdapApplicationEClass, CDAP_APPLICATION__ARTIFACT);

		cdapArtifactEClass = createEClass(CDAP_ARTIFACT);
		createEAttribute(cdapArtifactEClass, CDAP_ARTIFACT__VERSION);
		createEAttribute(cdapArtifactEClass, CDAP_ARTIFACT__SCOPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		CorePackage theCorePackage = (CorePackage)EPackage.Registry.INSTANCE.getEPackage(CorePackage.eNS_URI);
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		cdapClusterEClass.getESuperTypes().add(theCorePackage.getNamedEntity());
		cdapClusterEClass.getESuperTypes().add(this.getCdapApi());
		cdapConfigurationEClass.getESuperTypes().add(theCorePackage.getNamedEntity());
		cdapNamespaceEClass.getESuperTypes().add(theCorePackage.getNamedEntity());
		cdapKeyPairEClass.getESuperTypes().add(theCorePackage.getNamedEntity());
		cdapEntityWithPreferencesEClass.getESuperTypes().add(theCorePackage.getNamedEntity());
		cdapDatasetEClass.getESuperTypes().add(theCorePackage.getNamedEntity());
		cdapDatasetSchemaEClass.getESuperTypes().add(theCorePackage.getNamedEntity());
		cdapDatasetSchemaFieldEClass.getESuperTypes().add(theCorePackage.getNamedEntity());
		cdapApplicationEClass.getESuperTypes().add(theCorePackage.getNamedEntity());
		cdapArtifactEClass.getESuperTypes().add(theCorePackage.getNamedEntity());

		// Initialize classes, features, and operations; add parameters
		initEClass(cdapAdaptorEClass, CdapAdaptor.class, "CdapAdaptor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(cdapClusterEClass, CdapCluster.class, "CdapCluster", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCdapCluster_BaseUrl(), theEcorePackage.getEString(), "baseUrl", null, 0, 1, CdapCluster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCdapCluster_PollingFrequency(), theEcorePackage.getELong(), "pollingFrequency", "300000", 0, 1, CdapCluster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCdapCluster_Remote(), theEcorePackage.getEBoolean(), "remote", "false", 0, 1, CdapCluster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCdapCluster_Configurations(), this.getCdapConfiguration(), null, "configurations", null, 0, -1, CdapCluster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCdapCluster_Namespaces(), this.getCdapNamespace(), this.getCdapNamespace_Cluster(), "namespaces", null, 0, -1, CdapCluster.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEOperation(getCdapCluster__Poll(), null, "poll", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(cdapApiEClass, CdapApi.class, "CdapApi", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getCdapApi__CreateNamespace__String(), theEcorePackage.getEString(), "createNamespace", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "namespace", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCdapApi__DeleteNamespace__String(), theEcorePackage.getEString(), "deleteNamespace", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "namespace", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCdapApi__DeployApp__String_String(), theEcorePackage.getEString(), "deployApp", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "namespace", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "jarfile", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCdapApi__LoadArtifact__String_String_String_String(), theEcorePackage.getEString(), "loadArtifact", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "namespace", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "artifactName", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "jarfile", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "version", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCdapApi__LoadArtifactWithConfig__String_String_String_String_String(), theEcorePackage.getEString(), "loadArtifactWithConfig", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "namespace", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "artifactName", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "jarfile", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "version", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "config", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCdapApi__DeleteArtifact__String_String_String(), theEcorePackage.getEString(), "deleteArtifact", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "namespace", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "artifactName", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "artifactVersion", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCdapApi__StartFlow__String_String_String_String(), theEcorePackage.getEString(), "startFlow", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "namespace", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "appName", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "flowId", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "extraArgs", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCdapApi__StartWorker__String_String_String_String(), theEcorePackage.getEString(), "startWorker", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "namespace", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "appName", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "workerId", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "extraArgs", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCdapApi__StartService__String_String_String_String(), theEcorePackage.getEString(), "startService", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "namespace", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "appName", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "serviceId", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "extraArgs", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCdapApi__StartApp__String_String(), theEcorePackage.getEString(), "startApp", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "namespace", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "appName", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCdapApi__StopApp__String_String(), theEcorePackage.getEString(), "stopApp", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "namespace", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "appName", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCdapApi__DeleteApp__String_String(), theEcorePackage.getEString(), "deleteApp", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "namespace", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "appName", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCdapApi__LoadPreferencesApp__String_String_String(), theEcorePackage.getEString(), "loadPreferencesApp", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "namespace", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "prefsFile", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "appId", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCdapApi__LoadPreferencesFlow__String_String_String_String(), theEcorePackage.getEString(), "loadPreferencesFlow", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "namespace", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "prefsFile", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "appId", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "flowId", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCdapApi__LoadPreferencesNameSpace__String_String(), theEcorePackage.getEString(), "loadPreferencesNameSpace", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "namespace", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "prefsFile", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCdapApi__SetPreferencesApp__String_String_String(), theEcorePackage.getEString(), "setPreferencesApp", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "namespace", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "prefsString", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "appId", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCdapApi__SetPreferencesFlow__String_String_String_String(), theEcorePackage.getEString(), "setPreferencesFlow", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "namespace", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "prefsString", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "appId", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "flowId", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCdapApi__SetPreferencesWorker__String_String_String_String(), theEcorePackage.getEString(), "setPreferencesWorker", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "namespace", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "prefsString", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "appId", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "workerId", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCdapApi__SetPreferencesService__String_String_String_String(), theEcorePackage.getEString(), "setPreferencesService", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "namespace", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "prefsString", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "appId", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "serviceId", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCdapApi__SetPreferencesNameSpace__String_String(), theEcorePackage.getEString(), "setPreferencesNameSpace", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "namespace", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "prefsString", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCdapApi__SetFlowRunTimeArgs__String_String_String_String(), theEcorePackage.getEString(), "setFlowRunTimeArgs", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "namespace", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "appId", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "flowId", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "args", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCdapApi__SetFlowletInstances__String_String_String_String_int(), theEcorePackage.getEString(), "setFlowletInstances", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "namespace", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "appId", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "flowId", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "flowletId", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEInt(), "nInstances", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCdapApi__StopFlow__String_String_String(), theEcorePackage.getEString(), "stopFlow", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "namespace", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "appId", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "flowId", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCdapApi__StopWorker__String_String_String(), theEcorePackage.getEString(), "stopWorker", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "namespace", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "appId", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "workerId", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCdapApi__StopService__String_String_String(), theEcorePackage.getEString(), "stopService", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "namespace", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "appId", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "serviceId", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCdapApi__TruncateDataSet__String_String(), theEcorePackage.getEString(), "truncateDataSet", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "namespace", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "datasetName", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCdapApi__DeleteDataset__String_String(), theEcorePackage.getEString(), "deleteDataset", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "namespace", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "datasetName", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCdapApi__CreateStream__String_String(), theEcorePackage.getEString(), "createStream", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "namespace", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "newStreamId", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCdapApi__DeleteStream__String_String(), theEcorePackage.getEString(), "deleteStream", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "namespace", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "streamId", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCdapApi__GetStreamEvents__String_String_String_String_int(), theEcorePackage.getEString(), "getStreamEvents", 0, -1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "namespace", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "streamId", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "startTime", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "endTime", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEInt(), "limit", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCdapApi__GetStreamStats__String_String_String_String_int(), theEcorePackage.getEString(), "getStreamStats", 0, -1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "namespace", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "streamId", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "startTime", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "endTime", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEInt(), "limit", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCdapApi__SendEventToStream__String_String_String(), theEcorePackage.getEString(), "sendEventToStream", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "namespace", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "streamId", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "event", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCdapApi__TrucateStream__String_String(), theEcorePackage.getEString(), "trucateStream", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "namespace", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "streamId", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCdapApi__SetStreamProperties__String_String_String(), theEcorePackage.getEString(), "setStreamProperties", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "namespace", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "streamId", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "propsFile", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCdapApi__RestartApp__String_String_String(), theEcorePackage.getEString(), "restartApp", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "namespace", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "appId", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "progTypes", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCdapApi__CreateApp__String_String_String_String_String(), theEcorePackage.getEString(), "createApp", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "namespace", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "appId", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "artifactName", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "artifactVersion", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "scope", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCdapApi__CreateAppWithConfig__String_String_String_String_String_String(), theEcorePackage.getEString(), "createAppWithConfig", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "namespace", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "appId", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "artifactName", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "artifactVersion", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "scope", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "appConfig", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCdapApi__SetDatasetProperties__String_String_String(), theEcorePackage.getEString(), "setDatasetProperties", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "namespace", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "datasetName", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "datasetProperties", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCdapApi__SetStreamTTL__String_String_int(), theEcorePackage.getEString(), "setStreamTTL", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "namespace", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "streamName", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEInt(), "ttlSeconds", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCdapApi__SuspendSchedule__String_String_String(), theEcorePackage.getEString(), "suspendSchedule", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "namespace", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "appId", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "scheduleId", 0, 1, !IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getCdapApi__ResumeSchedule__String_String_String(), theEcorePackage.getEString(), "resumeSchedule", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "namespace", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "appId", 0, 1, !IS_UNIQUE, IS_ORDERED);
		addEParameter(op, theEcorePackage.getEString(), "scheduleId", 0, 1, !IS_UNIQUE, IS_ORDERED);

		initEClass(cdapConfigurationEClass, CdapConfiguration.class, "CdapConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCdapConfiguration_Value(), theEcorePackage.getEString(), "value", null, 0, 1, CdapConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCdapConfiguration_Source(), theEcorePackage.getEString(), "source", null, 0, 1, CdapConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cdapNamespaceEClass, CdapNamespace.class, "CdapNamespace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCdapNamespace_Description(), theEcorePackage.getEString(), "description", null, 0, 1, CdapNamespace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCdapNamespace_Config(), this.getCdapKeyPair(), null, "config", null, 0, -1, CdapNamespace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCdapNamespace_Datasets(), this.getCdapDataset(), null, "datasets", null, 0, -1, CdapNamespace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCdapNamespace_Applications(), this.getCdapApplication(), null, "applications", null, 0, -1, CdapNamespace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCdapNamespace_Cluster(), this.getCdapCluster(), this.getCdapCluster_Namespaces(), "cluster", null, 0, 1, CdapNamespace.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cdapKeyPairEClass, CdapKeyPair.class, "CdapKeyPair", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCdapKeyPair_Value(), theEcorePackage.getEString(), "value", null, 0, 1, CdapKeyPair.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cdapEntityWithPreferencesEClass, CdapEntityWithPreferences.class, "CdapEntityWithPreferences", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCdapEntityWithPreferences_Preferences(), this.getCdapKeyPair(), null, "preferences", null, 0, -1, CdapEntityWithPreferences.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(cdapDatasetEClass, CdapDataset.class, "CdapDataset", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCdapDataset_Type(), theEcorePackage.getEString(), "type", null, 0, 1, CdapDataset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCdapDataset_Properties(), this.getCdapKeyPair(), null, "properties", null, 0, -1, CdapDataset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCdapDataset_Schema(), this.getCdapDatasetSchema(), null, "schema", null, 0, 1, CdapDataset.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cdapDatasetSchemaEClass, CdapDatasetSchema.class, "CdapDatasetSchema", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCdapDatasetSchema_Type(), theEcorePackage.getEString(), "type", null, 0, 1, CdapDatasetSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCdapDatasetSchema_Fields(), this.getCdapDatasetSchemaField(), null, "fields", null, 0, -1, CdapDatasetSchema.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cdapDatasetSchemaFieldEClass, CdapDatasetSchemaField.class, "CdapDatasetSchemaField", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCdapDatasetSchemaField_Type(), theEcorePackage.getEString(), "type", null, 0, 1, CdapDatasetSchemaField.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cdapApplicationEClass, CdapApplication.class, "CdapApplication", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCdapApplication_Type(), theEcorePackage.getEString(), "type", null, 0, 1, CdapApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCdapApplication_Id(), theEcorePackage.getEString(), "id", null, 0, 1, CdapApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCdapApplication_Version(), theEcorePackage.getEString(), "version", null, 0, 1, CdapApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCdapApplication_Description(), theEcorePackage.getEString(), "description", null, 0, 1, CdapApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCdapApplication_Artifact(), this.getCdapArtifact(), null, "artifact", null, 0, 1, CdapApplication.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cdapArtifactEClass, CdapArtifact.class, "CdapArtifact", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCdapArtifact_Version(), theEcorePackage.getEString(), "version", null, 0, 1, CdapArtifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCdapArtifact_Scope(), theEcorePackage.getEString(), "scope", null, 0, 1, CdapArtifact.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //CdapPackageImpl
