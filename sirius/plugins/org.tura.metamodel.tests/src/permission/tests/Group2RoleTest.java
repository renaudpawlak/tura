/**
 */
package permission.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import permission.Group2Role;
import permission.PermissionFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Group2 Role</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class Group2RoleTest extends TestCase {

	/**
	 * The fixture for this Group2 Role test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Group2Role fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(Group2RoleTest.class);
	}

	/**
	 * Constructs a new Group2 Role test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Group2RoleTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Group2 Role test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Group2Role fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Group2 Role test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Group2Role getFixture() {
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
		setFixture(PermissionFactory.eINSTANCE.createGroup2Role());
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

} //Group2RoleTest
