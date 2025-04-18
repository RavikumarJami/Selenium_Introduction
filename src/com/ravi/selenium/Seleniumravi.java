package com.ravi.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class Seleniumravi {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://www.microsoft.com/en-us/d/surface-laptop-go-3/8p0wwgj6c6l2");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
			
		
		

	}

}

