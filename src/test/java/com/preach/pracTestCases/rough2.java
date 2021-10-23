package com.preach.pracTestCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class rough2 {
WebDriver dvr;
	@Test
	public void testrs() throws InterruptedException {
	
	WebDriverManager.chromedriver().setup();
	 dvr= new ChromeDriver();
	 dvr.get("http://iarchtaps.com:8080/opentaps/control/main");
	 dvr.findElement(By.id("username")).sendKeys("DemoSalesManager");
	 dvr.findElement(By.id("password")).sendKeys("crmsfa");
	 dvr.findElement(By.className("decorativeSubmit")).click();
		dvr.findElement(By.linkText("CRM/SFA")).click();
		dvr.findElement(By.linkText("Leads")).click();
		dvr.findElement(By.linkText("Find Leads")).click();
		dvr.findElement(By.xpath("//input[@id='ext-gen248']")).sendKeys("bhavya");
		dvr.findElement(By.xpath("//button[normalize-space()='Find Leads']")).click();
		Thread.sleep(3000);
		 WebElement table= dvr.findElement(By.className("x-grid3-row-table"));
		 List<WebElement> rows=table.findElements(By.tagName("tr"));
		 WebElement rowNum=rows.get(0);
		 List<WebElement> col=rowNum.findElements(By.tagName("td"));
		 WebElement colCel=col.get(0);
		 System.out.println(colCel.getText());
		 colCel.click();
	
	
	}
}
