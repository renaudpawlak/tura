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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Drop Down Selection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link domain.DropDownSelection#getSelection <em>Selection</em>}</li>
 *   <li>{@link domain.DropDownSelection#getInitialOptionMessage <em>Initial Option Message</em>}</li>
 *   <li>{@link domain.DropDownSelection#getInitialOptionValue <em>Initial Option Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see domain.DomainPackage#getDropDownSelection()
 * @model annotation="gmf.node figure='org.tura.metamodel.commons.figures.DropDownFigure' label.placement='none' tool.small.bundle='org.tura.metamodel.commons' tool.small.path='icons/dropdownselection.png'"
 * @generated
 */
public interface DropDownSelection extends OptionSelection {
	/**
	 * Returns the value of the '<em><b>Selection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Selection</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selection</em>' containment reference.
	 * @see #setSelection(Selection)
	 * @see domain.DomainPackage#getDropDownSelection_Selection()
	 * @model containment="true"
	 * @generated
	 */
	Selection getSelection();

	/**
	 * Sets the value of the '{@link domain.DropDownSelection#getSelection <em>Selection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selection</em>' containment reference.
	 * @see #getSelection()
	 * @generated
	 */
	void setSelection(Selection value);

	/**
	 * Returns the value of the '<em><b>Initial Option Message</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Option Message</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Option Message</em>' containment reference.
	 * @see #setInitialOptionMessage(Context)
	 * @see domain.DomainPackage#getDropDownSelection_InitialOptionMessage()
	 * @model containment="true"
	 * @generated
	 */
	Context getInitialOptionMessage();

	/**
	 * Sets the value of the '{@link domain.DropDownSelection#getInitialOptionMessage <em>Initial Option Message</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Option Message</em>' containment reference.
	 * @see #getInitialOptionMessage()
	 * @generated
	 */
	void setInitialOptionMessage(Context value);

	/**
	 * Returns the value of the '<em><b>Initial Option Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initial Option Value</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Initial Option Value</em>' attribute.
	 * @see #setInitialOptionValue(String)
	 * @see domain.DomainPackage#getDropDownSelection_InitialOptionValue()
	 * @model
	 * @generated
	 */
	String getInitialOptionValue();

	/**
	 * Sets the value of the '{@link domain.DropDownSelection#getInitialOptionValue <em>Initial Option Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Initial Option Value</em>' attribute.
	 * @see #getInitialOptionValue()
	 * @generated
	 */
	void setInitialOptionValue(String value);

} // DropDownSelection
