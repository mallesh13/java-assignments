package com.capgemini.inheritanceassignment.model;

public class Manager extends Employee {

	private double petrolAllowance;
	private double foodAllowance;
	private double otherAllowance;
	
	public Manager() {
		super();
		
	}

	public Manager(int employeeId, String employeeName, double basicSalary, double medical) {
		super(employeeId, employeeName, basicSalary, medical);
	}

	@Override
	public double grossSalary() {
		petrolAllowance= 0.08*getBasicSalary();
		foodAllowance=0.13*getBasicSalary();
		otherAllowance=0.03*getBasicSalary();
		
		return (super.grossSalary()+petrolAllowance+foodAllowance+otherAllowance);
		
	}
	
	public double netSalary() {
		return super.netSalary();
	}
}
