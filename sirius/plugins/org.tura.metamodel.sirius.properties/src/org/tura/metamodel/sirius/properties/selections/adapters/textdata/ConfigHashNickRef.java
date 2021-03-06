package org.tura.metamodel.sirius.properties.selections.adapters.textdata;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.tura.metamodel.sirius.properties.selections.TextDataAdapter;

import artifact.ArtifactPackage;
import artifact.ConfigHashWithNickName;
import artifact.TechLeaf;

public class ConfigHashNickRef implements TextDataAdapter {

	@Override
	public Object getFeatureValue(Object eObject, EStructuralFeature feature) {
		if (eObject == null)
			return "";
		ConfigHashWithNickName opt = (ConfigHashWithNickName) eObject;
		if (opt.getHash() == null || opt.getHash().getName() == null)
			return "";
		return getName(opt);
		
	}

	@Override
	public EStructuralFeature getFeature() {
		return ArtifactPackage.eINSTANCE.getConfigHashWithNickName_Hash();
	}

	private String getName(ConfigHashWithNickName opt){
	  if (opt.getHash().eContainer() instanceof TechLeaf){
			return ((TechLeaf) (opt.getHash().eContainer())).getName() + ":" + opt.getHash().getName();
	  }else{
			return  opt.getHash().getName();
	  }
	}
	
}
