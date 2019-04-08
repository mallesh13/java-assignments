package com.capgemini.mockitodemo.test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.when;

import java.util.InputMismatchException;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

import com.capgemini.mockitodemo.demo.MathApplication;
import com.capgemini.mockitodemo.service.CalculatorService;

@RunWith(MockitoJUnitRunner.class)
public class MathApplicationTest {

	@Mock
	private CalculatorService service;

	@InjectMocks
	MathApplication application = new MathApplication(service);

	@Before
	public void setUp() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testPerformAdditionOfTwoPositiveIntegers() {
		when(service.addition(7, 3)).thenReturn(10);
		assertEquals(10, application.performAddition(7, 3));
	}

	@Test
	public void testPerformAdditionOfOnePositiveOneNegativeInteger() {
		when(service.addition(-7, 3)).thenReturn(-4);
		assertEquals(-4, application.performAddition(-7, 3));
	}

	@Test
	public void testPerformAdditionOfTwoNegativeInteger() {
		when(service.addition(-5, -3)).thenReturn(-8);
		assertEquals(-8, application.performAddition(-5, -3));
	}

	@Test
	public void testPerformSubtractionOfTwoPositiveIntegers() {
		when(service.subtraction(7, 3)).thenReturn(4);
		assertEquals(4, application.performSubtraction(7, 3));
	}

	@Test
	public void testPerformSubtractionOfOnePositiveOneNegativeInteger() {
		when(service.subtraction(-7, 3)).thenReturn(-10);
		assertEquals(-10, application.performSubtraction(-7, 3));
	}

	@Test
	public void testPerformSubtractionOfTwoNegativeInteger() {
		when(service.subtraction(-5, -3)).thenReturn(-2);
		assertEquals(-2, application.performSubtraction(-5, -3));
	}

	@Test
	public void testPerformMultiplicationOfTwoPositiveIntegers() {
		when(service.multiplication(5, 3)).thenReturn(15);
		assertEquals(15, application.performMultipliacation(5, 3));
	}

	@Test
	public void testPerformMultiplicationOfOnePositiveOneNegativeInteger() {
		when(service.multiplication(-8, 3)).thenReturn(-24);
		assertEquals(-24, application.performMultipliacation(-8, 3));
	}

	@Test
	public void testPerformMultiplicationOfTwoNegativeInteger() {
		when(service.multiplication(-4, -6)).thenReturn(24);
		assertEquals(24, application.performMultipliacation(-4, -6));
	}

	@Test
	public void testPerformDivisionWithInteger() {
		when(service.division(6, 2)).thenReturn(3);
		assertEquals(3, application.performDivision(6, 2));
	}
	@Test(expected = ArithmeticException.class)
	public void testPerformDivisionWithDivisorZero() {
		doThrow(new ArithmeticException("/ by zero")).when(service).division(10, 0);
		application.performDivision(10, 0);
	}
	
	@Test
	public void testFindFactorialInteger() {
		when(service.factorial(5)).thenReturn(120L);
		assertEquals(120, application.findFactorial(5));
	}
	@Test
	public void testFindFactorialWithZero() {
		when(service.factorial(0)).thenReturn(1L);
		assertEquals(1, application.findFactorial(0));
	}
	@Test(expected=InputMismatchException.class)
	public void testFindFactorialNegativeInteger() {
		doThrow(new InputMismatchException("enter valid number")).when(service).factorial(-5);
		application.findFactorial(-5);
	}
	
	@Test
	public void testPerformSquareWithInteger() {
		when(service.square(8)).thenReturn(64L);
		assertEquals(64, application.findSqure(8));
	}
	@Test
	public void testPerformSquareWithNegativeInteger() {
		when(service.square(-8)).thenReturn(64L);
		assertEquals(64, application.findSqure(-8));
	}
	@Test
	public void testPerformSquareWithZero() {
		when(service.square(0)).thenReturn(1L);
		assertEquals(1, application.findSqure(0));
	}
	
}
