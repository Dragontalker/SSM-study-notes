package com.dragontalker.mapper;

import com.dragontalker.bean.Emp;

public interface ParamMapper {

	// 添加员工信息
	void insertEmp(Emp emp);
	
	// 根据eid获取员工信息
	Emp getEmpByEid(String eid);
}