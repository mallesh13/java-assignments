package com.capgemini.exceptionhandling.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

import com.capgemini.exceptionhandling.exceptions.FactorialException;
import com.capgemini.exceptionhandling.exceptions.InvalidInputException;
import com.capgemini.exceptionhandling.model.Factorial;

public class FactorialTest {

	@Test(expected = InvalidInputException.class)
	public void testFactorialOfNumberLessthanTwo() throws InvalidInputException, FactorialException {
		Factorial fact = new Factorial();
		fact.getFactorial(0);
	}

	@Test(expected = FactorialException.class)
	public void testFactorialOfGivenNumberExceedsRange() throws FactorialException, InvalidInputException {
		Factorial fact = new Factorial();

		fact.getFactorial(15);

	}

	@Test
	public void testFactorialOfValidNumber() {
		Factorial fact = new Factorial();
		try {
			assertEquals(120, fact.getFactorial(5));
		} catch (FactorialException | InvalidInputException e) {
			e.printStackTrace();
		}
	}

}
