package com.ravi.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicDropDownLecuture {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		//this is xpath for HYD: //a[@value='HYD']
		//if there are two Hyd cities from departure and arrival, then if we want to select the Hyd from Arrival dropdown
		//than the Xpath will be: (//a[@value='HYD'])[2]
		//driver.findElement(By.xpath("(//a[@value='HYD'])[2]")).click();	
		
		//in this lecture we will learn How handle dynamic dropdown without index'es
		
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='HYD']")).click();
		
				////div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='HYD'])
		
		

	}

}
