package com.dragontalker.ioc.userMod.dao;

import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {

	public UserDaoImpl() {
		System.out.println(">> constructor UserDaoImp() called...");
	}

	@Override
	public void addUser() {
		System.out.println("SQL....");
	}
}
