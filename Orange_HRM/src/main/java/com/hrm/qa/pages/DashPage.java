package com.hrm.qa.pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.hrm.qa.base.TestBase;

@SuppressWarnings("unused")
public class DashPage extends TestBase
{
	@FindBy(xpath="//b[contains(text(),'Admin')]")
	WebElement adminLink;
	
	@FindBy(xpath="//b[contains(text(),'PIM')]")
	WebElement PIMLink;
	
	@FindBy(xpath="//b[contains(text(),'Leave')]")
	WebElement LeaveLink;
	
	@FindBy(xpath="//b[contains(text(),'Time')]")
	WebElement TimeLink;
	
	@FindBy(xpath="//b[contains(text(),'Recruitment')]")
	WebElement RecruitmentLink;
	
	@FindBy(xpath="//b[contains(text(),'Performance')]")
	WebElement PerformanceLink;
	
	@FindBy(xpath="//b[contains(text(),'Dashboard')]")
	WebElement DashBoardLink;
	
	@FindBy(xpath="//b[contains(text(),'Directory')]")
	WebElement DirectoryLink;
	
	@FindBy(xpath="//b[contains(text(),'Maintenance')]")
	WebElement MaintenanceLink;
	
	@FindBy(xpath="//span[contains(text(),'Assign Leave')]")
	WebElement AssignLeavel;
	
	@FindBy(xpath="//span[contains(text(),'Leave List')]")
	WebElement LeaveListLink;
	
	@FindBy(xpath="//span[contains(text(),'Timesheets')]")
	WebElement TimesheetsLink;
	
	@FindBy(id="welcome")
	WebElement AdminLevel;
	
	
	// Initializing the Page Objects:
	public DashPage() 
	{
		PageFactory.initElements(driver, this);
	}
		
	public String verifyDashPageUrl()
	{
		return driver.getCurrentUrl();
	}
		
	public String admin()
	{
		adminLink.click();
		return driver.getCurrentUrl();
	}
	
	public String GetWelcomeLabel()
	{
		return AdminLevel.getText();
	}
	
	public String ClickOnPIMLink()
	{
		PIMLink.click();
		return driver.getCurrentUrl();
	}

	public String ClickOnLeaveLink()
	{
		LeaveLink.click();
		return driver.getCurrentUrl();	
	}
	
	public String ClickOnTimeLink()
	{
		TimeLink.click();
		return driver.getCurrentUrl();
    }
	
	public String ClickOnRecruitmentLink()
	{
		RecruitmentLink.click();
		return driver.getCurrentUrl();
    }
	
	public String ClickOnPerformanceLink() 
	{
		PerformanceLink.click();
		return driver.getCurrentUrl();
	}
	
	public String ClickOnDashBoardLink() 
	{
		DashBoardLink.click();
		return driver.getCurrentUrl();
	}
	
	public String ClickOnDirectoryLink() 
	{
		DirectoryLink.click();
		return driver.getCurrentUrl();
	}
	
	public String ClickOnMaintenanceLink() 
	{
		MaintenanceLink.click();
		return driver.getCurrentUrl();
	}
	
	public String ClickOnAssignLeaveListLink() 
	{
		AssignLeavel.click();
		return driver.getCurrentUrl();
	}
	
	public String ClickOnLeaveListLink() 
	{
		LeaveListLink.click();
		return driver.getCurrentUrl();
	}
	
	public String ClickOnTimesheetsLink() 
	{
		TimesheetsLink.click();
		return driver.getCurrentUrl();
	}
	
	
}
