package com.dragontalker.ioc.scope;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("scope.xml");
		
		Student student = context.getBean("student", Student.class);
		
		System.out.println(student);
		
		context.close();
	}
}
