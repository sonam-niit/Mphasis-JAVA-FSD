package com.selenium.demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo1 {

	public static void main(String[] args) {
		
		//set property for webdriver
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		String baseUrl="https://www.google.co.in/";
		String expected="Google";
		//launch googlechrome and direct it to baseURL
		driver.get(baseUrl);
		//get Actual Title
		String actual= driver.getTitle();
		
		if(expected.equals(actual))
			System.out.println("Test Passed..!!");
		else
			System.out.println("Test Failed");
		
		driver.close();
		
	}
}
