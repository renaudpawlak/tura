package org.tura.metamodel.sirius.properties.selections.adapters.textdata;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.tura.metamodel.sirius.properties.selections.TextDataAdapter;

import artifact.ArtifactPackage;
import artifact.Option;
import artifact.TechLeaf;

public class OptionRef implements TextDataAdapter {

	@Override
	public Object getFeatureValue(Object eObject, EStructuralFeature feature) {
		if (eObject == null)
			return "";
		Option opt = (Option) eObject;
		if (opt.getValue() == null || opt.getValue().getName() == null)
			return "";
		return getName(opt);
		
	}

	@Override
	public EStructuralFeature getFeature() {
		return ArtifactPackage.eINSTANCE.getOption_Value();
	}

	public String getName(Option opt){
		  if (opt.getValue().eContainer() instanceof TechLeaf){
			  return ((TechLeaf) (opt.getValue().eContainer())).getName() + ":" + opt.getValue().getName();
		  }else{
				return  opt.getValue().getName();
		  }
		
	}
	
}
