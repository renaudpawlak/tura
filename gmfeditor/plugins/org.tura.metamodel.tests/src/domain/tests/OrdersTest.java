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
package domain.tests;

import domain.DomainFactory;
import domain.Orders;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Orders</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class OrdersTest extends TestCase
{

  /**
	 * The fixture for this Orders test case.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected Orders fixture = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static void main(String[] args)
  {
		TestRunner.run(OrdersTest.class);
	}

  /**
	 * Constructs a new Orders test case with the given name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public OrdersTest(String name)
  {
		super(name);
	}

  /**
	 * Sets the fixture for this Orders test case.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void setFixture(Orders fixture)
  {
		this.fixture = fixture;
	}

  /**
	 * Returns the fixture for this Orders test case.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected Orders getFixture()
  {
		return fixture;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
  @Override
  protected void setUp() throws Exception
  {
		setFixture(DomainFactory.eINSTANCE.createOrders());
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
  @Override
  protected void tearDown() throws Exception
  {
		setFixture(null);
	}

} //OrdersTest