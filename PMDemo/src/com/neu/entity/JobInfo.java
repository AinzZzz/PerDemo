package com.neu.entity;

public class JobInfo {
	private Integer jobno;
	private String job;
	private String jtype;
	private String weave;
	public JobInfo() {
		super();
		// TODO Auto-generated constructor stub
	}
	public JobInfo(Integer jobno, String job, String jtype, String weave) {
		super();
		this.jobno = jobno;
		this.job = job;
		this.jtype = jtype;
		this.weave = weave;
	}
	public Integer getJobno() {
		return jobno;
	}
	public void setJobno(Integer jobno) {
		this.jobno = jobno;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getJtype() {
		return jtype;
	}
	public void setJtype(String jtype) {
		this.jtype = jtype;
	}
	public String getWeave() {
		return weave;
	}
	public void setWeave(String weave) {
		this.weave = weave;
	}
	@Override
	public String toString() {
		return "JobInfo [jobno=" + jobno + ", job=" + job + ", jtype=" + jtype + ", weave=" + weave + "]";
	}
	
	
}
