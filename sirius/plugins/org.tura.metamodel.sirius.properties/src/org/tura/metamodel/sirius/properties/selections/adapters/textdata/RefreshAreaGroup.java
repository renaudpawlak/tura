package org.tura.metamodel.sirius.properties.selections.adapters.textdata;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.tura.metamodel.sirius.properties.selections.TextDataAdapter;
import org.tura.metamodel.sirius.properties.selections.grid.TextColumnConverter;
import org.tura.metamodel.sirius.properties.selections.grid.impl.RefreshAreaRow;

import form.FormPackage;

public class RefreshAreaGroup implements TextDataAdapter, TextColumnConverter {

	@Override
	public Object getFeatureValue(Object eObject, EStructuralFeature feature) {
		return ((EObject )eObject).eGet(feature);
	}

	@Override
	public EStructuralFeature getFeature() {
		return FormPackage.eINSTANCE.getAreaRef_Group();
	}

	@Override
	public String convertToText(Object obj) {
		return  new Integer (  ((RefreshAreaRow)obj).getGroup()).toString() ;
	}

	@Override
	public Object convertToObject(String str) {
		return new Integer(str);
	}

}
