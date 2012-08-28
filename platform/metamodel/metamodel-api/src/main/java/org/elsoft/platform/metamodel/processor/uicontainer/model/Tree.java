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
package org.elsoft.platform.metamodel.processor.uicontainer.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import org.elsoft.platform.metamodel.MetamodelTriggerEventsType;
import org.elsoft.platform.metamodel.objects.command.EventDAO;
import org.elsoft.platform.metamodel.objects.command.form.ui.CreateUITreeDAO;
import org.elsoft.platform.metamodel.processor.CommandHandler;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateEventGetTreeRoot;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateEventUIElement2UIElement;
import org.elsoft.platform.metamodel.processor.uicontainer.command.CreateUITree;

public class Tree extends ExternalIterator implements ChildrenOwner,PointerElement{

	private ArrayList<EventDAO> updateOnRawSelect = new ArrayList<EventDAO>();

	public Tree(CreateUITreeDAO command, HashMap<String, Object> context) {
		this.setCss(command.getCss());
		this.setCssClass(command.getCssClass());
		setUuid(command.getUUID());
		context.put(command.getUUID(), this);
	}

	@Override
	protected void serialize(CommandHandler ch) throws Exception {
		CreateUITree.save(ch, getParentUuid(), this);
        CreateEventGetTreeRoot.save(ch, getUuid(), this) ;  
		super.serialize(ch);

        Iterator<EventDAO> itr = updateOnRawSelect.iterator();
		while (itr.hasNext())
			CreateEventUIElement2UIElement
					.save(ch, getUuid(), itr.next());
	
	}


	public void setGetTreeRootEvent(EventDAO command,
			HashMap<String, Object> context) throws Exception {
		setDataSrcLnk((DataLink) context.get(command.getDstUUID()));
		this.getDataSrcLnk().addTrigger(this.getUiElementType(),
				MetamodelTriggerEventsType.valueOf( command.getEventType()).name());

	}

	public ArrayList<UIElement> getChildrens() {
		return super.getChildrens();
	}

	public void addChild(UIElement child) {
		child.setParentUuid(getUuid());
		child.setParent(this);
		this.getChildrens().add(child);
	}
	
	
	@Override
	public String getUiElementType() {
		return "Tree";
	}
	@Override
	public void addReference(EventDAO event, HashMap<String, Object> context) {
        if (event.getEventType().equals(MetamodelTriggerEventsType.OnRawSelect.name())){
        	updateOnRawSelect.add(event);
        }
	}

	public ArrayList<EventDAO> getUpdateOnRawSelect() {
		return updateOnRawSelect;
	}

}
