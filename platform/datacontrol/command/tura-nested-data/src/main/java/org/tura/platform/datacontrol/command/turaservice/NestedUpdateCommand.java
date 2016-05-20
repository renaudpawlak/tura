/**
 * Tura - application generation platform
 *
 * Copyright (c) 2012 - 2015, Arseniy Isakov
 *
 * This project includes software developed by Arseniy Isakov
 * http://sourceforge.net/p/tura/wiki/Home/
 *
 * Licensed under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at:
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.tura.platform.datacontrol.command.turaservice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.tura.platform.datacontrol.BeanWrapper;
import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.command.base.Command;
import org.tura.platform.datacontrol.command.base.CommandFactory;
import org.tura.platform.datacontrol.command.base.UpdateCommandBase;
import org.tura.platform.datacontrol.commons.Reflection;
import org.tura.platform.datacontrol.commons.TuraException;
import org.tura.platform.datacontrol.pool.PoolCommand;

public class NestedUpdateCommand extends UpdateCommandBase{

	protected static String METHOD = "update";
	private Object parent;
	
	public NestedUpdateCommand(DataControl<?> datacontrol) {
		super(datacontrol);
	}	
	
	public NestedUpdateCommand() {
	}		
	
	
	/*
	 * 
	 * parameter 0 -- -- main object 
	 * parameter 1 -- -- parent object 
	 * parameter 2 -- -- name of method to get list of dependent objects 
	 * parameter 3 -- -- current object 
	 * 
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public Object execute() throws Exception {
		this.prepareParameters();

		this.getDatacontrol().getShifter().update(this.getDatacontrol().getCurrentPosition(), getWrappedObject());
		this.getDatacontrol().putObjectToPool(getWrappedObject(), PoolCommand.U);
		
		parent = parameters.get(1).getObj();
		if (parent == null) {
			parent = this.getDatacontrol().getParent().getMasterCurrentObject();
		}
		
		List array = (List) Reflection.call(parent,makeGetMethod((String) (parameters.get(2).getObj())));
		if (array == null ){
			array = new ArrayList<>();
			BeanWrapper w = (BeanWrapper) Reflection.call(parent, "getWrapper");
			Reflection.callTyped(w.getObj(), makeSetMethod((String) (parameters.get(2).getObj())),Collection.class,array );
		}
		
		int i = 0;
		String key =  getDatacontrol().getObjectKey( parameters.get(3).getObj());

		for (Object obj : array){
			if (getDatacontrol().getObjectKey( obj ).equals(key)){
				break;
			}
			i++;
		}
		if (i >= array.size()){
			throw new TuraException("Object hasn't been found");
		}
		array.set(i,parameters.get(3).getObj());
		
		Command cmd = null;
		if (parameters.get(0).getObj() == null) {
			Object obj = this.getDatacontrol().getParent().getMasterCurrentObject();
			BeanWrapper w = (BeanWrapper) Reflection.call(obj, "getWrapper");
			DataControl<?> dc = w.getDatacontrol();
			Object currentObject= parameters.get(3).getObj();
			Object masterObject= obj;

			cmd = CommandFactory.cloneCommand(dc, dc.getUpdateCommand(), null, currentObject, masterObject,  (String)(parameters.get(2).getObj()));

		}else{
			String exp = parameters.get(0).getExpression();
			Object obj = getDatacontrol().getElResolver().getValue(exp);
			BeanWrapper w = (BeanWrapper) Reflection.call(obj, "getWrapper");
			DataControl<?> dc = w.getDatacontrol();
			Object currentObject= parameters.get(3).getObj();
			Object masterObject= obj;

			cmd = CommandFactory.cloneCommand(dc, dc.getUpdateCommand(), null, currentObject, masterObject,  (String)(parameters.get(2).getObj()));
		}		
		cmd.execute();
		
		return null;
	}
	
	
	private String makeSetMethod(String field){
		String property = field;
		if ((field.substring(0, 3).equals("set"))  || (field.substring(0, 3).equals("get")))
			property = StringUtils.uncapitalize(field.substring(3));
		
		return "set"+StringUtils.capitalize(property);

	}
	
	private String makeGetMethod(String field){
		String property = field;
		if ((field.substring(0, 3).equals("set"))  || (field.substring(0, 3).equals("get")))
			property = StringUtils.uncapitalize(field.substring(3));
		
		return "get"+StringUtils.capitalize(property);

	}
	
}
