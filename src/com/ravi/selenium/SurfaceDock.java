package com.ravi.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SurfaceDock {

	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.microsoft.com/en-us/d/surface-dock-2/8qd908364sg2?activetab=pivot:overviewtab");
		
		// String s =
		// driver.findElement(By.xpath("//img[@data-automation-test-id='buy-box-product-image']")).getDomAttribute("alt");
		// System.out.println(s);
		driver.findElement(By.id("emailSup-modal"));
		driver.findElement(By.cssSelector("button[data-bi-bhvr='1234']")).click();
		driver.findElement(By.xpath("//button[@data-target='#buy-box-product-image-gallery']")).click();

	//System.out.println(driver.findElement(By.cssSelector("img:nth-child(4)")).getDomAttribute("alt"));
	System.out.println(driver.findElement(By.xpath("//div/img[3]")).getDomAttribute("alt"));
	driver.findElement(By.xpath("//button[@data-automation-test-id='buy-box-product-image-gallery-modal-button']")).click();
	
		//driver.findElement(By.partialLinkText("2 for Business")).click();

	}

}
