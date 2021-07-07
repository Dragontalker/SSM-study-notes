package com.dragontalker.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyUtil {
	
	private Math mathImpl;
	
	public Object getProxy() {
		
		ClassLoader loader = this.getClass().getClassLoader();
		Class<?>[] interfaces = mathImpl.getClass().getInterfaces();
		
		return Proxy.newProxyInstance(loader, interfaces, new InvocationHandler() {
			
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				System.out.println(">> Method called: " + method);
				System.out.println(">> Arguments: " + args);
				
				Object result = method.invoke(mathImpl, args);
				System.out.println(">> Result: " + result);
				
				return result;
			}
		});
	}

}
