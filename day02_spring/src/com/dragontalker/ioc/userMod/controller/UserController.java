package com.dragontalker.ioc.userMod.controller;

import org.springframework.stereotype.Controller;

import com.dragontalker.ioc.userMod.service.UserService;

@Controller
public class UserController {
	
	private UserService userSerivce;
	
	public void addUser() {
		
	}

	public UserController() {
		System.out.println(">> constructor UserController() called....");
	}
}
