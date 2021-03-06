package com.dragontalker.mapper;

import java.util.List;

import com.dragontalker.bean.Emp;

public interface EmpMapper {

	// 根据eid查询一个信息
	Emp getEmpByEid(String eid);
	
	// 获取所有员工信息
	List<Emp> getAllEmp();
	
	// 添加员工信息
	void addEmp(Emp emp);
	
	// 修改员工信息
	void updateEmp(Emp emp);
	
	// 删除员工信息
	Boolean deleteEmp(String eid);
	
}
