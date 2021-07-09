package com.dragontalker.bean;

public class User {

	private Integer id;
	
	private String userName;
	
	private String password;
	
	private Integer age;
	
	private String sex;
	
	public User() {}

	public User(Integer id, String userName, String password, Integer age, String sex) {
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.age = age;
		this.sex = sex;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getuserName() {
		return userName;
	}

	public void setuserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", password=" + password + ", age=" + age + ", sex=" + sex
				+ "]";
	}
	
}
