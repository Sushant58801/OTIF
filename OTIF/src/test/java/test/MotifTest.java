package test;

import java.io.IOException;

import org.testng.annotations.Test;

import Page.MotifPage;
import Page.UserPage;
import WebBase.BaseTest;

public class MotifTest extends BaseTest{
MotifPage usrpage = new MotifPage();
	
	
	@Test(priority=1)
	public void CreateNewMOTIF() throws InterruptedException, IOException
	{
		
		usrpage.CreateNewMOTIF();
	
	}
	
	@Test(priority=2)
	public void EditMOTIF() throws InterruptedException, IOException
	{		
		usrpage.EditMOTIF();
	
	}
	

}
