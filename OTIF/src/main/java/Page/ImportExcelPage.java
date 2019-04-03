package Page;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Identifier.ImportExcelIdentifiers;
import Utility.AppstringsConstant;
import WebBase.BasePage;
import WebBase.BaseTest;

public class ImportExcelPage extends BasePage{
	
	ImportExcelIdentifiers excelid = new ImportExcelIdentifiers();
	String className = "";
	public ExtentTest logger;
	BaseTest baseT = new BaseTest();
	
	String UserDriectory = System.getProperty("user.dir")+"\\ExcelFiles";
	
	public void OtherthenExcel() throws InterruptedException{		
		className = this.getClass().getName();
		createDirectory("OTIF" + className);
		logger = baseT.extent.startTest("Excel Data import Test");
		excelid.importexcelTab.click();
		Thread.sleep(1000);
		excelid.importfilebutton.sendKeys(UserDriectory+"\\Display order results.docx");
		excelid.importSubmitBtn.click();
		if(excelid.error_msg_div.getText().equals(AppstringsConstant.WRONGDOC) == true){
			logger.log(LogStatus.PASS,
					"1: Excel import file " + "<br/>" + "2 : Verify details on Page" + "<br/>"
							+ "<b>Result: excel  doc incorrect message is verified. <b>"
							+ logger.addScreenCapture(captureScreenShot(driver, "Verify with incorrect doc")));
		} else {
			logger.log(LogStatus.FAIL, "error message  is not verified");
		}			
	}
	
	public void InvalidRowsCount() throws InterruptedException{			
	
		excelid.importfilebutton.sendKeys(UserDriectory+"\\otif_sap_orders_5002.xlsx");
		excelid.importSubmitBtn.click();
		if(excelid.error_msg_div.getText().equals(AppstringsConstant.MORETHEN5000MSG) == true){
			logger.log(LogStatus.PASS,
					"1: Excel import file " + "<br/>" + "2 : Verify details on Page" + "<br/>"
							+ "<b>Result: excel more then 5000 rows  message is verified. <b>"
							+ logger.addScreenCapture(captureScreenShot(driver, "Verify with   rows count")));
		} else {
			logger.log(LogStatus.FAIL, "error message  is not verified");
		}	
		
	}
	
	public void InvalidTables() throws InterruptedException{			
		
		excelid.importfilebutton.sendKeys(UserDriectory+"\\otif_sap_orders_5000 - InvalidTables.xlsx");
		excelid.importSubmitBtn.click();
		if(excelid.error_msg_div.getText().equals(AppstringsConstant.WRONGFILEFORMAT) == true){
			logger.log(LogStatus.PASS,
					"1: Excel import file " + "<br/>" + "2 : Verify details on Page" + "<br/>"
							+ "<b>Result: excel more with invalid column structor  message is verified. <b>"
							+ logger.addScreenCapture(captureScreenShot(driver, "Verify with   rows count")));
		} else {
			logger.log(LogStatus.FAIL, "error message  is not verified");
		}	
		
	}
	
		public void validExcelfile() throws InterruptedException{			
		
		excelid.importfilebutton.sendKeys(UserDriectory+"\\otif_test_5000_SAP.xlsx");
		excelid.importSubmitBtn.click();
		Thread.sleep(10000);
		if(excelid.error_msg_div.getText().contains(AppstringsConstant.SUCESSMESSAGE) == true){
			logger.log(LogStatus.PASS,
					"1: Excel import file " + "<br/>" + "2 : Verify details on Page" + "<br/>"
							+ "<b>Result: excel more with invalid column structor  message is verified. <b>"
							+ logger.addScreenCapture(captureScreenShot(driver, "Verify with   rows count")));
		} else {
			logger.log(LogStatus.FAIL, "error message  is not verified");
		}	
		
	}
		

}
