package com.capgemini.spring.organization.test;

import com.capgemini.spring.organization.*;
import org.springframework.context.*;
import org.springframework.context.support.*;
import com.capgemini.spring.organization.config.*;
class Test{

	public static void main(String a[]){
	
		ApplicationContext context = new ClassPathXmlApplicationContext(OrganizationConfig.class);
		//Properties properties = new properties("db.properties");
		Organization organization =context.getBean(Organization.class) ;
		System.out.println("welcome");
		System.out.println(organization.toString());
	}

}