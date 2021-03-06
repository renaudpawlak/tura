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
package org.tura.metamodel.sirius.properties.selections.grid;

import org.eclipse.jface.viewers.CellEditor;
import org.eclipse.swt.widgets.TableColumn;

public interface GridColumn {

    public abstract TableColumn createColumn();

	public abstract String getName();

	public abstract CellEditor getEditor() ;

	public abstract int compareOptions(Object o1, Object o2) ;

	public abstract Object getValue(Object element);

	public abstract Object getText(Object element);

	public abstract void modify(Object element, Object value);
	
	public abstract boolean isModify(Object element, String property);
}
