package com.qspider.book;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.qspider.genericutility.BaseClass;
import com.qspider.genericutility.ListenerUtility;
import com.qspider.genericutility.WebDriverUtility;
import com.qspider.objectrepository.HomePage;

@Listeners(ListenerUtility.class)
public class TC_DWS_001_Test extends BaseClass{
	
	@Test
	public void ClickOnBooks() {
		
	
		hp=new HomePage(driver);
		hp.getBookLink().click();
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop. Books","Books page is not displayed");
		test.log(Status.PASS,"Book page is displayed");
	}

}
