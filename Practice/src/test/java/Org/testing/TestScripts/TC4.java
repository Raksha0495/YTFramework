package Org.testing.TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Org.testing.Base.Base;
import Org.testing.Pages.LoginPage;
import Org.testing.Pages.LogoutPage;
import Org.testing.Utilities.LogsCapture;

public class TC4 extends Base {

	@Test

	public void VideoClick() throws InterruptedException {

		LoginPage login = new LoginPage(driver, pr);

		login.signin("rakshartestacc0895@gmail.com", "test123rr");

		LogsCapture.takeLog("TC4", "TC 4 Signed In successfully");

		/*-----------------------------Get the Login Details from the 'Login Page'----------------------------*/

		WebElement VideoClick = driver.findElement(By.id(pr.getProperty("Videotry")));

		VideoClick.click();

		Thread.sleep(8000);

		LogsCapture.takeLog("TC4", "TC 4 Video Clicked successfully");

		WebElement LikeButton = driver.findElement(By.xpath(pr.getProperty("LikeButtonClick")));
		LikeButton.click();

		Thread.sleep(4000);

		LogsCapture.takeLog("TC4", "TC 4 Video Liked successfully");

		/*-----------------------------Get the Logout Details from the 'LogoutPage'----------------------------*/

		LogoutPage logout = new LogoutPage(driver, pr);
		logout.SignOut();

		LogsCapture.takeLog("TC4", "TC 4 Signed Out successfully");

	}
}