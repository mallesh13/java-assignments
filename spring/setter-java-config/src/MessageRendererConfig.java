package com.capgemini.spring.renderer;

import org.springframework.context.annotation.*;
import com.capgemini.spring.renderer.MessageRenderer;
import com.capgemini.spring.provider.*;

@Configuration
 public class MessageRendererConfig{
	
	@Bean
	public MessageRenderer config(){
		MessageRenderer render =  new MessageRenderer();
		render.setMessageProvider( new GoodMorningMessageProvider());
		return render;
	}
}