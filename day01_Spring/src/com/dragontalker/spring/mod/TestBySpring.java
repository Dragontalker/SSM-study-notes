package com.dragontalker.spring.mod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBySpring {
	
	public static void main(String[] args) {
		
		// 初始化容器
		ApplicationContext ac = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// 通过getBean()获取Bean对象
		Person person = ac.getBean("person", Person.class);
		System.out.println(person);
		
		
	}
}
