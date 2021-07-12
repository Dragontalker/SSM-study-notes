package com.dragontalker.mapper;

import java.util.List;

import com.dragontalker.bean.Emp;

public interface EmpMapper {

	// 根据eid, ename, age, sex多条件查询员工信息
	List<Emp> getEmpListByMoreTJ(Emp emp);
}
