package com.dragontalker.mapper;

import com.dragontalker.bean.Emp;

public interface EmpSelectMapper {

	// 根据eid查询一个员工信息
	Emp getEmpByEid(String eid);
}