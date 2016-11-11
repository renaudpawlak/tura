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
package org.tura.example.ui.hrmanager.hrcontroller.producer;

import org.tura.platform.datacontrol.annotations.Create;
import org.tura.platform.datacontrol.annotations.CreateTrigger;
import org.tura.platform.datacontrol.annotations.Delete;
import org.tura.platform.datacontrol.annotations.DeleteTrigger;
import org.tura.platform.datacontrol.annotations.Insert;
import org.tura.platform.datacontrol.annotations.InsertTrigger;
import org.tura.platform.datacontrol.annotations.Parameter;
import org.tura.platform.datacontrol.annotations.Parameters;
import org.tura.platform.datacontrol.annotations.Search;
import org.tura.platform.datacontrol.annotations.SearchTrigger;
import org.tura.platform.datacontrol.annotations.Selector;
import org.tura.platform.datacontrol.annotations.Update;
import org.tura.platform.datacontrol.annotations.UpdateTrigger;
import org.tura.platform.datacontrol.command.CreateCommand;
import org.tura.platform.datacontrol.command.DeleteCommand;
import org.tura.platform.datacontrol.command.SearchCommand;
import org.tura.platform.datacontrol.command.base.CallParameter;
import org.tura.platform.datacontrol.command.base.Command;
import org.tura.platform.datacontrol.command.base.CreateCommandBase;
import org.tura.platform.datacontrol.command.base.DeleteCommandBase;
import org.tura.platform.datacontrol.command.base.InsertCommandBase;
import org.tura.platform.datacontrol.command.base.SearchCommandBase;
import org.tura.platform.datacontrol.command.base.UpdateCommandBase;
import org.tura.platform.datacontrol.command.turaservice.InsertCommandTuraService;
import org.tura.platform.datacontrol.command.turaservice.UpdateCommandTuraService;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import javax.annotation.Priority;

import javax.enterprise.inject.Alternative;
import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;

@Alternative
@Priority(0)
public class UserCommandProducer {
    @Produces
    @Selector("hrmanager.hrcontroller")
    @CreateTrigger("user")
    public CreateCommandBase getCreateCommand(InjectionPoint injectionPoint)
        throws NoSuchMethodException, SecurityException, InstantiationException,
            IllegalAccessException, IllegalArgumentException,
            InvocationTargetException {
        Create annotation =
            injectionPoint.getAnnotated().getAnnotation(Create.class);

        CreateCommand cmd = new CreateCommand();

        parametersBuilder(annotation.parameters(), cmd);

        return cmd;

    }

    @Produces
    @Selector("hrmanager.hrcontroller")
    @InsertTrigger("user")
    public InsertCommandBase getInsertCommand(InjectionPoint injectionPoint)
        throws NoSuchMethodException, SecurityException, InstantiationException,
            IllegalAccessException, IllegalArgumentException,
            InvocationTargetException {
        Insert annotation =
            injectionPoint.getAnnotated().getAnnotation(Insert.class);

        InsertCommandTuraService cmd = new InsertCommandTuraService();

        parametersBuilder(annotation.parameters(), cmd);

        return cmd;

    }

    @Produces
    @Selector("hrmanager.hrcontroller")
    @UpdateTrigger("user")
    public UpdateCommandBase getUpdateCommand(InjectionPoint injectionPoint)
        throws NoSuchMethodException, SecurityException, InstantiationException,
            IllegalAccessException, IllegalArgumentException,
            InvocationTargetException {
        Update annotation =
            injectionPoint.getAnnotated().getAnnotation(Update.class);

        UpdateCommandTuraService cmd = new UpdateCommandTuraService();

        parametersBuilder(annotation.parameters(), cmd);

        return cmd;

    }

    @Produces
    @Selector("hrmanager.hrcontroller")
    @DeleteTrigger("user")
    public DeleteCommandBase getDeleteCommand(InjectionPoint injectionPoint)
        throws NoSuchMethodException, SecurityException, InstantiationException,
            IllegalAccessException, IllegalArgumentException,
            InvocationTargetException {
        Delete annotation =
            injectionPoint.getAnnotated().getAnnotation(Delete.class);

        DeleteCommand cmd = new DeleteCommand();
        parametersBuilder(annotation.parameters(), cmd);

        return cmd;

    }

    @Produces
    @Selector("hrmanager.hrcontroller")
    @SearchTrigger("user")
    public SearchCommandBase getSearchCommand(InjectionPoint injectionPoint)
        throws NoSuchMethodException, SecurityException, InstantiationException,
            IllegalAccessException, IllegalArgumentException,
            InvocationTargetException {
        Search annotation =
            injectionPoint.getAnnotated().getAnnotation(Search.class);

        SearchCommand cmd = new SearchCommand();

        parametersBuilder(annotation.parameters(), cmd);

        return cmd;

    }

    private void parametersBuilder(Parameters parameters, Command cmd)
        throws NoSuchMethodException, SecurityException, InstantiationException,
            IllegalAccessException, IllegalArgumentException,
            InvocationTargetException {
        for (Parameter prm : parameters.value()) {
            CallParameter cp = new CallParameter();
            cmd.getParameters().add(cp);
            cp.setClazz(prm.type());
            cp.setExpression(prm.expression());
            cp.setName(prm.name());
            if (!"".equals(prm.value())) {
                Constructor<?> constructor =
                    prm.type().getConstructor(String.class);
                cp.setValue(constructor.newInstance(prm.value()));
            }
        }
    }
}