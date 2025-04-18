package com.ravi.selenium;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitAndExplicit_Waits 
{

			public static void main(String[] args)
			{
				WebDriver driver = new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
				driver.manage().window().maximize();
				
				String[] itemsNeeded = {"Brocolli","Beetroot","Cucumber","Mushroom"};
				driver.get("https://rahulshettyacademy.com/seleniumPractise/");
				addItems(driver,itemsNeeded);
				
			}
public static void  addItems(WebDriver driver, String[] itemsNeeded)
{
	int j = 0;
	List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));
	
	for(int i=0; i<products.size(); i++)
	{

		
		String[] name = products.get(i).getText().split("-");
		String formattedName = name[0].trim();

		
		List<String> iteamsNeededLIST = Arrays.asList(itemsNeeded);
		
		if(iteamsNeededLIST.contains(formattedName))
		{
			driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
			j++;
			
			if(j==itemsNeeded.length)
			{
				break;
			}
		}
	}
}
}