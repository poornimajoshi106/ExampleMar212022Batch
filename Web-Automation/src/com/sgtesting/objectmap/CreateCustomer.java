package com.sgtesting.objectmap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateCustomer {
	public static WebDriver oBrowser=null;
	public static String filename=null;
	public static ObjectMap objectmap=null;
	public static void main(String[] args)
	{
		launchBrowser();
		navigate();
		login();
		minimizewindow();
		createCustomer();
		deleteCustomer();
		logout();
		closeApplication();

	}
	public static void launchBrowser()
	{
		try
		{
			filename="E:\\SeleniumAutomation\\Automation\\Web-Automation\\ObjectMap\\ObjectMap.properties";
			System.setProperty("webdriver.chrome.driver","E:\\SeleniumAutomation\\Automation\\Web-Automation\\Library\\Drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			objectmap=new ObjectMap(filename);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void navigate()
	{
		try
		{
			oBrowser.get("http://localhost:83/login.do");
			Thread.sleep(4000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	
	private static void closeApplication()
	{
		try
		{
			oBrowser.quit();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void login()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("loginpageusername")).sendKeys("admin");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("loginpagepassword")).sendKeys("manager");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("loginpageloginbtn")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void minimizewindow()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("homepageflyoutwindow")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void logout()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("homepagelogoutlink")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void createCustomer()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("taskclick")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("addnewclick")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("addnewcustomer")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("addcustomername")).sendKeys("Axis Bank");
			Thread.sleep(500);
			oBrowser.findElement(objectmap.getLocator("createcustomer1")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void deleteCustomer()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("taskclickagain")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("settingbtn")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("actionbtn")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("deleteclickcustomer")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("deleteclickcustomerpermanently")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
