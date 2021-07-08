package com.dragontalker.ioc.userMod.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dragontalker.ioc.userMod.dao.UserDao;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserDao userDao;

	public UserServiceImpl() {
		System.out.println(">> consturctor UserServiceImpl() called...");
	}

	@Override
	public void addUser() {
		userDao.addUser();
	}
}
