package test;

import org.testng.annotations.Test;

import Page.OrderPage;
import WebBase.BaseTest;

public class OrderTest extends BaseTest{
	
	OrderPage  ord = new OrderPage();
	
	@Test(priority = 1)
	public void SearchOrderWithOrdnumber() throws InterruptedException {
		ord.SearchOrderWithOrdnumber();
	}
	
	@Test(priority = 2)
	public void SearchOrderWithcreationDate() throws InterruptedException {
		ord.SearchOrderWithcreationDate();
	}
	
	@Test(priority = 3)
	public void SearchOrderWithreceptionDate() throws InterruptedException {
		ord.SearchOrderWithreceptionDate();
	}
	
}
