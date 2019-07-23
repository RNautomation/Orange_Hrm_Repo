package com.hrm.qa.testcases;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.hrm.qa.base.TestBase;
import com.hrm.qa.pages.LoginPage;

import junit.framework.Assert;

public class LoginPageTest extends TestBase
{
	LoginPage loginpage;
	
	@BeforeMethod
	public void setup()
	{
		initialization();
		loginpage=new LoginPage();
	}
	
	@Test(priority=1)
	public void loginPageTitleTest()
	{
		String title=loginpage.validateLoginPageTitle();
		Assert.assertEquals(title, "OrangeHRM");
	}
	
	@Test(priority=2)
	public void hrmLogoImageTest()
	{
		boolean logo=loginpage.validateHRMImage();
	}
	
	@Test(priority=3)
	public void loginTest()
	{
		loginpage.login(prop.getProperty("username"),prop.getProperty("Password"));
	}
	
	
	@AfterMethod
	public void tearDown()
	{
		Logout();
		driver.quit();
	}
	
	
}
 