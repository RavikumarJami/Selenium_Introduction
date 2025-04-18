package com.ravi.selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollingWebpage {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/#");
		JavascriptExecutor j = (JavascriptExecutor)driver;
		j.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);
		j.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
	List <WebElement> value = driver.findElements(By.cssSelector("td:nth-child(4)"));
	int sum =0;
	for(int i=0; i<value.size();i++)
	{
        sum = sum + Integer.parseInt(value.get(i).getText());
        
	}
	System.out.println(sum);
String s =	driver.findElement(By.cssSelector("div[class='totalAmount']")).getText();
System.out.println(s);
		

		
		
		

	}

}
