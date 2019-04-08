package com.capgemini.spring.test;

import com.capgemini.spring.provider.*;
import com.capgemini.spring.renderer.*;
import org.springframework.context.*;
import org.springframework.context.annotation.*;
import java.util.*;

class Test{

	public static void main(String args[]) throws Exception {

		ApplicationContext context = new AnnotationConfigApplicationContext(MessageRendererConfig.class);
		MessageRenderer renderer = (MessageRenderer) context.getBean(MessageRenderer.class);
		renderer.render();

		
	}

}