/*******************************************************************************
 * Tura - application generation platform
 *
 * Copyright (c) 2012, 2015, Arseniy Isakov
 *  
 * This project includes software developed by Arseniy Isakov
 * http://sourceforge.net/p/tura/wiki/Home/
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *******************************************************************************/
package org.tura.metamodel.sirius.properties.selections.grid.impl;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.views.properties.tabbed.TabbedPropertySheetPage;
import org.tura.metamodel.sirius.properties.selections.events.Bus;
import org.tura.metamodel.sirius.properties.selections.events.Event;
import org.tura.metamodel.sirius.properties.selections.events.EventListener;
import org.tura.metamodel.sirius.properties.selections.events.TriggerMethodChangeEvent;
import org.tura.metamodel.sirius.properties.selections.grid.DataSource;

import form.ContextParameter;
import type.Parameter;
import type.TypeElement;

public class TriggerContextParameterPropertySelection extends  ContextParameterPropertySelection {

	
	private SelectionListener listener = new SelectionListener();
	
	@Override
	public TypeElement contextRefTypeExtreactor(
			ContextParameter obj) {
		return ((Parameter) obj.getRefObj()).getTypeRef();
	}

	@Override
	protected DataSource getDS() {
		return new TriggerContextParameterDS(this);
	}

	
	@Override
	public void createControls(Composite parent, TabbedPropertySheetPage aTabbedPropertySheetPage) {
		super.createControls(parent, aTabbedPropertySheetPage);
		Bus.getInstance().addEventListner(listener);
		
	}
	
	
	
	private class SelectionListener implements EventListener {

		public SelectionListener() {
		}

		@Override
		public void handleEvent(Event event) {
			if (event instanceof TriggerMethodChangeEvent) {
				ds.cleanList();
				ds.getRows();
				refresh();
			}
		}
	}
	
	@Override
	public void dispose(){
		Bus.getInstance().removeEventListner(listener);
	}
	
	
}
