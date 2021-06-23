package com.dragontalker.spring.mod;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBySpring {
	
	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Person personOne = context.getBean("personOne", Person.class);
		System.out.println(personOne);
		
		Person personTwo = context.getBean("personTwo", Person.class);
		System.out.println(personTwo);
		context.close();
	}

}
