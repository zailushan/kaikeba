package com.kaikeba.dao;

import java.util.List;

import com.kaikeba.beans.Dept;

public interface DeptDao {

	public Dept findByDname(String Dname);
	public Dept findByDeptNo(Integer deptno);
	
}
