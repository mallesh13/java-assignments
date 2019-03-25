package com.capgemini.inheritanceassignment.model;

public class MarketingExecutive extends Employee {

	
	private double kilometersTravelled;
	private double tourAllowance;
	private static final double telephoneAllowance=1500;
	
	public MarketingExecutive() {
		super();
	}

	public MarketingExecutive(int employeeId, String employeeName, double basicSalary, double medical,double kilometersTravelled) {
		super(employeeId, employeeName, basicSalary, medical);
		this.kilometersTravelled=kilometersTravelled;	
	}
	@Override
	public double grossSalary() {
		tourAllowance=kilometersTravelled*5;
		return super.grossSalary()+telephoneAllowance+tourAllowance;
		
	}
	 
	public double netSalary() {
		return super.netSalary();
	}
}
