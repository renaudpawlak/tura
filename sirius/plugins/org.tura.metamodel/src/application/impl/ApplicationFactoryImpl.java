/**
 */
package application.impl;

import application.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ApplicationFactoryImpl extends EFactoryImpl implements ApplicationFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ApplicationFactory init() {
		try {
			ApplicationFactory theApplicationFactory = (ApplicationFactory)EPackage.Registry.INSTANCE.getEFactory(ApplicationPackage.eNS_URI);
			if (theApplicationFactory != null) {
				return theApplicationFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ApplicationFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case ApplicationPackage.APPLICATION_GROUP: return createApplicationGroup();
			case ApplicationPackage.APPLICATION: return createApplication();
			case ApplicationPackage.APPLICATION_INFRASTRUCTURE_LAYERS: return createApplicationInfrastructureLayers();
			case ApplicationPackage.APPLICATION_INFRASTRUCTURE_LAYER: return createApplicationInfrastructureLayer();
			case ApplicationPackage.APPLICATION_MESSAGE_LIBRARIES: return createApplicationMessageLibraries();
			case ApplicationPackage.APPLICATION_LANGUAGES: return createApplicationLanguages();
			case ApplicationPackage.APPLICATION_MESSAGE_LIBRARY: return createApplicationMessageLibrary();
			case ApplicationPackage.APPLICATION_REALMS: return createApplicationRealms();
			case ApplicationPackage.APPLICATION_REALM: return createApplicationRealm();
			case ApplicationPackage.APPLICATION_STYLE_LIBRARIES: return createApplicationStyleLibraries();
			case ApplicationPackage.APPLICATION_STYLE: return createApplicationStyle();
			case ApplicationPackage.APPLICATION_UI_LAYER: return createApplicationUILayer();
			case ApplicationPackage.APPLICATION_UI_PACKAGE: return createApplicationUIPackage();
			case ApplicationPackage.APPLICATION_RECIPES: return createApplicationRecipes();
			case ApplicationPackage.APPLICATION_RECIPE: return createApplicationRecipe();
			case ApplicationPackage.APPLICATION_MAPPERS: return createApplicationMappers();
			case ApplicationPackage.APPLICATION_MAPPER: return createApplicationMapper();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationGroup createApplicationGroup() {
		ApplicationGroupImpl applicationGroup = new ApplicationGroupImpl();
		return applicationGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Application createApplication() {
		ApplicationImpl application = new ApplicationImpl();
		return application;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationInfrastructureLayers createApplicationInfrastructureLayers() {
		ApplicationInfrastructureLayersImpl applicationInfrastructureLayers = new ApplicationInfrastructureLayersImpl();
		return applicationInfrastructureLayers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationInfrastructureLayer createApplicationInfrastructureLayer() {
		ApplicationInfrastructureLayerImpl applicationInfrastructureLayer = new ApplicationInfrastructureLayerImpl();
		return applicationInfrastructureLayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationMessageLibraries createApplicationMessageLibraries() {
		ApplicationMessageLibrariesImpl applicationMessageLibraries = new ApplicationMessageLibrariesImpl();
		return applicationMessageLibraries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationLanguages createApplicationLanguages() {
		ApplicationLanguagesImpl applicationLanguages = new ApplicationLanguagesImpl();
		return applicationLanguages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationMessageLibrary createApplicationMessageLibrary() {
		ApplicationMessageLibraryImpl applicationMessageLibrary = new ApplicationMessageLibraryImpl();
		return applicationMessageLibrary;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationRealms createApplicationRealms() {
		ApplicationRealmsImpl applicationRealms = new ApplicationRealmsImpl();
		return applicationRealms;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationRealm createApplicationRealm() {
		ApplicationRealmImpl applicationRealm = new ApplicationRealmImpl();
		return applicationRealm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationStyleLibraries createApplicationStyleLibraries() {
		ApplicationStyleLibrariesImpl applicationStyleLibraries = new ApplicationStyleLibrariesImpl();
		return applicationStyleLibraries;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationStyle createApplicationStyle() {
		ApplicationStyleImpl applicationStyle = new ApplicationStyleImpl();
		return applicationStyle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationUILayer createApplicationUILayer() {
		ApplicationUILayerImpl applicationUILayer = new ApplicationUILayerImpl();
		return applicationUILayer;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationUIPackage createApplicationUIPackage() {
		ApplicationUIPackageImpl applicationUIPackage = new ApplicationUIPackageImpl();
		return applicationUIPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationRecipes createApplicationRecipes() {
		ApplicationRecipesImpl applicationRecipes = new ApplicationRecipesImpl();
		return applicationRecipes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationRecipe createApplicationRecipe() {
		ApplicationRecipeImpl applicationRecipe = new ApplicationRecipeImpl();
		return applicationRecipe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationMappers createApplicationMappers() {
		ApplicationMappersImpl applicationMappers = new ApplicationMappersImpl();
		return applicationMappers;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationMapper createApplicationMapper() {
		ApplicationMapperImpl applicationMapper = new ApplicationMapperImpl();
		return applicationMapper;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationPackage getApplicationPackage() {
		return (ApplicationPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ApplicationPackage getPackage() {
		return ApplicationPackage.eINSTANCE;
	}

} //ApplicationFactoryImpl
