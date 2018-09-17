package Practice.TestLogin;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Base_SetDriver {
	public WebDriver driver=null;
	public WebDriver getDriver() {
		driver=new FirefoxDriver();
		return driver;
		
	}
}
