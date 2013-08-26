/**
 */
package domain.tests;

import domain.DomainFactory;
import domain.ORMEntity;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>ORM Entity</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ORMEntityTest extends DomainArtifactTest
{

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(ORMEntityTest.class);
  }

  /**
   * Constructs a new ORM Entity test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ORMEntityTest(String name)
  {
    super(name);
  }

  /**
   * Returns the fixture for this ORM Entity test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected ORMEntity getFixture()
  {
    return (ORMEntity)fixture;
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
    setFixture(DomainFactory.eINSTANCE.createORMEntity());
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

} //ORMEntityTest