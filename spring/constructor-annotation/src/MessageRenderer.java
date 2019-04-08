package com.capgemini.spring.renderer;

import com.capgemini.spring.provider.MessageProvider;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

@Component
public class MessageRenderer{

	private MessageProvider provider;
	
	@Autowired
	
	public MessageRenderer(MessageProvider provider){
		this.provider=provider;
	}
	
	public void render(){
		System.out.println(provider.getMessage());
	}
}