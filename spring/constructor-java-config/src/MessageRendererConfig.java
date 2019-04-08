package com.capgemini.spring.renderer;

import org.springframework.context.annotation.*;
import com.capgemini.spring.renderer.MessageRenderer;
import com.capgemini.spring.provider.*;

@Configuration
 public class MessageRendererConfig{
	@Bean
	public MessageProvider provider(){
		return new GoodMorningMessageProvider();
	}
	
	@Bean
	public MessageProvider provider1(){
		return new HelloWorldMessageProvider();
	}

	@Bean
	public MessageRenderer Config(){
		MessageRenderer render =  new MessageRenderer(provider());
		
		return render;
	}
}