package com.capgemini.spring.test;

import com.capgemini.spring.provider.*;
import com.capgemini.spring.renderer.*;
import org.springframework.context.*;
import org.springframework.context.support.*;
import java.util.*;

class Test{

	public static void main(String args[]) throws Exception {

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		MessageRenderer renderer =  context.getBean(MessageRenderer.class);
		renderer.render();

		
	}

}