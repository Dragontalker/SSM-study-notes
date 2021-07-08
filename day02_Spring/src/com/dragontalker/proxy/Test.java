package com.dragontalker.proxy;

public class Test {

	public static void main(String[] args) {
		
		Math math = new MathImpl();
		
		double result = math.add(1.0,  1.0);
		System.out.println(result);
	}
}
