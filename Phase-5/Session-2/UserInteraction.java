package com.selenium.session2;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class UserInteraction {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://m.facebook.com/");
		
		WebElement name= driver.findElement(By.id("m_login_email"));
		
		Actions builder= new Actions(driver);
		Action myAction= builder.moveToElement(name)
				.click()
				.keyDown(name,Keys.SHIFT)
				.sendKeys(name,"sonam")
				.keyUp(name,Keys.SHIFT)
				.doubleClick(name)
				.contextClick()
				.build();
		
		myAction.perform();

	}

}
