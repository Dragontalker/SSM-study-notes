package com.dragontalker.spring.aop;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("aop.xml");
		
		Math math = context.getBean("mathImpl", Math.class);
		double result = math.add(1, 2);
		System.out.println(result);
		
		context.close();
	}
}
