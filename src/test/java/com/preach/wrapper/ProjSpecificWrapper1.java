package com.preach.wrapper;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;


import dataProvider.Excel.ReadingExcel3;

public class ProjSpecificWrapper1 extends GenWrapperByInterface{
	
	@BeforeMethod
//	@Parameters({"unprmzxml","pwprmzxml","brprmzxml"})

//public void login(String unp, String pwp, String br) {
		//invokeBrowser(br, "http://iarchtaps.com:8080/opentaps/control/main");
		//clearAndType(locSelector("xpath","//form[@id='login']//input[@id='username']"), unp);
		//clearAndType(locSelector("id", "password"),pwp);
	   // click(locSelector("className","decorativeSubmit"));
	//}
	

	@Parameters({"brprmzxml","urlprmzxml"})
	public void loginbrurl(String br, String url) {
		invokeBrowser(br,url); 
		clearAndType(locSelector("xpath","//form[@id='login']//input[@id='username']"),"DemoCSR");
		clearAndType(locSelector("id", "password"),"crmsfa");
	    click(locSelector("className","decorativeSubmit"));
	}
	//public void loginold() {
		//invokeBrowser("ch", "http://iarchtaps.com:8080/opentaps/control/main");
		//clearAndType(locSelector("xpath","//form[@id='login']//input[@id='username']"),"DemoCSR");
		//clearAndType(locSelector("id", "password"),"crmsfa");
	   // click(locSelector("className","decorativeSubmit"));
	
	
	
	@AfterMethod
public void tearDown() {
	close();
}
	
	@DataProvider(name="fetchdataa")
	public String[][] data(){            
		String[][] dat=new String[2][3];
		dat[0][0]="mano";
		dat[0][1]="bhav";		
		dat[1][0]="male";
		dat[1][1]="fema";
		return dat;
		//this is sample data provider function/method , here data and row and column count is hardcoded, instead
		//this we can read it from excel and use tht code as data provider, refer below
	}
	
	@DataProvider(name="fetchdataxl")
	public String[][] xldata() throws IOException{            
		ReadingExcel3 rxl=new ReadingExcel3();
		return rxl.xldatamthd();
		
		//this is sample data provider function/method , here data and row and column count is hardcoded, instead
		//this we can read it from excel and use tht code as data provider, refer below
	}
	
	
}
