package com.ravi.selenium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment6Practise 
{

	public static void main(String[] args) throws InterruptedException 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(8));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/#");
		driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).click();
	    driver.findElement(By.xpath("//input[@id='checkBoxOption2']")).click();
	    String s = driver.findElement(By.cssSelector("label[for='benz']")).getText();
		System.out.println(s);
		WebElement drop = driver.findElement(By.id("dropdown-class-example"));
		Select dropdown = new Select(drop);
		dropdown.selectByVisibleText(s);
		driver.findElement(By.cssSelector("input[name='enter-name']")).sendKeys(s);
		driver.findElement(By.id("alertbtn")).click();
		Alert alert = driver.switchTo().alert();
		String w = driver.switchTo().alert().getText();
		if(w.contains(s))
		{
			System.out.println("My Assigement is Success");
		}
		else
		{
			System.out.println("Fail");
		}
		Thread.sleep(3000);
		
		alert.accept(); 
		
	}
}
