package com.dragontalker.ioc.scope;

public class Student {

	private Integer id;
	
	private String name;
	
	public Student() {
		System.out.println("Constructor Student() called....");
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
