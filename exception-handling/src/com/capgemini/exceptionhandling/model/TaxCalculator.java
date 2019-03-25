package com.capgemini.exceptionhandling.model;

import com.capgemini.exceptionhandling.exceptions.CountryNotValidException;
import com.capgemini.exceptionhandling.exceptions.EmployeeNameInvalidException;
import com.capgemini.exceptionhandling.exceptions.TaxNotEligibleException;

public class TaxCalculator {

	private String employeeName;
	private double employeeSalary;
	private boolean employeeIsIndian;
	public TaxCalculator() {
		super();
	
	}
	public TaxCalculator(String employeeName, double employeeSalary, boolean employeeIsIndian) {
		super();
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
		this.employeeIsIndian = employeeIsIndian;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public double getEmployeeSalary() {
		return employeeSalary;
	}
	public void setEmployeeSalary(double employeeSalary) {
		this.employeeSalary = employeeSalary;
	}
	public boolean isEmployeeIsIndian() {
		return employeeIsIndian;
	}
	public void setEmployeeIsIndian(boolean employeeIsIndian) {
		this.employeeIsIndian = employeeIsIndian;
	}
	
	
	public double calculateTax() throws CountryNotValidException, EmployeeNameInvalidException, TaxNotEligibleException {
		if(!employeeIsIndian)
			throw new CountryNotValidException("the employee should ba an indian citizen to calculating tax");
		if(employeeName==null || employeeName=="")
			throw new EmployeeNameInvalidException("employee name cannot be empty");
		double taxAmount;
		if(employeeIsIndian && employeeSalary > 100000)
			taxAmount=employeeSalary*0.08;
		else if(employeeIsIndian && employeeSalary <= 100000 && employeeSalary >= 50000)
			taxAmount=employeeSalary*0.06;
		else if(employeeIsIndian && employeeSalary < 50000 && employeeSalary >= 30000)
			taxAmount=employeeSalary*0.05;
		else if(employeeIsIndian && employeeSalary < 30000 && employeeSalary >= 10000)
			taxAmount=employeeSalary*0.04;
		else
			throw new TaxNotEligibleException("The employee does not need to pay tax");
		return taxAmount;
	}
	
}
