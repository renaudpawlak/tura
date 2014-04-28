/**
 */
package domain;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Uielement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link domain.Uielement#getUid <em>Uid</em>}</li>
 *   <li>{@link domain.Uielement#getEnabled <em>Enabled</em>}</li>
 *   <li>{@link domain.Uielement#getEnabledContext <em>Enabled Context</em>}</li>
 *   <li>{@link domain.Uielement#getRequired <em>Required</em>}</li>
 *   <li>{@link domain.Uielement#getRequiredContext <em>Required Context</em>}</li>
 *   <li>{@link domain.Uielement#getReadOnly <em>Read Only</em>}</li>
 *   <li>{@link domain.Uielement#getReadOnlyContext <em>Read Only Context</em>}</li>
 * </ul>
 * </p>
 *
 * @see domain.DomainPackage#getUielement()
 * @model
 * @generated
 */
public interface Uielement extends StyleElement
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
   * @see domain.DomainPackage#getUielement_Uid()
   * @model id="true"
   * @generated
   */
  String getUid();

  /**
   * Sets the value of the '{@link domain.Uielement#getUid <em>Uid</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Uid</em>' attribute.
   * @see #getUid()
   * @generated
   */
  void setUid(String value);

  /**
   * Returns the value of the '<em><b>Enabled</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Enabled</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Enabled</em>' attribute.
   * @see #setEnabled(String)
   * @see domain.DomainPackage#getUielement_Enabled()
   * @model
   * @generated
   */
  String getEnabled();

  /**
   * Sets the value of the '{@link domain.Uielement#getEnabled <em>Enabled</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Enabled</em>' attribute.
   * @see #getEnabled()
   * @generated
   */
  void setEnabled(String value);

  /**
   * Returns the value of the '<em><b>Enabled Context</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Enabled Context</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Enabled Context</em>' containment reference.
   * @see #setEnabledContext(Context)
   * @see domain.DomainPackage#getUielement_EnabledContext()
   * @model containment="true"
   * @generated
   */
  Context getEnabledContext();

  /**
   * Sets the value of the '{@link domain.Uielement#getEnabledContext <em>Enabled Context</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Enabled Context</em>' containment reference.
   * @see #getEnabledContext()
   * @generated
   */
  void setEnabledContext(Context value);

  /**
   * Returns the value of the '<em><b>Required</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Required</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Required</em>' attribute.
   * @see #setRequired(String)
   * @see domain.DomainPackage#getUielement_Required()
   * @model
   * @generated
   */
  String getRequired();

  /**
   * Sets the value of the '{@link domain.Uielement#getRequired <em>Required</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Required</em>' attribute.
   * @see #getRequired()
   * @generated
   */
  void setRequired(String value);

  /**
   * Returns the value of the '<em><b>Required Context</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Required Context</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Required Context</em>' containment reference.
   * @see #setRequiredContext(Context)
   * @see domain.DomainPackage#getUielement_RequiredContext()
   * @model containment="true"
   * @generated
   */
  Context getRequiredContext();

  /**
   * Sets the value of the '{@link domain.Uielement#getRequiredContext <em>Required Context</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Required Context</em>' containment reference.
   * @see #getRequiredContext()
   * @generated
   */
  void setRequiredContext(Context value);

  /**
   * Returns the value of the '<em><b>Read Only</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Read Only</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Read Only</em>' attribute.
   * @see #setReadOnly(String)
   * @see domain.DomainPackage#getUielement_ReadOnly()
   * @model
   * @generated
   */
  String getReadOnly();

  /**
   * Sets the value of the '{@link domain.Uielement#getReadOnly <em>Read Only</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Read Only</em>' attribute.
   * @see #getReadOnly()
   * @generated
   */
  void setReadOnly(String value);

  /**
   * Returns the value of the '<em><b>Read Only Context</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Read Only Context</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Read Only Context</em>' containment reference.
   * @see #setReadOnlyContext(Context)
   * @see domain.DomainPackage#getUielement_ReadOnlyContext()
   * @model containment="true"
   * @generated
   */
  Context getReadOnlyContext();

  /**
   * Sets the value of the '{@link domain.Uielement#getReadOnlyContext <em>Read Only Context</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Read Only Context</em>' containment reference.
   * @see #getReadOnlyContext()
   * @generated
   */
  void setReadOnlyContext(Context value);

} // Uielement