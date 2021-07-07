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
		// 获取当前类的类加载器, 用来加载代理对象所属类
		ClassLoader loader = this.getClass().getClassLoader();
		// 获取目标对象实现的所有接口的Class, 代理类会和目标实现相同的接口, 最终通过代理对象实现功能
		Class<?>[] interfaces = mathImpl.getClass().getInterfaces();
		
		return Proxy.newProxyInstance(loader, interfaces, new InvocationHandler() {
			
			// 代理对象实现功能的方式
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				MyLogger.before(method.getName(), Arrays.toString(args));
				
				Object result = method.invoke(mathImpl, args);

				MyLogger.after(method.getName(), result.toString());
				
				return result;
			}
		});
	}

}
