package com.qa.RevisionTestNG.DifferentFeatures;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderExample {
	
	WebDriver driver;
	
	@BeforeMethod
	public void SetUpData()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	}
	
	@DataProvider(name="Data")
	public Object[][] GetDataProvider()
	{
		Object[][] inputdata=new Object[2][1];
		inputdata[0][0]="admin";
		inputdata[1][0]="arka";
		return inputdata;
	}
	
	@Test(dataProvider="Data")
	public void Test1(String userName)
	{
		driver.findElement(By.id("txtUsername")).sendKeys(userName);
	}
	
	@AfterMethod
	public void TearDown()
	{
		driver.quit();
	}
}
