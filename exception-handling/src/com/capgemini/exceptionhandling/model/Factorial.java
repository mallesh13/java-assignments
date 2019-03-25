package com.capgemini.exceptionhandling.model;


import com.capgemini.exceptionhandling.exceptions.FactorialException;
import com.capgemini.exceptionhandling.exceptions.InvalidInputException;

public class Factorial {

	public long getFactorial(int number) throws InvalidInputException, FactorialException {
		long result = 1;
		if (number < 2) {
			throw new InvalidInputException("number not lessthan two");
		} else {
			for (int i = number; i >= 1; --i) {

				result = result * i;
				if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
					throw new FactorialException("result is greaterthan interger value");
				}
			}

			System.out.println(result);

			return result;
		}
	}
}
