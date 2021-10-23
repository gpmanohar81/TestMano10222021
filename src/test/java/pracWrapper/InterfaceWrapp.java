package pracWrapper;

import org.openqa.selenium.WebElement;

public interface InterfaceWrapp {
	
	
	public void OpnBr(String bname, String url);
	public WebElement locatorSelector (String feBy, String locVal);
	public void type(WebElement ele, String data);

}
