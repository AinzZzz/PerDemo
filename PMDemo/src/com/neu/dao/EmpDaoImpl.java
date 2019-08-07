package com.neu.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.neu.entity.Emp;

public class EmpDaoImpl implements EmpDao {
	  DBUtils util = new DBUtils();
	@Override
	public int insert(Emp emp) throws Exception {
		String sql ="insert into emp(empno,ename,gender,dname,job,emply,status,tel,email) values(?,?,?,?,?,?,?,?,?)";
		int n = util.executeUpdate(sql, emp.getEmpno(),emp.getEname(),emp.getGender(),emp.getDname(),emp.getJob(),emp.getEmply(),emp.getStatus(),emp.getTel(),emp.getEmail());
				
		return n;
	}

	@Override
	public int update(Emp emp) throws Exception {
		String sql ="update emp set dname=?,job=?,emply=?,status=?,tel=?,email=? where  ename = ?";
		int n = util.executeUpdate(sql, emp.getDname(),emp.getJob(),emp.getEmply(),emp.getStatus(),emp.getEname());
				
		return n;
	}

	@Override
	public int delete(Integer empno) throws Exception {
		String sql ="delete emp where empno=?";
		int n = util.executeUpdate(sql, empno);
		return n;
	}

	@Override
	public Emp getByName(String ename) throws Exception {
		String sql="select * from emp where ename=? ";
		Connection connection = util.getConnection();
		ResultSet rs = util.executeQuery(connection, sql,ename);
		
		Emp emp = null;
		
		Integer empno;
		
		String gender;
		String dname;
		String job;
		String emply;
		String status;
		Integer tel;
		String email;
		while(rs.next()) {
			empno = rs.getInt("empno");
			ename = rs.getString("ename");
			gender = rs.getString("gender");
			dname = rs.getString("dname");
			job = rs.getString("job");
			emply = rs.getString("emply");
			status = rs.getString("status");
			tel = rs.getInt("tel");
			email = rs.getString("email");
			
			emp = new Emp(empno,ename,gender,dname,job,emply,status,tel,email);
		
		}
		util.closeConnection(connection);		
		return emp;
	}

	

	@Override
	public Emp getByJob(String job) throws Exception {
		String sql="select * from emp where job=? ";
		Connection connection = util.getConnection();
		ResultSet rs = util.executeQuery(connection, sql,job);
		
		Emp emp = null;
		String ename;
		Integer empno;		
		String gender;
		String dname;		
		String emply;
		String status;
		Integer tel;
		String email;
		
		while(rs.next()) {
			empno = rs.getInt("empno");
			ename = rs.getString("ename");
			gender = rs.getString("gender");
			dname = rs.getString("dname");
			job = rs.getString("job");
			emply = rs.getString("emply");
			status = rs.getString("status");
			tel = rs.getInt("tel");
			email = rs.getString("email");
			
			emp = new Emp(empno,ename,gender,dname,job,emply,status,tel,email);
		
		}
		util.closeConnection(connection);		
		return emp;
	}
	@Override
	public Emp getById(Integer empno) throws Exception {
		String sql="select * from emp where empno=? ";
		Connection connection = util.getConnection();
		ResultSet rs = util.executeQuery(connection, sql,empno);
		
		Emp emp = null;
		String ename;
		String job;	
		String gender;
		String dname;		
		String emply;
		String status;
		Integer tel;
		String email;
		while(rs.next()) {
			empno = rs.getInt("empno");
			ename = rs.getString("ename");
			gender = rs.getString("gender");
			dname = rs.getString("dname");
			job = rs.getString("job");
			emply = rs.getString("emply");
			status = rs.getString("status");
			tel = rs.getInt("tel");
			email = rs.getString("email");
			
			emp = new Emp(empno,ename,gender,dname,job,emply,status,tel,email);
		
		}
		util.closeConnection(connection);		
		return emp;
	}

	@Override
	public Emp getByDept(String dname) throws Exception {
		String sql="select * from emp where dname=? ";
		Connection connection = util.getConnection();
		ResultSet rs = util.executeQuery(connection, sql,dname);
		
		Emp emp = null;
		String ename;
		Integer empno;		
		String gender;
		String job;	
		String emply;
		String status;
		Integer tel;
		String email;
		while(rs.next()) {
			empno = rs.getInt("empno");
			ename = rs.getString("ename");
			gender = rs.getString("gender");
			dname = rs.getString("dname");
			job = rs.getString("job");
			emply = rs.getString("emply");
			status = rs.getString("status");
			tel = rs.getInt("tel");
			email = rs.getString("email");
			
			
			emp = new Emp(empno,ename,gender,dname,job,emply,status,tel,email);
		
		}
		util.closeConnection(connection);		
		return emp;
	}
	@Override
	public List<Emp> getAll() throws Exception {
		String sql="select * from emp ";
		Connection connection = util.getConnection();
		ResultSet rs = util.executeQuery(connection, sql);
		List<Emp> list = new ArrayList<>();
		Emp emp = null;
		
		Integer empno;
		String ename;
		String gender;
		String dname;
		String job;
		String emply;
		String status;
		Integer tel;
		String email;
		
		while(rs.next()) {
			empno = rs.getInt("empno");
			ename = rs.getString("ename");
			gender = rs.getString("gender");
			dname = rs.getString("dname");
			job = rs.getString("job");
			emply = rs.getString("emply");
			status = rs.getString("status");
			tel = rs.getInt("tel");
			email = rs.getString("email");
			
			emp = new Emp(empno,ename,gender,dname,job,emply,status,tel,email);
		  list.add(emp);
		}
		util.closeConnection(connection);		
		return list;
	}

}

















