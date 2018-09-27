package com.qa.RevisionTestNG.RetryAnalyzer;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryAnalyzer implements IRetryAnalyzer{

	int initialCount=0;
	int finalCount=1;
	public boolean retry(ITestResult result) {
		while(initialCount<finalCount)
			{
				initialCount++;
				return true;
			}
		return false;
	}
}
