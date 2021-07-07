package com.dragontalker.proxy;

public class MyLogger {

	public static void before(String methodName, String args) {
		System.out.println("method: " + methodName + ", arguments" + args);
		
	}
	
	public static void afer(String methodName, String result) {
		System.out.println("method: " + methodName + ", result" + result);
	}
}
