package com.dragontalker.spring.aop;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("aop.xml");
		
		Math math = context.getBean("mathImpl", Math.class);
		
		double divResult = math.div(6, 0);
		
		context.close();
	}
}
