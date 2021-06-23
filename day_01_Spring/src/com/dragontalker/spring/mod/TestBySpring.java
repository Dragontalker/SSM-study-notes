package com.dragontalker.spring.mod;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBySpring {
	
	public static void main(String[] args) {
		
		//初始化容器
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		//通过getBean()获取对象
		Person person = context.getBean("person", Person.class);
		System.out.println(person);
	}

}
