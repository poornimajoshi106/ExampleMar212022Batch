package com.sgtesting.pageobject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Advance1Demo 
{
	public static WebDriver oBrowser=null;
	public static Actitimepage2 Page=null;
	public static void main(String[] args)
	{
		launchBrowser();
		navigation();
		login();
		minimizeWindow();
		createuser1(); createuser2(); createuser3(); logout();
		loginuser1(); logout();
		loginuser2(); logout();
		loginuser3(); logout();
		login();
		modifyuser1(); modifyuser2(); modifyuser3(); logout();
		loginuser11(); logout();
		loginuser22(); logout();
		loginuser33(); logout();
		login();
		Deleteuser1(); Deleteuser2(); Deleteuser3();
		logout();
		closeApplication();

	}
	public static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver","E:\\SeleniumAutomation\\Automation\\Web-Automation\\Library\\Drivers\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			Page=new Actitimepage2(oBrowser);
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void navigation()
	{
		try
		{
			oBrowser.get("http://localhost:83/login.do");
			Thread.sleep(2000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public static void minimizeWindow()
	{
		try
		{
			Page.getminimize().click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void login()
	{
		try
		{
			Page.getUserName().sendKeys("admin");
			Thread.sleep(1000);
			Page.getPassword().sendKeys("manager");
			Thread.sleep(1000);
			Page.getLogin().click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void createuser1() 
	{
		try {
			Page.getuserclick().click();
			Thread.sleep(1000);
			Page.getadduser().click();
			Thread.sleep(1000);
			Page.getfirstName().sendKeys("Poornima");
			Thread.sleep(1000);
			Page.getlastName().sendKeys("Joshi");
			Thread.sleep(1000);
			Page.getemail().sendKeys("poornima@gmail.com");
			Thread.sleep(1000);
			Page.getuserName().sendKeys("User1");
			Thread.sleep(1000);
			Page.getpassword().sendKeys("User1");
			Thread.sleep(1000);
			Page.getpasswordcopy().sendKeys("User1");
			Thread.sleep(1000);
			Page.getcreateuser().click();
			Thread.sleep(1000);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	private static void createuser2() 
	{
		try {
			Page.getadduser().click();
			Thread.sleep(1000);
			Page.getfirstName().sendKeys("Madhu");
			Thread.sleep(1000);
			Page.getlastName().sendKeys("timmapur");
			Thread.sleep(1000);
			Page.getemail().sendKeys("madhu@gmail.com");
			Thread.sleep(1000);
			Page.getuserName().sendKeys("User2");
			Thread.sleep(1000);
			Page.getpassword().sendKeys("User2");
			Thread.sleep(1000);
			Page.getpasswordcopy().sendKeys("User2");
			Thread.sleep(1000);
			Page.getcreateuser().click();
			Thread.sleep(1000);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	private static void createuser3() 
	{
		try {
			Page.getadduser().click();
			Thread.sleep(1000);
			Page.getfirstName().sendKeys("Pooja");
			Thread.sleep(1000);
			Page.getlastName().sendKeys("Joshi");
			Thread.sleep(1000);
			Page.getemail().sendKeys("pooja@gmail.com");
			Thread.sleep(1000);
			Page.getuserName().sendKeys("User3");
			Thread.sleep(1000);
			Page.getpassword().sendKeys("User3");
			Thread.sleep(1000);
			Page.getpasswordcopy().sendKeys("User3");
			Thread.sleep(1000);
			Page.getcreateuser().click();
			Thread.sleep(1000);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	private static void loginuser1()
	{
		try
		{
			Page.getUserName().sendKeys("User1");
			Thread.sleep(1000);
			Page.getPassword().sendKeys("User1");
			Thread.sleep(1000);
			Page.getLogin().click();
			Thread.sleep(1000);
			Page.getstartexploringactitime().click();
			Thread.sleep(4000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void loginuser2()
	{
		try
		{
			Page.getUserName().sendKeys("User2");
			Thread.sleep(1000);
			Page.getPassword().sendKeys("User2");
			Thread.sleep(1000);
			Page.getLogin().click();
			Thread.sleep(1000);
			Page.getstartexploringactitime().click();
			Thread.sleep(4000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void loginuser3()
	{
		try
		{
			Page.getUserName().sendKeys("User3");
			Thread.sleep(1000);
			Page.getPassword().sendKeys("User3");
			Thread.sleep(1000);
			Page.getLogin().click();
			Thread.sleep(1000);
			Page.getstartexploringactitime().click();
			Thread.sleep(4000);

		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

	private static void modifyuser1() 
	{
		try {
			Page.getuserclick().click();
			Thread.sleep(1000);
			Page.getuser1click().click();
			Thread.sleep(1000);
			Page.getpassword().sendKeys("DummyUser1");
			Thread.sleep(1000);
			Page.getpasswordcopy().sendKeys("DummyUser1");
			Thread.sleep(1000);
			Page.getsavechanges().click();
			Thread.sleep(1000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void modifyuser2()  
	{
		try {
			Page.getuser2click().click();
			Thread.sleep(1000);
			Page.getpassword().sendKeys("DummyUser2");
			Thread.sleep(1000);
			Page.getpasswordcopy().sendKeys("DummyUser2");
			Thread.sleep(1000);
			Page.getsavechanges().click();
			Thread.sleep(1000);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	private static void modifyuser3() 
	{
		try {
			Page.getuser3click().click();
			Thread.sleep(1000);
			Page.getpassword().sendKeys("DummyUser3");
			Thread.sleep(1000);
			Page.getpasswordcopy().sendKeys("DummyUser3");
			Thread.sleep(1000);
			Page.getsavechanges().click();
			Thread.sleep(1000);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	private static void loginuser11()
	{
		try
		{
			Page.getUserName().sendKeys("User1");
			Thread.sleep(1000);
			Page.getPassword().sendKeys("DummyUser1");
			Thread.sleep(1000);
			Page.getLogin().click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void loginuser22()
	{
		try
		{
			Page.getUserName().sendKeys("User2");
			Thread.sleep(1000);
			Page.getPassword().sendKeys("DummyUser2");
			Thread.sleep(1000);
			Page.getLogin().click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void loginuser33()
	{
		try
		{
			Page.getUserName().sendKeys("User3");
			Thread.sleep(1000);
			Page.getPassword().sendKeys("DummyUser3");
			Thread.sleep(1000);
			Page.getLogin().click();
			Thread.sleep(1000);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void Deleteuser1() 
	{
		try {
			Page.getuserclick().click();
			Thread.sleep(1000);
			Page.getuser1click().click();
			Thread.sleep(1000);
			Page.getdeleteuser().click();
			Thread.sleep(1000);
			Alert a=  oBrowser.switchTo().alert();
			String b=a.getText();
			System.out.println(b);
			a.accept();
			Thread.sleep(2000);

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	private static void Deleteuser2()  
	{
		try {
			Page.getuser2click().click();
			Thread.sleep(1000);
			Page.getdeleteuser().click();
			Thread.sleep(1000);
			Alert p =  oBrowser.switchTo().alert();
			String q=p.getText();
			System.out.println(q);
			p.accept();
			Thread.sleep(2000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void Deleteuser3()
	{
		try {
			Page.getuser3click().click();
			Thread.sleep(1000);
			Page.getdeleteuser().click();
			Thread.sleep(1000);
			Alert m =  oBrowser.switchTo().alert();
			String n=m.getText();
			System.out.println(n);
			m.accept();
			Thread.sleep(2000);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void logout()
	{
		try
		{
			Page.getLogout().click();
			Thread.sleep(1000);
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

}
