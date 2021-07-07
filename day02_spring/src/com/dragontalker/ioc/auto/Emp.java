package com.dragontalker.ioc.auto;

public class Emp {

	private Integer eid;
	
	private String ename;
	
	private CarExtend car;
	
	private Dept dept;

	public Integer getEid() {
		return eid;
	}

	public void setEid(Integer eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public CarExtend getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public Dept getDept() {
		return dept;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Emp [eid=" + eid + ", ename=" + ename + ", car=" + car + ", dept=" + dept + "]";
	}
	
}
