package com.capgemini.mockitodemo.demo;

import com.capgemini.mockitodemo.service.CalculatorService;

public class MathApplication {
	
	private CalculatorService service;

	public MathApplication(CalculatorService service) {
		this.service = service;
	}
	
	public int performAddition(int number1,int number2) {
		return service.addition(number1, number2);
	}

	public int performSubtraction(int number1,int number2) {
		return service.subtraction(number1, number2);
	}

	public int performMultipliacation(int number1,int number2) {
		return service.multiplication(number1, number2);
	}

	public int performDivision(int number1,int number2) {
		return service.division(number1, number2);
	}
	
	public long findFactorial(int number) {
		return service.factorial(number);
	}
	public long findSqure(int number) {
		return service.square(number);
	}
	
	
	
}
