package Org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginPage {

	ChromeDriver driver;

	Properties pr;

	public LoginPage(ChromeDriver driver, Properties pr) {
		this.driver = driver;
		this.pr = pr;

	}

	public void signin(String email, String password) throws InterruptedException {

		WebElement SignInButton = driver.findElement(By.linkText(pr.getProperty("signIn")));

		SignInButton.click();

		Thread.sleep(2000);

		WebElement emailClick = driver.findElement(By.xpath(pr.getProperty("email")));
		emailClick.sendKeys("rakshartestacc0895@gmail.com");

		Thread.sleep(3000);

		WebElement nextButtonClick = driver.findElement(By.xpath(pr.getProperty("nextButton")));

		nextButtonClick.click();

		Thread.sleep(4000);

		WebElement passwordEnter = driver.findElement(By.xpath(pr.getProperty("password")));

		passwordEnter.sendKeys("test123rr");

		Thread.sleep(4000);

		WebElement nextButtonClick1 = driver.findElement(By.xpath(pr.getProperty("nextButton")));

		nextButtonClick1.click();

		Thread.sleep(8000);

	}

}
