package com.preach.pracTestCases;


import org.testng.annotations.Test;

import pracWrapper.GenericWrapper1;

public class TestClsObj {


	@Test
	public void tc1() {
		
	GenericWrapper1 wr=new GenericWrapper1();
	
	wr.OpnBr("edge", "https://www.facebook.com");
		
		//wr.dvr.findElement(By.id("email")).sendKeys("teste");

		
	}
	
}
