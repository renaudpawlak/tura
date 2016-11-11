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
package org.tura.example.ui.hrmanager.nesteddata.producer;

import org.tura.platform.datacontrol.annotations.PostCreate;
import org.tura.platform.datacontrol.annotations.PostQuery;
import org.tura.platform.datacontrol.annotations.PreDelete;
import org.tura.platform.datacontrol.annotations.PreInsert;
import org.tura.platform.datacontrol.annotations.PreQuery;
import org.tura.platform.datacontrol.annotations.PreUpdate;
import org.tura.platform.datacontrol.annotations.Selector;
import org.tura.platform.datacontrol.command.base.PostCreateTrigger;
import org.tura.platform.datacontrol.command.base.PostQueryTrigger;
import org.tura.platform.datacontrol.command.base.PreDeleteTrigger;
import org.tura.platform.datacontrol.command.base.PreInsertTrigger;
import org.tura.platform.datacontrol.command.base.PreQueryTrigger;
import org.tura.platform.datacontrol.command.base.PreUpdateTrigger;

import javax.annotation.Priority;

import javax.enterprise.inject.Alternative;
import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;

@Alternative
@Priority(0)
public class StreetTriggerProducer {
    @Produces
    @Selector("hrmanager.nesteddata")
    @PreQuery("street")
    public PreQueryTrigger getPreQueryTrigger(InjectionPoint injectionPoint) {
        return null;

    }

    @Produces
    @Selector("hrmanager.nesteddata")
    @PostQuery("street")
    public PostQueryTrigger getPostQueryTrigger(InjectionPoint injectionPoint) {
        return null;

    }

    @Produces
    @Selector("hrmanager.nesteddata")
    @PostCreate("street")
    public PostCreateTrigger getPostCreateTrigger(InjectionPoint injectionPoint) {
        return null;

    }

    @Produces
    @Selector("hrmanager.nesteddata")
    @PreDelete("street")
    public PreDeleteTrigger getPreDeleteTrigger(InjectionPoint injectionPoint) {
        return null;

    }

    @Produces
    @Selector("hrmanager.nesteddata")
    @PreInsert("street")
    public PreInsertTrigger getPreInsertTrigger(InjectionPoint injectionPoint) {
        return null;

    }

    @Produces
    @Selector("hrmanager.nesteddata")
    @PreUpdate("street")
    public PreUpdateTrigger getPreUpdateTrigger(InjectionPoint injectionPoint) {
        return null;

    }
}