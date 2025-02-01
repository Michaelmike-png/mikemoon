package com.quspider.addtocart;

import static org.testng.Assert.assertEquals;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.qspider.genericutility.BaseClass;
import com.qspider.genericutility.ListenerUtility;
import com.qspider.objectrepository.HomePage;

@Listeners(ListenerUtility.class)

public class TC_DWS12_Test extends BaseClass{
	@Test
	
	public void clickonaddtocart() {
		
		hp=new HomePage(driver);
		hp.getAddtocartButton().click();
		Assert.assertEquals(driver.getTitle(),"Demo Web Shop. 14.1-inch Laptop","addtocart page is displayed");
		test.log(Status.PASS, "addtocartpage is displayed");
		
	}

}
