package com.simplilearn;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	@GetMapping("/")
	public String test()
	{
		return "Application runnit under SSL";
	}
}
