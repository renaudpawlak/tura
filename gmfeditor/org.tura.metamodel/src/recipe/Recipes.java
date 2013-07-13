/**
 */
package recipe;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Recipes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link recipe.Recipes#getRecipe <em>Recipe</em>}</li>
 *   <li>{@link recipe.Recipes#getConfigurations <em>Configurations</em>}</li>
 * </ul>
 * </p>
 *
 * @see recipe.RecipePackage#getRecipes()
 * @model
 * @generated
 */
public interface Recipes extends EObject
{
  /**
   * Returns the value of the '<em><b>Recipe</b></em>' containment reference list.
   * The list contents are of type {@link recipe.Recipe}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Recipe</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Recipe</em>' containment reference list.
   * @see recipe.RecipePackage#getRecipes_Recipe()
   * @model containment="true"
   * @generated
   */
  EList<Recipe> getRecipe();

  /**
   * Returns the value of the '<em><b>Configurations</b></em>' containment reference list.
   * The list contents are of type {@link recipe.Configuration}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Configurations</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Configurations</em>' containment reference list.
   * @see recipe.RecipePackage#getRecipes_Configurations()
   * @model containment="true"
   * @generated
   */
  EList<Configuration> getConfigurations();

} // Recipes
