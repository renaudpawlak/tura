/**
 */
package type;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Pointer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link type.AttributePointer#getAttributeRef <em>Attribute Ref</em>}</li>
 * </ul>
 *
 * @see type.TypePackage#getAttributePointer()
 * @model
 * @generated
 */
public interface AttributePointer extends EObject {
	/**
	 * Returns the value of the '<em><b>Attribute Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attribute Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attribute Ref</em>' reference.
	 * @see #setAttributeRef(Attribute)
	 * @see type.TypePackage#getAttributePointer_AttributeRef()
	 * @model
	 * @generated
	 */
	Attribute getAttributeRef();

	/**
	 * Sets the value of the '{@link type.AttributePointer#getAttributeRef <em>Attribute Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Attribute Ref</em>' reference.
	 * @see #getAttributeRef()
	 * @generated
	 */
	void setAttributeRef(Attribute value);

} // AttributePointer
