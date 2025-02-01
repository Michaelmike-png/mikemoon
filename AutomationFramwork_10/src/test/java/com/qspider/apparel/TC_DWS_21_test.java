package com.qspider.apparel;


import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.qspider.genericutility.BaseClass;
import com.qspider.genericutility.ListenerUtility;
import com.qspider.objectrepository.HomePage;

@Listeners(ListenerUtility.class)
public class TC_DWS_21_test extends BaseClass {
	
	@Test
	public void apparelandshoe() {
		
		hp=new HomePage(driver);
		hp.getAddtoCartButton().click();
		
		Assert.assertEquals(driver.getTitle(),"Demo Web Shop. Blue and green Sneaker","apprel is not displayed ");
		test.log(Status.PASS, "apparel page is displayed");
		
		
		 
	}

}
