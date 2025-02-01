package com.qspider.genericutility;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.beust.jcommander.Parameter;
import com.qspider.objectrepository.HomePage;
import com.qspider.objectrepository.LoginPage;
import com.qspider.objectrepository.WelcomePage;

public class BaseClass {
	
	public static ExtentReports ExtReport;
	public JavaUtility jt=new JavaUtility();
	public WebDriverUtility wutil=new WebDriverUtility();
	public FileUtility futil=new FileUtility();
	public static ExtentTest test;
	public WelcomePage wp;
	public HomePage hp;
	public LoginPage lp;
	
	public WebDriver driver;
	
	@BeforeSuite
	public void configReport() {
		

		ExtentSparkReporter spark=new ExtentSparkReporter("./HTML_reports/ExtentReport_"+jt.getSystemString()+".html");
			ExtReport=new ExtentReports();
			ExtReport.attachReporter(spark);
	}
	@Parameters("Browser")
	@BeforeClass
	public void openBrwoser(@Optional("chrome")String browserName) throws IOException {
		
	if(browserName.equalsIgnoreCase("chrome")) {
		driver=new ChromeDriver();
	}else if(browserName.equalsIgnoreCase("firefox")) {
		driver=new FirefoxDriver();
	}else if(browserName.equalsIgnoreCase("edge")) {
		driver=new EdgeDriver();
	}
	driver.manage().window().maximize();
	wutil.implicitWait(driver);
	driver.get(futil.getDataFromProperty("url"));
}

@BeforeMethod
public void login() throws IOException {
	wp=new WelcomePage(driver);
	wp.getLoginLink().click();
	
	lp=new LoginPage(driver);
	lp.getEmailTextField().sendKeys(futil.getDataFromProperty("email"));
	lp.getPasswordTextField().sendKeys(futil.getDataFromProperty("password"));
	lp.getLoginButton().click();

}
@AfterMethod
public void Logout() {
	hp=new HomePage(driver);
	hp.getLogOutButton().click();
}
@AfterClass
public void closeBrowser() {
	driver.quit();
}
	
	@AfterSuite
	public void reportBackup() {
		
	ExtReport.flush();
			
				
	}
}
	





