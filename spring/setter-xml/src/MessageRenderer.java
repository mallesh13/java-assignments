package com.capgemini.spring.renderer;

import com.capgemini.spring.provider.MessageProvider;

public class MessageRenderer{

	private MessageProvider provider;
	
	//setter injuction using xml
	public void setMessageProvider(MessageProvider provider){
		this.provider=provider;
	
	}
	
	//Constructor injuction using Xml
	public MessageRenderer(MessageProvider provider){
	
		this.provider=provider;
	}
	
	//setter injuction using @annotaion
	
	public void render(){
		System.out.println(provider.getMessage());
	}
}