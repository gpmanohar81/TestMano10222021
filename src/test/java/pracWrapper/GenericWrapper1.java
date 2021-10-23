package pracWrapper;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import java.time.Duration;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GenericWrapper1 {

	
	WebDriver dvr;
	
	public void OpnBr(String bname, String url) {
		
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
	
	//ele 
	//* here return is needed because we have to pass the elements in
	//other methosds below to perform certain action on //*
	
	public WebElement locatorSelector (String feBy, String locVal) {
		
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
		//else if ()feBy.equals(locVal)
	
		return null;
		
		
	}
	
	
	//below pweforms only actions hence no return needed
	public void type(WebElement ele, String data) {
		ele.clear();
		ele.sendKeys(data);
	}
	
	public void click(WebElement ele) {
		ele.click();
	}
	
	public void ddselect(WebElement ele, String ddvalue) {
		Select dd=new Select(ele);
	    dd.selectByValue(ddvalue);
		
	}
	public void capText(WebElement ele) {
		ele.getText();
	System.out.println(ele.getText());
	}
	 public void teardown(){
		 dvr.quit();
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
		 ///colCel.click();  this not worked
		
		 
		// public void tablehandler() throws InterruptedException {
			// Thread.sleep(3000);
			// WebElement table= dvr.findElement(By.className("x-grid3-row-table"));
			// List<WebElement> rows=table.findElements(By.tagName("tr"));
			// WebElement rowNum=rows.get(0);
			// List<WebElement> col=rowNum.findElements(By.tagName("td"));
			// WebElement colCel=col.get(0);
			// System.out.println(colCel.getText());
			// colCel.click();
		 
	 }
	 
	 
	 
	     
		 
	
	 
	
}
