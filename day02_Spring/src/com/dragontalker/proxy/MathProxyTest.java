package com.dragontalker.proxy;

public class MathProxyTest {

	public static void main(String[] args) {
		
		ProxyUtil proxy = new ProxyUtil(new MathImpl());
		Math proxyObj = (Math) proxy.getProxy();
		proxyObj.div(1.0, 1.0);
		
	}
}
