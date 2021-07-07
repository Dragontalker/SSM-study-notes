package com.dragontalker.ioc.userMod.controller;

import org.springframework.stereotype.Controller;

import com.dragontalker.ioc.userMod.service.UserService;
import com.dragontalker.ioc.userMod.service.UserServiceImpl;

@Controller
public class UserController {
	
	private UserService userSerivce = new UserServiceImpl();
	
	public void addUser() {
		userSerivce.addUser();
	}

	public UserController() {
		System.out.println(">> constructor UserController() called....");
	}
}
