package com.selenium.session2;

import java.util.ArrayList;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabExample {

	public static void main(String[] args) throws InterruptedException{
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.co.in/");
		
		JavascriptExecutor je= (JavascriptExecutor)driver;
		je.executeScript("window.open('https://m.facebook.com/','_blank')");
		
		ArrayList<String> tabs= new ArrayList<String>(driver.getWindowHandles());
		//switch
		driver.switchTo().window(tabs.get(1));
		
		Thread.sleep(5000);
		
		
		driver.switchTo().window(tabs.get(0));
	}
}
