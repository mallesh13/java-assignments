package com.capgemini.spring.math.impl;

import com.capgemini.spring.math.*;
import org.springframework.stereotype.*;

@Component
public class CalculatorImpl implements Calculator{
	
	@Override
	public void division(double number1, double number2){

		System.out.println(number1/number2);
	}	

}
