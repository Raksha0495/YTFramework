package Org.testing.TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Org.testing.Base.Base;
import Org.testing.Pages.LoginPage;
import Org.testing.Pages.LogoutPage;

public class TC8 extends Base {

	@Test

	public void Library() throws InterruptedException {

		LoginPage login = new LoginPage(driver, pr);

		login.signin("rakshartestacc0895@gmail.com", "test123rr");

		/*-----------------------------Get the Login Details from the 'Login Page'----------------------------*/

		WebElement leftpanelyou = driver.findElement(By.linkText(pr.getProperty("YouClick")));

		leftpanelyou.click();

		Thread.sleep(2000);

		/*-----------------------------Get the Logout Details from the 'LogoutPage'----------------------------*/

		LogoutPage logout = new LogoutPage(driver, pr);
		logout.SignOut();
	}

}