/**
 */
package domain.tests;

import domain.DomainFactory;
import domain.InfrastructureConnection;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Infrastructure Connection</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class InfrastructureConnectionTest extends TestCase
{

  /**
   * The fixture for this Infrastructure Connection test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InfrastructureConnection fixture = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static void main(String[] args)
  {
    TestRunner.run(InfrastructureConnectionTest.class);
  }

  /**
   * Constructs a new Infrastructure Connection test case with the given name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public InfrastructureConnectionTest(String name)
  {
    super(name);
  }

  /**
   * Sets the fixture for this Infrastructure Connection test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void setFixture(InfrastructureConnection fixture)
  {
    this.fixture = fixture;
  }

  /**
   * Returns the fixture for this Infrastructure Connection test case.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected InfrastructureConnection getFixture()
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
    setFixture(DomainFactory.eINSTANCE.createInfrastructureConnection());
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

} //InfrastructureConnectionTest