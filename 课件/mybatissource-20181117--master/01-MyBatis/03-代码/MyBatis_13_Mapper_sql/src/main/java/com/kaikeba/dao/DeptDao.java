package com.kaikeba.dao;

import com.kaikeba.beans.Dept;

public interface DeptDao {

	public Dept findByDname(String Dname);
	public Dept findByDeptNo(Integer deptno);
	
}
