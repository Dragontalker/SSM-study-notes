package com.dragontalker.rest.crud.dao;

import java.util.Map;

import org.springframework.stereotype.Repository;

import com.dragontalker.rest.crud.bean.Employee;

@Repository
public class EmployeeDao {
	
	private static Map<Integer, Employee> employees = null;

}
