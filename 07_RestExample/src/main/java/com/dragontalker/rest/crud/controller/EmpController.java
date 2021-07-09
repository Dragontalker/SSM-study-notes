package com.dragontalker.rest.crud.controller;

import java.util.Collection;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.dragontalker.rest.crud.bean.Employee;
import com.dragontalker.rest.crud.dao.DepartmentDao;
import com.dragontalker.rest.crud.dao.EmployeeDao;

@Controller
public class EmpController {
	
	@Autowired
	private EmployeeDao employeeDao;
	
	@Autowired
	private DepartmentDao departmentDao;
	
	@RequestMapping(value = "/emps")
	public String getAll(Map<String, Object> map) {
		Collection<Employee> emps = employeeDao.getAll();
		map.put("emps", emps);
		return "list";
	}
	
	@RequestMapping(value = "/index")
	public String index() {
		return "index";
	}

}
