package org.tura.metamodel.sirius.properties.selections.adapters.textdata;

import org.eclipse.emf.ecore.EStructuralFeature;
import org.tura.metamodel.sirius.properties.selections.TextDataAdapter;

import type.MethodPointer;
import type.TypePackage;

public class MethodPointerMethodName implements TextDataAdapter {

	@Override
	public Object getFeatureValue(Object eObject, EStructuralFeature feature) {
		MethodPointer operRefRef = (MethodPointer) eObject;
		if (operRefRef.getMethodRef() == null || operRefRef.getMethodRef().getName() == null){
			return "";
		}else{
			return operRefRef.getMethodRef().getName();
		}
	}

	
	
	@Override
	public EStructuralFeature getFeature() {
		return TypePackage.eINSTANCE.getMethodPointer_MethodRef();
	}

}