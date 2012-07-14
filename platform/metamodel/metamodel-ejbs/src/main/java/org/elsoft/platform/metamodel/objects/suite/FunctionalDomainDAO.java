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
package org.elsoft.platform.metamodel.objects.suite;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.elsoft.platform.metamodel.objects.ELsoftObject;

@Entity(name = "FunctionalDomain")
@Table(name = "functionaldomain")
public class FunctionalDomainDAO extends ELsoftObject{

	@Column(name = "FUNCTIONAL_DOMAIN_NAME")
	private String functionalDomainName;

	//For tree testing
		@Column(name = "NAME")
		private String name;
	
	
	public String getFunctionalDomainName() {
		return functionalDomainName;
	}

	public void setFunctionalDomainName(String functionalDomainName) {
		this.functionalDomainName = functionalDomainName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
