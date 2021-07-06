package com.dragontalker.spring.mod;


import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBySpring {
	
	public static void main(String[] args) {
		
		// 初始化容器
		ClassPathXmlApplicationContext ac = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// 通过getBean()获取Bean对象
		Person person1 = ac.getBean("personOne", Person.class);
		Person person2 = ac.getBean("personTwo", Person.class);
		
		System.out.println(person1);
		System.out.println(person2);
		
		ac.close();
	}
}
