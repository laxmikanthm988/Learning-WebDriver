package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocationStrategies {
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("http://www.absofttrainings.com/selenium-training-free-videos/");
		Thread.sleep(10000);
		System.out.println(driver.findElement(By.xpath("//table[@class='FreeVideosPGTable CoursePGChapTables ']/tbody/tr[3]/td[2]/strong")).getText());
		driver.close();
	/*
		//Creating the FireFox Driver
		WebDriver driver=new FirefoxDriver();
		//Opening the Indeed WebSite
		driver.get("http://indeed.co.in");
		//Finding What field And Entering Selenium in it
		driver.findElement(By.name("q")).sendKeys("Selenium");
		//Findning Where field and entering Hyderabad in it
		driver.findElement(By.id("where")).clear();
		driver.findElement(By.id("where")).sendKeys("Hyderabad, Andhra Pradesh");
		//Finding Find Jobs button and clicking it
		driver.findElement(By.id("fj")).click();;
		//Finding Find Jobs link an clicking on it
		driver.findElement(By.linkText("Find Jobs")).click();
		//Closing the Browser
		driver.close();		
		System.out.println("Done");*/
	}
}
d