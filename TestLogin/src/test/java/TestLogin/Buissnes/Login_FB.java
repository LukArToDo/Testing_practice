package TestLogin.Buissnes;

import org.openqa.selenium.WebDriver;

import TestLogin.Page.Login_FB_;

public class Login_FB extends Login_FB_{

	public Login_FB(WebDriver driver) {
		super(driver);
	}
	public void formFillUp(String email,String pass) {
		getEmail().clear();
		getEmail().sendKeys(email);
		getPass().clear();
		getPass().sendKeys(pass);
		
	}
}
