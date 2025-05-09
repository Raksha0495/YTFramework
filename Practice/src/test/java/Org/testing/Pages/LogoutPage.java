package Org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogoutPage {

	ChromeDriver driver;

	Properties pr;

	public LogoutPage(ChromeDriver driver, Properties pr) {

		this.driver = driver;
		this.pr = pr;
	}

	public void SignOut() throws InterruptedException {

		WebElement MenuButton = driver.findElement(By.xpath(pr.getProperty("Menu")));

		MenuButton.click();

		Thread.sleep(3000);

		WebElement SignOut = driver.findElement(By.linkText(pr.getProperty("SignOutButton")));

		SignOut.click();

		Thread.sleep(4000);

	}
}
