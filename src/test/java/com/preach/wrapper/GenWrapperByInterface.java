package com.preach.wrapper;

import static org.testng.Assert.assertEquals;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GenWrapperByInterface implements AnishWrapperInterface{

	WebDriver dvr;
	@Override
	public void invokeBrowser(String bname, String url) {
		// TODO Auto-generated method stub
		if(bname.equals("ch")) {
			WebDriverManager.chromedriver().setup();
			dvr=new ChromeDriver();
			}
			else if (bname.equals("ff")) {
				WebDriverManager.firefoxdriver().setup();
				dvr=new FirefoxDriver();
				}
			else if(bname.equals("edge")) {
				WebDriverManager.edgedriver().setup();
			dvr=new EdgeDriver();     
			System.out.println("edge opened");
			} 
			dvr.get(url);
			dvr.manage().window().maximize();
			dvr.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			System.out.println(url + " launched in "+ bname);
		
		
		
	}

	@Override   
	//ele
	public WebElement locSelector(String feBy, String locVal) {
		
		if (feBy.equals("id")) {
			return dvr.findElement(By.id(locVal));
		}
		else if(feBy.equals("className")) {
			return dvr.findElement(By.className(locVal));
		}
		else if (feBy.equals("xpath")) {
			return dvr.findElement(By.xpath(locVal));
		}
		else if (feBy.equals("linkText")) {
			return dvr.findElement(By.linkText(locVal));
		}
		//else if ()feBy.equals("xpath")
	
		return null;
	}
	
	public void tablehandler1(WebElement ele, int r,int c) throws InterruptedException  {
		 
		Thread.sleep(3000);
			 WebElement table= ele;
			 List<WebElement> rows=table.findElements(By.tagName("tr"));
			 WebElement rowNum=rows.get(r);
			 List<WebElement> col=rowNum.findElements(By.tagName("td"));
			 WebElement colCel=col.get(c);
			 System.out.println(colCel.getText());
			 dvr.findElement(By.linkText(colCel.getText())).click();
	}
	

	@Override
	public List<WebElement> locSelectors(String selType, String selValue) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void click(WebElement ele) {
		ele.click();
		
	}

	@Override
	public void append(WebElement ele, String data) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void clear(WebElement ele) {
		ele.clear();
		
	}

	@Override
	public void clearAndType(WebElement ele, String data) {
		ele.clear();
		ele.sendKeys(data);
		
	}

	@Override
	public String getElementText(WebElement ele) {
		return ele.getText();
		//System.out.println(ele.getText());
		//return null;
	}

	@Override
	public String getBackgroundColor(WebElement ele) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getTypedText(WebElement ele) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void selectDropDownUsingText(WebElement ele, String value) {
		// TODO Auto-generated method stub
		Select dd=new Select(ele);
		dd.selectByVisibleText(value);
	}

	@Override
	public void selectDropDownUsingIndex(WebElement ele, int index) {
		// TODO Auto-generated method stub
		Select dd=new Select(ele);
		dd.selectByIndex(index);
	}

	@Override
	public void selectDropDownUsingValue(WebElement ele, String value) {
		Select dd=new Select(ele);
		dd.selectByValue(value);
	}

	@Override
	public boolean verifyExactText(WebElement ele, String expectedText) {
		String s=ele.getText();
		assertEquals(s, expectedText);
		return false;
	}

	@Override
	public boolean verifyPartialText(WebElement ele, String expectedText) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean verifyExactAttribute(WebElement ele, String attribute, String value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean verifyPartialAttribute(WebElement ele, String attribute, String value) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean verifyDisplayed(WebElement ele) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean verifyEnabled(WebElement ele) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean verifySelected(WebElement ele) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void switchToAlert() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void acceptAlert() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dismissAlert() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getAlertText() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void enterAlertText(String data) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void switchToWindow(int index) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void switchToFrame(int index) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void switchToFrame(WebElement ele) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void switchToFrame(String idOrName) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void switchOutFrame() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean verifyUrl(String url) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean verifyTitle(String title) {
		dvr.getTitle();
		assertEquals(dvr.getTitle(), title);
		System.out.println(dvr.getTitle()+ "printed when matches");
		return false;
	}

	@Override
	public void close() {
		dvr.close();
		// TODO Auto-generated method stub
		
	}

	@Override
	public void quit() {
		dvr.quit();
		// TODO Auto-generated method stub
		
	}

}
