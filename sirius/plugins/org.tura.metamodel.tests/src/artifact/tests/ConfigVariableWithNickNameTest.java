/**
 */
package artifact.tests;

import artifact.ArtifactFactory;
import artifact.ConfigVariableWithNickName;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Config Variable With Nick Name</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ConfigVariableWithNickNameTest extends TestCase {

	/**
	 * The fixture for this Config Variable With Nick Name test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigVariableWithNickName fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(ConfigVariableWithNickNameTest.class);
	}

	/**
	 * Constructs a new Config Variable With Nick Name test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfigVariableWithNickNameTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Config Variable With Nick Name test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(ConfigVariableWithNickName fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Config Variable With Nick Name test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigVariableWithNickName getFixture() {
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
		setFixture(ArtifactFactory.eINSTANCE.createConfigVariableWithNickName());
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

} //ConfigVariableWithNickNameTest
