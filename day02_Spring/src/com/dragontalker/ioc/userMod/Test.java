package com.dragontalker.ioc.userMod;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dragontalker.ioc.userMod.controller.UserController;

public class Test {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("user.xml");
		
		UserController uc = context.getBean("userController", UserController.class);
		System.out.println(uc);
		
		uc.addUser();
		
		context.close();
	}
}
