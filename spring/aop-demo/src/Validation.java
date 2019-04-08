package com.capgemini.spring.mathvalidation;

import org.springframework.stereotype.*;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.*;

@Component
@Aspect
public class Validation{

	@Before("execution(* com.capgemini.spring.math.impl.CalculatorImpl.division(..))")
	public void disp(){
		System.out.println("validation done..!");
	}
	//@After("execution(* com.capgemini.spring.math.impl.CalculatorImpl.division(..))")
	/*@Around("execution(* com.capgemini.spring.math.impl.CalculatorImpl.division(..))")
	public void valid(ProceedingJoinPoint pjp) throws Throwable{
		
		Object[] args = pjp.getArgs();
		double secondArg = Double.parseDouble(args[1].toString());
		if(secondArg > 0){
			System.out.println("validation done..!");
			pjp.proceed();
		}
		else
			System.out.println("divisor not zero");
	}*/

}
