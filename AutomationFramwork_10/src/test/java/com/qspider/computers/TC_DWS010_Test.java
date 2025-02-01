package com.qspider.computers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.qspider.genericutility.BaseClass;
import com.qspider.genericutility.WebDriverUtility;
import com.qspider.objectrepository.HomePage;

public class TC_DWS010_Test extends BaseClass {
	
	 @Test
	 public void clickOnComputer() {
		 
		 test.log(Status.INFO,"User logged in Successfully");
		 
		 
		
	
		 
		 
		 hp=new HomePage(driver);
		WebElement comp = hp.getComputerLink();
		 wutil.mouseHover(driver,comp);
		 hp.getNotebooklinktext().click();
		 
		 hp.getComputerLink().click();
		 Assert.assertEquals(driver.getTitle(),"Demo Web Shop Computers" , "computer page is not displayed");
		 test.log(Status.INFO,"computers page is displayed");
	 }

}
