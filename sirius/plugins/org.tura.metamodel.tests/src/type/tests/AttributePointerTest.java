/**
 */
package type.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import type.AttributePointer;
import type.TypeFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Attribute Pointer</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AttributePointerTest extends TestCase {

	/**
	 * The fixture for this Attribute Pointer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributePointer fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AttributePointerTest.class);
	}

	/**
	 * Constructs a new Attribute Pointer test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AttributePointerTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Attribute Pointer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(AttributePointer fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Attribute Pointer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributePointer getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(TypeFactory.eINSTANCE.createAttributePointer());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //AttributePointerTest
