package com.neu.dao;

import java.util.List;

import com.neu.entity.Emp;

public interface EmpDao {
	int insert(Emp emp) throws Exception;
	
	int update(Emp emp) throws Exception;
	
	int delete(Integer empno) throws Exception;
	
	Emp getByName(String ename) throws Exception;
	
	Emp getByJob(String job) throws Exception;
	
	Emp getById(Integer empno) throws Exception;
	
	Emp getByDept(String dname)throws Exception;
	
	List<Emp> getAll() throws Exception;
	
}



















