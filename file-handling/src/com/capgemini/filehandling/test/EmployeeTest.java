package com.capgemini.filehandling.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.junit.Test;

import com.capgemini.filehandling.model.Employee;
import com.capgemini.filehandling.model.EmployeeDeserialization;
import com.capgemini.filehandling.model.EmployeeSerialization;

public class EmployeeTest {
	private Employee employee;
	private EmployeeSerialization employeeSerialization;
	private EmployeeDeserialization employeeDeserialization;
	
	@Test
	public void testEmployeeSerialization() throws IOException {
		employee= new Employee(1010, "clary", 12300);
		employeeSerialization=new EmployeeSerialization();
		assertTrue(employeeSerialization.writeObjectInFile("employee.ser", employee));
		
	}
	
	@Test
	public void testEmployeeDeserialization() throws IOException, ClassNotFoundException {
		employee= new Employee(1010, "clary", 12300);
		employeeDeserialization=new EmployeeDeserialization();
		assertEquals(employee, employeeDeserialization.deSerialize("employee.ser"));
		
		
	}
}
