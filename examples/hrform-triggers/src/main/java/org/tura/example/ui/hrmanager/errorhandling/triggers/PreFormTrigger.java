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
package org.tura.example.ui.hrmanager.errorhandling.triggers;


import javax.annotation.Priority;
import javax.enterprise.inject.Alternative;

import org.tura.example.ui.hrmanager.errorhandling.datacontrol.IBeanFactory;
import org.tura.platform.datacontrol.annotations.Selector;
import org.tura.platform.datacontrol.command.base.FactoryInitializeTrigger;
import org.tura.platform.datacontrol.commons.TuraException;


@Alternative
@Priority(10)
@Selector("hrmanager.errorhandling")
public class PreFormTrigger implements FactoryInitializeTrigger {

	@Override
	public void execute(Object obj) throws TuraException {
		try {
			IBeanFactory bf = (IBeanFactory) obj;
			bf.getErrorRecord().createObject();
			
		} catch (Exception e) {
            throw new TuraException(e);
		}
	}

}
