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

import javax.xml.stream.XMLStreamReader;

import org.elsoft.platform.metamodel.RepositoryFactory;
import org.elsoft.platform.metamodel.general.CommandDAO;
import org.elsoft.platform.metamodel.general.CreateUIWindowDAO;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateUIWindow;

public class ShellReader extends Reader {

	private String windowName;

	public Reader reader(XMLStreamReader xmlReader, Reader parent) {
		return this;
	}

	@Override
	public void build(HashMap<String, Object> context, RepositoryFactory rf,
			Reader parent,List<CommandDAO> program) {
		CreateUIWindowDAO createWin = new CreateUIWindowDAO();
		createWin.setCommandExecutor(CreateUIWindow.class.getName());
		createWin.setParentUUID(parent.getUuid());
		createWin.setWindowName(windowName);
		createWin.setUUID(getUuid());
		program.add(createWin);

	}

	public void setWindowName(String windowName) {
		this.windowName = windowName;
	}

	@Override
	protected boolean check(HashMap<String, Object> context,
			RepositoryFactory rf, Reader parent, List<CommandDAO> program)
			throws Exception {
		return true;
	}

}
