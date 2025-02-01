package com.qspider.objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	

	@FindBy (partialLinkText="BOOKS")
	private WebElement BookLink;
	
	
	@FindBy(partialLinkText="COMPUTERS")
	private WebElement computerLink;
	
	@FindBy (linkText = "Notebooks")
	private WebElement notebooklinktext;
	
	@FindBy (partialLinkText="ElECTRONICS")
	private WebElement ElectronicsLink;
	
	@FindBy(xpath="//a[text()='14.1-inch Laptop']/../..//input[@value='Add to cart']")
	private WebElement addtocartButton;
	
	@FindBy(partialLinkText = "APPAREL & SHOE")
	private WebElement apparelandshoelink;
	
	@FindBy(xpath = "//a[text()='Blue and green Sneaker']/../..//input[@value='Add to cart']")
	private WebElement addtoCartButton;
	
	@FindBy(id ="add-to-wishlist-button-28")
	private WebElement addtowishlistButton;
	


	@FindBy(xpath="//a[text()='Log out']")
	private WebElement LogOutButton;
	

public HomePage(WebDriver driver) {
	PageFactory.initElements(driver,this);
}


public WebElement getBookLink() {
	return BookLink;
}


public WebElement getComputerLink() {
	return computerLink;
}


public WebElement getElectronicsLink() {
	return ElectronicsLink;
}


public WebElement getLogOutButton() {
	return LogOutButton;
}


public WebElement getAddtocartButton() {
	return addtocartButton;
}


public WebElement getApparelandshoelink() {
	return apparelandshoelink;
}


public WebElement getAddtoCartButton() {
	return addtoCartButton;
}

public WebElement getNotebooklinktext() {
	return notebooklinktext;
}


public WebElement getAddtowishlistButton() {
	return addtowishlistButton;
}

}




