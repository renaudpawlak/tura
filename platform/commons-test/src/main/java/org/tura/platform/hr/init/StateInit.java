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

import org.elsoft.platform.hr.objects.jpa.simple.model.StateJPA;


public class StateInit {

	private EntityManager em;

	public StateInit(EntityManager em) {
		this.em = em;
	}

	public void init() {
		em.getTransaction().begin();
		
		create(1L,"State 1 Ct 1", 1L);
		create(2L,"State 2 Ct 1", 1L);
		create(3L,"State 3 Ct 1", 1L);
		create(4L,"State 4 Ct 1", 1L);
		create(5L,"State 5 Ct 1", 1L);

		create(6L,"State 1 Ct 2", 2L);
		create(7L,"State 2 Ct 2", 2L);
		create(8L,"State 3 Ct 2", 2L);
		create(9L,"State 4 Ct 2", 2L);
		create(10L,"State 5 Ct 2", 2L);


		create(11L,"State 1 Ct 2", 3L);
		create(12L,"State 2 Ct 2", 3L);
		create(13L,"State 3 Ct 2", 3L);
		create(14L,"State 4 Ct 2", 3L);
		create(15L,"State 5 Ct 2", 3L);
		
		
		
		
		em.getTransaction().commit();

	}

	private StateJPA create(Long obj_id, String stateName, Long country_id) {
		StateJPA dpt = new StateJPA();
		dpt.setObjId(obj_id);
		dpt.setParentId(country_id);
		dpt.setName(stateName);
		em.persist(dpt);
		return dpt;

	}

}
