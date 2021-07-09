package com.dragontalker.bean;

public class User {

	private Integer uid;
	
	private String userName;
	
	private String password;
	
	private Integer age;
	
	private String sex;
	
	public User() {}

	public User(Integer uid, String userName, String password, Integer age, String sex) {
		this.uid = uid;
		this.userName = userName;
		this.password = password;
		this.age = age;
		this.sex = sex;
	}

	public Integer getUid() {
		return uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
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
		return "User [uid=" + uid + ", userName=" + userName + ", password=" + password + ", age=" + age + ", sex=" + sex
				+ "]";
	}
	
}
