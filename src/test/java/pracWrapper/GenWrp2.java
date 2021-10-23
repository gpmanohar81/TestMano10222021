package pracWrapper;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GenWrp2 {

	WebDriver drv;
	
	public void openBr(String bname,String url) {
		
		if(bname.equals("edge")) {
			WebDriverManager.edgedriver().setup();
			 drv = new EdgeDriver();
			
		}
		else if (bname.equals("ff")) {
			WebDriverManager.firefoxdriver().setup();
			 drv=new FirefoxDriver();
		
		}
		drv.get(url);
	}
		
		public void t() {
			WebElement j =drv.findElement(By.id(null));
			j.sendKeys("dv");
		}
		
	public void type(WebElement wel, String dt) {
		wel.sendKeys(dt);
	}	
	
	public void click(WebElement wel) {
		wel.click();
	}
	
	//wel
	public WebElement locSelec(String feby, String locdetails) {
		if (feby.equals("id")) {
			return drv.findElement(By.id(locdetails));
		}
			else if (feby.equals("xpath")) {
				return drv.findElement(By.xpath(locdetails));
			}
		return null;
		}
		
	}
		
		
		
	
	
	

