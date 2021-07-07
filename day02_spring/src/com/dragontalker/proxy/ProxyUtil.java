package com.dragontalker.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class ProxyUtil {
	
	private Math mathImpl;
	
	public ProxyUtil(Math mathImpl) {
		this.mathImpl = mathImpl;
	}

	public Object getProxy() {
		
		ClassLoader loader = this.getClass().getClassLoader();
		Class<?>[] interfaces = mathImpl.getClass().getInterfaces();
		
		return Proxy.newProxyInstance(loader, interfaces, new InvocationHandler() {
			
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				MyLogger.before(method.getName(), Arrays.toString(args));
				
				Object result = method.invoke(mathImpl, args);

				MyLogger.afer(method.getName(), result.toString());
				
				return result;
			}
		});
	}

}
