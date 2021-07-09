package com.dragontalker.rest.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.dragontalker.rest.crud.dao.DepartmentDao;
import com.dragontalker.rest.crud.dao.EmployeeDao;

@Controller
public class EmpController {
	
	@Autowired
	private EmployeeDao employeeDao;
	
	@Autowired
	private DepartmentDao departmentDao;

}
