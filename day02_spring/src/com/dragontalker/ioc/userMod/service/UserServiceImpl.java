package com.dragontalker.ioc.userMod.service;

import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

	public UserServiceImpl() {
		System.out.println(">> consturctor UserServiceImpl() called...");
	}

	@Override
	public void addUser() {
		// TODO Auto-generated method stub
		
	}
}
