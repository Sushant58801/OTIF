package Identifier;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import WebBase.BasePage;

public class Orderidentifiers extends BasePage{
	
	@FindBy(xpath = "//a[contains(@href,'order')]")
	public WebElement ordertab;
	
	@FindBy(id = "warehouse")
	public WebElement Entrepôt;
	
	@FindBy(id = "po")
	public WebElement  	OrganisationdAchat;
	
	@FindBy(id = "order_number")
	public WebElement  	ordernumber;
	
	@FindBy(xpath = "//input[@name='datetype'][2]")
	public WebElement  	Reception_Date;	
	
	@FindBy(xpath = "//input[@name='datetype'][1]")
	public WebElement  	Creation_Date;
	
	@FindBy(id = "start_date")
	public WebElement  	start_date;
	
	@FindBy(id = "creation_start_date")
	public WebElement  	creation_start_date;
	
	@FindBy(id = "creation_end_date")
	public WebElement  	creation_end_date;
	
	@FindBy(id = "end_date")
	public WebElement  	end_date;	
		
	@FindBy(id = "supplier")
	public WebElement  	supplier;
	
	@FindBy(xpath = "//ul[@id='suggestion']")
	public WebElement  	supplierList;
	
	@FindBy(id = "btnSearch")
	public WebElement  	btnSearch;	
	
	@FindBy(id = "MSO_MDF_CONF_OT_IND-0")
	public WebElement  	showdeletedrows;
	
	@FindBy(xpath = "//a[text()='1']")
	public WebElement startDatePick;
	
	@FindBy(xpath = "//select[@class='ui-datepicker-year']")
	public WebElement selectPevYear;
	
	@FindBy(xpath = "//table[@class='ui-datepicker-calendar']//a[@href='#']")
	public WebElement enddate;
	
	
	
	
	
	
	

}
