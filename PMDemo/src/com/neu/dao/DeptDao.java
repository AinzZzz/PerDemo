package com.neu.dao;

import java.util.List;

import com.neu.entity.Dept;

public interface DeptDao {
	List<Dept> getAll() throws Exception;

	int delete(int deptno) throws Exception;

	Dept getByName(String dname) throws Exception;

	Dept getByType(String type) throws Exception;

	int update(Dept dept) throws Exception;

	int insert(Dept dept) throws Exception;
}
