package com.capgemini.lambda.model;

import java.util.Objects;

public class Employee {
	
	private String employeeName;
	private int employeeId;
	private String employeeDepartment;
	private double employeeSlary;
	public Employee() {
		super();
	
	}
	
	public Employee(String employeeName, int employeeId, String employeeDepartment, double employeeSlary) {
		super();
		this.employeeName = employeeName;
		this.employeeId = employeeId;
		this.employeeDepartment = employeeDepartment;
		this.employeeSlary = employeeSlary;
	}

	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeDepartment() {
		return employeeDepartment;
	}
	public void setEmployeeDepartment(String employeeDepartment) {
		this.employeeDepartment = employeeDepartment;
	}
	public double getEmployeeSlary() {
		return employeeSlary;
	}
	public void setEmployeeSlary(double employeeSlary) {
		this.employeeSlary = employeeSlary;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(employeeId,employeeName);
	}
	
	@Override
	public boolean equals(Object obj) {
		
		if(obj==null)
			return false;
		if(!(obj instanceof Employee))
			return false;
		if(this==obj)
			return true;
		Employee employee=(Employee) obj;
		if(this.employeeId==employee.employeeId && this.employeeName.equals(employee.employeeName))
			return true;
		else
			return false;
		
	}
	@Override
	public String toString() {
		return "Employee [employeeName=" + employeeName + ", employeeId=" + employeeId + ", employeeDepartment="
				+ employeeDepartment + ", employeeSlary=" + employeeSlary + "]";
	}
	
	
	
	
}
