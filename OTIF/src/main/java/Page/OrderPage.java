package Page;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Identifier.Orderidentifiers;
import Utility.AppstringsConstant;
import Utility.Helper;
import WebBase.BasePage;
import WebBase.BaseTest;

public class OrderPage extends BasePage{
	
	Orderidentifiers ordid = new Orderidentifiers();
	BaseTest baseT = new BaseTest();
	Helper schelp = new Helper();
	String className = "";
	public ExtentTest logger;
	
	public void AutoTextSelection (String value, String method) throws InterruptedException
	{
		if(method.equals("1")){
		List<WebElement> options = ordid.supplierList.findElements(By.tagName("li"));
				   for (WebElement option1 : options) {
		   if(value.equals(option1.getText()))
		   {
			  // Thread.sleep(4000);
		    option1.click(); 
		   }
		   // Thread.sleep(1000);
		   }	
		}
				   
	}
	
	public void SearchOrderWithOrdnumber() throws InterruptedException{
		 className = this.getClass().getName();
		 createDirectory("OTIF"+ className);
		 logger = baseT.extent.startTest("OrderTest");		 
		ordid.ordertab.click();
		Thread.sleep(2000);
		ordid.Entrepôt.click();
		Select whrhouse = new Select(ordid.Entrepôt);
		whrhouse.selectByVisibleText(AppstringsConstant.ENTERPOTLIST);
		if(schelp.isElementDisable(ordid.OrganisationdAchat)== true){
			logger.log(LogStatus.PASS, "Oraganisation Achat element is disable.");
		}else{
			logger.log(LogStatus.FAIL, "Oraganisation Achat element is enable.");
		}
		ordid.ordernumber.sendKeys(AppstringsConstant.ORDERNUMBER);
		ordid.btnSearch.click();
		Thread.sleep(5000);
		if(schelp.isElementPresent(ordid.showdeletedrows)==true){
			logger.log(LogStatus.PASS, "1.Order search functionality" + "<br/>"
					+"2.Order Number entered in Order Number field"+"<br/>"
					+"3.Orders are displayed for entered number successfully."
					+logger.addScreenCapture(captureScreenShot(driver, "Order displayed")));
		}else{
			logger.log(LogStatus.FAIL, "Orders are not displayed for entered order number"
					+logger.addScreenCapture(captureScreenShot(driver, "Order displayed")));
		}
				
	}
	
	public void SearchOrderWithcreationDate() throws InterruptedException{
		ordid.ordertab.click();
		Thread.sleep(2000);  		
		ordid.Entrepôt.click();
		Select whrhouse = new Select(ordid.Entrepôt);
		whrhouse.selectByVisibleText(AppstringsConstant.ENTERPOTLIST);
		ordid.Creation_Date.click();
		ordid.start_date.click();
		ordid.selectPevYear.click();
		Select year = new Select(ordid.selectPevYear);
		year.selectByVisibleText("2017");
		ordid.startDatePick.click();
				ordid.end_date.click();
		schelp.DateSelect(AppstringsConstant.DATESELECT);
		ordid.supplier.sendKeys("21000113");
		Thread.sleep(2000);
		AutoTextSelection(AppstringsConstant.SELECTSUPPLIER,"1");
		ordid.btnSearch.click();
		Thread.sleep(5000);
		if(schelp.isElementPresent(ordid.showdeletedrows)==true){
			logger.log(LogStatus.PASS, "1.Order search functionality" + "<br/>"
					+"2.Order Number entered in Order Number field"+"<br/>"
					+"3.Orders are displayed for entered number successfully."
					+logger.addScreenCapture(captureScreenShot(driver, "Order displayed")));
		}else{
			logger.log(LogStatus.FAIL, "Orders are not displayed for entered order number"
					+logger.addScreenCapture(captureScreenShot(driver, "Order displayed")));
		}
				
	}
	
	public void SearchOrderWithreceptionDate() throws InterruptedException{
  		
		ordid.ordertab.click();
		Thread.sleep(2000);
		ordid.Entrepôt.click();
		Select whrhouse = new Select(ordid.Entrepôt);
		whrhouse.selectByVisibleText(AppstringsConstant.ENTERPOTLIST);
		ordid.Reception_Date.click();
		ordid.creation_start_date.click();
		ordid.selectPevYear.click();
		Select year = new Select(ordid.selectPevYear);
		year.selectByVisibleText("2017");
		ordid.startDatePick.click();		
		ordid.creation_end_date.click();
		schelp.DateSelect(AppstringsConstant.DATESELECT);
		ordid.supplier.sendKeys("21000113");
		Thread.sleep(4000);
		AutoTextSelection(AppstringsConstant.SELECTSUPPLIER,"1");
		ordid.btnSearch.click();
		Thread.sleep(5000);
		if(schelp.isElementPresent(ordid.showdeletedrows)==true){
			logger.log(LogStatus.PASS, "1.Order search functionality" + "<br/>"
					+"2.Order Number entered in Order Number field"+"<br/>"
					+"3.Orders are displayed for entered number successfully."
					+logger.addScreenCapture(captureScreenShot(driver, "Order displayed")));
		}else{
			logger.log(LogStatus.FAIL, "Orders are not displayed for entered order number"
					+logger.addScreenCapture(captureScreenShot(driver, "Order displayed")));
		}
				
	}

}
