package com.dragontalker.rest.crud.bean;

public class Employee {

	private Integer id;
	private String lastName;
	private String email;
	
	// 1 male, 0 female
	private Integer gender;
	
	private Department department;
	
	public Employee() {}

	public Employee(Integer id, String lastName, String email, Integer gender, Department department) {
		this.id = id;
		this.lastName = lastName;
		this.email = email;
		this.gender = gender;
		this.department = department;
	}
	
}
