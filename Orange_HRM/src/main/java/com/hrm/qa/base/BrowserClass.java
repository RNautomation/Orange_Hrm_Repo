package com.hrm.qa.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserClass {
	public static WebDriver driver;
	public void initialization() 
	{
		/*System.setProperty("webDriver.chrome.driver","C:/SeleniumRepo/chromedriver_win32/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");*/
		
		System.setProperty("webdriver.gecko.driver","C:/SELENIUM/geckodriver-v0.23.0-win64/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		System.setProperty("webdriver.chrome.driver", "C:/SELENIUM/chromedriver_win32/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        System.out.println("Selenium Webdriver Script in Chrome browser | Software Testing Material");
	}
	
	public static void main(String args[])
	{
		BrowserClass TBobj=new BrowserClass();
		TBobj.initialization();
		
	}

}
