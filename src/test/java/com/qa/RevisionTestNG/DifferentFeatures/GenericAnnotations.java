/*
 * TestNG framework provides different in built Annotations that helps in process the Execution Flow of different test cases.
 * There are Pre-Annotations , Post-Annotations and some annotations whic facilitates data or specific featires to each test case.
 * Pre-Annotations: @BeforeSuite, @BeforeTest, @BeforeClass, @BeforeMethod.
 * Post-Annotations: @AfterSuite, @AfterTest, @AfterClass, @AfterMethod.
 * Specific Data driven Annotations: @DataProvider, @Parameters
 */

package com.qa.RevisionTestNG.DifferentFeatures;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class GenericAnnotations {
	
	@BeforeSuite
	public void BeforeSuiteAnnotation()
	{
		System.out.println("1. Sequence in Execution In Before Test Suite");
	}
	
	@BeforeTest
	public void BeforeTestAnnotation()
	{
		System.out.println("2. Sequence in Execution in Before Test");
	}
	
	@BeforeClass
	public void BeforeClassAnnotation()
	{
		System.out.println("3. Sequence in Execution in Before Class");
	}
	
	@BeforeMethod
	public void BeforeMethodAnnotation()
	{
		System.out.println("4. Sequence in Execution in Before Method");
	}

	@Test
	public void ActualTestCase()
	{
		System.out.println("5. Sequence in Execution in Actual Test");
	}
	
	@AfterMethod
	public void AfterMethodAnnotation()
	{
		System.out.println("6. Sequence in Execution in After Method");
	}
	
	@AfterClass
	public void AfterClassAnnotation()
	{
		System.out.println("7. Sequence in Execution in After Class");
	}
	
	@AfterTest
	public void AfterTestAnnotation()
	{
		System.out.println("8. Sequence in Execution in After Test");
	}
	
	@AfterSuite
	public void AfterSuiteAnnotation()
	{
		System.out.println("9. Sequence in Execution in After Suite");
	}
}
