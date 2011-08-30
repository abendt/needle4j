package de.akquinet.jbosscc.needle.injection;

import java.lang.reflect.Field;

public interface InjectionProvider {

	<T> T get(final Class<T> type);

	boolean verify(Field field);

	Object getKey(Field field);


}