package com.Chapter1;
import java.io.File;
import java.io.IOException;

import javax.imageio.stream.FileCacheImageOutputStream;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.io.TemporaryFilesystem;
import org.openqa.selenium.io.Zip;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.openqa.selenium.support.ui.Select;


import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.WritableWorkbook;

public class LocatingMachanism {

	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException,IOException, BiffException
	{
		//		Chrome();
		//		InternetExplorer();
		//		Firefox();
//				byId();
		//		Test();
		//		LocatingMechanisms();
		//		SindhuPalivela();
		//		eventListener();
		//		FileCopyFromSrcToDest();
//				readExcel();
				TestLog();

	}
	public static void Chrome() 
	{
//		@office
		System.setProperty("webdriver.chrome.driver","D:\\Laxmikanth\\Personnal\\Softwares\\chromedriver_win32\\chromedriver.exe");
		//@Home
//		System.setProperty("webdriver.chrome.driver","E:\\Laxmikanth\\Workspace\\Selenium WebDriver Packages\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	public static void InternetExplorer() throws InterruptedException
	{
		System.setProperty("webdriver.ie.driver", "D:\\Laxmikanth\\Personnal\\Softwares\\IEDriverServer_Win32_2.49.0\\IEDriverServer.exe");
		driver=new InternetExplorerDriver();
	}
	public static void Firefox() throws InterruptedException
	{
		driver=new FirefoxDriver();
	}
	public static void logFile() throws IOException
	{
		File srcFile=((TakesScreenshot)driver).getScreenshotAs((OutputType.FILE));
		FileUtils.copyFile(srcFile, new File("D:\\Temp\\laxmikanth.png"));
		

	}
	public static void TestLog() throws IOException
	{
		Chrome();
		driver.get("https://www.google.co.in/?gws_rd=ssl");
		logFile();
	}
	public static void byId() throws InterruptedException, IOException
	{
		Chrome();
		driver.get("https://connect-stg.cummins.com");
		logFile();
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
		logFile();
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
		driver.manage().window().maximize();
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

		WebElement image=driver.findElement(By.xpath("/html/body/div[7]/div[3]/div[1]/div[1]/div[4]/div[1]/div[1]/div[1]/div[2]/div[4]/div[1]/a/span"));
		image.click();
		Thread.sleep(5000);
		WebElement signout=driver.findElement(By.id("gb_71"));
		signout.click();
		Thread.sleep(5000);
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

	public static void eventListener()
	{
		System.setProperty("webdriver.chrome.driver","E:\\Laxmikanth\\Workspace\\Selenium WebDriver Packages\\chromedriver.exe");
		driver=new ChromeDriver();
		EventFiringWebDriver eventfir=new EventFiringWebDriver(driver);
		IAmEventListener listner=new IAmEventListener();
		eventfir.register(listner);
		eventfir.navigate().to("https://google.co.in");
		eventfir.findElement(By.id("lst-ib")).sendKeys("Hello Laxmikanth");;
	}
	public static void FileCopyFromSrcToDest() throws IOException,InterruptedException
	{
		//Copying files from source to destination
		//FileHandler.copy(new File("E:\\Temp1\\"),new File("E:\\Temp2\\"),".txt");
		//Creating Directory in a specified Directory
//		FileHandler.createDir(new File("E://Temporary"));
//		Thread.sleep(10000);
//		FileHandler.delete(new File("E://Temporary"));
		//Verifying Whether the target File is in Zip Format or not
//		System.out.println(FileHandler.isZipped("E://TempZip.zip"));
		//Verifying whether can we make target File as Executable
//		System.out.println(FileHandler.makeExecutable(new File("E://Temp2//Mlk.txt")));
		//Verifying whether can we make target File as Writable
//		System.out.println(FileHandler.makeWritable(new File("E://Temp2//Mlk.txt")));
		//Reading Content from a target File
//		System.out.println(FileHandler.readAsString(new File("E://Temp2//Mlk.txt")));
		//Verifying whether the target file is having executable permissions
//		System.out.println(FileHandler.canExecute(new File("E://Temp2//Mlk.txt")));
		//Creating Temporary Directories in Default TempFolder
		/*File f=TemporaryFilesystem.getDefaultTmpFS().createTempDir("prefix1","suffix1");
		System.out.println(f.getAbsolutePath());
		File f1=TemporaryFilesystem.getDefaultTmpFS().createTempDir("prefix1","suffix1");
		System.out.println(f1.getAbsolutePath());
		Thread.sleep(5000);
		TemporaryFilesystem.getDefaultTmpFS().deleteTemporaryFiles();
		Thread.sleep(10000);*/
		/*//Changing Default Temporary File System
		TemporaryFilesystem.setTemporaryDirectory(new File("E://Temp123"));
		File f2=TemporaryFilesystem.getDefaultTmpFS().createTempDir("prefix1", "suffix1");
		System.out.println(f2.getAbsolutePath());
		Thread.sleep(10000);*/
		/*//Changing Default Temporary File System
		TemporaryFilesystem tmpfs=TemporaryFilesystem.getTmpFsBasedOn(new File("E://Temp456"));
		tmpfs.createTempDir("prefix123","Suffix123");
		Thread.sleep(10000);*/
		/*//Zipping the file
		Zip myZip=new Zip();
		myZip.zip(new File("E://Temp456"), new File("E://Temp456.zip"));*/
		/*//Unzipping the file
		Zip myZip=new Zip();
		myZip.unzip(new File("E://Temp456.zip"),new File("E://"));*/
	}
	public static void readExcel() throws IOException, BiffException
	{
		/*//Retrieving the data from excel
		Workbook wbook=Workbook.getWorkbook(new File("Selenium_InputData.xls"));
		Sheet sheet=wbook.getSheet("Sheet1");
		int rowcount=sheet.getRows();
		for(int i=0;i<rowcount;i++)
		{
			System.out.println(sheet.getCell(0,i).getContents()+" "+sheet.getCell(1,i).getContents()+" "+sheet.getCell(2, i).getContents());
			System.out.println("\n");
		}*/
		//Writing into the excel
		WritableWorkbook wbook1=Workbook.createWorkbook(new File("D:\\201602090550.xls"));
		Sheet sheet1=wbook1.createSheet("Sheet1",2);
		
		
	}
	
}
class IAmEventListener implements WebDriverEventListener
{
	@Override
	public void afterChangeValueOf(WebElement arg0, WebDriver arg1) {
		System.out.println("afterChnageValueOf");
	}
	@Override
	public void afterClickOn(WebElement arg0, WebDriver arg1) {
		System.out.println("afterClickOn");
	}
	@Override
	public void afterFindBy(By arg0, WebElement arg1, WebDriver arg2) {
		System.out.println("afterFindBy");
	}
	@Override
	public void afterNavigateBack(WebDriver arg0) {
		System.out.println("afterNavigateBack");
	}
	@Override
	public void afterNavigateForward(WebDriver arg0) {
		System.out.println("afterNavigateForward");
	}
	@Override
	public void afterNavigateTo(String arg0, WebDriver arg1) {
		System.out.println("afterNavigateTo");
	}
	@Override
	public void afterScript(String arg0, WebDriver arg1) {
		System.out.println("afterScript");
	}
	@Override
	public void beforeChangeValueOf(WebElement arg0, WebDriver arg1) {
		System.out.println("beforeChangeValueOf");
	}
	@Override
	public void beforeClickOn(WebElement arg0, WebDriver arg1) {
		System.out.println("beforeClickOn");
	}
	@Override
	public void beforeFindBy(By arg0, WebElement arg1, WebDriver arg2) {
		System.out.println("beforeFindBy");
	}
	@Override
	public void beforeNavigateBack(WebDriver arg0) {
		System.out.println("beforeNavigateBack");
	}
	@Override
	public void beforeNavigateForward(WebDriver arg0) {
		System.out.println("beforeNavigateForward");
	}
	@Override
	public void beforeNavigateTo(String arg0, WebDriver arg1) {
		System.out.println("Driver::"+arg1+" is navigating to::"+arg0);
	}
	@Override
	public void beforeScript(String arg0, WebDriver arg1) {
		System.out.println("beforeScript");
	}
	@Override
	public void onException(Throwable arg0, WebDriver arg1) {
		System.out.println("onExeption");
	}
}