package TestLoginRegression;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;



import Practice.TestLogin.Base_SetDriver;
import TestLogin.Buissnes.Login_FB;

public class FB_test {

		@Test
		public void testFB() {
		Base_SetDriver b=new Base_SetDriver();
		WebDriver driver=b.getDriver();
		Login_FB login01 =PageFactory.initElements(driver,Login_FB.class);
		String url = "https://hr-hr.facebook.com/login.php?login_attempt=1&lwv=100";
		driver.get(url);
		driver.manage().window().maximize();
		login01.formFillUp("todorovic.radmila.bl@gmail.com", "Test123!");
		driver.close();
		}
}
