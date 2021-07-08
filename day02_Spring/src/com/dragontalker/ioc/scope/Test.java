package com.dragontalker.ioc.scope;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("scope.xml");
		
		Student student1 = context.getBean("student", Student.class);
		Student student2 = context.getBean("student", Student.class);
		
		System.out.println(student1 == student2);
		
		context.close();
	}
}
