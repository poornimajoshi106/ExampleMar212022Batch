package com.sgtesting.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Actitimepage2
{

	public Actitimepage2(WebDriver oBrowser)
	{
		PageFactory.initElements(oBrowser, this);
	}
	
	private WebElement username;
	public WebElement getUserName() {
		return username;
	}
	
	private WebElement pwd;
	public WebElement getPassword() {
		return pwd;
	}
	
	@FindBy(xpath="//*[@id=\'loginButton\']/div")
	private WebElement Login;
	public WebElement getLogin() {
	return Login;
	}
	
	@FindBy(xpath="//*[@id=\'gettingStartedShortcutsPanelId\']")
	private WebElement minimize;	
	public WebElement getminimize() {
		return minimize;
	}
	
	@FindBy(xpath="//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[1]")
	private WebElement user;
	public WebElement getuserclick() {
		return user;
	}
	
	@FindBy(xpath="//*[@id=\'createUserDiv\']/div/div[2]")
	private WebElement adduser;
	public WebElement getadduser() {
		return adduser;
	}
	
	private WebElement firstName;
	public WebElement getfirstName() {
		return firstName;
	}
	
	private WebElement lastName;
	public WebElement getlastName() {
		return lastName;
	}
	
	private WebElement email;
	public WebElement getemail() {
		return email;
	}
	
	private WebElement userDataLightBox_usernameField;
	public WebElement getuserName() {
		return userDataLightBox_usernameField;
	}
	
	private WebElement password;
	public WebElement getpassword() {
		return password;
	}
	
	private WebElement passwordCopy;
	public WebElement getpasswordcopy() {
		return passwordCopy;
	}
	
	@FindBy(xpath="//*[@id=\'userDataLightBox_commitBtn\']/div/span")
	private WebElement createuser;
	public WebElement getcreateuser() {
		return createuser;
	}
	
	//login as user1
	@FindBy(xpath="//*[@id=\"welcomeScreenBoxId\"]/div[3]/div/span[1]")
	private WebElement explore;
	public WebElement getstartexploringactitime() {
		return explore;
	}
	
	//click on user1 to modify password
	@FindBy(xpath="//span[text()='Joshi, Poornima']")
	private WebElement modify1;
	public WebElement getuser1click() {
		return modify1;
	}
	
	@FindBy(xpath="//span[text()='Save Changes']")
	private WebElement savechanges;
	public WebElement getsavechanges() {
		return savechanges;
	}
	
	//click on user2 to modify password
	@FindBy(xpath="//span[text()='timmapur, Madhu']")
	private WebElement modify2;
	public WebElement getuser2click() {
		return modify2;
	}
	
	//click on user3 to modify password
	@FindBy(xpath="//span[text()='Joshi, Pooja']")
	private WebElement modify3;
	public WebElement getuser3click() {
		return modify3;
	}
	
	//delete user1
	private WebElement userDataLightBox_deleteBtn;
	public WebElement getdeleteuser() {
		return userDataLightBox_deleteBtn;
	}
	
	@FindBy(xpath="//*[@id='logoutLink']")
	private WebElement logout;
	public WebElement getLogout() {
		return logout;
	}
}
