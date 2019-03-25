package com.capgemini.inheritanceassignment.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.inheritanceassignment.model.Employee;
import com.capgemini.inheritanceassignment.model.Manager;

class ManagerTest {
	
	Employee manager;
	@BeforeEach
	public void setUp() {
		manager =new Manager(1001, "john", 30000, 3000);
	}
	
	@Test
	public void testManagerGrossSalary() {
		
		assertEquals(55200, manager.grossSalary());
	}

	@Test
	public void testManagerNetSalary() {
		assertEquals(51400,manager.netSalary());
	}
}
