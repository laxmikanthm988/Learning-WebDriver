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
		//		byId();

		//		Test();

//		LocatingMechanisms();
		SindhuPalivela();


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
		WebElement UserId=driver.findElement(By.id("Email"));
		UserId.sendKeys("laxmikanthm988@gmail.com");
		WebElement next=driver.findElement(By.id("next"));
		next.click();
		Thread.sleep(5000);
		WebElement password=driver.findElement(By.id("Passwd"));
		password.sendKeys("mlk@LaxmiSathya1");

		WebElement staySigned=driver.findElement(By.id("PersistentCookie"));
		if(staySigned.isSelected())
		{
			staySigned.click();
			System.out.println("Check box is selected");
		}
		else
		{
			System.out.println("Check Box is Not Selected");
		}
		WebElement signin=driver.findElement(By.id("signIn"));
		signin.click();
		Thread.sleep(10000);
		
		WebElement image=driver.findElement(By.className("gb_Za gbii"));
		image.click();
		
		WebElement signout=driver.findElement(By.id("gb_71"));
		signout.click();
		
		Thread.sleep(5000);
		driver.close();

	}

	public static void SindhuPalivela() throws InterruptedException
	{
		Chrome();
		driver.get("http://10.212.172.94:89/");
		
		WebElement userid=driver.findElement(By.id("UserID"));
		userid.sendKeys("nw466");
		WebElement password=driver.findElement(By.id("Password"));
		password.sendKeys("abcd");
		
		WebElement submit=driver.findElement(By.id("button"));
		submit.click();
		
		Thread.sleep(10000);
		
		WebElement xyz=driver.findElement(By.partialLinkText("XYZ"));
		xyz.click();
		
		WebElement create=driver.findElement(By.id("imgCreateNew"));
		create.click();
		
		WebElement txtname=driver.findElement(By.id("txtName"));
		txtname.sendKeys("abc1260");
		
		WebElement btncreate=driver.findElement(By.id("btnNew"));
		btncreate.click();
		
		Thread.sleep(10000);
		driver.findElement(By.id("btnSelectEngine")).click();
		
		Thread.sleep(10000);
		Select marketSelect=new Select(driver.findElement(By.id("BaseMarkets")));
		marketSelect.selectByValue("1");
		
		Thread.sleep(10000);
		Select equipmenttypeSelect=new Select(driver.findElement(By.id("Equipment")));
		equipmenttypeSelect.selectByValue("167");
		
		Thread.sleep(5000);
		WebElement btnSearch=driver.findElement(By.id("btnUpdate"));
		btnSearch.click();
		
		Thread.sleep(10000);
		WebElement firstelement=driver.findElement(By.xpath("html/body/div[1]/div/div[3]/div/div/div[8]/div[1]/div[2]/table/tbody/tr[1]/td[1]"));
		firstelement.click();
		
		Thread.sleep(5000);
		WebElement btnSaveSelection=driver.findElement(By.id("btnSave"));
		btnSaveSelection.click();
		
		Thread.sleep(10000);
		WebElement chkimageonly=driver.findElement(By.id("chkImagesOnly"));
		chkimageonly.click();
		
		Thread.sleep(10000);
		WebElement btnSave=driver.findElement(By.id("btnSaveUpper"));
		btnSave.click();
		
		Thread.sleep(5000);
		WebElement signout= driver.findElement(By.partialLinkText("Sign Out"));
		signout.click();
		
		Thread.sleep(5000);
		
		System.out.println("It's done");
		driver.close();
		
		
	}
}

