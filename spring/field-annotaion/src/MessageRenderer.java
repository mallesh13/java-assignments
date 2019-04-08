package com.capgemini.spring.renderer;

import com.capgemini.spring.provider.MessageProvider;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

@Component
public class MessageRenderer{
	
	@Autowired
	//@Qualifier("goodMorningMessageProvider")
	@Qualifier("helloWorldMessageProvider")
	private MessageProvider provider;
	
	public void render(){
		System.out.println(provider.getMessage());
	}
}