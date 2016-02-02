package com.Chapter1;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;

public class LocatingMachanism {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException 
	{
		//		Chrome();
		//		InternetExplorer();
		//		Firefox();
		byId();
		//		Test();



	}
	public static void Chrome() 
	{
		System.setProperty("webdriver.chrome.driver","D:\\Laxmikanth\\Personnal\\Softwares\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	public static void InternetExplorer() throws InterruptedException
	{
		System.setProperty("webdriver.ie.driver", "D:\\Laxmikanth\\Personnal\\Softwares\\IEDriverServer_Win32_2.49.0\\IEDriverServer.exe");
	}
	public static void Firefox() throws InterruptedException

	{
		WebDriver driver=new FirefoxDriver();
	}

	public static void byId() throws InterruptedException
	{
		Chrome();
		driver.get("https://connect-stg.cummins.com");
		/*//Clicking on the Advanced Link for Security Reasons
		WebElement lnkAdvanced=driver.findElement(By.partialLinkText("Advanced"));
		//Clicking on Proceed link
		WebElement lnkProceed=driver.findElement(By.partialLinkText("Proceed to"));
		lnkProceed.click();
		lnkAdvanced.click();*/
		//Authenticating
		WebElement userid=driver.findElement(By.id("username"));
		userid.sendKeys("nc395");
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("Dell@1234");
		WebElement btnLogin=driver.findElement(By.xpath("html/body/div[1]/div[2]/div[1]/form/div[1]/input"));
		btnLogin.click();
		Thread.sleep(5000);
		driver.close();

	}

	public static void Test() throws InterruptedException 
	{
		Chrome();
		driver.get("http://sos-stg.cummins.com/SOS/loadHomePage.action?");
		WebElement txtUserId=driver.findElement(By.name("USER"));
		WebElement txtPassword=driver.findElement(By.name("PASSWORD"));
		WebElement btnSubmit=driver.findElement(By.xpath("//*[@id='login']/table[2]/tbody/tr[8]/td[3]/a/input"));
		txtUserId.sendKeys("nc395");
		txtPassword.sendKeys("Dell@1234");
		btnSubmit.click();

		//Selecting the WWID form the dropdown
		Select oselect=new Select(driver.findElement(By.id("searchSelectId")));
		oselect.selectByValue("wwid");		
		//Entering the Search Value
		WebElement txtWWID=driver.findElement(By.name("searchText"));
		txtWWID.sendKeys("nc395");
		//Clicking on Search button
		WebElement btnSearch=driver.findElement(By.xpath(".//*[@id='homePage']/table/tbody/tr[1]/td[2]/table/tbody/tr[2]/td[4]/input"));
		By.className("");
		btnSearch.click();


		Thread.sleep(5000);
		driver.close();
	}

	public static void LocatingMechanisms() throws InterruptedException
	{
		Chrome();
		driver.get("http://gmail.com/");
		
	}
}

