/*
 * 
 */
package recipe.diagram.providers;

import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.gmf.runtime.emf.type.core.ElementTypeRegistry;
import org.eclipse.gmf.runtime.emf.type.core.IElementType;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.resource.ImageRegistry;
import org.eclipse.swt.graphics.Image;

import recipe.diagram.edit.parts.ConfigurationConfigExtensionEditPart;
import recipe.diagram.edit.parts.ConfigurationEditPart;
import recipe.diagram.edit.parts.InfrastructureEditPart;
import recipe.diagram.edit.parts.InfrastructureRecipeConfigEditPart;
import recipe.diagram.edit.parts.IngredientEditPart;
import recipe.diagram.edit.parts.JavaComponent2EditPart;
import recipe.diagram.edit.parts.JavaComponentEditPart;
import recipe.diagram.edit.parts.ModelMapperEditPart;
import recipe.diagram.edit.parts.PropertyEditPart;
import recipe.diagram.edit.parts.RecipeEditPart;
import recipe.diagram.edit.parts.RecipeInfrastructuresEditPart;
import recipe.diagram.edit.parts.RecipesEditPart;
import recipe.diagram.edit.parts.TypeExtensionEditPart;
import recipe.diagram.part.DomainDiagramEditorPlugin;
import domain.DomainPackage;

/**
 * @generated
 */
public class DomainElementTypes {

	/**
	 * @generated
	 */
	private DomainElementTypes() {
	}

	/**
	 * @generated
	 */
	private static Map<IElementType, ENamedElement> elements;

	/**
	 * @generated
	 */
	private static ImageRegistry imageRegistry;

	/**
	 * @generated
	 */
	private static Set<IElementType> KNOWN_ELEMENT_TYPES;

