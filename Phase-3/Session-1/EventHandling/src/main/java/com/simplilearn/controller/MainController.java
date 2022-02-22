package com.simplilearn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.simplilearn.custom.CustomEventpublisher;

@Controller
public class MainController {

	@Autowired
	ConfigurableApplicationContext appContext;
	@Autowired
	CustomEventpublisher cep;
	@GetMapping("/handleevent")
	public String handleEvent(ModelMap map)
	{
		appContext.start();
		appContext.stop();
		return "handleEvent";
	}
	
	@GetMapping("/customevent")
	public String customEvent(ModelMap map)
	{
		cep.publish();
		cep.publish();
		
		return "customEvent";
		
	}
	
	
}
