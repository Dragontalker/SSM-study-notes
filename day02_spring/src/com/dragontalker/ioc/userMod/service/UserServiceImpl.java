package com.dragontalker.ioc.userMod.service;

import org.springframework.stereotype.Service;

import com.dragontalker.ioc.userMod.dao.UserDao;
import com.dragontalker.ioc.userMod.dao.UserDaoImpl;

@Service
public class UserServiceImpl implements UserService {
	
	private UserDao userDao = new UserDaoImpl();

	public UserServiceImpl() {
		System.out.println(">> consturctor UserServiceImpl() called...");
	}

	@Override
	public void addUser() {
		userDao.addUser();
	}
}
