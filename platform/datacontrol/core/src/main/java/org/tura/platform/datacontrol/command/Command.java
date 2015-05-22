package org.tura.platform.datacontrol.command;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

import org.tura.platform.datacontrol.BeanWrapper;
import org.tura.platform.datacontrol.DataControl;
import org.tura.platform.datacontrol.commons.Reflection;
import org.tura.platform.datacontrol.commons.TuraException;

import com.rits.cloning.Cloner;

public abstract class Command {

	private DataControl<?> datacontrol;
	protected List<CallParameter> parameters = new ArrayList<>();
	protected Object provider;
	private String method;
	protected Method call;

	public abstract Object execute() throws Exception;

	public abstract void delayedExecution() throws Exception;

	public Command(DataControl<?> datacontrol) {
		this.datacontrol = datacontrol;
	}

	public Command() {

	}

	public void setProvider(Object provider) {
		this.provider = provider;
	}

	public void setMethod(String method) {
		this.method = method;
	}

	public List<CallParameter> getParameters() {
		return parameters;
	}

	public DataControl<?> getDatacontrol() {
		return datacontrol;
	}

	public void setDatacontrol(DataControl<?> datacontrol) {
		this.datacontrol = datacontrol;
	}

	public void prepareCall() throws Exception {
		ArrayList<Class<?>> ls = new ArrayList<>();
		for (CallParameter prm : parameters) {
			ls.add(prm.getClazz());
		}
		call = provider.getClass().getMethod(method,
				ls.toArray(new Class<?>[ls.size()]));
	}

	protected Object callMethod() throws Exception {

		ArrayList<Object> ls = new ArrayList<>();
		for (CallParameter prm : parameters) {
			ls.add(prm.getObj());
		}
		return call.invoke(provider, ls.toArray(new Object[ls.size()]));
	}

	public List<CallParameter> prepareParameters() throws Exception {

		Cloner cloner = new Cloner();
		ArrayList<CallParameter> lst = new ArrayList<CallParameter>();

		if (parameters.size() != 0) {
			for (CallParameter parameter : parameters) {

				String exp = parameter.getExpression();
				Object val = parameter.getValue();
				// Class<?> clazz = parameter.getClazz();
				if ((exp != null && !exp.equals(""))
						&& (val != null && !val.equals(""))) {
					new TuraException("Wrong combination of method's parameter");
				}
				if (exp != null && !exp.equals("")) {
					Object obj = datacontrol.getElResolver().getValue(exp);

					if (!obj.getClass().isPrimitive()&& obj.getClass().getName().indexOf("EnhancerByCGLIB") != -1) {
						Object w = Reflection.call(obj, "getWrapper");
						if (w instanceof BeanWrapper)
						    obj = ((BeanWrapper)w).getObj();
					}

					Object o = cloner.deepClone(obj);
					parameter.setObj(o);
				}
				if (val != null && !val.equals("")) {
					parameter.setObj(val);
				}

				CallParameter param = new CallParameter();
				param.clazz = parameter.clazz;
				param.expression = parameter.expression;
				param.name = parameter.name;
				param.obj = parameter.obj;

				lst.add(param);
			}
		}
		return lst;
	}


	public class CallParameter {
		private String name;
		private Object value;
		private Class<?> clazz;
		private String expression;
		private Object obj;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Object getValue() {
			return value;
		}

		public void setValue(Object value) {
			this.value = value;
		}

		public String getExpression() {
			return expression;
		}

		public void setExpression(String expression) {
			this.expression = expression;
		}

		public Class<?> getClazz() {
			return clazz;
		}

		public void setClazz(Class<?> clazz) {
			this.clazz = clazz;
		}

		/**
		 * @return the obj
		 */
		public Object getObj() {
			return obj;
		}

		/**
		 * @param obj
		 *            the obj to set
		 */
		public void setObj(Object obj) {
			this.obj = obj;
		}

	}

}
