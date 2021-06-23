package com.dragontalker.spring.mod;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBySpring {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Person person = context.getBean("person", Person.class);
		System.out.println(person);
		context.close();
	}

}
