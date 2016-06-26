/**
 * 
 */
package com.spring.aop.cala;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author zhaocc
 *
 */
public class ArchImplProxyLog {

	private IArch iArch;

	public ArchImplProxyLog(IArch iArch) {
		this.iArch = iArch;
	}

	@SuppressWarnings("rawtypes")
	public IArch getIArchProxyLogging() {
		IArch proxy = null;

		ClassLoader loader = iArch.getClass().getClassLoader();
		Class[] classes = new Class[] { IArch.class };
		InvocationHandler handler = new InvocationHandler() {

			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				System.out.println(method.getName() + "start");
				Object invoke = method.invoke(iArch, args);
				System.out.println(method.getName() + "end");
				return invoke;
			}
		};
		proxy = (IArch) Proxy.newProxyInstance(loader, classes, handler);
		return proxy;
	}

}
