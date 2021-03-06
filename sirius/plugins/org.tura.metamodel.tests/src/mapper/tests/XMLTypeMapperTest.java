/**
 */
package mapper.tests;

import junit.textui.TestRunner;

import mapper.MapperFactory;
import mapper.XMLTypeMapper;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>XML Type Mapper</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class XMLTypeMapperTest extends TypeMapperTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(XMLTypeMapperTest.class);
	}

	/**
	 * Constructs a new XML Type Mapper test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public XMLTypeMapperTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this XML Type Mapper test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected XMLTypeMapper getFixture() {
		return (XMLTypeMapper)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(MapperFactory.eINSTANCE.createXMLTypeMapper());
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

} //XMLTypeMapperTest
