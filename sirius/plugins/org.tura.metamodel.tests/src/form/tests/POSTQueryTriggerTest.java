/**
 */
package form.tests;

import form.FormFactory;
import form.POSTQueryTrigger;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>POST Query Trigger</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class POSTQueryTriggerTest extends TriggerTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(POSTQueryTriggerTest.class);
	}

	/**
	 * Constructs a new POST Query Trigger test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public POSTQueryTriggerTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this POST Query Trigger test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected POSTQueryTrigger getFixture() {
		return (POSTQueryTrigger)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(FormFactory.eINSTANCE.createPOSTQueryTrigger());
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

} //POSTQueryTriggerTest
