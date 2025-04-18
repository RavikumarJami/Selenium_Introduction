package com.ravi.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumLocators {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/locatorspractice");
		driver.findElement(By.id("inputUsername")).sendKeys("Kumar");
		driver.findElement(By.name("inputPassword")).sendKeys("9100");
		driver.findElement(By.className("signInBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Ravi");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("ravi674.jr@gmail.com");
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("9100505828");
		driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
		System.out.println(driver.findElement(By.xpath("//p[@class='infoMsg']")).getText());
		driver.findElement(By.className("go-to-login-btn")).click();
		driver.findElement(By.cssSelector("input#inputUsername")).sendKeys("Jami_Ravikumar");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.id("chkboxOne")).click();
		driver.findElement(By.cssSelector("input[id='chkboxTwo']")).click();
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click();
		
		
	}

}
