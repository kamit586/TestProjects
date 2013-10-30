package com.sunrays.hibernate.merge;

public class StudentDTO {
	private Integer rollNo;
	private String name;
	private Integer java;
	private Integer jsp;
	private Integer servlet;

	public Integer getRollNo() {
		return rollNo;
	}

	public void setRollNo(Integer rollNo) {
		this.rollNo = rollNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getJava() {
		return java;
	}

	public void setJava(Integer java) {
		this.java = java;
	}

	public Integer getJsp() {
		return jsp;
	}

	public void setJsp(Integer jsp) {
		this.jsp = jsp;
	}

	public Integer getServlet() {
		return servlet;
	}

	public void setServlet(Integer servlet) {
		this.servlet = servlet;
	}
}
