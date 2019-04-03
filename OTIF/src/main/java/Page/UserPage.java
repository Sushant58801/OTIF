package Page;

import java.io.IOException;

import Utility.AppstringsConstant;
import Utility.Helper;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import Identifier.LoginIdentifier;
import Identifier.userIdentifier;
import WebBase.BasePage;
import WebBase.BaseTest;

public class UserPage extends BasePage {

	LoginIdentifier Log = new LoginIdentifier();
	Helper help = new Helper();
	userIdentifier ui = new userIdentifier();
	String SGID = help.randomSGIDGenerator();
	BaseTest baseT = new BaseTest();
	String editSGID = help.randomSGIDGenerator();
	String className = "";
	public ExtentTest logger;

	public void userfun(String SGID, String Fname, String Lname) {
		ui.UserSGID.sendKeys(SGID);
		ui.UserLastname.sendKeys(Fname);
		ui.Userfirstname.sendKeys(Lname);
	}

	public void Createuser() throws InterruptedException {
		className = this.getClass().getName();
		createDirectory("OTIF"+className);
		logger = baseT.extent.startTest("User Test");
		ui.usertab.click();
		ui.createUser.click();
		userfun(SGID, help.randomUsernameGenerator(), help.randomUsernameGenerator());
		ui.UserRole.click();
		help.Dropdown(AppstringsConstant.USERROLEDROPDOWN);
		ui.UserLastname.click();			
		Select role = new Select(ui.UserRole);
		String selectedrole = role.getFirstSelectedOption().getText();
		System.out.println(selectedrole);
		
		if (selectedrole.equalsIgnoreCase("User")) {
			Thread.sleep(2000);
			ui.selectWarehouse.click();
		}
		ui.Createuserbutton.click();
		Thread.sleep(2000);

		String actualresult = ui.Usersuccessmsg.getText();
		String split[] = actualresult.split("\u002D" + "\u003E");
		String firstPart = split[0].trim();
		String SecondPart = split[1].trim();
		if (AppstringsConstant.USRSUCCESSMSG.contains(firstPart) == true) {
			logger.log(LogStatus.PASS,
					"1: Create New user " + "<br/>" + "2 : Verify all fields are present " + "<br/>"
							+ "<b>Result: user creation success message is displayed <b>"
							+ logger.addScreenCapture(captureScreenShot(driver, "verify user create successfully")));
		} else {
			logger.log(LogStatus.FAIL, "Creating new supplier  fail" + "<br/>"
					+ logger.addScreenCapture(captureScreenShot(driver, "user creation fail")));
		}

	}

	public void edituser() throws InterruptedException {
		ui.Usersearch.sendKeys(SGID);
		Thread.sleep(2000);
		ui.tbl_EditUser.click();
		userfun(editSGID, help.randomUsernameGenerator(), help.randomUsernameGenerator());
		ui.UserRole.click();
		help.Dropdown(AppstringsConstant.USERROLEDROPDOWN);
		ui.UserLastname.click();
		Select role = new Select(ui.UserRole);
		String selectedrole = role.getFirstSelectedOption().getText();
		System.out.println(selectedrole);
		
		if (selectedrole.equals("User")) {
			Thread.sleep(2000);
			ui.selectWarehouse.click();
		}
		ui.Createuserbutton.click();
		Thread.sleep(2000);
		String actualresult = ui.Editusersuccessmsg.getText();
		String split[] = actualresult.split("\u002D" + "\u003E");
		String firstPart = split[0].trim();
		String SecondPart = split[1].trim();
		if (AppstringsConstant.EDITUSRSUCCESSMSG.equals(firstPart) == true) {
			logger.log(LogStatus.PASS,
					"1: update user " + "<br/>" + "2 : Verify all fields are present " + "<br/>"
							+ "<b>Result: user updation success message is displayed <b>"
							+ logger.addScreenCapture(captureScreenShot(driver, "verify user updated successfully")));
		} else {
			logger.log(LogStatus.FAIL, "Creating new supplier  fail" + "<br/>"
					+ logger.addScreenCapture(captureScreenShot(driver, "user updation fail")));
		}

	}
}
