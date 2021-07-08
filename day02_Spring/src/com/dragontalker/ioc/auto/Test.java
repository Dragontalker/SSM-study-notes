package com.dragontalker.ioc.auto;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("auto.xml");
		
		Emp emp = context.getBean("emp", Emp.class);
		
		System.out.println(emp);
		
		context.close();
	}
}
