package com.selenium.demo;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

public class FluentWaitDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.get("https://softwaretestingplace.blogspot.com/2017/02/selenium-fluent-wait.html");
		
		driver.findElement(By.xpath("//*[@id=\"post-body-5280210221385817166\"]/div[1]/button")).click();
		
		FluentWait<WebDriver> wait= new FluentWait<WebDriver>(driver)
				.withTimeout(30, TimeUnit.SECONDS)
				.pollingEvery(5, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class);
		
		WebElement element= wait.until(new Function<WebDriver, WebElement>() {

			@Override
			public WebElement apply(WebDriver d) {
				WebElement ele= driver.findElement(By.xpath("//*[@id=\"demo\"]"));
				String getTextonPage= ele.getText();
				
				if(getTextonPage.equals("Software Testing Material - DEMO PAGE"))
				{
					System.out.println(getTextonPage);
					return ele;
				}
				else
				{
					System.out.println("Fluent wait failed");
					return null;
				}
			}
		});
	}
}
