package com.qa.RevisionTestNG.DifferentFeatures;

import org.testng.Assert;
import org.testng.annotations.Test;

public class VerifyTestNGListeners {
	
	@Test(priority=1,description="Checking RetryAnalyser Listener")
	public void TestCase1()
	{
		Assert.assertTrue(false);
	}
	
	@Test(priority=2,description="Normal TestCase")
	public void TestCase2()
	{
		System.out.println("Test Case without any Error");
	}
}
