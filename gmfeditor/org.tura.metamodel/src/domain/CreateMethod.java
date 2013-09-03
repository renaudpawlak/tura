/**
 */
package domain;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Create Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link domain.CreateMethod#getParent <em>Parent</em>}</li>
 * </ul>
 * </p>
 *
 * @see domain.DomainPackage#getCreateMethod()
 * @model annotation="gmf.node label='method'"
 * @generated
 */
public interface CreateMethod extends BusinessMethod
{
  /**
   * Returns the value of the '<em><b>Parent</b></em>' container reference.
   * It is bidirectional and its opposite is '{@link domain.BusinessObject#getCreateMethods <em>Create Methods</em>}'.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Parent</em>' container reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Parent</em>' container reference.
   * @see #setParent(BusinessObject)
   * @see domain.DomainPackage#getCreateMethod_Parent()
   * @see domain.BusinessObject#getCreateMethods
   * @model opposite="createMethods" transient="false"
   * @generated
   */
  BusinessObject getParent();

  /**
   * Sets the value of the '{@link domain.CreateMethod#getParent <em>Parent</em>}' container reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Parent</em>' container reference.
   * @see #getParent()
   * @generated
   */
  void setParent(BusinessObject value);

} // CreateMethod
