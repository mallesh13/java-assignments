package com.capgemini.spring.math.client;

import com.capgemini.spring.mathvalidation.*;
import com.capgemini.spring.math.impl.*;
import com.capgemini.spring.math.*;
import org.springframework.context.*;
import org.springframework.context.support.*;

public class Main{

	public static void main(String args[]) throws Exception {

		ApplicationContext context = new ClassPathXmlApplicationContext("bankbeans.xml");
		Calculator calculator = context.getBean(Calculator.class);
		calculator.division(10.0,0.0);
		
	}

}