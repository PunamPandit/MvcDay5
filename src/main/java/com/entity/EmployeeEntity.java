package com.entity;


public class EmployeeEntity {
	
	private int employeeId;
	private String employeename;
	private int salary;
	private String emailId;
	private String password;
	public EmployeeEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmployeeEntity(int employeeId, String employeename, int salary, String emailId, String password) {
		super();
		this.employeeId = employeeId;
		this.employeename = employeename;
		this.salary = salary;
		this.emailId = emailId;
		this.password = password;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeename() {
		return employeename;
	}
	public void setEmployeename(String employeename) {
		this.employeename = employeename;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "EmployeeEntity [employeeId=" + employeeId + ", employeename=" + employeename + ", salary=" + salary
				+ ", emailId=" + emailId + ", password=" + password + "]";
	}
	

}
