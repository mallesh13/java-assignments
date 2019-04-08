package com.capgemini.lambda.client;

import java.util.TreeSet;

import com.capgemini.lambda.model.Employee;

public class EmployeeClient {
	public static void main(String[] args) {

		TreeSet<Employee> employees=new TreeSet<Employee>((emp1,emp2)->Integer.compare(emp1.getEmployeeId(), emp2.getEmployeeId()));
//		
//		TreeSet<Employee> employees = new TreeSet<>(new Comparator<Employee>() {
//
//			@Override
//			public int compare(Employee emp1, Employee emp2) {
//
//				return Integer.compare(emp1.getEmployeeId(), emp2.getEmployeeId());
//			}
//		});
		employees.add(new Employee("adam", 1000, "Accounts", 35000));
		employees.add(new Employee("alex", 1004, "HR", 55000));
		employees.add(new Employee("Grant", 1002, "HR", 45000));
		employees.add(new Employee("bob", 1003, "Accounts", 50000));
		System.out.println(employees);
	}
}
