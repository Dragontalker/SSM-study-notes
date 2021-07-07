package com.dragontalker.ioc.userMod;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dragontalker.ioc.userMod.controller.UserController;
import com.dragontalker.ioc.userMod.service.UserServiceImpl;

public class Test {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("user.xml");
		
		UserController uc = context.getBean("userController", UserController.class);
		System.out.println(uc);
		
		UserServiceImpl us = context.getBean("userServiceImpl", UserServiceImpl.class);
		System.out.println(us);
		
		context.close();
	}
}
