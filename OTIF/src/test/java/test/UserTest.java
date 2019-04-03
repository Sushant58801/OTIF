package test;

import java.io.IOException;

import org.testng.annotations.Test;

import Page.UserPage;
import WebBase.BaseTest;

public class UserTest extends BaseTest {
	
	UserPage usrpage = new UserPage();
	
	
	@Test(priority=1)
	public void CreateNewUser() throws InterruptedException, IOException
	{
		
		usrpage.Createuser();
	
	}
	
	@Test(priority=2)
	public void EditNewUser() throws InterruptedException, IOException
	{		
		usrpage.edituser();
	
	}

}
