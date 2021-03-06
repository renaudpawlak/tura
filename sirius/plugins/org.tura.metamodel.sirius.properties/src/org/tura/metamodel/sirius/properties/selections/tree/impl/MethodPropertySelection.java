package org.tura.metamodel.sirius.properties.selections.tree.impl;

import org.tura.metamodel.commons.QueryHelper;
import org.tura.metamodel.commons.properties.selections.adapters.helper.TreeRoot;
import org.tura.metamodel.sirius.properties.selections.TextDataAdapter;
import org.tura.metamodel.sirius.properties.selections.adapters.textdata.MethodPointerMethodName;
import org.tura.metamodel.sirius.properties.selections.events.Bus;
import org.tura.metamodel.sirius.properties.selections.events.TriggerMethodChangeEvent;
import org.tura.metamodel.sirius.properties.selections.tree.TreePropertySelectioin;

import type.Operation;

public class MethodPropertySelection extends TreePropertySelectioin{

	@Override
	public String getLabelText() {
		return "Method:";
	}

	@Override
	public TreeRoot getContextRoot() {
		TreeRoot rootOfTree = new TreeRoot();
		try {
			rootOfTree.addChild(  new QueryHelper().getTypesRepository(getModel()));
		} catch (Exception e) {
			// ignore
		}
		return rootOfTree;
	}


	@Override
	protected void showError() {
		
	}

	public void afterUpdate(){
		Bus.getInstance().notify(new TriggerMethodChangeEvent());
	}	
	
	@Override
	protected TextDataAdapter getDataAdapter() {
		return new MethodPointerMethodName();
	}

	@Override
	protected  Class<?> getComaringClass() {
		return Operation.class;
	}

}
