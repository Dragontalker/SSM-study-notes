package com.dragontalker.spring.aop;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("aop.xml");
		
		Math math = context.getBean("mathImpl", Math.class);
		
		double addResult = math.add(1, 3);
		System.out.println(addResult);
		
		double subResult = math.sub(1, 3);
		System.out.println(subResult);
		
		TestHandler testHandler = context.getBean("testHandler", TestHandler.class);
		testHandler.test();
		
		context.close();
	}
}
