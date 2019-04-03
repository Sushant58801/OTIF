package Identifier;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import WebBase.BasePage;

public class LoginIdentifier extends BasePage {
	
	@FindBy(id = "buttonConnect")
	public WebElement btn_ssoConnection;
	
	@FindBy(xpath ="//*[@id=\"links\"]/a")
	public WebElement loginpagelink;
	
	@FindBy(xpath ="//*[@id=\"error\"]/span")
	public WebElement errormsg;
	
	@FindBy(xpath ="//*[@id=\"formAutoLogin\"]/a")
	public WebElement useanotherloginlink;		
	
	@FindBy(id="password")
	public WebElement txt_SGpassword;
	
	@FindBy(id="username")
	public WebElement txt_SGusername;
	
	@FindBy(xpath = "/html/body/div[1]/div[1]/div[2]/div/ul/li[4]/a")
	public WebElement usertab;
	

	
}
