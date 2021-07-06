package com.dragontalker.spring.di;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ac = 
				new ClassPathXmlApplicationContext("beans-di.xml");
		
		Student s1 = ac.getBean("s1", Student.class);
		Student s2 = ac.getBean("s2", Student.class);
		
		System.out.println(s1);
		System.out.println(s2);
		
		ac.close();
	}
}
