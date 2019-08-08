package com.neu.dao;

import java.util.List;

import com.neu.entity.Dept;
import com.neu.entity.JobInfo;

public interface JobInfoDao {
	List<JobInfo> getAll() throws Exception;

	int delete(int jobno) throws Exception;

	JobInfo getById(Integer jobno) throws Exception;

	JobInfo getByType(String jtype) throws Exception;

	int update(JobInfo  jobinfo) throws Exception;

	int insert(JobInfo jobinfo) throws Exception;
}
