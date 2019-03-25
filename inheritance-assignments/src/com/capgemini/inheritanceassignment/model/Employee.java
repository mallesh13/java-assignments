package com.capgemini.inheritanceassignment.model;

public class Employee {
	
	private int employeeId;
	private String employeeName;
	private double basicSalary;
	private double hra;
	private double medical;
	private double pf;
	private double pt;
	private double netSalary;
	private double grossSalary;

	public Employee() {
		super();
	}

	public Employee(int employeeId, String employeeName, double basicSalary, double medical) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.basicSalary = basicSalary;
		this.medical = medical;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getBasicSalary() {
		return basicSalary;
	}

	public void setBasicSalary(double basicSalary) {
		this.basicSalary = basicSalary;
	}

	public double getMedical() {
		return medical;
	}

	public void setMedical(double medical) {
		this.medical = medical;
	}
	
	public double getHra() {
		return hra;
	}
		
	public void setHra(double hra) {
		this.hra = hra;
	}

	public void setPf(double pf) {
		this.pf = pf;
	}

	public void setPt(double pt) {
		this.pt = pt;
	}

	public void setNetSalary(double netSalary) {
		this.netSalary = netSalary;
	}

	public void setGrossSalary(double grossSalary) {
		this.grossSalary = grossSalary;
	}

	public double getPf() {
		return pf;
	}

	public double getPt() {
		return pt;
	}

	public double getNetSalary() {
		return netSalary;
	}

	public double getGrossSalary() {
		return grossSalary;
	}

	public double grossSalary() {
		hra = 0.50*basicSalary;
		grossSalary = basicSalary+hra+medical;
		return grossSalary;
	}
	
	public double netSalary() {
		pf=0.12*basicSalary;
		pt=200;
		netSalary = grossSalary()-(pt+pf);
		return netSalary;
	}

	
}
