package Identifier;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import WebBase.BasePage;
//testdsf
//tes
public class ImportExcelIdentifiers extends BasePage{
	
	@FindBy(xpath="//a[contains(@href,'import')]")
	public WebElement importexcelTab;
	
	@FindBy(id="importFile")
	public WebElement importfilebutton;
	
	@FindBy(id="importSubmitBtn")
	public WebElement importSubmitBtn;
	
	@FindBy(id="importResetBtn")
	public WebElement importResetBtn;
	
	@FindBy(id="error_msg_div")
	public WebElement error_msg_div;
	
	


}
