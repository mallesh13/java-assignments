package com.capgemini.bankappjdbc.aspects;

import org.springframework.stereotype.*;
import org.apache.log4j.*;
import org.aspectj.lang.annotation.*;

@Component
@Aspect

public class LoggingAspects{

	private Logger logger = Logger.getLogger(LoggingAspects.class);
	
	@After("excution(* com.capgemini.bankappjdbc.*)")
	public void log(){
				
		logger.info("Account Created Successfully..!!");
	}
	
}