package com.qa.RevisionTestNG.MultiplePackage;

import org.testng.annotations.Test;

public class MultiplePackageExecutionUsingXML1 {
	
	
	@Test(priority=1,groups="Regression")
	public void Test1()
	{
		System.out.println("Proving Multiple Test Case1  under Package Running in XML");
	}
	
	@Test(priority=2,groups="Sanity")
	public void Test2()
	{
		System.out.println("Proving Multiple Test Case2  under Package Running in XML");
	}
	
	@Test(priority=3,groups={"Regression","Sanity"})
	public void Test3()
	{
		System.out.println("Proving Multiple Test Case3  under Package Running in XML");
	}
	
	@Test(priority=4,groups="Regression")
	public void Test4()
	{
		System.out.println("Proving Multiple Test Case4  under Package Running in XML");
	}
	
}
