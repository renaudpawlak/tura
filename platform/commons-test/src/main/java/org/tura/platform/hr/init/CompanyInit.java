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
package org.tura.platform.hr.init;

import javax.persistence.EntityManager;

import org.elsoft.platform.hr.objects.CompanyDAO;


public class CompanyInit {
	private EntityManager em;

	public CompanyInit(EntityManager em) {
		this.em = em;
	}

	public void init() {
		em.getTransaction().begin();
		create(1L, "Company 1");
		create(2L, "Company 2");
		em.getTransaction().commit();

	}

	private CompanyDAO create(Long obj_id, String companyName) {
		CompanyDAO dpt = new CompanyDAO();
		dpt.setObjId(obj_id);
		dpt.setCompanyName(companyName);
		em.persist(dpt);
		return dpt;

	}

}
