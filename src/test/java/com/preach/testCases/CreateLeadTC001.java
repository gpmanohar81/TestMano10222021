package com.preach.testCases;



import org.testng.annotations.Test;

import com.preach.wrapper.ProjSpecificWrapper1;

public class CreateLeadTC001 extends ProjSpecificWrapper1{

	@Test
	public void tc001() throws InterruptedException {
	   //login(); //--- @BeforeMethod in  ProjSpecificWrapper1 takes care
	   click(locSelector("linkText","CRM/SFA"));
	   click(locSelector("linkText","Leads"));
	   click(locSelector("linkText","Create Lead"));
	   clearAndType(locSelector("id", "createLeadForm_companyName"),"bh1com");
	   clearAndType(locSelector("id", "createLeadForm_lastName"),"bh1ln");
	   clearAndType(locSelector("id", "createLeadForm_firstName"),"bh1fn");
	   selectDropDownUsingValue(locSelector("id","createLeadForm_dataSourceId"), "LEAD_COLDCALL");
	   selectDropDownUsingValue(locSelector("id","createLeadForm_marketingCampaignId"), "CATRQ_AUTOMOBILE");
	   clearAndType(locSelector("xpath", "//input[@id='createLeadForm_primaryPhoneNumber']"),"5702398612");
	   clearAndType(locSelector("id", "createLeadForm_primaryEmail"),"bhav87@gmail.com");
	   click(locSelector("className","smallSubmit"));
	   Thread.sleep(100);
	   getElementText(locSelector("id","viewLead_companyName_sp"));
	   //tearDown();
	  
	}
	

	
	
}
