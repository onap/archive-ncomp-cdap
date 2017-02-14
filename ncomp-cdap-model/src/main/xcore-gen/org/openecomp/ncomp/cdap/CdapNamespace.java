
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

import org.openecomp.ncomp.core.NamedEntity;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Namespace</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.openecomp.ncomp.cdap.CdapNamespace#getDescription <em>Description</em>}</li>
 *   <li>{@link org.openecomp.ncomp.cdap.CdapNamespace#getConfig <em>Config</em>}</li>
 *   <li>{@link org.openecomp.ncomp.cdap.CdapNamespace#getDatasets <em>Datasets</em>}</li>
 *   <li>{@link org.openecomp.ncomp.cdap.CdapNamespace#getApplications <em>Applications</em>}</li>
 *   <li>{@link org.openecomp.ncomp.cdap.CdapNamespace#getCluster <em>Cluster</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.openecomp.ncomp.cdap.CdapPackage#getCdapNamespace()
 * @model
 * @generated
 */
public interface CdapNamespace extends NamedEntity {
	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.openecomp.ncomp.cdap.CdapPackage#getCdapNamespace_Description()
	 * @model unique="false"
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.cdap.CdapNamespace#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Config</b></em>' containment reference list.
	 * The list contents are of type {@link org.openecomp.ncomp.cdap.CdapKeyPair}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Config</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Config</em>' containment reference list.
	 * @see org.openecomp.ncomp.cdap.CdapPackage#getCdapNamespace_Config()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<CdapKeyPair> getConfig();

	/**
	 * Returns the value of the '<em><b>Datasets</b></em>' containment reference list.
	 * The list contents are of type {@link org.openecomp.ncomp.cdap.CdapDataset}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Datasets</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datasets</em>' containment reference list.
	 * @see org.openecomp.ncomp.cdap.CdapPackage#getCdapNamespace_Datasets()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<CdapDataset> getDatasets();

	/**
	 * Returns the value of the '<em><b>Applications</b></em>' containment reference list.
	 * The list contents are of type {@link org.openecomp.ncomp.cdap.CdapApplication}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applications</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applications</em>' containment reference list.
	 * @see org.openecomp.ncomp.cdap.CdapPackage#getCdapNamespace_Applications()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<CdapApplication> getApplications();

	/**
	 * Returns the value of the '<em><b>Cluster</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.openecomp.ncomp.cdap.CdapCluster#getNamespaces <em>Namespaces</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cluster</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cluster</em>' container reference.
	 * @see #setCluster(CdapCluster)
	 * @see org.openecomp.ncomp.cdap.CdapPackage#getCdapNamespace_Cluster()
	 * @see org.openecomp.ncomp.cdap.CdapCluster#getNamespaces
	 * @model opposite="namespaces" transient="false"
	 * @generated
	 */
	CdapCluster getCluster();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.cdap.CdapNamespace#getCluster <em>Cluster</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cluster</em>' container reference.
	 * @see #getCluster()
	 * @generated
	 */
	void setCluster(CdapCluster value);

} // CdapNamespace
