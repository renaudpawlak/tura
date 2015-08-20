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
 * A representation of the model object '<em><b>Using Mappers</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link domain.UsingMappers#getMappers <em>Mappers</em>}</li>
 * </ul>
 *
 * @see domain.DomainPackage#getUsingMappers()
 * @model
 * @generated
 */
public interface UsingMappers extends EObject {
	/**
	 * Returns the value of the '<em><b>Mappers</b></em>' reference list.
	 * The list contents are of type {@link domain.ApplicationMapper}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mappers</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mappers</em>' reference list.
	 * @see domain.DomainPackage#getUsingMappers_Mappers()
	 * @model
	 * @generated
	 */
	EList<ApplicationMapper> getMappers();

} // UsingMappers