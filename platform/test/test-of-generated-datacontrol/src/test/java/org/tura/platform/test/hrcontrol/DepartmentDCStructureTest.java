/**
 * Tura - application generation platform
 *
 * Copyright (c) 2012 - 2017, Arseniy Isakov
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
package org.tura.platform.test.hrcontrol;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.tura.platform.test.CDIImplementationDataControlStructureUtil.checkArtificialProperties;
import static org.tura.platform.test.CDIImplementationDataControlStructureUtil.checkCommandStack;
import static org.tura.platform.test.CDIImplementationDataControlStructureUtil.checkConnection;
import static org.tura.platform.test.CDIImplementationDataControlStructureUtil.checkCreateTrigger;
import static org.tura.platform.test.CDIImplementationDataControlStructureUtil.checkCreateTriggerParameters;
import static org.tura.platform.test.CDIImplementationDataControlStructureUtil.checkDefaultOrderCriteria;
import static org.tura.platform.test.CDIImplementationDataControlStructureUtil.checkDefaultSearchCriteria;
import static org.tura.platform.test.CDIImplementationDataControlStructureUtil.checkKeys;
import static org.tura.platform.test.CDIImplementationDataControlStructureUtil.checkPostCreateTrigger;
import static org.tura.platform.test.CDIImplementationDataControlStructureUtil.checkPostQueryTrigger;
import static org.tura.platform.test.CDIImplementationDataControlStructureUtil.checkPreDeleteTrigger;
import static org.tura.platform.test.CDIImplementationDataControlStructureUtil.checkPreInsertTrigger;
import static org.tura.platform.test.CDIImplementationDataControlStructureUtil.checkPreQueryTrigger;
import static org.tura.platform.test.CDIImplementationDataControlStructureUtil.checkPreUpdateTrigger;
import static org.tura.platform.test.CDIImplementationDataControlStructureUtil.checkSearchTrigger;
import static org.tura.platform.test.CDIImplementationDataControlStructureUtil.checkSearchTriggerParameters;
import static org.tura.platform.test.CDIImplementationDataControlStructureUtil.checkSelector;
import static org.tura.platform.test.ClassStructureTestUtils.findMethod;
import static org.tura.platform.test.ClassStructureTestUtils.getMethod;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.junit.Test;
import org.tura.example.ui.hrmanager.hrcontroller.datacontrol.DepartmentDC;
import org.tura.platform.datacontrol.CommandStack;
import org.tura.platform.datacontrol.ELResolver;
import org.tura.platform.datacontrol.IDataControl;
import org.tura.platform.datacontrol.command.base.CallParameter;
import org.tura.platform.datacontrol.command.base.CreateObjectParameters;
import org.tura.platform.datacontrol.command.base.PostCreateTrigger;
import org.tura.platform.datacontrol.command.base.PostQueryTrigger;
import org.tura.platform.datacontrol.command.base.PreDeleteTrigger;
import org.tura.platform.datacontrol.command.base.PreInsertTrigger;
import org.tura.platform.datacontrol.command.base.PreQueryTrigger;
import org.tura.platform.datacontrol.command.base.PreUpdateTrigger;
import org.tura.platform.datacontrol.command.base.SearchObjectParameters;
import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.datacontrol.metainfo.PropertyLink;
import org.tura.platform.object.TuraObject;

import com.octo.java.sql.exp.Operator;
import com.octo.java.sql.query.SelectQuery;

public class DepartmentDCStructureTest {

	@Test
	public void checkDepartmentDCStructure(){
		assertEquals(19, DepartmentDC.class.getDeclaredMethods().length);
		
		assertTrue(findMethod( DepartmentDC.class,"init" ));

		assertTrue(findMethod( DepartmentDC.class,"handleChangeRecord",new Class[]{IDataControl.class,Object.class} ));

		
		
		assertTrue(findMethod( DepartmentDC.class,"setKeys" , new Class[]{List.class}));
		Method m = getMethod( DepartmentDC.class,"setKeys" , new Class[]{List.class});
		checkKeys(m,"objId");
		
		assertTrue(findMethod( DepartmentDC.class,"setArtificialProperties" ,new Class[]{List.class}));
		m = getMethod( DepartmentDC.class,"setArtificialProperties" , new Class[]{List.class});
		HashMap<String, Class<?>> map = new HashMap<>();
		checkArtificialProperties(m,map);

		assertTrue(findMethod( DepartmentDC.class,"setElResolver" ,new Class[]{ELResolver.class}));
		assertTrue(findMethod( DepartmentDC.class,"setCommandStack",new Class[]{CommandStack.class} ));
		m = getMethod( DepartmentDC.class,"setCommandStack",new Class[]{CommandStack.class} );
		checkCommandStack(m,"hrmanager.hrcontroller");
		
		assertTrue(findMethod( DepartmentDC.class,"setCreateObjectParameters" ,new Class[]{CreateObjectParameters.class}));
		m = getMethod( DepartmentDC.class,"setCreateObjectParameters" ,new Class[]{CreateObjectParameters.class});
		checkSelector(m,"hrmanager.hrcontroller");
		checkCreateTrigger(m,"department");
		ArrayList<CallParameter> prms = new ArrayList<>();
		prms.add(new CallParameter("objectType", "org.tura.platform.hr.objects.serialization.Department", TuraObject.class));
		checkCreateTriggerParameters(m,prms);
		
		
		assertTrue(findMethod( DepartmentDC.class,"setSearchObjectParameters" ,new Class[]{SearchObjectParameters.class}));
		m = getMethod( DepartmentDC.class,"setSearchObjectParameters" ,new Class[]{SearchObjectParameters.class});
		checkSelector(m,"hrmanager.hrcontroller");
		checkSearchTrigger(m,"department");
		prms = new ArrayList<>();
		prms.add(new CallParameter("searchCriteria", "#{beanFactoryHrManagerHRController.department.searchCriteria}", List.class));
		prms.add(new CallParameter("orderByCriteria", "#{beanFactoryHrManagerHRController.department.orderCriteria}", List.class));
		prms.add(new CallParameter("start Index", "#{beanFactoryHrManagerHRController.department.startIndex}", Integer.class));
		prms.add(new CallParameter("end Index", "#{beanFactoryHrManagerHRController.department.endIndex}", Integer.class));
		prms.add(new CallParameter("objectType", "org.tura.platform.hr.objects.serialization.Department", TuraObject.class));
		checkSearchTriggerParameters(m,prms);

		
		assertTrue(findMethod( DepartmentDC.class,"setPreQueryTrigger" ,new Class[]{PreQueryTrigger.class}));
		m = getMethod( DepartmentDC.class,"setPreQueryTrigger" ,new Class[]{PreQueryTrigger.class});
		checkSelector(m,"hrmanager.hrcontroller");
		checkPreQueryTrigger(m,"department");
		
		
		assertTrue(findMethod( DepartmentDC.class,"setPostQueryTrigger" ,new Class[]{PostQueryTrigger.class}));
		m = getMethod( DepartmentDC.class,"setPostQueryTrigger" ,new Class[]{PostQueryTrigger.class});
		checkSelector(m,"hrmanager.hrcontroller");
		checkPostQueryTrigger(m,"department");
		
		
		assertTrue(findMethod( DepartmentDC.class,"setPostCreateTrigger" ,new Class[]{PostCreateTrigger.class}));
		m = getMethod( DepartmentDC.class,"setPostCreateTrigger" ,new Class[]{PostCreateTrigger.class});
		checkSelector(m,"hrmanager.hrcontroller");
		checkPostCreateTrigger(m,"department");

		
		assertTrue(findMethod( DepartmentDC.class,"setPreDeleteTrigger" ,new Class[]{PreDeleteTrigger.class}));
		m = getMethod( DepartmentDC.class,"setPreDeleteTrigger" ,new Class[]{PreDeleteTrigger.class});
		checkSelector(m,"hrmanager.hrcontroller");
		checkPreDeleteTrigger(m,"department");

		
		assertTrue(findMethod( DepartmentDC.class,"setPreInsertTrigger",new Class[]{PreInsertTrigger.class} ));
		m = getMethod( DepartmentDC.class,"setPreInsertTrigger",new Class[]{PreInsertTrigger.class} );
		checkSelector(m,"hrmanager.hrcontroller");
		checkPreInsertTrigger(m,"department");

		
		assertTrue(findMethod( DepartmentDC.class,"setPreUpdateTrigger" ,new Class[]{PreUpdateTrigger.class}));
		m = getMethod( DepartmentDC.class,"setPreUpdateTrigger" ,new Class[]{PreUpdateTrigger.class});
		checkSelector(m,"hrmanager.hrcontroller");
		checkPreUpdateTrigger(m,"department");

		
		assertTrue(findMethod( DepartmentDC.class,"getDepartment2Employee" ,new Class[]{}));
		m = getMethod( DepartmentDC.class,"getDepartment2Employee" ,new Class[]{});
		ArrayList<PropertyLink> links = new ArrayList<>();
		links.add(new PropertyLink("objId","parentId"));
		checkConnection(m,"department2employee",links);
		
		assertTrue(findMethod( DepartmentDC.class,"getDepartment2Vehicle" ,new Class[]{}));
		m = getMethod( DepartmentDC.class,"getDepartment2Vehicle" ,new Class[]{});
		links = new ArrayList<>();
		links.add(new PropertyLink("objId","parentId"));
		checkConnection(m,"department2vehicle",links);

		
		assertTrue(findMethod( DepartmentDC.class,"createChild" ,new Class[]{String.class}));


		assertTrue(findMethod( DepartmentDC.class,"setDefaultSearchCriteria",new Class[]{List.class} ));
		m = getMethod( DepartmentDC.class,"setDefaultSearchCriteria",new Class[]{List.class} );
		ArrayList<SearchCriteria> search = new ArrayList<>();
		search.add(new SearchCriteria("parentId",Operator.EQ.name(),"#{beanFactoryHrManagerHRController.treeRootCountry.currentObject.objId}",Long.class.getName()));
		checkDefaultSearchCriteria(m,search);

		
		assertTrue(findMethod( DepartmentDC.class,"setDefaultOrderCriteria" ,new Class[]{List.class}));
		m = getMethod( DepartmentDC.class,"setDefaultOrderCriteria" ,new Class[]{List.class});
		ArrayList<OrderCriteria> order = new ArrayList<>();
		order.add(new OrderCriteria("objId",SelectQuery.Order.ASC.name()));
		checkDefaultOrderCriteria(m,order);
		
	}

	
	
}
