/**
 */
package typesrepository.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import typesrepository.TypesRepository;
import typesrepository.TypesrepositoryFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Types Repository</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TypesRepositoryTest extends TestCase
{

  /**
   * The fixture for this Types Repository test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TypesRepository fixture = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(TypesRepositoryTest.class);
  }

  /**
   * Constructs a new Types Repository test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public TypesRepositoryTest(String name)
  {
    super(name);
  }

  /**
   * Sets the fixture for this Types Repository test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void setFixture(TypesRepository fixture)
  {
    this.fixture = fixture;
  }

  /**
   * Returns the fixture for this Types Repository test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected TypesRepository getFixture()
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
    setFixture(TypesrepositoryFactory.eINSTANCE.createTypesRepository());
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

} //TypesRepositoryTest