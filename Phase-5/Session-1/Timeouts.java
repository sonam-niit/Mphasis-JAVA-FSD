package com.selenium.demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Timeouts {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");

		//timeout
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		//scripted timeout
		driver.manage().timeouts().setScriptTimeout(10, TimeUnit.SECONDS);
		//page load
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.MILLISECONDS);
		
		driver.close();
	}
}
