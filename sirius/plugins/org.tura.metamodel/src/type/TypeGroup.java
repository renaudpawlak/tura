/**
 */
package type;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link type.TypeGroup#getUid <em>Uid</em>}</li>
 *   <li>{@link type.TypeGroup#getName <em>Name</em>}</li>
 *   <li>{@link type.TypeGroup#getTypes <em>Types</em>}</li>
 *   <li>{@link type.TypeGroup#getRelationships <em>Relationships</em>}</li>
 * </ul>
 *
 * @see type.TypePackage#getTypeGroup()
 * @model
 * @generated
 */
public interface TypeGroup extends EObject {
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
	 * @see type.TypePackage#getTypeGroup_Uid()
	 * @model id="true"
	 * @generated
	 */
	String getUid();

	/**
	 * Sets the value of the '{@link type.TypeGroup#getUid <em>Uid</em>}' attribute.
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
	 * @see type.TypePackage#getTypeGroup_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link type.TypeGroup#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Types</b></em>' containment reference list.
	 * The list contents are of type {@link type.TypeElement}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Types</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Types</em>' containment reference list.
	 * @see type.TypePackage#getTypeGroup_Types()
	 * @model containment="true"
	 * @generated
	 */
	EList<TypeElement> getTypes();

	/**
	 * Returns the value of the '<em><b>Relationships</b></em>' containment reference list.
	 * The list contents are of type {@link type.Relationship}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relationships</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relationships</em>' containment reference list.
	 * @see type.TypePackage#getTypeGroup_Relationships()
	 * @model containment="true"
	 * @generated
	 */
	EList<Relationship> getRelationships();

} // TypeGroup
