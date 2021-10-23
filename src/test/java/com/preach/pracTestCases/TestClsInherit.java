package com.preach.pracTestCases;


import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pracWrapper.GenericWrapper1;

public class TestClsInherit extends GenericWrapper1{
	
	WebDriver dvr;
	@BeforeMethod
	
	public void gen() throws InterruptedException {
		
		OpnBr("edge", "http://iarchtaps.com:8080/opentaps/control/main");
		Thread.sleep(500);
	}
	@Test
	public void tc11() {
		
		type(locatorSelector("xpath","//form[@id='login']//input[@id='username']"), "DemoSalesManager");
		type(locatorSelector("id", "password"),"crmsfa");
	    click(locatorSelector("className","decorativeSubmit"));
	   click(locatorSelector("linkText","CRM/SFA"));
	   click(locatorSelector("linkText","Leads"));
	   click(locatorSelector("linkText","Create Lead"));
	   type(locatorSelector("id", "createLeadForm_companyName"),"bh1com");
	   type(locatorSelector("id", "createLeadForm_lastName"),"bh1ln");
	   type(locatorSelector("id", "createLeadForm_firstName"),"bh1fn");
	   ddselect(locatorSelector("id","createLeadForm_dataSourceId"), "LEAD_COLDCALL");
	   ddselect(locatorSelector("id","createLeadForm_marketingCampaignId"), "CATRQ_AUTOMOBILE");
	   type(locatorSelector("xpath", "//input[@id='createLeadForm_primaryPhoneNumber']"),"5702398612");
	   type(locatorSelector("id", "createLeadForm_primaryEmail"),"bhav87@gmail.com");
	   click(locatorSelector("className","smallSubmit"));
	   capText(locatorSelector("id","viewLead_companyName_sp"));
	 
	  
	}
	@Test
	public void tc12() {
		type(locatorSelector("xpath","//form[@id='login']//input[@id='username']"), "DemoSalesManager");
		type(locatorSelector("id", "password"),"crmsfa");
	    click(locatorSelector("className","decorativeSubmit"));
	   click(locatorSelector("linkText","CRM/SFA"));
	   click(locatorSelector("linkText","Leads"));
	   click(locatorSelector("linkText","Find Leads"));
	   type(locatorSelector("xpath", "//input[@id='ext-gen248']"),"bhavya");
	   click(locatorSelector("xpath","//button[normalize-space()='Find Leads']"));
	 
	   
		
	}
	
	@AfterMethod
	
	public void bclose() {
	teardown();
	}
	
	
	

}


