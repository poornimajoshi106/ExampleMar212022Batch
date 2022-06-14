package com.sgtesting.objectmap;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateTask {
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
		createProject();
		createTask();
		deleteTasks();
		deleteProject();
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
			oBrowser.findElement(objectmap.getLocator("addcustomername")).sendKeys("My Train");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("createcustomer1")).click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void createProject()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("addnewclick")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("addnewproject")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("addnewprojectname")).sendKeys("Mobile Application");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("newprojectclickbtn")).click();
			Thread.sleep(1000);			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void createTask()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("clicktasktocreatetask")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("clickonnewtasktocreatetask")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("createnewtaskforproject")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("createtask1")).sendKeys("Task1");
			Thread.sleep(500);
			oBrowser.findElement(objectmap.getLocator("createtask2")).sendKeys("Task2");
			Thread.sleep(500);
			oBrowser.findElement(objectmap.getLocator("createtask3")).sendKeys("Task3");
			Thread.sleep(500);
			oBrowser.findElement(objectmap.getLocator("createtaskbtn")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void deleteTasks()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("clicktasktocreatetask")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("clickontask1fordelete")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("clickonactionbtnfordeletetask")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("clickondeletesymboltodeletetask")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("clickondeletepermanentlytask")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void deleteProject()
	{
		try
		{
			/*oBrowser.findElement(By.xpath("//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[2]")).click();
			Thread.sleep(2000);*/
			oBrowser.findElement(objectmap.getLocator("settingbtnproject")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("actionclickproject")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("deleteprojectclick")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("deleteprojectpermanently")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void deleteCustomer()
	{
		try
		{
			//oBrowser.findElement(objectmap.getLocator("taskclickagain")).click();
			//Thread.sleep(1000);
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
