package com.dragontalker.mapper;

import java.util.Map;

import com.dragontalker.bean.Emp;

public interface EmpSelectMapper {

	// 根据eid查询一个员工信息
	Emp getEmpByEid(String eid);
	
	// 获取所有的员工的数量
	Integer getCount();
	
	// 以map集合获取一个员工信息
	Map<String, Object> getEmpMapByEid(String eid);
}
