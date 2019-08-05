package com.neu.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.neu.entity.Dept;

public class DeptDaoImpl implements DeptDao {
	DBUtils utils = new DBUtils();

	@Override
	public List<Dept> getAll() throws Exception {
		String sql = "select * from dept";
		Connection connection = utils.getConnection();
		ResultSet rs = utils.executeQuery(connection, sql);
		List<Dept> list = new ArrayList<>();

		Dept dept = null;
		Integer deptno;
		String dname;
		Integer tel;
		String email;
		while (rs.next()) {
			deptno = rs.getInt("deptno");
			dname = rs.getString("dname");
			tel = rs.getInt("tel");
			email = rs.getString("email");

			dept = new Dept(deptno, dname, tel, email);

			list.add(dept);
		}

		utils.closeConnection(connection);
		return list;
	}

	@Override
	public int delete(int deptno) throws Exception {
		String sql="delect dept where deptno =?";
		int n = utils.executeUpdate(sql, deptno);
		return n;
	}

	@Override
	public Dept getByName(String dname) throws Exception {
		String sql = "select * from dept where dname = ?";
		Connection connection = utils.getConnection();
		ResultSet rs = utils.executeQuery(connection, sql, dname);
		Dept dept = null;
		Integer deptno;
		String type;
		Integer tel;
		String email;
		while (rs.next()) {
			deptno = rs.getInt("deptno");
			type = rs.getString("type");
			tel = rs.getInt("tel");
			email = rs.getString("email");

			dept = new Dept(deptno, dname, type, tel, email);

		}
		return dept;
	}

	@Override
	public Dept getByType(String type) throws Exception {
		String sql = "select * from dept where type = ?";
		Connection connection = utils.getConnection();
		ResultSet rs = utils.executeQuery(connection, sql, type);
		Dept dept = null;
		Integer deptno;
		String dname;
		Integer tel;
		String email;
		while (rs.next()) {
			deptno = rs.getInt("deptno");
			dname = rs.getString("dname");
			tel = rs.getInt("tel");
			email = rs.getString("email");

			dept = new Dept(deptno, dname, type, tel, email);

		}
		return dept;
	}

	@Override
	public int update(Dept dept) throws Exception {
		String sql = "update dept set dname = ?,tel=? ,email=? where deptno = ?";
		int n = utils.executeUpdate(sql, dept);

		return n;
	}

	@Override
	public int insert(Dept dept) throws Exception {
		String sql="insert into dept values(?,?,?,?,?)";
		int n = utils.executeUpdate(sql, dept.getDeptno(),dept.getDname(),dept.getType(),dept.getTel(),dept.getEmail());
		return n;
	}

}
