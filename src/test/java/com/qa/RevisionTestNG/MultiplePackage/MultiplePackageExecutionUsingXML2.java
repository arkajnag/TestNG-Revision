package com.qa.RevisionTestNG.MultiplePackage;

import org.testng.annotations.Test;

public class MultiplePackageExecutionUsingXML2 {

	@Test(priority=1,groups="Regression")
	public void TestCase1()
	{
		System.out.println("This is new class 1 of another data");
	}
	
	@Test(priority=2,groups={"Regression","Sanity"})
	public void TestCase2()
	{
		System.out.println("This is new class 2 of another data");
	}
}
