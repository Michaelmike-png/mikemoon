package com.qspider.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WelcomePage {
	

	@FindBy  (xpath= "//a[text()='Log in']")
	private WebElement LoginLink;

	
   @FindBy (xpath= "//a[text()='Register']")
   private WebElement Registerlink;
  

  public WelcomePage(WebDriver driver) {
	 PageFactory.initElements(driver,this);
  }


public WebElement getLoginLink() {
	return LoginLink;
}


public WebElement getRegisterlink() {
	return Registerlink;
}


}
