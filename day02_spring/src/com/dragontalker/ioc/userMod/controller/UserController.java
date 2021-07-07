package com.dragontalker.ioc.userMod.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.dragontalker.ioc.userMod.service.UserService;
import com.dragontalker.ioc.userMod.service.UserServiceImpl;

@Controller
public class UserController {
	
	@Autowired
	private UserService userSerivce;
	
	public void addUser() {
		userSerivce.addUser();
	}

	public UserController() {
		System.out.println(">> constructor UserController() called....");
	}
}
