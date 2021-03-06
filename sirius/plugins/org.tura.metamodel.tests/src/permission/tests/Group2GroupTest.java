/**
 */
package permission.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import permission.Group2Group;
import permission.PermissionFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Group2 Group</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class Group2GroupTest extends TestCase {

	/**
	 * The fixture for this Group2 Group test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Group2Group fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(Group2GroupTest.class);
	}

	/**
	 * Constructs a new Group2 Group test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Group2GroupTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Group2 Group test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Group2Group fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Group2 Group test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Group2Group getFixture() {
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
		setFixture(PermissionFactory.eINSTANCE.createGroup2Group());
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

} //Group2GroupTest
