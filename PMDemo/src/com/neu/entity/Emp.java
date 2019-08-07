package com.neu.entity;

public class Emp {
	private Integer empno;
	private String ename;
	private String gender;
	private String dname;
	private String job;
	private String emply;
	private String status;
	private Integer tel;
	private String email;
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Emp(Integer empno, String ename, String gender, String dname, String job, String emply, String status,
			Integer tel, String email) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.gender = gender;
		this.dname = dname;
		this.job = job;
		this.emply = emply;
		this.status = status;
		this.tel = tel;
		this.email = email;
	}
	@Override
	public String toString() {
		return "Emp [empno=" + empno + ", ename=" + ename + ", gender=" + gender + ", dname=" + dname + ", job=" + job
				+ ", emply=" + emply + ", status=" + status + ", tel=" + tel + ", email=" + email + "]";
	}
	public Integer getEmpno() {
		return empno;
	}
	public void setEmpno(Integer empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	public String getEmply() {
		return emply;
	}
	public void setEmply(String emply) {
		this.emply = emply;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Integer getTel() {
		return tel;
	}
	public void setTel(Integer tel) {
		this.tel = tel;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Emp(Integer empno, String gender, String dname, String job, String emply, String status,
			Integer tel, String email, String ename) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.gender = gender;
		this.dname = dname;
		this.job = job;
		this.emply = emply;
		this.status = status;
		this.tel = tel;
		this.email = email;
	}
	
	
	
	
}	