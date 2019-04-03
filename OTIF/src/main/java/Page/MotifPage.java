package Page;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Identifier.LoginIdentifier;
import Identifier.Motifidentifier;
import Identifier.userIdentifier;
import Utility.AppstringsConstant;
import Utility.Helper;
import WebBase.BasePage;
import WebBase.BaseTest;
import junit.framework.Assert;

public class MotifPage extends BasePage {

	LoginIdentifier Log = new LoginIdentifier();
	Helper help = new Helper();
	userIdentifier ui = new userIdentifier();
	String SGID = help.randomSGIDGenerator();
	String Code = help.randomMOTIFCODEGenerator();
	String EditCode = help.randomMOTIFCODEGenerator();
	BaseTest baseT = new BaseTest();
	String editSGID = help.randomSGIDGenerator();
	Motifidentifier motif = new Motifidentifier();
	String className = "";
	public ExtentTest logger;

	public void motiffun(String code, String label) {
		motif.motifCode.sendKeys(code);
		motif.motifLabel.sendKeys(label);

	}

	public void CreateNewMOTIF() throws InterruptedException {
		className = this.getClass().getName();
		createDirectory("Motif" + className);
		logger = baseT.extent.startTest("Motif Test");
		motif.Motifab.click();
		Thread.sleep(2000);
		motiffun(Code, AppstringsConstant.MOTIFLABEL);
		motif.motifCreate.click();
		Thread.sleep(2000);
		System.out.println(motif.Msg_createMotif.getText());
		if (motif.Msg_createMotif.getText().equals(AppstringsConstant.MOTIFCRTMSG) == true) {
			logger.log(LogStatus.PASS,
					"1:  Create motif " + "<br/>" + "2 : Creation of new motif. " + "<br/>"
							+ "<b>Result: New motif is created successfully <b>"
							+ logger.addScreenCapture(captureScreenShot(driver, "Create new motif")));
		} else {
			logger.log(LogStatus.FAIL, "Success message is not displayed.");
		}

	}

	public void EditMOTIF() throws InterruptedException {
		motif.searchMotif.sendKeys(Code);
		Thread.sleep(1000);
		motif.tbl_Code.click();
		motif.motifCode.clear();
		motiffun(EditCode, AppstringsConstant.MOTIFLABEL);
		if(motif.motifID.isEnabled() && motif.modifyDate.isEnabled() && motif.modifySGID.isEnabled()){
			logger.log(LogStatus.FAIL, "Assert PASS :Log for modify of motif is wrong");
		}else{
			logger.log(LogStatus.PASS, "Assert PASS :Log for modify of motif is correct");
		}

		motif.modifySave.click();
		Thread.sleep(2000);
		if (motif.Msg_createMotif.getText().equals(AppstringsConstant.MOTIFEDITMSG) == true) {
			logger.log(LogStatus.PASS,
					"1:  modify motif " + "<br/>" + "2 : updation of  motif. " + "<br/>"
							+ "<b>Result:  motif is updated successfully <b>"
							+ logger.addScreenCapture(captureScreenShot(driver, "Create new motif")));
		} else {
			logger.log(LogStatus.FAIL, "Success message is not displayed.");
		}

	}
}
