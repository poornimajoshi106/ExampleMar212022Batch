package com.sgtesting.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimePage
{
	public ActiTimePage(WebDriver oBrowser)
	{
		PageFactory.initElements(oBrowser, this);
	}
	
	//UserName Text Field
	private WebElement username;
	public WebElement getUserName()
	{
		return username;
	}
	//Password Text Field
	private WebElement pwd;
	public WebElement getPassword()
	{
		return pwd;
	}
	
	//Login button field
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement oLogin;
	public WebElement getLogin()
	{
		return oLogin;
	}
	
	//FlyOutwindow field
	private WebElement gettingStartedShortcutsPanelId;
	public WebElement getFlyOutWindow()
	{
		return gettingStartedShortcutsPanelId;
	}
	
	
	//Logout Link
	@FindBy(linkText="Logout")
	private WebElement oLogout;
	public WebElement getLogout()
	{
		return oLogout;
	}
	
	@FindBy(xpath="//*[@id=\'topnav\']/tbody/tr[1]/td[5]/a/div[1]")
	private WebElement userclick;
	public WebElement getuser() {
		return userclick;
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
	public WebElement getusername() {
		return userDataLightBox_usernameField;
	}
	private WebElement password;
	public WebElement getpwd() {
		return password;
	}
	private WebElement passwordCopy;
	public WebElement getpasswordCopy() {
		return passwordCopy;
	}
	@FindBy(xpath="//*[@id=\'userDataLightBox_commitBtn\']/div/span")
	private WebElement usercreate;
	public WebElement getcreateuser() {
		return usercreate;
	}
	@FindBy(xpath="//span[text()='Joshi, Poornima']")
	private WebElement userdelete;
	public WebElement getusernameclick1() {
		return userdelete;
	}
	
	private WebElement userDataLightBox_deleteBtn;
	public WebElement getdeleteuser() {
		return userDataLightBox_deleteBtn;
	}
	@FindBy(xpath="//*[@id=\'userDataLightBox_commitBtn\']/div/span")
	private WebElement saveclick;
	public WebElement getsavechangesclick() {
		return saveclick;
	}
	@FindBy(xpath="//span[text()='Joshi, Poornima']")
	private WebElement usermodify;
	public WebElement getusernameclick() {
		return usermodify;
	}
	
	@FindBy(xpath="//span[text()='joshi, Poornima']")
	private WebElement userdelete1;
	public WebElement getusernameclick11() {
	
		return userdelete1;
	}
	@FindBy(xpath="//div[text()='TASKS']")
	private WebElement task;
	public WebElement getclicktask() {
		
		return task;
	}
	@FindBy(xpath="//div[text()='Add New']")
	private WebElement addnew;
	public WebElement getclickadduser() {
	
		return addnew;
	}
	@FindBy(xpath="//div[text()='+ New Customer']")
	private WebElement addnewCustomer;
	public WebElement getnewcustomer() {
	
		return addnewCustomer;
	}
	private WebElement customerLightBox_nameField;
	public WebElement getenternewcustomer() {
	
		return customerLightBox_nameField;
	}
	@FindBy(xpath="//span[text()='Create Customer']")
	private WebElement customer;
	public WebElement getcreatecustomer() {
		
		return customer;
	}
	@FindBy(xpath="//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")
	private WebElement gearclick;
	public WebElement getgearclick() {
		return gearclick;
	}
	@FindBy(xpath="//div[text()='ACTIONS']")
	private WebElement actions;
	public WebElement getactions() {
		return actions;
	}
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[2]/div[4]/div/div[3]/div")
	private WebElement actions1;
	public WebElement getdeletecuatomer() {
		return actions1;
	}
	@FindBy(xpath="//*[@id=\'customerPanel_deleteConfirm_submitTitle\']")
	private WebElement action2;
	public WebElement getdeletepermanently() {
		return action2;
	}
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[3]/div/div[1]")
	private WebElement action3;
	public WebElement getNewCustomer() {
		
		// TODO Auto-generated method stub
		return action3;
	}
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[3]/div/div[2]/input")
	private WebElement customermodify;
	public WebElement getclearNewCustomer() {
		
		return customermodify;
	}
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[2]/div[1]/div[2]")
	private WebElement sideclick;
	public WebElement getclickelsewhere() {
		return sideclick;
	}
	
	@FindBy(xpath="//div[text()='TASKS']")
	private WebElement taskproject;
	public WebElement getclicktask1() {
		return taskproject;
	}
	
	@FindBy(xpath="//div[text()='Add New']")
	private WebElement addnew1;
	public WebElement getaddNew() {
		return addnew1;
	}
	
	@FindBy(xpath="//div[text()='+ New Project']")
	private WebElement addnewproject;
	public WebElement addnewProject() {
		return addnewproject;
	}
	private WebElement projectPopup_projectNameField;
	public WebElement addnewProjectName() {
		return projectPopup_projectNameField;
	}
	
	@FindBy(xpath="//span[text()='Create Project']")
	private WebElement addnewprojectsave;
	public WebElement addtoProject() {
		return addnewprojectsave;
	}
	
	@FindBy(xpath="//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[2]")
	private WebElement deleteproject1;
	public WebElement getdeleteProject1() {
		return deleteproject1;
	}
	
	@FindBy(xpath="//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")
	private WebElement deleteproject11;
	public WebElement getdeleteProject11() {
		return deleteproject11;
	}
	
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[4]/div[1]/div[2]/div[3]/div/div/div[2]")
	private WebElement deleteproject111;
	public WebElement getdeleteProject111() {
		return deleteproject111;
	}
	
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[4]/div[4]/div/div[3]/div")
	private WebElement deleteproject1111;
	public WebElement getdeleteProject1111() {
		return deleteproject1111;
	}
	
	@FindBy(xpath="//*[@id=\'projectPanel_deleteConfirm_submitTitle\']")
	private WebElement deleteproject11111;
	public WebElement getdeleteProject11111() {
		return deleteproject11111;
	}
	
	@FindBy(xpath="//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[2]")
	private WebElement ModifyDemo1;
	public WebElement getModifyProject1() {
		return ModifyDemo1;
	}
	
	@FindBy(xpath="//*[@id=\"cpTreeBlock\"]/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")
	private WebElement ModifyDemo11;
	public WebElement getModifyProject11() {
		return ModifyDemo11;
	}
	
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[4]/div[1]/div[2]/div[2]/div/div[1]")
	private WebElement ModifyDemo111;
	public WebElement getModifyProject111() {
		return ModifyDemo111;
	}
	
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[4]/div[1]/div[2]/div[2]/div/div[2]/input")
	private WebElement ModifyDemo1111;
	public WebElement getModifyProject1111() {
		return ModifyDemo1111;
	}
	
	@FindBy(xpath="//*[@id=\"taskListBlock\"]/div[4]/div[1]/div[2]/div[2]/div/div[2]/input")
	private WebElement ModifyDemo11111;
	public WebElement getModifyProject11111() {
		return ModifyDemo11111;
	}
	
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[4]/div[1]/div[2]/div[1]")
	private WebElement ModifyDemo111111;
	public WebElement getAnywhereModify() {
		return ModifyDemo111111;
	}
	
	@FindBy(xpath="//div[text()='TASKS']")
	private WebElement TaskDemo1;
	public WebElement getDemoTask1() {
		return null;
	}
	
	@FindBy(xpath="//div[text()='Add New Task']")
	private WebElement TaskDemo11;
	public WebElement getDemoTask11() {
		return TaskDemo11;
	}
	
	@FindBy(xpath="//div[text()='Create new tasks']")
	private WebElement TaskDemo111;
	public WebElement getDemoTask111() {
		return TaskDemo111;
	}
	
	@FindBy(xpath="//*[@id=\'createTasksPopup_createTasksTableContainer\']/table/tbody/tr[1]/td[1]/input")
	private WebElement TaskDemo12;
	public WebElement getDemoTask12() {
		return TaskDemo12;
	}
	
	@FindBy(xpath="//*[@id=\'createTasksPopup_createTasksTableContainer\']/table/tbody/tr[2]/td[1]/input")
	private WebElement TaskDemo13;
	public WebElement getDemoTask13() {
		return TaskDemo13;
	}
	
	@FindBy(xpath="//*[@id=\'createTasksPopup_createTasksTableContainer\']/table/tbody/tr[3]/td[1]/input")
	private WebElement TaskDemo14;
	public WebElement getDemoTask14() {
		return TaskDemo14;
	}
	
	@FindBy(xpath="//span[text()='Create Tasks']")
	private WebElement TaskDemo1111;
	public WebElement getDemoTask1111() {
		return TaskDemo1111;
	}
	
	@FindBy(xpath="//div[text()='TASKS']")
	private WebElement TaskDelete1;
	public WebElement getDemoDelete1() {
		return TaskDelete1;
	}
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[1]/div[2]/div[1]/table[1]/tbody/tr[1]/td[2]/div/div[2]")
	private WebElement TaskDelete12;
	public WebElement getDemoDelete12() {
		return TaskDelete12;
	}
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[3]/div[1]/div[2]/div[3]/div/div/div[2]")
	private WebElement TaskDelete13;
	public WebElement getDemoDelete13() {
		return TaskDelete13;
	}
	
	@FindBy(xpath="//*[@id=\'taskListBlock\']/div[3]/div[4]/div/div[3]/div")
	private WebElement TaskDelete14;
	public WebElement getDemoDelete14() {
		return TaskDelete14;
	}
	
	@FindBy(xpath="//*[@id=\'taskPanel_deleteConfirm_submitTitle\']")
	private WebElement TaskDelete15;
	public WebElement getDemoDelete15() {
		return TaskDelete15;
	}
}
