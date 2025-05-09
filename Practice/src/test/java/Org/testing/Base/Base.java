package Org.testing.Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {

	public ChromeDriver driver;
	public Properties pr;

	@BeforeMethod

	public void BrowserLaunch() throws IOException {

		File f = new File("../Practice/ObjectRepo.properties");

		FileInputStream fis = new FileInputStream(f);

		pr = new Properties();
		pr.load(fis);

		driver = new ChromeDriver();

		driver.get("https://www.youtube.com");

		driver.navigate().refresh();

		driver.manage().window().maximize();

	}

	@AfterMethod

	public void BrowserClose() {

		driver.close();

	}

}
