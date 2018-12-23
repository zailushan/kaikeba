package com.kaikeba.test;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Statement;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.kaikeba.beans.Dept;
import com.kaikeba.dao.DeptDao;

public class TestMain {
	
	 private SqlSession session;
	 
	 @Before
	 public void start() throws IOException{
		    InputStream is = Resources.getResourceAsStream("myBatis-config.xml");
		    SqlSessionFactoryBuilder builderObj = new SqlSessionFactoryBuilder();
			SqlSessionFactory factory = builderObj.build(is);
			session = factory.openSession();
	 }
	 @After
	 public void destory(){
		 if(session!=null){
			 session.close();
		 }
	 }
	 @Test
	 public void Test01(){
		    DeptDao dao =  session.getMapper(DeptDao.class);
		    Dept dept = dao.findByDeptNo(10);
		    System.out.println(dept.getDname());
	 }
	
}
