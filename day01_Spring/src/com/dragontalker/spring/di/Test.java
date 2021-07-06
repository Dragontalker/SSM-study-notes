package com.dragontalker.spring.di;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ac = 
				new ClassPathXmlApplicationContext("beans-di.xml");
		
		Student student = ac.getBean("s1", Student.class);
		System.out.println(student);
		
		ac.close();
	}
}
