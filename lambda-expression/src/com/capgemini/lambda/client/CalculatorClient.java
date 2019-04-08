package com.capgemini.lambda.client;

import com.capgemini.lambda.model.Calculator;

public class CalculatorClient {

	public static void main(String[] args) {
		Calculator c = (x, y) -> x + y;
		System.out.println(c.calculate(10, 20));
	}

}
