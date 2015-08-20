/*******************************************************************************
 * Tura - application generation platform
 *
 * Copyright (c) 2012, 2015, Arseniy Isakov
 *  
 * This project includes software developed by Arseniy Isakov
 * http://sourceforge.net/p/tura/wiki/Home/
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
/**
 */
package domain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Style Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link domain.StyleElement#getStyle <em>Style</em>}</li>
 *   <li>{@link domain.StyleElement#getStyleClass <em>Style Class</em>}</li>
 * </ul>
 *
 * @see domain.DomainPackage#getStyleElement()
 * @model
 * @generated
 */
public interface StyleElement extends EObject {
	/**
	 * Returns the value of the '<em><b>Style</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Style</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style</em>' containment reference.
	 * @see #setStyle(Context)
	 * @see domain.DomainPackage#getStyleElement_Style()
	 * @model containment="true"
	 * @generated
	 */
	Context getStyle();

	/**
	 * Sets the value of the '{@link domain.StyleElement#getStyle <em>Style</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Style</em>' containment reference.
	 * @see #getStyle()
	 * @generated
	 */
	void setStyle(Context value);

	/**
	 * Returns the value of the '<em><b>Style Class</b></em>' containment reference list.
	 * The list contents are of type {@link domain.StyleClass}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Style Class</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Style Class</em>' containment reference list.
	 * @see domain.DomainPackage#getStyleElement_StyleClass()
	 * @model containment="true"
	 * @generated
	 */
	EList<StyleClass> getStyleClass();

} // StyleElement