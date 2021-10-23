package com.preach.pracTestCases;

import org.testng.annotations.Test;

import pracWrapper.GenWrp2;

public class TestCls2 extends GenWrp2{

	@Test
	public void tc1 () {
	
		openBr("ff", "http://iarchtaps.com:8080/opentaps/control/main");
		type(locSelec("xpath", "//form[@id='login']//input[@id='username']"),"mano");
		
		
		
	}
	

}
