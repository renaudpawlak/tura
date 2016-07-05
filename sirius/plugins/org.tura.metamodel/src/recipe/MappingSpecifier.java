/**
 */
package recipe;

import artifact.Option;
import artifact.Technology;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapping Specifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link recipe.MappingSpecifier#getUid <em>Uid</em>}</li>
 *   <li>{@link recipe.MappingSpecifier#getSpecifierRef <em>Specifier Ref</em>}</li>
 *   <li>{@link recipe.MappingSpecifier#getValueRef <em>Value Ref</em>}</li>
 * </ul>
 *
 * @see recipe.RecipePackage#getMappingSpecifier()
 * @model
 * @generated
 */
public interface MappingSpecifier extends EObject {
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
	 * @see recipe.RecipePackage#getMappingSpecifier_Uid()
	 * @model id="true"
	 * @generated
	 */
	String getUid();

	/**
	 * Sets the value of the '{@link recipe.MappingSpecifier#getUid <em>Uid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Uid</em>' attribute.
	 * @see #getUid()
	 * @generated
	 */
	void setUid(String value);

	/**
	 * Returns the value of the '<em><b>Specifier Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Specifier Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specifier Ref</em>' reference.
	 * @see #setSpecifierRef(Technology)
	 * @see recipe.RecipePackage#getMappingSpecifier_SpecifierRef()
	 * @model
	 * @generated
	 */
	Technology getSpecifierRef();

	/**
	 * Sets the value of the '{@link recipe.MappingSpecifier#getSpecifierRef <em>Specifier Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specifier Ref</em>' reference.
	 * @see #getSpecifierRef()
	 * @generated
	 */
	void setSpecifierRef(Technology value);

	/**
	 * Returns the value of the '<em><b>Value Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Value Ref</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value Ref</em>' reference.
	 * @see #setValueRef(Option)
	 * @see recipe.RecipePackage#getMappingSpecifier_ValueRef()
	 * @model
	 * @generated
	 */
	Option getValueRef();

	/**
	 * Sets the value of the '{@link recipe.MappingSpecifier#getValueRef <em>Value Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value Ref</em>' reference.
	 * @see #getValueRef()
	 * @generated
	 */
	void setValueRef(Option value);

} // MappingSpecifier