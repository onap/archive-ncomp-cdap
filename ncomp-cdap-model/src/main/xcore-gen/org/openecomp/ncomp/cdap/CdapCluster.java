
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
 * A representation of the model object '<em><b>Cluster</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.openecomp.ncomp.cdap.CdapCluster#getBaseUrl <em>Base Url</em>}</li>
 *   <li>{@link org.openecomp.ncomp.cdap.CdapCluster#getPollingFrequency <em>Polling Frequency</em>}</li>
 *   <li>{@link org.openecomp.ncomp.cdap.CdapCluster#isRemote <em>Remote</em>}</li>
 *   <li>{@link org.openecomp.ncomp.cdap.CdapCluster#getConfigurations <em>Configurations</em>}</li>
 *   <li>{@link org.openecomp.ncomp.cdap.CdapCluster#getNamespaces <em>Namespaces</em>}</li>
 * </ul>
 *
 * @see org.openecomp.ncomp.cdap.CdapPackage#getCdapCluster()
 * @model
 * @generated
 */
public interface CdapCluster extends NamedEntity, CdapApi {
	/**
	 * Returns the value of the '<em><b>Base Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Base Url</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Base Url</em>' attribute.
	 * @see #setBaseUrl(String)
	 * @see org.openecomp.ncomp.cdap.CdapPackage#getCdapCluster_BaseUrl()
	 * @model unique="false"
	 * @generated
	 */
	String getBaseUrl();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.cdap.CdapCluster#getBaseUrl <em>Base Url</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Base Url</em>' attribute.
	 * @see #getBaseUrl()
	 * @generated
	 */
	void setBaseUrl(String value);

	/**
	 * Returns the value of the '<em><b>Polling Frequency</b></em>' attribute.
	 * The default value is <code>"300000"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Polling Frequency</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Polling Frequency</em>' attribute.
	 * @see #setPollingFrequency(long)
	 * @see org.openecomp.ncomp.cdap.CdapPackage#getCdapCluster_PollingFrequency()
	 * @model default="300000" unique="false"
	 * @generated
	 */
	long getPollingFrequency();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.cdap.CdapCluster#getPollingFrequency <em>Polling Frequency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Polling Frequency</em>' attribute.
	 * @see #getPollingFrequency()
	 * @generated
	 */
	void setPollingFrequency(long value);

	/**
	 * Returns the value of the '<em><b>Remote</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remote</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remote</em>' attribute.
	 * @see #setRemote(boolean)
	 * @see org.openecomp.ncomp.cdap.CdapPackage#getCdapCluster_Remote()
	 * @model default="false" unique="false"
	 * @generated
	 */
	boolean isRemote();

	/**
	 * Sets the value of the '{@link org.openecomp.ncomp.cdap.CdapCluster#isRemote <em>Remote</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remote</em>' attribute.
	 * @see #isRemote()
	 * @generated
	 */
	void setRemote(boolean value);

	/**
	 * Returns the value of the '<em><b>Configurations</b></em>' containment reference list.
	 * The list contents are of type {@link org.openecomp.ncomp.cdap.CdapConfiguration}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Configurations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Configurations</em>' containment reference list.
	 * @see org.openecomp.ncomp.cdap.CdapPackage#getCdapCluster_Configurations()
	 * @model containment="true" ordered="false"
	 * @generated
	 */
	EList<CdapConfiguration> getConfigurations();

	/**
	 * Returns the value of the '<em><b>Namespaces</b></em>' containment reference list.
	 * The list contents are of type {@link org.openecomp.ncomp.cdap.CdapNamespace}.
	 * It is bidirectional and its opposite is '{@link org.openecomp.ncomp.cdap.CdapNamespace#getCluster <em>Cluster</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Namespaces</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Namespaces</em>' containment reference list.
	 * @see org.openecomp.ncomp.cdap.CdapPackage#getCdapCluster_Namespaces()
	 * @see org.openecomp.ncomp.cdap.CdapNamespace#getCluster
	 * @model opposite="cluster" containment="true" ordered="false"
	 * @generated
	 */
	EList<CdapNamespace> getNamespaces();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void poll();

} // CdapCluster
