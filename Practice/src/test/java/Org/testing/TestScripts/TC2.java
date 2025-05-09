package Org.testing.TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Org.testing.Base.Base;
import Org.testing.Pages.LoginPage;
import Org.testing.Pages.LogoutPage;
import Org.testing.Utilities.LogsCapture;

public class TC2 extends Base {

	@Test

	public void HistoryClick() throws InterruptedException {

		LoginPage login = new LoginPage(driver, pr);

		login.signin("rakshartestacc0895@gmail.com", "test123rr");

		LogsCapture.takeLog("TC2", "TC 2 Signed In successfully");

		/*-----------------------------Get the Login Details from the 'Login Page'----------------------------*/

		WebElement HistoryClick = driver.findElement(By.linkText(pr.getProperty("HistoryButton")));

		HistoryClick.click();

		Thread.sleep(8000);

		LogsCapture.takeLog("TC2", "TC 2 History Button Clicked Successfully");

		/*-----------------------------Get the Logout Details from the 'LogoutPage'----------------------------*/

		LogoutPage logout = new LogoutPage(driver, pr);
		logout.SignOut();

		LogsCapture.takeLog("TC2", "TC 2 Logged Out successfully");

	}

}
