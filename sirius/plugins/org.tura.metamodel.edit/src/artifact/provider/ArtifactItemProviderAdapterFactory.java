/**
 */
package artifact.provider;

import artifact.util.ArtifactAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
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
public class ArtifactItemProviderAdapterFactory extends ArtifactAdapterFactory implements ComposeableAdapterFactory, IChangeNotifier {
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
	public ArtifactItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link artifact.ArtifactGroup} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArtifactGroupItemProvider artifactGroupItemProvider;

	/**
	 * This creates an adapter for a {@link artifact.ArtifactGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createArtifactGroupAdapter() {
		if (artifactGroupItemProvider == null) {
			artifactGroupItemProvider = new ArtifactGroupItemProvider(this);
		}

		return artifactGroupItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link artifact.TechLeaf} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TechLeafItemProvider techLeafItemProvider;

	/**
	 * This creates an adapter for a {@link artifact.TechLeaf}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTechLeafAdapter() {
		if (techLeafItemProvider == null) {
			techLeafItemProvider = new TechLeafItemProvider(this);
		}

		return techLeafItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link artifact.Artifact} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArtifactItemProvider artifactItemProvider;

	/**
	 * This creates an adapter for a {@link artifact.Artifact}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createArtifactAdapter() {
		if (artifactItemProvider == null) {
			artifactItemProvider = new ArtifactItemProvider(this);
		}

		return artifactItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link artifact.GenerationHintWithNickName} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenerationHintWithNickNameItemProvider generationHintWithNickNameItemProvider;

	/**
	 * This creates an adapter for a {@link artifact.GenerationHintWithNickName}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGenerationHintWithNickNameAdapter() {
		if (generationHintWithNickNameItemProvider == null) {
			generationHintWithNickNameItemProvider = new GenerationHintWithNickNameItemProvider(this);
		}

		return generationHintWithNickNameItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link artifact.ConfigVariableWithNickName} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigVariableWithNickNameItemProvider configVariableWithNickNameItemProvider;

	/**
	 * This creates an adapter for a {@link artifact.ConfigVariableWithNickName}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConfigVariableWithNickNameAdapter() {
		if (configVariableWithNickNameItemProvider == null) {
			configVariableWithNickNameItemProvider = new ConfigVariableWithNickNameItemProvider(this);
		}

		return configVariableWithNickNameItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link artifact.ConfigHashWithNickName} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigHashWithNickNameItemProvider configHashWithNickNameItemProvider;

	/**
	 * This creates an adapter for a {@link artifact.ConfigHashWithNickName}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConfigHashWithNickNameAdapter() {
		if (configHashWithNickNameItemProvider == null) {
			configHashWithNickNameItemProvider = new ConfigHashWithNickNameItemProvider(this);
		}

		return configHashWithNickNameItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link artifact.GenerationHint} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GenerationHintItemProvider generationHintItemProvider;

	/**
	 * This creates an adapter for a {@link artifact.GenerationHint}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createGenerationHintAdapter() {
		if (generationHintItemProvider == null) {
			generationHintItemProvider = new GenerationHintItemProvider(this);
		}

		return generationHintItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link artifact.ConfigVariable} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigVariableItemProvider configVariableItemProvider;

	/**
	 * This creates an adapter for a {@link artifact.ConfigVariable}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConfigVariableAdapter() {
		if (configVariableItemProvider == null) {
			configVariableItemProvider = new ConfigVariableItemProvider(this);
		}

		return configVariableItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link artifact.ConfigHash} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConfigHashItemProvider configHashItemProvider;

	/**
	 * This creates an adapter for a {@link artifact.ConfigHash}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createConfigHashAdapter() {
		if (configHashItemProvider == null) {
			configHashItemProvider = new ConfigHashItemProvider(this);
		}

		return configHashItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link artifact.ModelQuery} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelQueryItemProvider modelQueryItemProvider;

	/**
	 * This creates an adapter for a {@link artifact.ModelQuery}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createModelQueryAdapter() {
		if (modelQueryItemProvider == null) {
			modelQueryItemProvider = new ModelQueryItemProvider(this);
		}

		return modelQueryItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link artifact.QueryParameter} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QueryParameterItemProvider queryParameterItemProvider;

	/**
	 * This creates an adapter for a {@link artifact.QueryParameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createQueryParameterAdapter() {
		if (queryParameterItemProvider == null) {
			queryParameterItemProvider = new QueryParameterItemProvider(this);
		}

		return queryParameterItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link artifact.Technology} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TechnologyItemProvider technologyItemProvider;

	/**
	 * This creates an adapter for a {@link artifact.Technology}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createTechnologyAdapter() {
		if (technologyItemProvider == null) {
			technologyItemProvider = new TechnologyItemProvider(this);
		}

		return technologyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link artifact.Option} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected OptionItemProvider optionItemProvider;

	/**
	 * This creates an adapter for a {@link artifact.Option}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createOptionAdapter() {
		if (optionItemProvider == null) {
			optionItemProvider = new OptionItemProvider(this);
		}

		return optionItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link artifact.Categorized} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CategorizedItemProvider categorizedItemProvider;

	/**
	 * This creates an adapter for a {@link artifact.Categorized}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCategorizedAdapter() {
		if (categorizedItemProvider == null) {
			categorizedItemProvider = new CategorizedItemProvider(this);
		}

		return categorizedItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link artifact.Classifier} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassifierItemProvider classifierItemProvider;

	/**
	 * This creates an adapter for a {@link artifact.Classifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createClassifierAdapter() {
		if (classifierItemProvider == null) {
			classifierItemProvider = new ClassifierItemProvider(this);
		}

		return classifierItemProvider;
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
