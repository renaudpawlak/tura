/**
 */
package domain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Controls</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link domain.Controls#getUid <em>Uid</em>}</li>
 *   <li>{@link domain.Controls#getRoot <em>Root</em>}</li>
 *   <li>{@link domain.Controls#getControls <em>Controls</em>}</li>
 *   <li>{@link domain.Controls#getRelations <em>Relations</em>}</li>
 * </ul>
 * </p>
 *
 * @see domain.DomainPackage#getControls()
 * @model
 * @generated
 */
public interface Controls extends EObject
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
   * @see domain.DomainPackage#getControls_Uid()
   * @model id="true"
   * @generated
   */
  String getUid();

  /**
   * Sets the value of the '{@link domain.Controls#getUid <em>Uid</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Uid</em>' attribute.
   * @see #getUid()
   * @generated
   */
  void setUid(String value);

  /**
   * Returns the value of the '<em><b>Root</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Root</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Root</em>' containment reference.
   * @see #setRoot(Root)
   * @see domain.DomainPackage#getControls_Root()
   * @model containment="true"
   * @generated
   */
  Root getRoot();

  /**
   * Sets the value of the '{@link domain.Controls#getRoot <em>Root</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Root</em>' containment reference.
   * @see #getRoot()
   * @generated
   */
  void setRoot(Root value);

  /**
   * Returns the value of the '<em><b>Controls</b></em>' containment reference list.
   * The list contents are of type {@link domain.DataControl}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Controls</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Controls</em>' containment reference list.
   * @see domain.DomainPackage#getControls_Controls()
   * @model containment="true"
   * @generated
   */
  EList<DataControl> getControls();

  /**
   * Returns the value of the '<em><b>Relations</b></em>' containment reference list.
   * The list contents are of type {@link domain.Relation}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Relations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Relations</em>' containment reference list.
   * @see domain.DomainPackage#getControls_Relations()
   * @model containment="true"
   * @generated
   */
  EList<Relation> getRelations();

} // Controls