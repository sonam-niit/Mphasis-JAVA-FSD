package com.simplilearn.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.simplilearn.custom.ProductNotFoundException;

@RestController
public class MainController {

	@GetMapping(value = "/test")
	public String test()
	{
		return "Hello World";
	}
	
	@GetMapping(value = "/testproducts/{id}")
	public String getProduct(@PathVariable("id") String id)
	{
		if(id.contentEquals("0"))
		{
			throw new ProductNotFoundException();
		}
		else
		{
			return "Product Found";
		}
	}
}
