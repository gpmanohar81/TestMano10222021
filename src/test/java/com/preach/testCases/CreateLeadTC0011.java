package com.preach.testCases;


import org.testng.annotations.Test;


import com.preach.wrapper.ProjSpecificWrapper1;

public class CreateLeadTC0011 extends ProjSpecificWrapper1{

	
	@Test(dataProvider="fetchdataxl")
	public void tc001(String a,String b, String c) throws InterruptedException {
	
	   //login(); --- @BeforeMethod in  ProjSpecificWrapper1 takes care
	   click(locSelector("linkText","CRM/SFA"));
	   click(locSelector("linkText","Leads"));
	   click(locSelector("linkText","Create Lead"));
	   clearAndType(locSelector("id", "createLeadForm_companyName"),"cmp1");
	   clearAndType(locSelector("id", "createLeadForm_lastName"),b);
	   clearAndType(locSelector("id", "createLeadForm_firstName"),c);
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
