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
package org.tura.platform.test;

import java.util.List;

import org.tura.platform.datacontrol.commons.OrderCriteria;
import org.tura.platform.datacontrol.commons.SearchCriteria;
import org.tura.platform.hr.objects.jpa.Department;
import org.tura.platform.repository.cdi.RepositoryTriggers;
import org.tura.platform.repository.core.Triggers;

@RepositoryTriggers
public class DepartmentTriggers extends Triggers{

	@Override
	public String getCalssName() {
		return Department.class.getName();
	}

	@Override
	public String getQueryName() {
		return "default";
	}

	@Override
	public void preQueryTrigger(List<SearchCriteria> searchCriteria, List<OrderCriteria> orderCriteria){
		for (SearchCriteria sc : searchCriteria){
			if (sc.getName().equals("parentId") ){
				sc.setName("PARENT_ID");
			}
			
		}
		
	}
	
	
}
