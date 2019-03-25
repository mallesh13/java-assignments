package com.capgemini.inheritanceassignment.test;

import static org.junit.Assert.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.inheritanceassignment.model.Employee;

class EmployeeTest {

	Employee employee;

	@BeforeEach
	public void setUp() {
		employee = new Employee(10001, "Mahadev", 25000, 1200);
	}

	@Test
	public void testEmployeeObjectCreatedWithDefaultContructor() {
		Employee employee = new Employee();
		assertNotNull(employee);
	}

	@Test
	public void testEmployeeObjectCreatedWitParameterizedContructor() {
		Employee employee = new Employee(10001, "Mahadev", 25000, 1200);
		assertNotNull(employee);
		assertEquals(10001, employee.getEmployeeId());
		assertEquals("Mahadev", employee.getEmployeeName());
		assertEquals(25000, employee.getBasicSalary(), 0.02);
		assertEquals(1200, employee.getMedical(), 0.02);
	}

	@Test
	public void testEmployeeGrossSalary() {
		assertEquals(38700, employee.grossSalary(), 0.02);
	}

	@Test
	public void testEmployeeNetSalary() {
		assertEquals(35500, employee.netSalary(), 0.001);
	}

}
