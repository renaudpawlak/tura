package org.tura.metamodel.sirius.properties.selections.adapters.textdata;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.tura.metamodel.sirius.properties.selections.TextDataAdapter;

import artifact.ArtifactGroup;
import recipe.ModelMapper;
import recipe.RecipePackage;

public class ModelMapperArtifactName  implements TextDataAdapter {

	@Override
	public Object getFeatureValue(Object eObject, EStructuralFeature feature) {
		ModelMapper mapper = (ModelMapper) eObject;
		if (mapper.getArtifactRef() == null || mapper.getArtifactRef().getName() == null){
			return "";
		}else{
			return ((ArtifactGroup) (mapper.getArtifactRef().eContainer())).getName() + ":" + mapper.getArtifactRef().getName();
		}
	}

	@Override
	public EStructuralFeature getFeature() {
		return RecipePackage.eINSTANCE.getArtifactRef_ArtifactRef();
	}

}
