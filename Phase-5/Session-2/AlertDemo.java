package com.selenium.session2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {

	public static void main(String[] args) {
		String baseUrl="https://nxtgenaiacademy.com/alertandpopup/";
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get(baseUrl);
		
		WebElement alert= driver.findElement(By.name("alertbox"));
		alert.click();
		driver.switchTo().alert().accept();
		
		//confirmalertbox
		WebElement confirmalert= driver.findElement(By.name("confirmalertbox"));
		confirmalert.click();
		//driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
		
		WebElement promptalert= driver.findElement(By.name("promptalertbox1234"));
		promptalert.click();
		driver.switchTo().alert().sendKeys("Yes");
		driver.switchTo().alert().accept();
	}
}
