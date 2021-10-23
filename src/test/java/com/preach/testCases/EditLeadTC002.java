package com.preach.testCases;




import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.preach.wrapper.ProjSpecificWrapper1;

public class EditLeadTC002 extends ProjSpecificWrapper1{



	
@Test
public void tc002() throws InterruptedException {
   //login();
   click(locSelector("linkText","CRM/SFA"));
   click(locSelector("linkText","Leads"));
   click(locSelector("linkText","Find Leads"));
   clearAndType(locSelector("xpath", "//input[@id='ext-gen248']"),"Anish");
   click(locSelector("xpath","//button[normalize-space()='Find Leads']"));
   Thread.sleep(3000);
   tablehandler1(locSelector("className","x-grid3-row-table"),0,0);
   verifyTitle("View Lead | opentaps CRM");
   click(locSelector("xpath","//a[text()=\"Edit\"]"));
   clearAndType(locSelector("id", "updateLeadForm_companyName"), "Infosysupdated1");
   click(locSelector("xpath", "(//input[@type=\"submit\" and @class=\"smallSubmit\"])[1]"));
   verifyExactText(locSelector("id","viewLead_companyName_sp"), "Infosysupdated1 (10169)");

}

	
	
}
