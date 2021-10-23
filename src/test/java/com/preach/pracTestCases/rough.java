package com.preach.pracTestCases;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class rough {
	WebDriver dvr;
@Test
	public void testr() throws InterruptedException {
	
	WebDriverManager.chromedriver().setup();
	 dvr= new ChromeDriver();
dvr.get("http://erail.in");
dvr.findElement(By.id("txtStationFrom")).clear();
dvr.findElement(By.id("txtStationFrom")).sendKeys("sbc",Keys.ENTER);
dvr.findElement(By.id("txtStationTo")).clear();
dvr.findElement(By.id("txtStationTo")).sendKeys("mas",Keys.ENTER);

Thread.sleep(2000);



WebElement table1 = dvr.findElement(By.xpath("//table[@class=\"DataTable TrainList TrainListHeader\"]"));
List<WebElement> rows =table1.findElements(By.tagName("tr"));
 WebElement secRow = rows.get(1);
 List<WebElement> secRowAllCol = secRow.findElements(By.tagName("td"));
WebElement secCol = secRowAllCol.get(1);

System.out.println(secCol.getText());
secCol.click();


Thread.sleep(4000);
	}
	
//@AfterMethod
 // public void tearDown() {
//	dvr.quit();
//}


}
