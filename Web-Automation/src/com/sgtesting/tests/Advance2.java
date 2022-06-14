package com.sgtesting.tests;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Advance2 {
	public static WebDriver obrowser = null;
	public static void main(String[] args)
	{

		launchbrowser();
		navigate();
		Login();
		minimizeWindow();
		createuser1(); logout();
		Loginuser1(); createuser2(); logout();
		Loginuser2(); createuser3(); logout();
		Loginuser3(); logout();
		Loginuser22(); modifyuser3(); logout();
		Loginuser33(); logout();
		Loginuser111(); modifyuser2(); logout();
		Loginuser222();  logout();
		Login(); modifyuser1(); logout();
		Loginuser11();  logout();
		Loginuser222(); Deleteuser3();logout();
		Loginuser11(); Deleteuser2();logout();
		Login(); Deleteuser1(); logout();
		closeapp();

	}
	private static void launchbrowser() {
		try {
			System.setProperty("webdriver.chrome.driver", "E:\\SeleniumAutomation\\Automation\\Web-Automation\\Library\\Drivers\\chromedriver.exe");
			obrowser = new ChromeDriver();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void navigate() {
		try {
			obrowser.get("http://localhost:83/login.do");
			Thread.sleep(1000);
		} catch (Exception e) {
			
		}
	}
	private static void Login() {
		try {
			obrowser.findElement(By.name("username")).sendKeys("admin");
			Thread.sleep(1000);
			obrowser.findElement(By.name("pwd")).sendKeys("manager");
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	public static void minimizeWindow()
	{
		try
		{
			obrowser.findElement(By.xpath("//*[@id=\'gettingStartedShortcutsPanelId\']")).click();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void createuser1() 
	{
		try {
			obrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.name("firstName")).sendKeys("Poornima");
			Thread.sleep(1000);
			obrowser.findElement(By.name("lastName")).sendKeys("joshi");
			Thread.sleep(1000);
			obrowser.findElement(By.name("email")).sendKeys("poornima@gmail.com");
			Thread.sleep(1000);
			obrowser.findElement(By.name("username")).sendKeys("User1");
			Thread.sleep(1000);
			obrowser.findElement(By.name("password")).sendKeys("User1");
			Thread.sleep(1000);
			obrowser.findElement(By.name("passwordCopy")).sendKeys("User1");
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	private static void logout() {
		try {
			obrowser.findElement(By.xpath("//*[@id=\'logoutLink\']")).click();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	private static void Loginuser1() {
		try {
			obrowser.findElement(By.name("username")).sendKeys("User1");
			Thread.sleep(1000);
			obrowser.findElement(By.name("pwd")).sendKeys("User1");
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div/span[1]")).click();
			Thread.sleep(4000);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	private static void createuser2() 
	{
		try {
			obrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\"createUserDiv\"]/div/div[2]")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.name("firstName")).sendKeys("Madhu");
			Thread.sleep(1000);
			obrowser.findElement(By.name("lastName")).sendKeys("timmapur");
			Thread.sleep(1000);
			obrowser.findElement(By.name("email")).sendKeys("madhu@gmail.com");
			Thread.sleep(1000);
			obrowser.findElement(By.name("username")).sendKeys("User2");
			Thread.sleep(1000);
			obrowser.findElement(By.name("password")).sendKeys("User2");
			Thread.sleep(1000);
			obrowser.findElement(By.name("passwordCopy")).sendKeys("User2");
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	private static void Loginuser2() {
		try {
			obrowser.findElement(By.name("username")).sendKeys("User2");
			Thread.sleep(1000);
			obrowser.findElement(By.name("pwd")).sendKeys("User2");
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();
			Thread.sleep(4000);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	private static void createuser3() 
	{
		try {
			obrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'createUserDiv\']/div/div[2]")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.name("firstName")).sendKeys("Bhuvana");
			Thread.sleep(1000);
			obrowser.findElement(By.name("lastName")).sendKeys("k");
			Thread.sleep(1000);
			obrowser.findElement(By.name("email")).sendKeys("bhuvana@gmail.com");
			Thread.sleep(1000);
			obrowser.findElement(By.name("username")).sendKeys("User3");
			Thread.sleep(1000);
			obrowser.findElement(By.name("password")).sendKeys("User3");
			Thread.sleep(1000);
			obrowser.findElement(By.name("passwordCopy")).sendKeys("User3");
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(4000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	private static void Loginuser3() {
		try {
			obrowser.findElement(By.name("username")).sendKeys("User3");
			Thread.sleep(1000);
			obrowser.findElement(By.name("pwd")).sendKeys("User3");
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'welcomeScreenBoxId\']/div[3]/div/span[1]")).click();
			Thread.sleep(4000);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	private static void Loginuser22() {
		try {
			obrowser.findElement(By.name("username")).sendKeys("User2");
			Thread.sleep(1000);
			obrowser.findElement(By.name("pwd")).sendKeys("User2");
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	private static void modifyuser3() {
		try {
			obrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//span[text()='k, Bhuvana']")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.name("password")).sendKeys("Demouser3");
			Thread.sleep(1000);
			obrowser.findElement(By.name("passwordCopy")).sendKeys("Demouser3");
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(1000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	private static void Loginuser33() {
		try {
			obrowser.findElement(By.name("username")).sendKeys("User3");
			Thread.sleep(1000);
			obrowser.findElement(By.name("pwd")).sendKeys("Demouser3");
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	private static void Loginuser11() {
		try {
			obrowser.findElement(By.name("username")).sendKeys("User1");
			Thread.sleep(1000);
			obrowser.findElement(By.name("pwd")).sendKeys("Demouser1");
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	private static void Loginuser111() {
		try {
			obrowser.findElement(By.name("username")).sendKeys("User1");
			Thread.sleep(1000);
			obrowser.findElement(By.name("pwd")).sendKeys("User1");
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(1000);
			//obrowser.findElement(By.xpath("//*[@id=\"welcomeScreenBoxId\"]/div[3]/div/span[1]")).click();
			//Thread.sleep(4000);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	private static void modifyuser2() {
		try {
			obrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//span[text()='timmapur, Madhu']")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.name("password")).sendKeys("Demouser2");
			Thread.sleep(1000);
			obrowser.findElement(By.name("passwordCopy")).sendKeys("Demouser2");
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(1000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	private static void Loginuser222() {
		try {
			obrowser.findElement(By.name("username")).sendKeys("User2");
			Thread.sleep(1000);
			obrowser.findElement(By.name("pwd")).sendKeys("Demouser2");
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'loginButton\']/div")).click();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	private static void modifyuser1() {
		try {
			obrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//span[text()='joshi, Poornima']")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.name("password")).sendKeys("Demouser1");
			Thread.sleep(1000);
			obrowser.findElement(By.name("passwordCopy")).sendKeys("Demouser1");
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_commitBtn\']/div/span")).click();
			Thread.sleep(1000);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	private static void Deleteuser3() {
		try {
			obrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//span[text()='k, Bhuvana']")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_deleteBtn\']")).click();
			Thread.sleep(1000);
			Alert a = obrowser.switchTo().alert();
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
			obrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//span[text()='timmapur, Madhu']")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_deleteBtn\']")).click();
			Thread.sleep(1000);
			Alert X = obrowser.switchTo().alert();
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
			obrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[1]")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//span[text()='joshi, Poornima']")).click();
			Thread.sleep(1000);
			obrowser.findElement(By.xpath("//*[@id=\'userDataLightBox_deleteBtn\']")).click();
			Thread.sleep(1000);
			Alert P = obrowser.switchTo().alert();
			String Q = P.getText();
			System.out.println(Q);
			P.accept();
			Thread.sleep(1000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	} private static void closeapp() {
		try {
			obrowser.quit();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}

