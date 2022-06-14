package com.sgtesting.objectmap;

import org.openqa.selenium.Alert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Advance1 {
	public static WebDriver oBrowser=null;
	public static String filename=null;
	public static ObjectMap objectmap=null;
	public static void main(String[] args)
	{
		launchBrowser();
		navigate();
		login();
		minimizewindow();
		CreateUser();
		logout();
		login1();
		logout();
		login2();
		logout();
		login3();
		logout();
		login();
		modifyUserPassword();
		logout();
		loginWithChangePassword1();
		logout();
		loginWithChangePassword2();
		logout();
		loginWithChangePassword3();
		logout();
		login();
		deleteUsers();
		logout();
		closeApplication();

	}
	private static void launchBrowser()
	{
		try
		{
			filename="E:\\SeleniumAutomation\\Automation\\Web-Automation\\ObjectMap\\ObjectMap.properties";
			System.setProperty("webdriver.chrome.driver", "E:\\SeleniumAutomation\\Automation\\Web-Automation\\Library\\Drivers\\chromedriver.exe");
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
	public static void CreateUser()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("homepageuserclicklink")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("userpageadduserclicklink")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("addfirstname")).sendKeys("Poornima");
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("addlastname")).sendKeys("Joshi");
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("addemail")).sendKeys("poornima@gmail.com");
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("adduser1")).sendKeys("User1");
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("addpassword")).sendKeys("user11");
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("addpasswordcopy")).sendKeys("user11");
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("createuserbtn")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("userpageadduserclicklink")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("addfirstname")).sendKeys("Poorva");
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("addlastname")).sendKeys("Joshi");
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("addemail")).sendKeys("poorva@gmail.com");
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("adduser1")).sendKeys("User2");
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("addpassword")).sendKeys("user22");
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("addpasswordcopy")).sendKeys("user22");
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("createuserbtn")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("userpageadduserclicklink")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("addfirstname")).sendKeys("Priya");
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("addlastname")).sendKeys("Joshi");
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("addemail")).sendKeys("priya@gmail.com");
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("adduser1")).sendKeys("User3");
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("addpassword")).sendKeys("user33");
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("addpasswordcopy")).sendKeys("user33");
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("createuserbtn")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void login1()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("loginpageusername")).sendKeys("User1");
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("loginpagepassword")).sendKeys("user11");
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("loginpageloginbtn")).click();
			Thread.sleep(5000);
			oBrowser.findElement(objectmap.getLocator("welcomescreenclick")).click(); 
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void login2()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("loginpageusername")).sendKeys("User2");
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("loginpagepassword")).sendKeys("user22");
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("loginpageloginbtn")).click();
			Thread.sleep(5000);
			oBrowser.findElement(objectmap.getLocator("welcomescreenclick")).click(); 
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void login3()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("loginpageusername")).sendKeys("User3");
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("loginpagepassword")).sendKeys("user33");
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("loginpageloginbtn")).click();
			Thread.sleep(5000);
			oBrowser.findElement(objectmap.getLocator("welcomescreenclick")).click(); 
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void modifyUserPassword()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("homepageuserclicklink")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("clickuser1forchangepassword")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("addpassword")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("addpassword")).sendKeys("user111");
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("addpasswordcopy")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("addpasswordcopy")).sendKeys("user111");
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("savechangesbtn")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("clickuser2forpasswordchange")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("addpassword")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("addpassword")).sendKeys("user222");
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("addpasswordcopy")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("addpasswordcopy")).sendKeys("user222");
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("savechangesbtn")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("clickuser3forpasswordchage")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("addpassword")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("addpassword")).sendKeys("user333");
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("addpasswordcopy")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("addpasswordcopy")).sendKeys("user333");
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("savechangesbtn")).click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void loginWithChangePassword1()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("loginpageusername")).sendKeys("User1");
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("loginpagepassword")).sendKeys("user111");
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("loginpageloginbtn")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void loginWithChangePassword2()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("loginpageusername")).sendKeys("User2");
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("loginpagepassword")).sendKeys("user222");
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("loginpageloginbtn")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void loginWithChangePassword3()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("loginpageusername")).sendKeys("User3");
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("loginpagepassword")).sendKeys("user333");
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("loginpageloginbtn")).click();
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void deleteUsers()
	{
		try
		{
			oBrowser.findElement(objectmap.getLocator("homepageuserclicklink")).click();
			Thread.sleep(2000);
			
			oBrowser.findElement(objectmap.getLocator("clickuser1forchangepassword")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("clickondeletebtnforuserdelete")).click();
			Thread.sleep(2000);
			Alert x=oBrowser.switchTo().alert();
			String y=x.getText();
			System.out.println(y);
			x.accept();
			Thread.sleep(2000);
			
			oBrowser.findElement(objectmap.getLocator("clickuser2forpasswordchange")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("clickondeletebtnforuserdelete")).click();
			Thread.sleep(2000);
			Alert a=oBrowser.switchTo().alert();
			String b=a.getText();
			System.out.println(b);
			x.accept();
			Thread.sleep(2000);
			
			oBrowser.findElement(objectmap.getLocator("clickuser3forpasswordchage")).click();
			Thread.sleep(2000);
			oBrowser.findElement(objectmap.getLocator("clickondeletebtnforuserdelete")).click();
			Thread.sleep(2000);
			Alert p=oBrowser.switchTo().alert();
			String q=p.getText();
			System.out.println(q);
			x.accept();
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
