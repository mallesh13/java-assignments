package com.capgemini.inheritanceassignment.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.capgemini.inheritanceassignment.model.MarketingExecutive;

class MarketingExecutiveTest {

	MarketingExecutive employee;
	@BeforeEach
	public void setUp() {
		employee = new MarketingExecutive(1010,"loha",10000,1000,30);
	}
	@Test
	public void testGrossSalaryOfMarketingExecutive() {
		assertEquals(17650,employee.grossSalary(),0.02 );
	}
	
	@Test
	public void testNetSalaryOfMarketingExcutive() {
		assertEquals(16250, employee.netSalary(),0.01);
	}
}
