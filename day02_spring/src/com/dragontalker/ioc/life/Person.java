package com.dragontalker.ioc.life;

public class Person {

	private Integer id;
	
	private String sex;
	
	private String name;
	
	public Person() {
		System.out.println("1. Constructor called...");
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		System.out.println("2. Dependency injected...");
		this.id = id;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void init() {
		System.out.println("3. init() called...");
	}
	
	public void detroy() {
		System.out.println("5. destroy() called...");
	}
}
