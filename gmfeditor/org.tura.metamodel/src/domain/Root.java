/**
 */
package domain;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link domain.Root#getUid <em>Uid</em>}</li>
 *   <li>{@link domain.Root#getName <em>Name</em>}</li>
 *   <li>{@link domain.Root#getPreFormTrigger <em>Pre Form Trigger</em>}</li>
 * </ul>
 * </p>
 *
 * @see domain.DomainPackage#getRoot()
 * @model annotation="gmf.node label='name' border.color='0,0,0' color='241,238,203'"
 * @generated
 */
public interface Root extends EObject
{
  /**
   * Returns the value of the '<em><b>Uid</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Uid</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Uid</em>' attribute.
   * @see #setUid(String)
   * @see domain.DomainPackage#getRoot_Uid()
   * @model id="true"
   * @generated
   */
  String getUid();

  /**
   * Sets the value of the '{@link domain.Root#getUid <em>Uid</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Uid</em>' attribute.
   * @see #getUid()
   * @generated
   */
  void setUid(String value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see domain.DomainPackage#getRoot_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link domain.Root#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Pre Form Trigger</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pre Form Trigger</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pre Form Trigger</em>' containment reference.
   * @see #setPreFormTrigger(PREFormTrigger)
   * @see domain.DomainPackage#getRoot_PreFormTrigger()
   * @model containment="true"
   *        annotation="gmf.compartment layout='list'"
   * @generated
   */
  PREFormTrigger getPreFormTrigger();

  /**
   * Sets the value of the '{@link domain.Root#getPreFormTrigger <em>Pre Form Trigger</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pre Form Trigger</em>' containment reference.
   * @see #getPreFormTrigger()
   * @generated
   */
  void setPreFormTrigger(PREFormTrigger value);

} // Root
