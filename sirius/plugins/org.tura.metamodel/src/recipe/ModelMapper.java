/**
 */
package recipe;

import common.Orderable;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model Mapper</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link recipe.ModelMapper#getName <em>Name</em>}</li>
 *   <li>{@link recipe.ModelMapper#getArtifactRoot <em>Artifact Root</em>}</li>
 *   <li>{@link recipe.ModelMapper#getTechnologies <em>Technologies</em>}</li>
 *   <li>{@link recipe.ModelMapper#getQueries <em>Queries</em>}</li>
 *   <li>{@link recipe.ModelMapper#getArtifactExecutionString <em>Artifact Execution String</em>}</li>
 *   <li>{@link recipe.ModelMapper#isSkip <em>Skip</em>}</li>
 * </ul>
 *
 * @see recipe.RecipePackage#getModelMapper()
 * @model
 * @generated
 */
public interface ModelMapper extends ArtifactRef, Orderable {
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
	 * @see recipe.RecipePackage#getModelMapper_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link recipe.ModelMapper#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Artifact Root</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Artifact Root</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artifact Root</em>' attribute.
	 * @see #setArtifactRoot(String)
	 * @see recipe.RecipePackage#getModelMapper_ArtifactRoot()
	 * @model
	 * @generated
	 */
	String getArtifactRoot();

	/**
	 * Sets the value of the '{@link recipe.ModelMapper#getArtifactRoot <em>Artifact Root</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Artifact Root</em>' attribute.
	 * @see #getArtifactRoot()
	 * @generated
	 */
	void setArtifactRoot(String value);

	/**
	 * Returns the value of the '<em><b>Technologies</b></em>' containment reference list.
	 * The list contents are of type {@link recipe.MappingTecnologiy}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Technologies</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Technologies</em>' containment reference list.
	 * @see recipe.RecipePackage#getModelMapper_Technologies()
	 * @model containment="true"
	 * @generated
	 */
	EList<MappingTecnologiy> getTechnologies();

	/**
	 * Returns the value of the '<em><b>Queries</b></em>' containment reference list.
	 * The list contents are of type {@link recipe.Query}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Queries</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Queries</em>' containment reference list.
	 * @see recipe.RecipePackage#getModelMapper_Queries()
	 * @model containment="true"
	 * @generated
	 */
	EList<Query> getQueries();

	/**
	 * Returns the value of the '<em><b>Artifact Execution String</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Artifact Execution String</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Artifact Execution String</em>' attribute.
	 * @see #setArtifactExecutionString(String)
	 * @see recipe.RecipePackage#getModelMapper_ArtifactExecutionString()
	 * @model
	 * @generated
	 */
	String getArtifactExecutionString();

	/**
	 * Sets the value of the '{@link recipe.ModelMapper#getArtifactExecutionString <em>Artifact Execution String</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Artifact Execution String</em>' attribute.
	 * @see #getArtifactExecutionString()
	 * @generated
	 */
	void setArtifactExecutionString(String value);

	/**
	 * Returns the value of the '<em><b>Skip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Skip</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Skip</em>' attribute.
	 * @see #setSkip(boolean)
	 * @see recipe.RecipePackage#getModelMapper_Skip()
	 * @model
	 * @generated
	 */
	boolean isSkip();

	/**
	 * Sets the value of the '{@link recipe.ModelMapper#isSkip <em>Skip</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Skip</em>' attribute.
	 * @see #isSkip()
	 * @generated
	 */
	void setSkip(boolean value);

} // ModelMapper
