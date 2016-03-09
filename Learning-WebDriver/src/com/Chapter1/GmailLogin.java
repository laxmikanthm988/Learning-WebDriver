package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailLogin {
	public static void main(String args[]) throws InterruptedException
	{
		/*//Creating the Firefox WebDriver
		WebDriver driver=new FirefoxDriver();*/
		//Creating Chrome WebDriver
		System.setProperty("webdriver.chrome.driver","E:\\Laxmikanth\\Workspace\\Selenium WebDriver Packages\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		try{
			//Opening Gmail Page
			driver.get("http://gmail.com");
			//Login into the my account
			driver.findElement(By.id("Email")).sendKeys("laxmikanthm988");
			driver.findElement(By.id("next")).click();
			Thread.sleep(5000);
			driver.findElement(By.id("Passwd")).sendKeys("mlk@Laxmikanth988");
			driver.findElement(By.id("signIn")).click();
//			//composing a mail and send it to me
//			Thread.sleep(10000);
//			driver.findElement(By.className("gb_Za gbii")).click();
//			//logging out from the account
			
		}
		finally
		{
			System.out.println(driver.getTitle());
			//closing the browser
			driver.close();
		}
	}
}
