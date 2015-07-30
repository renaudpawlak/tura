/**
 */
package domain.tests;

import junit.textui.TestRunner;
import domain.ApplicationUILayer;
import domain.DomainFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Application UI Layer</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApplicationUILayerTest extends HTMLLayerHolderTest
{

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static void main(String[] args)
  {
		TestRunner.run(ApplicationUILayerTest.class);
	}

  /**
	 * Constructs a new Application UI Layer test case with the given name.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public ApplicationUILayerTest(String name)
  {
		super(name);
	}

  /**
	 * Returns the fixture for this Application UI Layer test case.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected ApplicationUILayer getFixture()
  {
		return (ApplicationUILayer)fixture;
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
		setFixture(DomainFactory.eINSTANCE.createApplicationUILayer());
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

} //ApplicationUILayerTest
