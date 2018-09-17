package TestLogin.Page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import Practice.TestLogin.Base_SetDriver;

public class Login_FB_ extends Base_SetDriver {
	public WebDriver driver;
	public Login_FB_(WebDriver driver) {
		this.driver=driver;
	}
	public By email=By.id("email");
	public WebElement getEmail() {
		return driver.findElement(email);
	}
	public By pass=By.id("pass");
	public WebElement getPass() {
		return driver.findElement(pass);
	}
	/*public By button=By.id("loginbutton");
	public WebElement getBtn(){
		return driver.findElement(button);
	}*/
}
