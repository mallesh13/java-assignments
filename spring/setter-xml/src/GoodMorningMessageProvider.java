package com.capgemini.spring.provider;

class GoodMorningMessageProvider implements MessageProvider{

	@Override
	public String getMessage(){
		
		return "Good Morning..!!";
	}

}