package com.hrm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.FindBy;

import com.hrm.qa.util.TestUtil;

public class TestBase 
{
	public static WebDriver driver;
	public static Properties prop;
		
	
	public TestBase() 
	{
	   prop= new Properties();
		try {
			FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"/src/main/java/com/hrm"+"/qa/config/config.properties");
			
				prop.load(fis);
		}
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		}
			catch (IOException e) 
			{
				
				e.printStackTrace();
			}
		} 
	
	 public void initialization()
	 {
	      String browser_name=prop.getProperty("browser");
	      if(browser_name.equals("chrome"))
	      {
	    	  System.setProperty("webdriver.chrome.driver", "C:/SELENIUM/chromedriver_win32/chromedriver.exe");
	 		 driver=new ChromeDriver();
	      }
	      else if (browser_name.equals("firefox")) 
	      {
	    	  System.setProperty("webdriver.gecko.driver", "C:/SELENIUM/geckodriver-v0.23.0-win64/geckodriver.exe");
	 		 driver=new FirefoxDriver();
			
		  }
		
		 driver.manage().window().maximize();
		 driver.manage().deleteAllCookies();
		 driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		 driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
		 driver.get(prop.getProperty("url"));
	     }
	 
	     public void Logout()
		 {
			
	    	 driver.findElement(By.id("welcome")).click();
			/*@FindBy(id="welcome")
			WebElement WelcomeAdmin;
			WelcomeAdmin.click();*/
			driver.findElement(By.xpath("//body/div[@id='wrapper']/div[@id='branding']/div[@id='welcome-menu']/ul/li[2]")).click();
			/*@FindBy(xpath="//body/div[@id='wrapper']/div[@id='branding']/div[@id='welcome-menu']/ul/li[2]")
			WebElement log;
			log.click();*/
			
		 }
	
	
}
