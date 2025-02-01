package com.qspider.genericutility;

import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.Status;

public class ListenerUtility extends BaseClass implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		String mathodName = result.getName();
		test=ExtReport.createTest(mathodName);
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		test.log(Status.FAIL, result.getName()+"is faild");
		TakesScreenshot ts=(TakesScreenshot)driver;
		String sereenshot = ts.getScreenshotAs(OutputType.BASE64);
		test.addScreenCaptureFromBase64String(sereenshot);
		
		
		try {
			wutil.takeScreenshot(driver);
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		
		}
	}
	
	
	
	
	
	
	
	
	


