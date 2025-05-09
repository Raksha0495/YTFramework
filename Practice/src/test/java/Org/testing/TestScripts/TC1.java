package Org.testing.TestScripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Org.testing.Base.Base;
import Org.testing.Pages.LoginPage;
import Org.testing.Pages.LogoutPage;
import Org.testing.Utilities.LogsCapture;
import Org.testing.Utilities.ScreenshotCapture;
import Org.testing.assertion.SoftAssertion;

public class TC1 extends Base {

	@Test

	public void TrendingClick() throws InterruptedException, IOException {

		// WebElement menuButton =
		// driver.findElement(By.cssSelector("icon-shape.style-scope yt-icon"));
		// menuButton.click()

		LoginPage login = new LoginPage(driver, pr);

		login.signin("rakshartestacc0895@gmail.com", "test123rr");

		LogsCapture.takeLog("TC1", "TC 1 Login completed successfully");

		/*
		 * The below code Assert.assertEquals is called as HARD Assertion-So if the
		 * execution fails it will not execute further
		 */

		// Assert.assertEquals(driver.getCurrentUrl(), "https://www.youtube.com/");

		SoftAssertion.assertion1(driver.getCurrentUrl(), "https://www.youtube.com/", "TC1");

		ScreenshotCapture.takeScreenshot(driver,
				"C:\\Users\\raksh\\OneDrive\\Desktop\\September Batch -Java\\SELENIUM  PART\\Screenshot\\firsttc.png");

		LogsCapture.takeLog("TC1", "Screenshot of Login taken successfully");

		/*-----------------------------Get the Login Details from the 'LoginPage'----------------------------*/

		WebElement trendingClick = driver.findElement(By.linkText(pr.getProperty("trendingButton")));

		trendingClick.click();

		Thread.sleep(8000);

		LogsCapture.takeLog("TC1", "Trending Button clicked successfully");

		ScreenshotCapture.takeScreenshot(driver,
				"C:\\Users\\raksh\\OneDrive\\Desktop\\September Batch -Java\\SELENIUM  PART\\Screenshot\\firsttctrendingclick.png");

		LogsCapture.takeLog("TC1", "Screenshot of trendinglick taken successfully");

		/*-----------------------------Get the Logout Details from the 'LogoutPage'----------------------------*/

		LogoutPage logout = new LogoutPage(driver, pr);
		logout.SignOut();

		LogsCapture.takeLog("TC1", "Logged Out Successfully");

		ScreenshotCapture.takeScreenshot(driver,
				"C:\\Users\\raksh\\OneDrive\\Desktop\\September Batch -Java\\SELENIUM  PART\\Screenshot\\TC1logout.png");

	}

}
