package com.hrm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.hrm.qa.base.TestBase;
import com.hrm.qa.pages.DashPage;
import com.hrm.qa.pages.LoginPage;

public class DashBoardPageTest extends TestBase
{
	DashPage dashPage;
	LoginPage loginpage;
	
	@BeforeMethod
	public void setup()
	{
		initialization();
		loginpage=new LoginPage();
		dashPage=new DashPage();
		dashPage=loginpage.login(prop.getProperty("username"),prop.getProperty("Password"));
	}
	
	@Test(priority=1)
	public void adminLinkPage()
	{
		String actURL=dashPage.admin();
		Assert.assertEquals(actURL,"https://opensource-demo.orangehrmlive.com/index.php/admin/viewSystemUsers");
	}
	
	@Test(priority=2)
	public void AdminLabel()
	{
		String actLabel= dashPage.GetWelcomeLabel();
		Assert.assertEquals(actLabel,"Welcome Admin");
	
	}
	
	@Test(priority=3)
	public void VerifyPIMLinkPage()
	{
		String actUrl=dashPage.ClickOnPIMLink();
		Assert.assertEquals(actUrl,"https://opensource-demo.orangehrmlive.com/index.php/pim/viewEmployeeList");
	}
	
	@Test(priority=4)
	public void VerifyLeaveLinkPage()
	{
		String actUrl=dashPage.ClickOnLeaveLink();
		Assert.assertEquals(actUrl,"https://opensource-demo.orangehrmlive.com/index.php/leave/viewLeaveList");
	}
	
	@Test(priority=5)
	public void VerifyTimeLink()
	{
		String actURL=dashPage.ClickOnTimeLink();
		Assert.assertEquals(actURL,"https://opensource-demo.orangehrmlive.com/index.php/time/defineTimesheetPeriod");	
	}
	
	@Test(priority=6)
	public void VerifyRecruitmentLink()
	{
		String actURL=dashPage.ClickOnRecruitmentLink();
		Assert.assertEquals(actURL,"https://opensource-demo.orangehrmlive.com/index.php/recruitment/viewCandidates");
	}
	
	@Test(priority=7)
	public void VerifyPerformanceLink()
	{
		dashPage.ClickOnPerformanceLink();
	}
	
	@Test(priority=8)
	private void VerifyDashBoardLink() 
	{
		String actURL=dashPage.ClickOnDashBoardLink();
		Assert.assertEquals(actURL,"https://opensource-demo.orangehrmlive.com/index.php/dashboard");
    }
	
	@Test(priority=9)
	private void VerifyDirectoryLink() 
	{
		String actURL=dashPage.ClickOnDirectoryLink();
		Assert.assertEquals(actURL,"https://opensource-demo.orangehrmlive.com/index.php/directory/viewDirectory/reset/1");
    }
	
	@Test(priority=10)
	private void VerifyMaintenanceLink()
	{
		String actURL=dashPage.ClickOnMaintenanceLink();
		Assert.assertEquals(actURL,"https://opensource-demo.orangehrmlive.com/index.php/maintenance/purgeEmployee");
	}
	
	@Test(priority=11)
	private void VerifyAssignLeavelLink()
	{
		String actURL=dashPage.ClickOnAssignLeaveListLink();
		Assert.assertEquals(actURL,"https://opensource-demo.orangehrmlive.com/index.php/leave/assignLeave");
	}
	
	@Test(priority=12)
	private void VerifyLeaveListLink()
	{
		String actURL=dashPage.ClickOnLeaveListLink();
		Assert.assertEquals(actURL,"https://opensource-demo.orangehrmlive.com/index.php/leave/viewLeaveList");
	}
	
	@Test(priority=13)
	private void VerifyTimesheetsLink()
	{
		String actURL=dashPage.ClickOnTimesheetsLink();
		Assert.assertEquals(actURL,"https://opensource-demo.orangehrmlive.com/index.php/time/viewEmployeeTimesheet");
	}
	
	@AfterMethod
	public void tearDown()
	{
		Logout();
		driver.quit();
	}

}
