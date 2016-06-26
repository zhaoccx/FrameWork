/**
 * 
 */
package com.spring.aop.cala;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * @author zhaocc
 *
 */
public class ArchimplVaidatProxyLog<T> implements InvocationHandler {

	private Log info = LogFactory.getLog(getClass());

	private T t;

	/**
	 * @param t
	 */
	public ArchimplVaidatProxyLog(T t) {
		super();
		this.t = t;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.reflect.InvocationHandler#invoke(java.lang.Object,
	 * java.lang.reflect.Method, java.lang.Object[])
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		for (int i = 0; i < args.length; i++) {
			validate((double) args[i]);
		}

		info.info("The methed " + method.getName() + " start");
		Object invoke = method.invoke(t, args);
		info.info("The methed " + method.getName() + " end");
		return invoke;
	}

	@SuppressWarnings("unchecked")
	public T getProxyinit(T t) {
		return (T) Proxy.newProxyInstance(t.getClass().getClassLoader(), t.getClass().getInterfaces(), new ArchimplVaidatProxyLog<>(t));
	}

	private void validate(double d) {
		if (d <= 0) {
			throw new IllegalArgumentException("");
		}
	}

}
