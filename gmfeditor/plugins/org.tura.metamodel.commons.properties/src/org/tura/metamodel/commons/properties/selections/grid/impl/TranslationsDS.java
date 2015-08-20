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
package org.tura.metamodel.commons.properties.selections.grid.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.tura.metamodel.commons.properties.selections.grid.DataSource;
import org.tura.metamodel.commons.properties.selections.grid.GridProperty;

import domain.DomainFactory;
import domain.DomainPackage;

public class TranslationsDS extends DataSource {

	private GridProperty property;

	public TranslationsDS(GridProperty property) {
		this.property = property;
	}

	@SuppressWarnings("unchecked")
	@Override
	public void addRow() {
		domain.Translation parameter = DomainFactory.eINSTANCE
				.createTranslation();
		parameter.setTranslation("New translation");
		parameter.setUid(UUID.randomUUID().toString());
		ArrayList<domain.Translation> ls = new ArrayList<domain.Translation>();
		ls.add(parameter);

		EditingDomain editingDomain = ((DiagramEditor) property.getPart())
				.getEditingDomain();

		editingDomain.getCommandStack()
				.execute(
						AddCommand.create(editingDomain,
								((domain.Message) property.getModel()),
								DomainPackage.eINSTANCE
										.getMessage_Translatioins(), ls));

		rowList.add(rowList.size(), parameter);
		this.notifyAddRow(parameter);

	}

	@Override
	public void removeRow(Object row) {
		ArrayList<domain.Translation> ls = new ArrayList<domain.Translation>();
		ls.add((domain.Translation) row);

		EditingDomain editingDomain = ((DiagramEditor) property.getPart())
				.getEditingDomain();

		editingDomain.getCommandStack()
				.execute(
						RemoveCommand.create(editingDomain,
								((domain.Message) property.getModel()),
								DomainPackage.eINSTANCE
										.getMessage_Translatioins(), ls));

		rowList.remove(row);
		this.notifyRemoveRow(row);

	}

	public List<Object> queryRows() {
		domain.Message msg = (domain.Message) property.getModel();

		ArrayList<Object> ls = new ArrayList<Object>();
		ls.addAll(msg.getTranslatioins());

		return ls;

	}

	@Override
	public int getSorterID() {
		return 0;
	}

}