package com.capgemini.spring.renderer;

import com.capgemini.spring.provider.MessageProvider;

public class MessageRenderer{

	private MessageProvider provider;
	
	//Constructor injuction using Xml
	public MessageRenderer(MessageProvider provider){
	
		this.provider=provider;
	}
	
	
	public void render(){
		System.out.println(provider.getMessage());
	}
}