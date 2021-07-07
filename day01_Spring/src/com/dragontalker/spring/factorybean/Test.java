package com.dragontalker.spring.factorybean;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ac = 
				new ClassPathXmlApplicationContext("factory-bean.xml");
		
		Object object = ac.getBean("factory");
		
		System.out.println(object);
	}
}
