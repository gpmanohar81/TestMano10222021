package com.preach.pracTestCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class roughradiobutton {

	
	WebDriver dvr;
	@Test
	public void testrs() throws InterruptedException {
	
	WebDriverManager.chromedriver().setup();
	 dvr= new ChromeDriver();
	 dvr.get("https://designsystem.digital.gov/components/radio-buttons/");
	 
	 dvr.findElement(By.xpath("//label[@for='historical-douglass']")).click();
	
	
	}
	
	
	
}
