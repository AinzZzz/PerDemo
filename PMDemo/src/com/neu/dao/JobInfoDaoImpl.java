package com.neu.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.neu.entity.Dept;
import com.neu.entity.JobInfo;

public class JobInfoDaoImpl implements JobInfoDao {
	DBUtils util = new DBUtils();
	@Override
	public List<JobInfo> getAll() throws Exception {
		String sql ="select * from job_info";
		Connection connection = util.getConnection();
		ResultSet rs = util.executeQuery(connection, sql);
		List<JobInfo> list = new ArrayList<>();

		JobInfo jobinfo = null;
		Integer jobno;
		String job;
		String jtype;
		String weave;
		while (rs.next()) {
			jobno = rs.getInt("jobno");
			job = rs.getString("job");
			jtype =rs.getString("jtype");
			weave = rs.getString("weave");

			jobinfo = new JobInfo(jobno, job, jtype, weave);

			list.add(jobinfo);
		}

		util.closeConnection(connection);
		return list;
		
		
	}

	@Override
	public int delete(int jobno) throws Exception {
		String sql="delect dept where jobno =?";
		int n = util.executeUpdate(sql, jobno);
		return n;
		
	}

	@Override
	public JobInfo getByName(String job) throws Exception {
		String sql="select * from job_info where  job= ? ";
		Connection connection = util.getConnection();
		ResultSet rs = util.executeQuery(connection, sql, job);
		JobInfo jobinfo = null;
		
		Integer jobno;		
		String jtype;
		String weave;
		
		while(rs.next()) {
			jobno = rs.getInt("jobno");
			jtype = rs.getString("jtype");
			weave = rs.getString("weave");
			
			jobinfo  = new JobInfo(jobno,job,jtype,weave);
			
		}				
		util.closeConnection(connection);
		return jobinfo;
	}

	@Override
	public JobInfo getByType(String jtype) throws Exception {
		String sql="select * from job_info where  jtype =?";
		Connection connection = util.getConnection();
		ResultSet rs = util.executeQuery(connection, sql, jtype);
		
		JobInfo jobinfo = null;
		Integer jobno;
		String job;
		String weave;
		
		while(rs.next()) {
			jobno = rs.getInt("jobno");
			job = rs.getString("job");
			weave = rs.getString("weave");
			
			jobinfo = new JobInfo(jobno,job,jtype,weave);
			
		}
		util.closeConnection(connection);
		return jobinfo;
	}

	@Override
	public int update(JobInfo jobinfo) throws Exception {
		String sql ="update  job_info set jobno =?,jtype=?,weave=? where job= ?";
		int n = util.executeUpdate(sql, jobinfo.getJobno(),jobinfo.getJtype(),jobinfo.getWeave(),jobinfo.getJob());
		return n;
	}

	@Override
	public int insert(JobInfo jobinfo) throws Exception {
		String sql="insert into job_info value(?,?,?,?)";
		int n = util.executeUpdate(sql, jobinfo.getJobno(),jobinfo.getJob(),jobinfo.getJtype(),jobinfo.getWeave());
		return n;
	}

	
}
