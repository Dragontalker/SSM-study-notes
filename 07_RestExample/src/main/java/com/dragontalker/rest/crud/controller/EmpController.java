package com.dragontalker.rest.crud.controller;

import java.util.Collection;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.dragontalker.rest.crud.bean.Department;
import com.dragontalker.rest.crud.bean.Employee;
import com.dragontalker.rest.crud.dao.DepartmentDao;
import com.dragontalker.rest.crud.dao.EmployeeDao;

@Controller
public class EmpController {
	
	@Autowired
	private EmployeeDao employeeDao;
	
	@Autowired
	private DepartmentDao departmentDao;
	
	/**
	 * 获取所有的员工信息
	 * @param map
	 * @return
	 */
	@RequestMapping(value = "/emps")
	public String getAll(Map<String, Object> map) {
		Collection<Employee> emps = employeeDao.getAll();
		map.put("emps", emps);
		return "list";
	}
	
	/**
	 * 跳转到添加页面
	 * @return
	 */
	@RequestMapping(value = "/emp", method = RequestMethod.GET)
	public String toAdd(Map<String, Object> map) {
		Collection<Department> depts = departmentDao.getDepartments();
		map.put("depts", depts);
		return "add";
	}
	
	/**
	 * 添加员工信息
	 * @param employee
	 * @return
	 */
	@RequestMapping(value = "/emp", method = RequestMethod.POST)
	public String addEmp(Employee employee) {
		employeeDao.save(employee);
		return "redirect:/emps";
	}
	
	/**
	 * 获取要回显的数据, 跳转到修改页面, 并回显
	 * @param id
	 * @param map
	 * @return
	 */
	@RequestMapping(value = "/emp/{id}", method = RequestMethod.GET)
	public String toUpdate(@PathVariable("id") Integer id, Map<String, Object> map) {
		// 获取要修改的员工信息
		Employee emp = employeeDao.get(id);
		// 获取所有的部门信息, 供用户选择
		Collection<Department> depts = departmentDao.getDepartments();
		
		map.put("emp", emp);
		map.put("depts", depts);
		return "update";
	}
	
	@RequestMapping(value = "/emp", method = RequestMethod.PUT)
	public String update(Employee employee) {
		employeeDao.save(employee);
		return "redirect:/emps";
	}

}
