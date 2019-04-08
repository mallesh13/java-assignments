package com.capgemini.spring.organization.test;

import com.capgemini.spring.organization.*;
import org.springframework.context.*;
import org.springframework.context.support.*;

class Test{

	public static void main(String a[]){
	
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		//Properties properties = new properties("db.properties");
		Organization organization =(Organization) context.getBean("details");
		System.out.println("welcome");
		System.out.println(organization.toString());
	}

}