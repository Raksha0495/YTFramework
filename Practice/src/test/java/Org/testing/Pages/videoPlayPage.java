package Org.testing.Pages;

import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class videoPlayPage {

	ChromeDriver driver;

	Properties pr;

	public videoPlayPage(ChromeDriver driver, Properties pr) {

		this.driver = driver;
		this.pr = pr;

	}

	public void videoplay() throws InterruptedException {

		WebElement VideoClick = driver.findElement(By.id(pr.getProperty("Videotry")));

		VideoClick.click();

		Thread.sleep(8000);

	}

}
