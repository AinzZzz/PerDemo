package com.neu.entity;

public class Dept {
	private Integer deptno;
	private String dname;
	private String type;
	private Integer tel;
	private String email;
	public Dept() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Dept(Integer deptno, String dname, String type, Integer tel, String email) {
		super();
		this.deptno = deptno;
		this.dname = dname;
		this.type = type;
		this.tel = tel;
		this.email = email;
	}
	public Integer getDeptno() {
		return deptno;
	}
	public void setDeptno(Integer deptno) {
		this.deptno = deptno;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
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
	@Override
	public String toString() {
		return "Dept [deptno=" + deptno + ", dname=" + dname + ", type=" + type + ", tel=" + tel + ", email=" + email
				+ "]";
	}
	
	
		
}
