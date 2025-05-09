package Org.testing.TestScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Org.testing.Base.Base;
import Org.testing.Pages.LoginPage;
import Org.testing.Pages.LogoutPage;

public class TC6 extends Base {

	@Test

	public void SubscribeClick() throws InterruptedException {

		LoginPage login = new LoginPage(driver, pr);

		login.signin("rakshartestacc0895@gmail.com", "test123rr");

		/*-----------------------------Get the Login Details from the 'Login Page'----------------------------*/

		WebElement VideoClick = driver.findElement(By.id(pr.getProperty("Videotry")));

		VideoClick.click();

		Thread.sleep(8000);

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");

		Thread.sleep(4000);

		WebElement comment = driver.findElement(By.xpath(pr.getProperty("commentClick")));
		comment.click();

		WebElement commententertxt = driver.findElement(By.id(pr.getProperty("commenttextbox")));
		commententertxt.sendKeys("test comment");
		Thread.sleep(2000);

		WebElement ClickOncmt = driver.findElement(By.cssSelector(pr.getProperty("commentButton")));
		ClickOncmt.click();

		/*-----------------------------Get the Logout Details from the 'LogoutPage'----------------------------*/

		LogoutPage logout = new LogoutPage(driver, pr);
		logout.SignOut();

		/*
		 * WebElement addComment =
		 * driver.findElement(By.xpath("//div[@aria-label='Add a comment…']"));
		 * 
		 * addComment.click();
		 * 
		 * Thread.sleep(2000);
		 * 
		 * addComment.sendKeys("Awesome");
		 * 
		 * WebElement comment = driver.findElement(By.linkText("Comment"));
		 * 
		 * comment.click();
		 * 
		 * Thread.sleep(4000);
		 */

	}
}
