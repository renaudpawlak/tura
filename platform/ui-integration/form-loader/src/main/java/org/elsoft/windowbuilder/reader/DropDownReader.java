/*******************************************************************************
 * Copyright 2012 Arseniy Isakov
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package org.elsoft.windowbuilder.reader;

import java.util.HashMap;
import java.util.List;
import java.util.UUID;

import javax.xml.stream.XMLStreamReader;

import org.elsoft.platform.metamodel.RepositoryFactory;
import org.elsoft.platform.metamodel.general.CommandDAO;
import org.elsoft.platform.metamodel.general.CreateOptionDescriptorDAO;
import org.elsoft.platform.metamodel.general.CreateUIDropDownListDAO;
import org.elsoft.platform.metamodel.general.EventDAO;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateDisplayFieldSpecifier;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateEventGetCurrentRow;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateEventGetOptionsList;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateEventUIElement2Field;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateUIDropDownList;

public class DropDownReader extends ItemReader {

	private String optionDataControlId;
	private String labelField;
	private String valueField;
	private String label;
	private boolean tableContext = false;
	private String cssStyle;
	private String cssStyleClass;

	@Override
	public Reader reader(XMLStreamReader xmlReader, Reader parent) {
		super.reader(xmlReader, parent);

		String iterator = xmlReader.getAttributeValue(null, "optionIterator");
		optionDataControlId = Reader.idMAP.get(iterator);
		labelField = xmlReader.getAttributeValue(null, "optionLabel");
		valueField = xmlReader.getAttributeValue(null, "optionValue");

		return this;
	}

	@Override
	protected void build(HashMap<String, Object> context, RepositoryFactory rf,
			Reader parent, List<CommandDAO> program) throws Exception {

		EventDAO event = null;
		if (parent instanceof TableColumnReader) {
			label = ((TableColumnReader) parent).getLabel();
			tableContext = true;
			parent = ((TableColumnReader) parent).getParent();
			setDataControlId(((TableReader) parent).getDataControlId());
		}

		CreateUIDropDownListDAO createUIDropDownList = new CreateUIDropDownListDAO();
		createUIDropDownList.setCommandExecutor(CreateUIDropDownList.class.getName());
		createUIDropDownList.setParentUUID(parent.getUuid());
		createUIDropDownList.setLabel(label);
		createUIDropDownList.setUUID(UUID.randomUUID().toString());
		createUIDropDownList.setCss(cssStyle);
		createUIDropDownList.setCssClass(cssStyleClass);
		program.add(createUIDropDownList);

		event = new EventDAO();
		event.setCommandExecutor(CreateEventUIElement2Field.class.getName());
		event.setParentUUID(createUIDropDownList.getUUID());
		event.setDstUUID(getDataControlId() + "." + getField());
		program.add(event);

		if (!tableContext) {
			event = new EventDAO();
			event.setCommandExecutor(CreateEventGetCurrentRow.class.getName());
			event.setParentUUID(createUIDropDownList.getUUID());
			event.setDstUUID(getDataControlId());
			program.add(event);
		}
		event = new EventDAO();
		event.setParentUUID(createUIDropDownList.getUUID());
		event.setCommandExecutor(CreateEventGetOptionsList.class.getName());
		event.setDstUUID(optionDataControlId);
		program.add(event);

		CreateOptionDescriptorDAO dispOption = new CreateOptionDescriptorDAO();
		dispOption.setCommandExecutor(CreateDisplayFieldSpecifier.class.getName());
		dispOption.setValue1(labelField);
		dispOption.setValue2(valueField);
		dispOption.setParentUUID(createUIDropDownList.getUUID());
		program.add(dispOption);

	}

	@Override
	protected boolean check(HashMap<String, Object> context,
			RepositoryFactory rf, Reader parent, List<CommandDAO> program)
			throws Exception {
		return true;
	}

}
