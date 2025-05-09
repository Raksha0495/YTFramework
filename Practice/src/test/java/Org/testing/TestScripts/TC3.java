package Org.testing.TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Org.testing.Base.Base;
import Org.testing.Pages.LoginPage;
import Org.testing.Pages.LogoutPage;
import Org.testing.Utilities.LogsCapture;

public class TC3 extends Base {

	@Test

	public void SubscriptionClick() throws InterruptedException {

		LoginPage login = new LoginPage(driver, pr);

		login.signin("rakshartestacc0895@gmail.com", "test123rr");

		LogsCapture.takeLog("TC3", "TC 3 Signed In successfully");

		/*-----------------------------Get the Login Details from the 'Login Page'----------------------------*/

		WebElement SubscriptionClick = driver.findElement(By.xpath(pr.getProperty("SubscriptionsButton")));

		SubscriptionClick.click();

		Thread.sleep(8000);

		LogsCapture.takeLog("TC3", "TC 3  Subscription Clicked successfully");

		/*-----------------------------Get the Logout Details from the 'LogoutPage'----------------------------*/

		LogoutPage logout = new LogoutPage(driver, pr);
		logout.SignOut();

		LogsCapture.takeLog("TC3", "TC 3 Logged Out successfully");

	}

}
