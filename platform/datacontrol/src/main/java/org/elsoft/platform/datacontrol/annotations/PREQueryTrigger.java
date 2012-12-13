package org.elsoft.platform.datacontrol.annotations;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;

@Retention(RUNTIME)
public @interface PREQueryTrigger {
	Class<?> clazz();
	String method();
}