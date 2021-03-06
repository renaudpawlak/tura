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
package org.tura.platform.repository.core;

import java.util.List;

public abstract class Triggers {
	
	public abstract String getCalssName();
	public abstract String getQueryName();

	
	public void preQueryTrigger(List<org.tura.platform.datacontrol.commons.SearchCriteria> searchCriteria, List<org.tura.platform.datacontrol.commons.OrderCriteria> orderCriteria){
		
	}

	public void postQueryTrigger(Object obj){
		
	}
	
	
}
