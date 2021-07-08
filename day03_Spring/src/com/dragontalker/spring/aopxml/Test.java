package com.dragontalker.spring.aopxml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context =
				new ClassPathXmlApplicationContext("aop-xml.xml");
		
		MathImpl math = context.getBean("mathImpl", MathImpl.class);
		
		double add = math.add(12, 12);
		
		System.out.println(add);
		
		context.close();
	}
}
