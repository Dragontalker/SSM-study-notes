package com.dragontalker.mapper;

import java.util.List;

import com.dragontalker.bean.Dept;
import com.dragontalker.bean.Emp;

public interface EmpDeptMapper {

	List<Emp> getAllEmp();
	
	Emp getEmpStep(String eid);
	
	Dept getDeptEmpsByDid(String did);
	
	Dept getOnlyDeptByDid(String did);
}
