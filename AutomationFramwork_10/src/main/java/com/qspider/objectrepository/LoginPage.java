package com.qspider.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	@FindBy (id="Email")
	private WebElement EmailTextField;
	
	@FindBy (id="Password")
	private WebElement PasswordTextField;//Encapsulation
	
	@FindBy(xpath="//input[@value='Log in']")
	private WebElement LoginButton;
	
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver,this);//ctl and space
		
	}

	public WebElement getEmailTextField() {
		return EmailTextField;
	}

	public WebElement getPasswordTextField() {
		return PasswordTextField;
	}

	public WebElement getLoginButton() {
		return LoginButton;
	}



}
