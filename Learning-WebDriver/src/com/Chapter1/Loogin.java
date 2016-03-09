package com.Chapter1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Loogin {
	
	public static void main(String args[]) throws InterruptedException
	{
		//Creating the Firefox Driver
		WebDriver driver=new FirefoxDriver();
		//Opening the Gmail.com URL in firefox
		driver.get("http://gmail.com");
		Thread.sleep(5000);
		//Entering the gmail id into the user id filed
		driver.findElement(By.id("Email")).sendKeys("laxmikanthm988@gmail.com");
		Thread.sleep(5000);
		//clicking on the next button
		driver.findElement(By.id("next")).click();
		Thread.sleep(5000);
		//Entering the password for the respected gmail id
		driver.findElement(By.id("Passwd")).sendKeys("mlk@Laxmikanth988");
		Thread.sleep(5000);
		//clicking on SignIn button
		driver.findElement(By.id("signIn")).click();
		Thread.sleep(5000);
		//Closing the browser or respected tab
		driver.close();
	}
}
