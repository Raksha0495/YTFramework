package Org.testing.TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Org.testing.Base.Base;
import Org.testing.Pages.LoginPage;
import Org.testing.Pages.LogoutPage;
import Org.testing.Pages.videoPlayPage;
import Org.testing.Utilities.LogsCapture;

public class TC5 extends Base {

	@Test

	public void SubscribeVideo() throws InterruptedException {

		LoginPage login = new LoginPage(driver, pr);

		login.signin("rakshartestacc0895@gmail.com", "test123rr");

		LogsCapture.takeLog("TC5", "TC 5 Signed In successfully");

		/*-----------------------------Get the Login Details from the 'Login Page'----------------------------*/

		videoPlayPage videoply = new videoPlayPage(driver, pr);

		videoply.videoplay();

		/*
		 * WebElement VideoClick =
		 * driver.findElement(By.id(pr.getProperty("Videotry")));
		 * 
		 * VideoClick.click();
		 * 
		 * Thread.sleep(8000);
		 */

		LogsCapture.takeLog("TC5", "TC 5 Video Clicked successfully");

		WebElement Subscribevideo = driver.findElement(By.xpath(pr.getProperty("SubscribeButton")));
		Subscribevideo.click();

		Thread.sleep(4000);

		LogsCapture.takeLog("TC5", "TC 5 after video click, video is subscribed successfully");

		/*-----------------------------Get the Logout Details from the 'LogoutPage'----------------------------*/

		LogoutPage logout = new LogoutPage(driver, pr);
		logout.SignOut();

		LogsCapture.takeLog("TC5", "TC 5 Signed Out successfully");

		/*
		 * WebElement emailClick =
		 * driver.findElement(By.xpath("//input[@type='email']"));
		 * 
		 * emailClick.sendKeys("rakshark1995@gmail.com");
		 * 
		 * Thread.sleep(2000);
		 * 
		 * WebElement nextButtonClick = driver.findElement(By.xpath(
		 * "//button[@class='VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-k8QpJ VfPpkd-LgbsSe-OWXEXe-dgl2Hf nCP5yc AjY5Oe DuMIQc LQeN7 qIypjc TrZEUc lw1w4b']"
		 * ));
		 * 
		 * nextButtonClick.click();
		 * 
		 * Thread.sleep(4000);
		 * 
		 * WebElement password =
		 * driver.findElement(By.xpath("//input[@type='password']"));
		 * 
		 * password.sendKeys("R@kshaR040895$$");
		 * 
		 * Thread.sleep(4000);
		 * 
		 * WebElement nextButtonClick1 = driver.findElement(By.xpath(
		 * "//button[@class='VfPpkd-LgbsSe VfPpkd-LgbsSe-OWXEXe-k8QpJ VfPpkd-LgbsSe-OWXEXe-dgl2Hf nCP5yc AjY5Oe DuMIQc LQeN7 qIypjc TrZEUc lw1w4b']"
		 * ));
		 * 
		 * nextButtonClick1.click();
		 * 
		 * Thread.sleep(3000);
		 * 
		 * WebElement VideoClick = driver.findElement(By.id("video-title"));
		 * 
		 * VideoClick.click();
		 * 
		 * Thread.sleep(8000);
		 */

		// WebElement SubscribeClick =
		// driver.findElement(By.xpath("//yt-button-shape[@id='subscribe-button-shape']"));
		// SubscribeClick.click();

		// Thread.sleep(4000);

	}
}
