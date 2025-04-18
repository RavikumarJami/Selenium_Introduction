package com.ravi.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7Practise {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/#");
		Thread.sleep(3000);
		WebElement table = driver.findElement(By.xpath("//table[@name='courses']"));
		System.out.println("this is the Tabel Row Count  " + table.findElements(By.tagName("tr")).size());
//System.out.println("this is the tabel column count  " + table.findElements(By.tagName("th")).size());
//we can also write the below format..... above aAND below will give same O/P
		System.out.println("this is the tabel column count  "
				+ table.findElements(By.tagName("tr")).get(0).findElements(By.tagName("th")).size());
		List<WebElement> list = table.findElements(By.tagName("tr")).get(2).findElements(By.tagName(("td")));
		System.out.print(" " + list.get(0).getText());
		System.out.print(" " + list.get(1).getText());
		System.out.print(" " + list.get(2).getText());

	}

}
