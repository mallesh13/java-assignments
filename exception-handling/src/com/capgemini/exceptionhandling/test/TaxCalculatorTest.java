package com.capgemini.exceptionhandling.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import com.capgemini.exceptionhandling.exceptions.CountryNotValidException;
import com.capgemini.exceptionhandling.exceptions.EmployeeNameInvalidException;
import com.capgemini.exceptionhandling.exceptions.TaxNotEligibleException;
import com.capgemini.exceptionhandling.model.TaxCalculator;

public class TaxCalculatorTest {

		@Test(expected=CountryNotValidException.class)
		public void testEmployeeIsNotAnIndian() throws CountryNotValidException, EmployeeNameInvalidException, TaxNotEligibleException {
			TaxCalculator empoloyee=new TaxCalculator("Ron",34000,false);
			empoloyee.calculateTax();
		}
		
		@Test(expected=EmployeeNameInvalidException.class)
		public void testEmployeeNameIsEmpty() throws CountryNotValidException, EmployeeNameInvalidException, TaxNotEligibleException {
			TaxCalculator empoloyee=new TaxCalculator(null,30000,true);
			empoloyee.calculateTax();
		}
		
		@Test(expected=TaxNotEligibleException.class)
		public void testEmployeeNotEligibleForTax() throws CountryNotValidException, EmployeeNameInvalidException, TaxNotEligibleException {
			TaxCalculator empoloyee=new TaxCalculator("Tim",1000,true);
			empoloyee.calculateTax();

		}
		
		@Test
		public void testEmployeePayingTax() throws CountryNotValidException, EmployeeNameInvalidException, TaxNotEligibleException {
			TaxCalculator empoloyee=new TaxCalculator("Jack",55000,true);
			assertEquals(3300, empoloyee.calculateTax(),0.01);

		}
}