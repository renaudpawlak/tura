/**
 */
package permission;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Grant Access</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link permission.GrantAccess#getUid <em>Uid</em>}</li>
 * </ul>
 *
 * @see permission.PermissionPackage#getGrantAccess()
 * @model
 * @generated
 */
public interface GrantAccess extends SecurityEntityPointer {
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
	 * @see permission.PermissionPackage#getGrantAccess_Uid()
	 * @model id="true"
	 * @generated
	 */
	String getUid();

	/**
	 * Sets the value of the '{@link permission.GrantAccess#getUid <em>Uid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uid</em>' attribute.
	 * @see #getUid()
	 * @generated
	 */
	void setUid(String value);

} // GrantAccess
