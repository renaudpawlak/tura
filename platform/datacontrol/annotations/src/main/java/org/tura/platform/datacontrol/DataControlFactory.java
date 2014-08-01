package org.tura.platform.datacontrol;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;

import org.tura.platform.datacontrol.annotations.Create;
import org.tura.platform.datacontrol.annotations.Delete;
import org.tura.platform.datacontrol.annotations.Insert;
import org.tura.platform.datacontrol.annotations.Parameter;
import org.tura.platform.datacontrol.annotations.Parameters;
import org.tura.platform.datacontrol.annotations.Search;
import org.tura.platform.datacontrol.annotations.Update;
import org.tura.platform.datacontrol.command.Command;
import org.tura.platform.datacontrol.command.Command.CallParameter;
import org.tura.platform.datacontrol.command.CreateCommand;
import org.tura.platform.datacontrol.command.DeleteCommand;
import org.tura.platform.datacontrol.command.InsertCommand;
import org.tura.platform.datacontrol.command.SearchCommand;
import org.tura.platform.datacontrol.command.UpdateCommand;
import org.tura.platform.datacontrol.metainfo.ArtificialProperty;

import com.octo.java.sql.query.SelectQuery;

public class DataControlFactory {

	@Produces
	public List<ArtificialProperty> getArtificialProperties(
			InjectionPoint injectionPoint) {
		return null;
	}

	@Produces
	public SelectQuery getSelectQuery(InjectionPoint injectionPoint) {
		return null;

	}

	@Produces
	public InsertCommand getInsertCommand(InjectionPoint injectionPoint)
			throws NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException {

		Insert annotation = injectionPoint.getAnnotated().getAnnotation(
				Insert.class);

		InsertCommand cmd = new InsertCommand();
		cmd.setMethod(annotation.objectAction());

		parametersBuilder(annotation.parameters(), cmd);

		return cmd;
	}

	@Produces
	public UpdateCommand getUpdateCommand(InjectionPoint injectionPoint)
			throws NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException {
		Update annotation = injectionPoint.getAnnotated().getAnnotation(
				Update.class);

		UpdateCommand cmd = new UpdateCommand();
		cmd.setMethod(annotation.objectAction());

		parametersBuilder(annotation.parameters(), cmd);

		return cmd;

	}

	@Produces
	public CreateCommand getCreateCommand(InjectionPoint injectionPoint)
			throws NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException {
		Create annotation = injectionPoint.getAnnotated().getAnnotation(
				Create.class);

		CreateCommand cmd = new CreateCommand();
		cmd.setMethod(annotation.objectAction());

		parametersBuilder(annotation.parameters(), cmd);

		return cmd;

	}

	@Produces
	public DeleteCommand getDeleteCommand(InjectionPoint injectionPoint)
			throws NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException {
		Delete annotation = injectionPoint.getAnnotated().getAnnotation(
				Delete.class);

		DeleteCommand cmd = new DeleteCommand();
		cmd.setMethod(annotation.objectAction());

		parametersBuilder(annotation.parameters(), cmd);

		return cmd;

	}

	@Produces
	public SearchCommand getSearchCommand(InjectionPoint injectionPoint)
			throws NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException {

		Search annotation = injectionPoint.getAnnotated().getAnnotation(
				Search.class);

		SearchCommand cmd = new SearchCommand();
		cmd.setMethod(annotation.objectAction());

		parametersBuilder(annotation.parameters(), cmd);

		return cmd;

	}

	private void parametersBuilder(Parameters parameters, Command cmd)
			throws NoSuchMethodException, SecurityException,
			InstantiationException, IllegalAccessException,
			IllegalArgumentException, InvocationTargetException {

		for (Parameter prm : parameters.value()) {

			CallParameter cp = ((Command) cmd).new CallParameter();
			cmd.getParameters().add(cp);
			cp.setClazz(prm.type());
			cp.setExpression(prm.expression());
			cp.setName(prm.name());
			if (!"".equals(prm.value())) {
				Constructor<?> constructor = prm.type().getConstructor(
						String.class);
				cp.setValue(constructor.newInstance(prm.value()));
			}
		}

	}

}
