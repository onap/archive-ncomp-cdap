
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
package org.openecomp.ncomp.cdap.util;

import org.openecomp.ncomp.cdap.*;

import org.openecomp.ncomp.core.NamedEntity;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.openecomp.ncomp.cdap.CdapPackage
 * @generated
 */
public class CdapSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static CdapPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CdapSwitch() {
		if (modelPackage == null) {
			modelPackage = CdapPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case CdapPackage.CDAP_ADAPTOR: {
				CdapAdaptor cdapAdaptor = (CdapAdaptor)theEObject;
				T result = caseCdapAdaptor(cdapAdaptor);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdapPackage.CDAP_CLUSTER: {
				CdapCluster cdapCluster = (CdapCluster)theEObject;
				T result = caseCdapCluster(cdapCluster);
				if (result == null) result = caseNamedEntity(cdapCluster);
				if (result == null) result = caseCdapApi(cdapCluster);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdapPackage.CDAP_API: {
				CdapApi cdapApi = (CdapApi)theEObject;
				T result = caseCdapApi(cdapApi);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdapPackage.CDAP_CONFIGURATION: {
				CdapConfiguration cdapConfiguration = (CdapConfiguration)theEObject;
				T result = caseCdapConfiguration(cdapConfiguration);
				if (result == null) result = caseNamedEntity(cdapConfiguration);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdapPackage.CDAP_NAMESPACE: {
				CdapNamespace cdapNamespace = (CdapNamespace)theEObject;
				T result = caseCdapNamespace(cdapNamespace);
				if (result == null) result = caseNamedEntity(cdapNamespace);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdapPackage.CDAP_KEY_PAIR: {
				CdapKeyPair cdapKeyPair = (CdapKeyPair)theEObject;
				T result = caseCdapKeyPair(cdapKeyPair);
				if (result == null) result = caseNamedEntity(cdapKeyPair);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdapPackage.CDAP_ENTITY_WITH_PREFERENCES: {
				CdapEntityWithPreferences cdapEntityWithPreferences = (CdapEntityWithPreferences)theEObject;
				T result = caseCdapEntityWithPreferences(cdapEntityWithPreferences);
				if (result == null) result = caseNamedEntity(cdapEntityWithPreferences);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdapPackage.CDAP_DATASET: {
				CdapDataset cdapDataset = (CdapDataset)theEObject;
				T result = caseCdapDataset(cdapDataset);
				if (result == null) result = caseNamedEntity(cdapDataset);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdapPackage.CDAP_DATASET_SCHEMA: {
				CdapDatasetSchema cdapDatasetSchema = (CdapDatasetSchema)theEObject;
				T result = caseCdapDatasetSchema(cdapDatasetSchema);
				if (result == null) result = caseNamedEntity(cdapDatasetSchema);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdapPackage.CDAP_DATASET_SCHEMA_FIELD: {
				CdapDatasetSchemaField cdapDatasetSchemaField = (CdapDatasetSchemaField)theEObject;
				T result = caseCdapDatasetSchemaField(cdapDatasetSchemaField);
				if (result == null) result = caseNamedEntity(cdapDatasetSchemaField);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdapPackage.CDAP_APPLICATION: {
				CdapApplication cdapApplication = (CdapApplication)theEObject;
				T result = caseCdapApplication(cdapApplication);
				if (result == null) result = caseNamedEntity(cdapApplication);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case CdapPackage.CDAP_ARTIFACT: {
				CdapArtifact cdapArtifact = (CdapArtifact)theEObject;
				T result = caseCdapArtifact(cdapArtifact);
				if (result == null) result = caseNamedEntity(cdapArtifact);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Adaptor</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Adaptor</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCdapAdaptor(CdapAdaptor object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cluster</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cluster</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCdapCluster(CdapCluster object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Api</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Api</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCdapApi(CdapApi object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Configuration</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Configuration</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCdapConfiguration(CdapConfiguration object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Namespace</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Namespace</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCdapNamespace(CdapNamespace object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Key Pair</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Key Pair</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCdapKeyPair(CdapKeyPair object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entity With Preferences</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entity With Preferences</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCdapEntityWithPreferences(CdapEntityWithPreferences object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dataset</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dataset</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCdapDataset(CdapDataset object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dataset Schema</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dataset Schema</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCdapDatasetSchema(CdapDatasetSchema object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dataset Schema Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dataset Schema Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCdapDatasetSchemaField(CdapDatasetSchemaField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Application</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Application</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCdapApplication(CdapApplication object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Artifact</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Artifact</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCdapArtifact(CdapArtifact object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Named Entity</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Named Entity</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNamedEntity(NamedEntity object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //CdapSwitch
