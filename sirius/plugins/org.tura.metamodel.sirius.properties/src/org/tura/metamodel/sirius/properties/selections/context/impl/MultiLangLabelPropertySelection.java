package org.tura.metamodel.sirius.properties.selections.context.impl;

import java.util.UUID;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.tura.metamodel.commons.QueryHelper;
import org.tura.metamodel.sirius.properties.selections.events.Bus;
import org.tura.metamodel.sirius.properties.selections.events.RecordChangeEvent;

import form.FormFactory;
import form.FormPackage;
import form.MultiLangLabel;
import type.TypeElement;

public class MultiLangLabelPropertySelection extends AbstractContextPropertySelection{

	protected TypeElement getTargetType() throws Exception {
		return new QueryHelper().findMessageType(getModel());
	}

	@Override
	public String getLabelText() {
		return "Multi Language label";
	}

	@Override
	public EObject getModel() {

		MultiLangLabel el = (MultiLangLabel) super.getModel();
		if (el.getMultiLangLabel() == null) {

			EditingDomain editingDomain = ((DiagramEditor) getPart()).getEditingDomain();
			editingDomain.getCommandStack().execute(
					SetCommand.create(editingDomain, el,
							FormPackage.eINSTANCE.getMultiLangLabel_MultiLangLabel(),
							FormFactory.eINSTANCE.createContext()));

		}

		if (el.getMultiLangLabel().getUid() == null) {
			EditingDomain editingDomain = ((DiagramEditor) getPart()).getEditingDomain();
			editingDomain.getCommandStack().execute(
					SetCommand.create(editingDomain, el.getMultiLangLabel(),
							FormPackage.eINSTANCE.getContextValue_Uid(), UUID.randomUUID().toString()));
		}
		return el.getMultiLangLabel();

	}

	protected boolean checkType(Object type){
		TypeElement  modelType = (TypeElement) type;
		TypeElement targetType = null;

		try{
			targetType = getTargetType();
		}catch(Exception e){
			return false;
		}
		
		if (targetType == null){
			return false;
		}
		if (targetType.getUid().equals(modelType.getUid())){
			return true;
		}else{
			return false;
		}
	}
	
	@Override
	protected void afterUpdate(){
		Bus.getInstance().notify(new RecordChangeEvent());
     }
}
