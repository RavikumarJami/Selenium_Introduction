package com.ravi.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpdatedDropDownLecuture {

	public static void main(String[] args) throws InterruptedException {
		
		//https://rahulshettyacademy.com/dropdownsPractise/
		//Here - Learned about Dropdown on Passenger tab on above URL
		//On Passenger dropdown, already One adult By default selected. How can we select 4 more adults.
		//We used While Loop
		//Also we used For Loop to tackle this challenge
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		//Handling the Checkbox
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).click();
		System.out.println(driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']")).isSelected());
		
		//Count the number of checkboxe's. 
		//( Basically we have to find out the locator which is common to all the checkboxes
		//Also we can do one thing, we check all the checkboxes, if threre any common attribute and value for all the check box then we can write CCS Selector for that
		System.out.println(driver.findElements(By.cssSelector("input=[type='checkbox']")).size());
		driver.findElement(By.id("divpaxinfo")).click();
		Thread.sleep(4000);
		System.out.println(driver.findElement(By.cssSelector("div.paxinfo")).getText());
		/*int i=1;
		while(i<5)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
			i++;
		}*/
		for(int i=1;i<5;i++)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
		}
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		System.out.println(driver.findElement(By.cssSelector("div.paxinfo")).getText());
	
		
		
		
		

	}

}
