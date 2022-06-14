package com.sgtesting.objectmap;


import org.openqa.selenium.Alert;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Advance2 {
	public static WebDriver oBrowser=null;
	public static String filename=null;
	public static ObjectMap objectmap=null;
	public static void main(String[] args) 
	{
		launchBrowser();
		navigate();
		login();
		minimizewindow();
		createuser1(); logout();
		Loginuser1(); createuser2(); logout();
		Loginuser2(); createuser3(); logout();
		Loginuser3(); logout();
		Loginuser22(); modifyuser3(); logout();
		Loginuser33(); logout();
		Loginuser111(); modifyuser2(); logout();
		Loginuser222();  logout();
		login(); modifyuser1(); logout();
		Loginuser11();  logout();
		Loginuser222(); Deleteuser3();logout();
		Loginuser11(); Deleteuser2();logout();
		login(); Deleteuser1(); logout();
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
	private static void createuser1() 
	{
		try {
			oBrowser.findElement(objectmap.getLocator("homepageuserclicklink")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("userpageadduserclicklink")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("addfirstname")).sendKeys("Poornima");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("addlastname")).sendKeys("joshi");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("addemail")).sendKeys("poornima@gmail.com");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("adduser1")).sendKeys("User1");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("addpassword")).sendKeys("User1");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("addpasswordcopy")).sendKeys("User1");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("createuserbtn")).click();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	private static void Loginuser1() {
		try {
			oBrowser.findElement(objectmap.getLocator("loginpageusername")).sendKeys("User1");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("loginpagepassword")).sendKeys("User1");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("loginpageloginbtn")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("welcomescreenclick")).click();
			Thread.sleep(4000);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	private static void createuser2() 
	{
		try {
			oBrowser.findElement(objectmap.getLocator("homepageuserclicklink")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("userpageadduserclicklink")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("addfirstname")).sendKeys("Madhu");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("addlastname")).sendKeys("timmapur");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("addemail")).sendKeys("madhu@gmail.com");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("adduser1")).sendKeys("User2");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("addpassword")).sendKeys("User2");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("addpasswordcopy")).sendKeys("User2");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("createuserbtn")).click();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void Loginuser2() {
		try {
			oBrowser.findElement(objectmap.getLocator("loginpageusername")).sendKeys("User2");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("loginpagepassword")).sendKeys("User2");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("loginpageloginbtn")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("welcomescreenclick")).click();
			Thread.sleep(4000);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	private static void createuser3() 
	{
		try {
			oBrowser.findElement(objectmap.getLocator("homepageuserclicklink")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("userpageadduserclicklink")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("addfirstname")).sendKeys("Bhuvana");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("addlastname")).sendKeys("k");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("addemail")).sendKeys("bhuvana@gmail.com");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("adduser1")).sendKeys("User3");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("addpassword")).sendKeys("User3");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("addpasswordcopy")).sendKeys("User3");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("createuserbtn")).click();
			Thread.sleep(4000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	private static void Loginuser3() {
		try {
			oBrowser.findElement(objectmap.getLocator("loginpageusername")).sendKeys("User3");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("loginpagepassword")).sendKeys("User3");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("loginpageloginbtn")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("welcomescreenclick")).click();
			Thread.sleep(4000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void Loginuser22() {
		try {
			oBrowser.findElement(objectmap.getLocator("loginpageusername")).sendKeys("User2");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("loginpagepassword")).sendKeys("User2");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("loginpageloginbtn")).click();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	private static void modifyuser3() {
		try {
			oBrowser.findElement(objectmap.getLocator("modifypasswordforuser3")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("modifyuser3password")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("addpassword")).sendKeys("Demouser3");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("addpasswordcopy")).sendKeys("Demouser3");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("savechangesbtn")).click();
			Thread.sleep(1000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void Loginuser33() {
		try {
			oBrowser.findElement(objectmap.getLocator("loginpageusername")).sendKeys("User3");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("loginpagepassword")).sendKeys("Demouser3");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("loginpageloginbtn")).click();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void Loginuser111() {
		try {
			oBrowser.findElement(objectmap.getLocator("loginpageusername")).sendKeys("User1");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("loginpagepassword")).sendKeys("User1");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("loginpageloginbtn")).click();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	private static void modifyuser2() {
		try {
			oBrowser.findElement(objectmap.getLocator("modifypasswordforuser3")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("modifyuser2password")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("addpassword")).sendKeys("Demouser2");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("addpasswordcopy")).sendKeys("Demouser2");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("savechangesbtn")).click();
			Thread.sleep(1000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	private static void Loginuser222() {
		try {
			oBrowser.findElement(objectmap.getLocator("loginpageusername")).sendKeys("User2");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("loginpagepassword")).sendKeys("Demouser2");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("loginpageloginbtn")).click();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void modifyuser1() {
		try {
			oBrowser.findElement(objectmap.getLocator("modifypasswordforuser3")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("modifyuser1password")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("addpassword")).sendKeys("Demouser1");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("addpasswordcopy")).sendKeys("Demouser1");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("savechangesbtn")).click();
			Thread.sleep(1000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	private static void Loginuser11() {
		try {
			oBrowser.findElement(objectmap.getLocator("loginpageusername")).sendKeys("User1");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("loginpagepassword")).sendKeys("Demouser1");
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("loginpageloginbtn")).click();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void Deleteuser3() {
		try {
			oBrowser.findElement(objectmap.getLocator("modifypasswordforuser3")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("modifyuser3password")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("deleteuser1")).click();
			Thread.sleep(1000);
			Alert a = oBrowser.switchTo().alert();
			String s = a.getText();
			System.out.println(s);
			a.accept();
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	private static void Deleteuser2() {
		try {
			oBrowser.findElement(objectmap.getLocator("modifypasswordforuser3")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("modifyuser2password")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("deleteuser1")).click();
			Thread.sleep(1000);
			Alert X = oBrowser.switchTo().alert();
			String Y = X.getText();
			System.out.println(Y);
			X.accept();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	private static void Deleteuser1() {
		try {
			oBrowser.findElement(objectmap.getLocator("modifypasswordforuser3")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("modifyuser1password")).click();
			Thread.sleep(1000);
			oBrowser.findElement(objectmap.getLocator("deleteuser1")).click();
			Thread.sleep(1000);
			Alert P = oBrowser.switchTo().alert();
			String Q = P.getText();
			System.out.println(Q);
			P.accept();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	} 

}
