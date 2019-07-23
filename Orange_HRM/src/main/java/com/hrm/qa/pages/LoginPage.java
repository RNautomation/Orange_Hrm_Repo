package com.hrm.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import com.hrm.qa.base.TestBase;

@SuppressWarnings("unused")
public class LoginPage extends TestBase
{
	@FindBy(id="txtUsername")
    WebElement username;
    
    @FindBy(id="txtPassword")
    WebElement password;
    
    @FindBy(id="btnLogin")
    WebElement loginbtn;
    
    @FindBy(xpath="//div[@id='divLogo']//img")
    WebElement hrmlogo;
    
  //Initializing the Page Objects:
    public LoginPage(){
		PageFactory.initElements(driver, this);
    }
	
	//page Title
	public String validateLoginPageTitle()
	{
		return driver.getTitle();
	}
	
	//HRM LOGO
	public boolean validateHRMImage()
	{
		return hrmlogo.isDisplayed();
	}
     
     public DashPage login(String user,String pwd)
     {
    	 username.sendKeys(user);
    	 password.sendKeys(pwd);
    	 loginbtn.click();
		return new DashPage();
     }
     

}
