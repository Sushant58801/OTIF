package Identifier;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import WebBase.BasePage;

public class userIdentifier extends BasePage{
	
	@FindBy(xpath = "//a[contains(@href,'user')]")
	public WebElement usertab;
	
	@FindBy(xpath = "//*[@id=\"add_user\"]")
	public WebElement createUser;
	
	@FindBy(id = "user_sgid")
	public WebElement UserSGID;
	
	@FindBy(id = "user_firstname")
	public WebElement Userfirstname;
	
	@FindBy(id = "user_lastname")
	public WebElement UserLastname;
	
	@FindBy(id = "user_role")
	public WebElement UserRole;
	
	@FindBy(id = "submitUserForm")
	public WebElement Createuserbutton;
	
	@FindBy(xpath = "//*[@id=\"user_form\"]/fieldset/div/div[2]/div/div/div[1]/div/button[1]")
	public WebElement selectWarehouse;
	
	@FindBy(xpath = "//*[@id=\"user_table\"]/tbody/tr[1]/td[1]")
	public WebElement tbl_Name;
	
	@FindBy(xpath = "//*[@id=\"user_table\"]/tbody/tr[1]/td[2]")
	public WebElement tbl_SGID;
	
	@FindBy(xpath = "//*[@id=\"user_table\"]/tbody/tr[1]/td[3]")
	public WebElement tbl_Role;
	
	@FindBy(xpath = "//*[@id=\"user_table\"]/tbody/tr[1]/td[4]")
	public WebElement tbl_Status;
	
	@FindBy(xpath = "//*[@id=\"user_table\"]/tbody/tr[1]/td[5]")
	public WebElement tbl_Warehouse;
	
	@FindBy(xpath = "//*[@id=\"user_table\"]/tbody/tr[1]/td[6]")
	public WebElement tbl_EditUser;
	
	@FindBy(xpath = "//*[@id=\"main_container\"]/div[1]")
	public WebElement Usersuccessmsg;
	
	@FindBy(xpath = "//*[@id=\"user_table_filter\"]/label/input")
	public WebElement Usersearch;
	
	@FindBy(xpath = "//*[@id=\"main_container\"]/div[1]")
	public WebElement Editusersuccessmsg;
	
	
}
