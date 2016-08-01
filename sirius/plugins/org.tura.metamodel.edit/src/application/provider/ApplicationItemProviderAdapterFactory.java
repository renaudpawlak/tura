/**
 */
package application.provider;

import application.util.ApplicationAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class ApplicationItemProviderAdapterFactory extends ApplicationAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApplicationItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link application.ApplicationGroup} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplicationGroupItemProvider applicationGroupItemProvider;

	/**
	 * This creates an adapter for a {@link application.ApplicationGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createApplicationGroupAdapter() {
		if (applicationGroupItemProvider == null) {
			applicationGroupItemProvider = new ApplicationGroupItemProvider(this);
		}

		return applicationGroupItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link application.Application} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplicationItemProvider applicationItemProvider;

	/**
	 * This creates an adapter for a {@link application.Application}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createApplicationAdapter() {
		if (applicationItemProvider == null) {
			applicationItemProvider = new ApplicationItemProvider(this);
		}

		return applicationItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link application.ApplicationInfrastructureLayers} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplicationInfrastructureLayersItemProvider applicationInfrastructureLayersItemProvider;

	/**
	 * This creates an adapter for a {@link application.ApplicationInfrastructureLayers}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createApplicationInfrastructureLayersAdapter() {
		if (applicationInfrastructureLayersItemProvider == null) {
			applicationInfrastructureLayersItemProvider = new ApplicationInfrastructureLayersItemProvider(this);
		}

		return applicationInfrastructureLayersItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link application.ApplicationInfrastructureLayer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplicationInfrastructureLayerItemProvider applicationInfrastructureLayerItemProvider;

	/**
	 * This creates an adapter for a {@link application.ApplicationInfrastructureLayer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createApplicationInfrastructureLayerAdapter() {
		if (applicationInfrastructureLayerItemProvider == null) {
			applicationInfrastructureLayerItemProvider = new ApplicationInfrastructureLayerItemProvider(this);
		}

		return applicationInfrastructureLayerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link application.ApplicationMessageLibraries} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplicationMessageLibrariesItemProvider applicationMessageLibrariesItemProvider;

	/**
	 * This creates an adapter for a {@link application.ApplicationMessageLibraries}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createApplicationMessageLibrariesAdapter() {
		if (applicationMessageLibrariesItemProvider == null) {
			applicationMessageLibrariesItemProvider = new ApplicationMessageLibrariesItemProvider(this);
		}

		return applicationMessageLibrariesItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link application.ApplicationLanguages} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplicationLanguagesItemProvider applicationLanguagesItemProvider;

	/**
	 * This creates an adapter for a {@link application.ApplicationLanguages}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createApplicationLanguagesAdapter() {
		if (applicationLanguagesItemProvider == null) {
			applicationLanguagesItemProvider = new ApplicationLanguagesItemProvider(this);
		}

		return applicationLanguagesItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link application.ApplicationMessageLibrary} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplicationMessageLibraryItemProvider applicationMessageLibraryItemProvider;

	/**
	 * This creates an adapter for a {@link application.ApplicationMessageLibrary}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createApplicationMessageLibraryAdapter() {
		if (applicationMessageLibraryItemProvider == null) {
			applicationMessageLibraryItemProvider = new ApplicationMessageLibraryItemProvider(this);
		}

		return applicationMessageLibraryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link application.ApplicationRealms} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplicationRealmsItemProvider applicationRealmsItemProvider;

	/**
	 * This creates an adapter for a {@link application.ApplicationRealms}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createApplicationRealmsAdapter() {
		if (applicationRealmsItemProvider == null) {
			applicationRealmsItemProvider = new ApplicationRealmsItemProvider(this);
		}

		return applicationRealmsItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link application.ApplicationRealm} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplicationRealmItemProvider applicationRealmItemProvider;

	/**
	 * This creates an adapter for a {@link application.ApplicationRealm}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createApplicationRealmAdapter() {
		if (applicationRealmItemProvider == null) {
			applicationRealmItemProvider = new ApplicationRealmItemProvider(this);
		}

		return applicationRealmItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link application.ApplicationStyleLibraries} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplicationStyleLibrariesItemProvider applicationStyleLibrariesItemProvider;

	/**
	 * This creates an adapter for a {@link application.ApplicationStyleLibraries}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createApplicationStyleLibrariesAdapter() {
		if (applicationStyleLibrariesItemProvider == null) {
			applicationStyleLibrariesItemProvider = new ApplicationStyleLibrariesItemProvider(this);
		}

		return applicationStyleLibrariesItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link application.ApplicationStyle} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplicationStyleItemProvider applicationStyleItemProvider;

	/**
	 * This creates an adapter for a {@link application.ApplicationStyle}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createApplicationStyleAdapter() {
		if (applicationStyleItemProvider == null) {
			applicationStyleItemProvider = new ApplicationStyleItemProvider(this);
		}

		return applicationStyleItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link application.ApplicationUILayer} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplicationUILayerItemProvider applicationUILayerItemProvider;

	/**
	 * This creates an adapter for a {@link application.ApplicationUILayer}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createApplicationUILayerAdapter() {
		if (applicationUILayerItemProvider == null) {
			applicationUILayerItemProvider = new ApplicationUILayerItemProvider(this);
		}

		return applicationUILayerItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link application.ApplicationUIPackage} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplicationUIPackageItemProvider applicationUIPackageItemProvider;

	/**
	 * This creates an adapter for a {@link application.ApplicationUIPackage}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createApplicationUIPackageAdapter() {
		if (applicationUIPackageItemProvider == null) {
			applicationUIPackageItemProvider = new ApplicationUIPackageItemProvider(this);
		}

		return applicationUIPackageItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link application.ApplicationRecipes} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplicationRecipesItemProvider applicationRecipesItemProvider;

	/**
	 * This creates an adapter for a {@link application.ApplicationRecipes}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createApplicationRecipesAdapter() {
		if (applicationRecipesItemProvider == null) {
			applicationRecipesItemProvider = new ApplicationRecipesItemProvider(this);
		}

		return applicationRecipesItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link application.ApplicationRecipe} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplicationRecipeItemProvider applicationRecipeItemProvider;

	/**
	 * This creates an adapter for a {@link application.ApplicationRecipe}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createApplicationRecipeAdapter() {
		if (applicationRecipeItemProvider == null) {
			applicationRecipeItemProvider = new ApplicationRecipeItemProvider(this);
		}

		return applicationRecipeItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link application.ApplicationMappers} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplicationMappersItemProvider applicationMappersItemProvider;

	/**
	 * This creates an adapter for a {@link application.ApplicationMappers}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createApplicationMappersAdapter() {
		if (applicationMappersItemProvider == null) {
			applicationMappersItemProvider = new ApplicationMappersItemProvider(this);
		}

		return applicationMappersItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link application.ApplicationMapper} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ApplicationMapperItemProvider applicationMapperItemProvider;

	/**
	 * This creates an adapter for a {@link application.ApplicationMapper}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createApplicationMapperAdapter() {
		if (applicationMapperItemProvider == null) {
			applicationMapperItemProvider = new ApplicationMapperItemProvider(this);
		}

		return applicationMapperItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>)type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

}
