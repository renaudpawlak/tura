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
package org.tura.example.ui.hrmanager.nesteddata.datacontrol;

import org.tura.platform.datacontrol.TreeDataControl;
import org.tura.platform.datacontrol.annotations.Dependencies;
import org.tura.platform.datacontrol.annotations.Dependency;
import org.tura.platform.datacontrol.metainfo.DependecyProperty;

import java.io.Serializable;

import java.util.List;

import javax.inject.Inject;

public class TreeRootCountryDC extends TreeDataControl implements Serializable {
    private static final long serialVersionUID = 1L;

    @Inject
    public void setRoot(CountryDC root) {
        super.setRoot(root);
        root.setTreeContext(this);
    }

    @Override
    @Inject
    public void setDependency(
        @Dependencies(dependency =  {
        @Dependency(expression = "#{beanFactoryHrManagerNestedData.department}")

    }
    )
    List<DependecyProperty> dependency) {
        this.dependency = dependency;
    }
}