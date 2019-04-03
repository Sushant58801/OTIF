package Identifier;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import WebBase.BasePage;

public class Motifidentifier extends BasePage{
	
	@FindBy(xpath = "//a[contains(@href,'motif')]")
	public WebElement Motifab;
	
	@FindBy(xpath = "//*[@id=\"add_motif\"]")
	public WebElement AddMotif;
		
	@FindBy(xpath = "//*[@id=\"dataTable1_filter\"]/label/input")
	public WebElement searchMotif;
	
	@FindBy(id = "m_code")
	public WebElement motifCode;

	@FindBy(id = "m_label")
	public WebElement motifLabel;
	
	@FindBy(id = "mot_id")
	public WebElement motifID;
	
	@FindBy(id = "create")
	public WebElement motifCreate;
	
	@FindBy(xpath = "//tr[@class='odd']//td[1]")
	public WebElement tbl_Code;
	
	@FindBy(xpath = "//*[@id=\"5\"]/td[2]")
	public WebElement tbl_label;
	
	@FindBy(id = "m_mdf_sgid")
	public WebElement modifySGID;
	
	@FindBy(id = "m_mdf_dt")
	public WebElement modifyDate;
	
	@FindBy(id = "save")
	public WebElement modifySave;
	
	@FindBy(id = "delete")
	public WebElement modifyDelete;
	
	@FindBy(xpath = "//div[@class='alert alert-success']//span")
	public WebElement Msg_createMotif;
	
	
	
}


