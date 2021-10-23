package com.preach.testCases;



import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.preach.wrapper.ProjSpecificWrapper1;

public class DeleateLeadTC003 extends ProjSpecificWrapper1{
		


@Test
   public void tc003() throws InterruptedException  {
  //login();
   click(locSelector("linkText","CRM/SFA"));
   click(locSelector("linkText","Leads"));
   click(locSelector("linkText","Find Leads"));
   click(locSelector("xpath", "//span[text()=\"Phone\"]"));
   clearAndType(locSelector("xpath", "//input[@name='phoneCountryCode']"),"1");
  // clearAndType(locSelector("xpath", "//input[@name='phoneAreaCode']"),"570");
   clearAndType(locSelector("xpath", "//input[@name='phoneNumber']"),"123456789");
   click(locSelector("xpath", "//button[text()='Find Leads']"));
   //tablehandler1(locSelector("className","x-grid3-row-table"),0,0);
   
   
   //clearAndType(locSelector("xpath", "//input[@id='ext-gen248']"),"bhavya");
   //click(locSelector("xpath","//button[normalize-space()='Find Leads']"));
   //Thread.sleep(3000);
   //tablehandler1(locSelector("className","x-grid3-row-table"),0,0);
   //verifyTitle("View Lead | opentaps CRM");
   //click(locSelector("xpath","//a[text()=\"Edit\"]"));
   //clearAndType(locSelector("id", "updateLeadForm_companyName"), "Infosysupdated1");
   //click(locSelector("xpath", "(//input[@type=\"submit\" and @class=\"smallSubmit\"])[1]"));
   //String s= getElementText(locSelector("id","viewLead_companyName_sp"));
  // assertEquals(s,"Infosysupdated1 (10169)");
   
}

		
		
		
	

}
