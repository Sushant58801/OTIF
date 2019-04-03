package test;

import org.testng.annotations.Test;

import Page.ImportExcelPage;
import WebBase.BaseTest;

public class ImportExcel extends BaseTest{
	
	ImportExcelPage excelpage = new ImportExcelPage();
	
	@Test(priority = 1)
	public void OtherthenExcel() throws InterruptedException {
		excelpage.OtherthenExcel();
	}
	
	@Test(priority = 2)
	public void InvalidRowsCount() throws Exception {
		excelpage.InvalidRowsCount();
	}
	
	@Test(priority = 3)
	public void InvalidTables() throws Exception {
		excelpage.InvalidTables();
	}
	
	@Test(priority = 4)
	public void validExcelfile() throws Exception {
		excelpage.validExcelfile();
	}
	

}