	/**
	 * @generated
	 */
	public static final IElementType Recipes_301000 = getElementType("org.tura.metamodel.diagram.recipe.Recipes_301000"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Recipe_302001 = getElementType("org.tura.metamodel.diagram.recipe.Recipe_302001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Configuration_302002 = getElementType("org.tura.metamodel.diagram.recipe.Configuration_302002"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Infrastructure_302003 = getElementType("org.tura.metamodel.diagram.recipe.Infrastructure_302003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Ingredient_303005 = getElementType("org.tura.metamodel.diagram.recipe.Ingredient_303005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType JavaComponent_303007 = getElementType("org.tura.metamodel.diagram.recipe.JavaComponent_303007"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType JavaComponent_303008 = getElementType("org.tura.metamodel.diagram.recipe.JavaComponent_303008"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ModelMapper_303003 = getElementType("org.tura.metamodel.diagram.recipe.ModelMapper_303003"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType Property_303004 = getElementType("org.tura.metamodel.diagram.recipe.Property_303004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType TypeExtension_304001 = getElementType("org.tura.metamodel.diagram.recipe.TypeExtension_304001"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType RecipeInfrastructures_304005 = getElementType("org.tura.metamodel.diagram.recipe.RecipeInfrastructures_304005"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType InfrastructureRecipeConfig_304004 = getElementType("org.tura.metamodel.diagram.recipe.InfrastructureRecipeConfig_304004"); //$NON-NLS-1$
	/**
	 * @generated
	 */
	public static final IElementType ConfigurationConfigExtension_304003 = getElementType("org.tura.metamodel.diagram.recipe.ConfigurationConfigExtension_304003"); //$NON-NLS-1$

	/**
	 * @generated
	 */
	private static ImageRegistry getImageRegistry() {
		if (imageRegistry == null) {
			imageRegistry = new ImageRegistry();
		}
		return imageRegistry;
	}

	/**
	 * @generated
	 */
	private static String getImageRegistryKey(ENamedElement element) {
		return element.getName();
	}

	/**
	 * @generated
	 */
	private static ImageDescriptor getProvidedImageDescriptor(
			ENamedElement element) {
		if (element instanceof EStructuralFeature) {
			EStructuralFeature feature = ((EStructuralFeature) element);
			EClass eContainingClass = feature.getEContainingClass();
			EClassifier eType = feature.getEType();
			if (eContainingClass != null && !eContainingClass.isAbstract()) {
				element = eContainingClass;
			} else if (eType instanceof EClass
					&& !((EClass) eType).isAbstract()) {
				element = eType;
			}
		}
		if (element instanceof EClass) {
			EClass eClass = (EClass) element;
			if (!eClass.isAbstract()) {
				return DomainDiagramEditorPlugin.getInstance()
						.getItemImageDescriptor(
								eClass.getEPackage().getEFactoryInstance()
										.create(eClass));
			}
		}
		// TODO : support structural features
		return null;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(ENamedElement element) {
		String key = getImageRegistryKey(element);
		ImageDescriptor imageDescriptor = getImageRegistry().getDescriptor(key);
		if (imageDescriptor == null) {
			imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
		}
		return imageDescriptor;
	}

	/**
	 * @generated
	 */
	public static Image getImage(ENamedElement element) {
		String key = getImageRegistryKey(element);
		Image image = getImageRegistry().get(key);
		if (image == null) {
			ImageDescriptor imageDescriptor = getProvidedImageDescriptor(element);
			if (imageDescriptor == null) {
				imageDescriptor = ImageDescriptor.getMissingImageDescriptor();
			}
			getImageRegistry().put(key, imageDescriptor);
			image = getImageRegistry().get(key);
		}
		return image;
	}

	/**
	 * @generated
	 */
	public static ImageDescriptor getImageDescriptor(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImageDescriptor(element);
	}

	/**
	 * @generated
	 */
	public static Image getImage(IAdaptable hint) {
		ENamedElement element = getElement(hint);
		if (element == null) {
			return null;
		}
		return getImage(element);
	}

	/**
	 * Returns 'type' of the ecore object associated with the hint.
	 * 
	 * @generated
	 */
	public static ENamedElement getElement(IAdaptable hint) {
		Object type = hint.getAdapter(IElementType.class);
		if (elements == null) {
			elements = new IdentityHashMap<IElementType, ENamedElement>();

			elements.put(Recipes_301000, DomainPackage.eINSTANCE.getRecipes());

			elements.put(Recipe_302001, DomainPackage.eINSTANCE.getRecipe());

			elements.put(Configuration_302002,
					DomainPackage.eINSTANCE.getConfiguration());

			elements.put(Infrastructure_302003,
					DomainPackage.eINSTANCE.getInfrastructure());

			elements.put(Ingredient_303005,
					DomainPackage.eINSTANCE.getIngredient());

			elements.put(JavaComponent_303007,
					DomainPackage.eINSTANCE.getJavaComponent());

			elements.put(JavaComponent_303008,
					DomainPackage.eINSTANCE.getJavaComponent());

			elements.put(ModelMapper_303003,
					DomainPackage.eINSTANCE.getModelMapper());

			elements.put(Property_303004, DomainPackage.eINSTANCE.getProperty());

			elements.put(TypeExtension_304001,
					DomainPackage.eINSTANCE.getTypeExtension());

			elements.put(RecipeInfrastructures_304005,
					DomainPackage.eINSTANCE.getRecipe_Infrastructures());

			elements.put(InfrastructureRecipeConfig_304004,
					DomainPackage.eINSTANCE.getInfrastructure_RecipeConfig());

			elements.put(ConfigurationConfigExtension_304003,
					DomainPackage.eINSTANCE.getConfiguration_ConfigExtension());
		}
		return (ENamedElement) elements.get(type);
	}

	/**
	 * @generated
	 */
	private static IElementType getElementType(String id) {
		return ElementTypeRegistry.getInstance().getType(id);
	}

	/**
	 * @generated
	 */
	public static boolean isKnownElementType(IElementType elementType) {
		if (KNOWN_ELEMENT_TYPES == null) {
			KNOWN_ELEMENT_TYPES = new HashSet<IElementType>();
			KNOWN_ELEMENT_TYPES.add(Recipes_301000);
			KNOWN_ELEMENT_TYPES.add(Recipe_302001);
			KNOWN_ELEMENT_TYPES.add(Configuration_302002);
			KNOWN_ELEMENT_TYPES.add(Infrastructure_302003);
			KNOWN_ELEMENT_TYPES.add(Ingredient_303005);
			KNOWN_ELEMENT_TYPES.add(JavaComponent_303007);
			KNOWN_ELEMENT_TYPES.add(JavaComponent_303008);
			KNOWN_ELEMENT_TYPES.add(ModelMapper_303003);
			KNOWN_ELEMENT_TYPES.add(Property_303004);
			KNOWN_ELEMENT_TYPES.add(TypeExtension_304001);
			KNOWN_ELEMENT_TYPES.add(RecipeInfrastructures_304005);
			KNOWN_ELEMENT_TYPES.add(InfrastructureRecipeConfig_304004);
			KNOWN_ELEMENT_TYPES.add(ConfigurationConfigExtension_304003);
		}
		return KNOWN_ELEMENT_TYPES.contains(elementType);
	}

	/**
	 * @generated
	 */
	public static IElementType getElementType(int visualID) {
		switch (visualID) {
		case RecipesEditPart.VISUAL_ID:
			return Recipes_301000;
		case RecipeEditPart.VISUAL_ID:
			return Recipe_302001;
		case ConfigurationEditPart.VISUAL_ID:
			return Configuration_302002;
		case InfrastructureEditPart.VISUAL_ID:
			return Infrastructure_302003;
		case IngredientEditPart.VISUAL_ID:
			return Ingredient_303005;
		case JavaComponentEditPart.VISUAL_ID:
			return JavaComponent_303007;
		case JavaComponent2EditPart.VISUAL_ID:
			return JavaComponent_303008;
		case ModelMapperEditPart.VISUAL_ID:
			return ModelMapper_303003;
		case PropertyEditPart.VISUAL_ID:
			return Property_303004;
		case TypeExtensionEditPart.VISUAL_ID:
			return TypeExtension_304001;
		case RecipeInfrastructuresEditPart.VISUAL_ID:
			return RecipeInfrastructures_304005;
		case InfrastructureRecipeConfigEditPart.VISUAL_ID:
			return InfrastructureRecipeConfig_304004;
		case ConfigurationConfigExtensionEditPart.VISUAL_ID:
			return ConfigurationConfigExtension_304003;
		}
		return null;
	}

}
