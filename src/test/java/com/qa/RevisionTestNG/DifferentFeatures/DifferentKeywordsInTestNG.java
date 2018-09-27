/*
 * TestNG provides different keywords to define flows in Test Cases Executions.
 * Few examples:
 * ======================================================================
 * priority: to define the sequence of the test cases to be executed in case there are multiple test cases.
 * description: to define any specific details/description to a particular test case.
 * groups: to define a group name where multiple test cases can be clubbed together. testNG.xml configuration file helps in running the particular groups. Example: Regression or Smoke or Sanity.
 * dependsOnMethods: to define the dependency of start of execution of one Test Case on another test case. 
 * dependsOnGroups: to define the dependency of start of execution of one Test Case on completion of execution of entire test group.
 * dataProvider: to define/provide the name of method or DataProvider for Data driven testing.
 * invocationCount: to define the count for number of times, a single test case will re-run. Usually use to create several test data.
 * invocationTimeout: to define the timestamp, till how long the test case will execute before throwing timeout exception.
 * enabled: to define if the particular test case should be executed or should be ignored.
 */

package com.qa.RevisionTestNG.DifferentFeatures;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DifferentKeywordsInTestNG {
	
	WebDriver driver;
	WebDriverWait wait;
	
	@Test(priority=1,description="First Test Case",groups="Regression")
	public void TestCase1()
	{
		System.out.println("This test case is in Sequence1");
	}
	
	@Test(priority=2,groups="SmokeTest")
	public void TestCase2()
	{
		System.out.println("This test case is in Sequence2");
	}
	
	@Test(priority=3,groups="Regression",invocationCount=5)
	public void TestCase3()
	{
		System.out.println("This test case is in Sequence3");
	}
	
	@Test(priority=4,timeOut=3)
	public void TestCase4()
	{ 
		int sum=0;
		System.out.println("This test case is in Sequence4");
		for(int i=0;i<1000000;i++)
			{
				sum=sum+i;
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		System.out.println("Total Sum:"+sum);
	}

	@Test(priority=5,groups="Regression")
	@Parameters({"url","username"})
	public void TestCase5(String url, String username)
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(url);
		wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id("txtUsername"))));
		driver.findElement(By.id("txtUsername")).sendKeys(username);
		driver.quit();
	}
	
	@Test(priority=6,groups={"Sanity","Regression"})
	public void TestCase6()
	{
		System.out.println("This test case is in Sequence6 and grouped by Sanity and Regression");
	}
	
	@Test(priority=7,groups="Sanity")
	public void TestCase7()
	{
		System.out.println("This test case is in Sequence7 and grouped by Sanity");
		Assert.assertTrue(false);
	}
	
	@Test(priority=8,groups="Sanity",dependsOnMethods="TestCase7")
	public void TestCase8()
	{
		System.out.println("This test case is in Sequence8 and grouped by Sanity and depended on Method 7");
	}

	@Test(priority=9,groups="Regression",enabled=false)
	public void TestCase9()
	{
		System.out.println("This test case is in Sequence9 and grouped by Regression but enabled=false");
	}
}
