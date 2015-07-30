/**
 */
package domain.tests;

import domain.ApplicationInfrastructureLayer;
import domain.DomainFactory;

import junit.framework.TestCase;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Application Infrastructure Layer</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApplicationInfrastructureLayerTest extends TestCase
{

  /**
	 * The fixture for this Application Infrastructure Layer test case.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected ApplicationInfrastructureLayer fixture = null;

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static void main(String[] args)
  {
		TestRunner.run(ApplicationInfrastructureLayerTest.class);
	}

  /**
	 * Constructs a new Application Infrastructure Layer test case with the given name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ApplicationInfrastructureLayerTest(String name)
  {
		super(name);
	}

  /**
	 * Sets the fixture for this Application Infrastructure Layer test case.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void setFixture(ApplicationInfrastructureLayer fixture)
  {
		this.fixture = fixture;
	}

  /**
	 * Returns the fixture for this Application Infrastructure Layer test case.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected ApplicationInfrastructureLayer getFixture()
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
		setFixture(DomainFactory.eINSTANCE.createApplicationInfrastructureLayer());
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

} //ApplicationInfrastructureLayerTest
