package com.capgemini.spring.provider;

class HelloWorldMessageProvider implements MessageProvider{

	@Override
	public String getMessage(){
		
		return "Hello World";
	}

}