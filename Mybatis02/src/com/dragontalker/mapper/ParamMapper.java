package com.dragontalker.mapper;

import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.dragontalker.bean.Emp;

public interface ParamMapper {

	// 添加员工信息
	void insertEmp(Emp emp);
	
	// 根据eid获取员工信息
	Emp getEmpByEid(String eid);
	
	// 根据eid和ename查询员工信息
	Emp getEmpByEidAndEname(String eid, String ename);
	
	// 根据map查询员工信息
	Emp getEmpByMap(Map<String, Object> map);
	
	// 根据eid和ename查询员工信息
	Emp getEmpByEidAndEnameByParam(@Param("eid")String eid, @Param("ename") String ename);
}
