package com.Chapter1;

import java.io.IOException;
import java.util.Date;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AdvisorDemo {
	WebDriver driver;
	public static void main(String[] args) throws InterruptedException, InvalidFormatException, IOException {

		AdvisorDemo d=new AdvisorDemo();
//		d.FolderUnderRoot();
//				d.InstallationCreate();
//				d.Dashboard();
//				d.Administration();
		//		d.Copy();
		//		d.Rename();
//				d.ReadFromExcel();
//		d.WriteToExcel();
//		d.getTimeStamp();
		d.Sample();
	}
	public void chrome()

	{
		System.setProperty("webdriver.chrome.driver","D:\\Laxmikanth\\Personnal\\Softwares\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	public void login()
	{
		chrome();
		driver.get("http://10.212.172.94:89");
		driver.manage().window().maximize();
		//Entering the UserID
		WebElement userid=driver.findElement(By.id("UserID"));
		userid.sendKeys("nw466");
		//Entering the Password
		WebElement password=driver.findElement(By.id("Password"));
		password.sendKeys("abc123");
		//Clicking on  Submit Button
		WebElement btnSubmit=driver.findElement(By.id("button"));
		btnSubmit.click();
		
	}
	public void FolderUnderRoot() throws InterruptedException
	{
		login();
		Thread.sleep(5000);
		//Selecting the Root Folder
		WebElement rootElement=driver.findElement(By.linkText("Root"));
		rootElement.click();
		Thread.sleep(5000);
		//Clicking on + Button
		WebElement btnPlus=driver.findElement(By.id("imgCreateNew"));
		btnPlus.click();
		//Selecting Folder radio Button
		WebElement rdbtnFolder=driver.findElement(By.id("Folder"));
		rdbtnFolder.click();
		//Enetring the Name for the Folder
		WebElement txtFolderName=driver.findElement(By.id("txtName"));
		txtFolderName.sendKeys("Sprint");
		//clicking Create button
		WebElement btnCreate=driver.findElement(By.id("btnNew"));
		btnCreate.click();
		Thread.sleep(10000);
		//Opening Sprint Folder
		WebElement folder=driver.findElement(By.linkText("Sprint"));
		folder.click();
		Thread.sleep(20000);
		//Closing the Browser
//		driver.close();

	}
	public void InstallationCreate() throws InterruptedException
	{
		login();
		Thread.sleep(5000);
		//Opening Sprint49 Folder
		WebElement folder=driver.findElement(By.linkText("Sprint"));
		folder.click();
		Thread.sleep(5000);
		//Clicking on + Button
		WebElement btnPlus=driver.findElement(By.id("imgCreateNew"));
		btnPlus.click();
		//Selecting the Installation Radio button
		WebElement rdbtnInstallation=driver.findElement(By.id("Installation"));
		rdbtnInstallation.click();
		//Entering the Installation Name
		WebElement txtInstallation=driver.findElement(By.id("txtName"));
		txtInstallation.sendKeys("Test3");
		//Clicking on Create Button
		WebElement btnCreate=driver.findElement(By.id("btnNew"));
		btnCreate.click();
		Thread.sleep(15000);
		//Clicking on Select Engine button
		WebElement btnSelectEngine=driver.findElement(By.id("btnSelectEngine"));
		btnSelectEngine.click();
		//Selecting Market Value
		Thread.sleep(10000);
		Select marketValue=new Select(driver.findElement(By.id("BaseMarkets")));
		marketValue.selectByVisibleText("Industrial");
		//Selecting Equipment Type Value
		Select equipmentType=new Select(driver.findElement(By.id("Equipment")));
		equipmentType.selectByVisibleText("Baler");
		//Clicking on Search button
		WebElement btnSearch=driver.findElement(By.id("btnUpdate"));
		btnSearch.click();
		Thread.sleep(10000);
		//Selecting first Search result
		WebElement searchResult=driver.findElement(By.xpath("html/body/div[1]/div/div[3]/div/div/div[8]/div[1]/div[2]/table/tbody/tr[1]/td[1]"));
		searchResult.click();
		Thread.sleep(20000);
		//Clicking on Save button
		WebElement btnSave=driver.findElement(By.id("btnSave"));
		btnSave.click();
		//Clicking on Save Button
		WebElement btnSaveUpper=driver.findElement(By.id("btnSaveUpper"));
		btnSaveUpper.click();
		Thread.sleep(20000);
		//Closing the Browser
//		driver.close();
	}
	public void Dashboard() throws InterruptedException
	{
		login();
		Thread.sleep(10000);
		//Clicking on Dashboard
		WebElement dashboard=driver.findElement(By.linkText("Dashboard"));
		dashboard.click();
		//Entering Title
		Thread.sleep(10000);
		WebElement txtTitle=driver.findElement(By.id("TITLE"));
		txtTitle.sendKeys("1086");
		//Entering IQA value
		WebElement txtIQA=driver.findElement(By.id("IQA"));
		txtIQA.sendKeys("575");
		//Entering FR Name
		WebElement txtFRName=driver.findElement(By.id("FR"));
		txtFRName.sendKeys("FR50055");
		//Clicking on Search button
		WebElement btnSearch=driver.findElement(By.id("txtDashboardSearch"));
		btnSearch.click();
		Thread.sleep(20000);
		//Clicking on the Resultant link
		WebElement txtLink=driver.findElement(By.linkText("1086"));
		if(txtLink.isDisplayed())
			System.out.println("Yes it is displayed");
		else
			System.out.println("It is not displayed");
		txtLink.click();
	}
	public void Administration() throws InterruptedException
	{
		login();
		Thread.sleep(5000);
		//Clicking Administration Link
		WebElement lnkAdministration=driver.findElement(By.linkText("Administration"));
		lnkAdministration.click();
		Thread.sleep(15000);
		//Clicking on + button
		WebElement btnPlus=driver.findElement(By.id("imgCreateNew"));
		btnPlus.click();
		//Selecting Group Radio Button
		WebElement rdnGroup=driver.findElement(By.id("Group"));
		rdnGroup.click();
		//Entering the Name of the Group
		WebElement txtGroupName=driver.findElement(By.id("txtName"));
		txtGroupName.sendKeys("Test56");
		Thread.sleep(10000);
		//Clicking on Create button
		WebElement btnGroupCreate=driver.findElement(By.id("btnNew"));
		btnGroupCreate.click();
		//Clicking above created UserGroup
		WebElement lnkUserGroup=driver.findElement(By.linkText("Test56"));
		lnkUserGroup.click();
		//Clicking + button
		Thread.sleep(10000);
		WebElement btnPlus1=driver.findElement(By.id("imgCreateNew"));
		btnPlus1.click();
		//Selecting User radio button
		WebElement rdUser=driver.findElement(By.id("User"));
		rdUser.click();
		//Entering the WWID into Name Field
		WebElement txtUserName=driver.findElement(By.id("txtName"));
		txtUserName.sendKeys("nw466");
		//Clicking Create Button
		WebElement btnUserCreate=driver.findElement(By.id("btnNew"));
		btnUserCreate.click();



	}
	public void Copy() throws InterruptedException
	{
		login();
		Thread.sleep(10000);
		//Navigating to Sprint49 folder
		WebElement lnkFolder=driver.findElement(By.linkText("Sprint"));
		lnkFolder.click();
		//Selecting Test1 Checkbox
		WebElement chkTest1=driver.findElement(By.id("7434"));
		chkTest1.click();
		//Clicking Copy Button
		WebElement btnCopy=driver.findElement(By.id("imgCopyItem"));
		btnCopy.click();
		//Entering New Name
		WebElement txtNewName=driver.findElement(By.id("txtCopy"));
		txtNewName.sendKeys("Test3");
		//Clicking on Save button
		WebElement btnSave=driver.findElement(By.id("btnCopy"));
		btnSave.click();
	}
	public void Rename() throws InterruptedException
	{
		login();
		Thread.sleep(10000);
		//Navigating to Sprint49 folder
		WebElement lnkFolder=driver.findElement(By.linkText("Sprint49"));
		lnkFolder.click();
		//Selecting Test3 Checkbox
		WebElement chkTest1=driver.findElement(By.id("7421"));
		chkTest1.click();
		//Clicking Rename Button
		WebElement btnCopy=driver.findElement(By.id("imgRename"));
		btnCopy.click();
		Thread.sleep(5000);
		//Entering New Name
		WebElement txtNewName=driver.findElement(By.id("txtRename"));
		txtNewName.sendKeys("Test4");
		//Clicking on Save button
		WebElement btnSave=driver.findElement(By.id("btnRename"));
		btnSave.click();

	}
	public void ReadFromExcel() throws InvalidFormatException, IOException
	{
		//@Office
		/*XSSFWorkbook workbook=new XSSFWorkbook(new File("DataSheet.xlsx"));
		XSSFSheet sheet=workbook.getSheetAt(0);
		XSSFRow row=sheet.getRow(1);
		System.out.println(row.getCell(0));
		System.out.println(sheet.getSheetName());
		*/
		//@Home
		XSSFWorkbook workbook=new XSSFWorkbook("DataSheet.xlsx");
		
		
		
	}
	public void WriteToExcel() throws InvalidFormatException, IOException
	{
		/*FileOutputStream fos=new FileOutputStream(new File("D:\\Lucky_"+getTimeStamp()+".xlsx"));
		XSSFWorkbook workbook=new XSSFWorkbook();
		XSSFSheet sheet1=workbook.createSheet("Test Result");
		XSSFRow row=sheet1.createRow(0);
		row.createCell(0).setCellValue("Hello");
		
		XSSFSheet sheet2=workbook.createSheet("Test Description");
		
		
		workbook.write(fos);
		workbook.close();
		fos.close();*/
		
	}
	public long getTimeStamp()
	{
		return (long)(new Date().getTime());
	}
	
	@Test
	public void Sample() throws InterruptedException
	{
		
		chrome();
		driver.get("https://www.google.co.in/?gws_rd=ssl");
		driver.findElement(By.id("lst-ib")).sendKeys("Test Google");
		driver.wait(1000);
	}

}
