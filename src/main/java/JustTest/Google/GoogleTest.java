package JustTest.Google;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTest {

	ChromeDriver driver;

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		try {
			// Open Google homepage

			ChromeDriver driver = new ChromeDriver();

			driver.get("https://www.google.com");

			// Wait briefly for the page to load (can use WebDriverWait for more
			// reliability)

			driver.manage().window().maximize();
			Thread.sleep(2000);

			// Locate language links (bottom of the page)
			List<WebElement> languages = driver.findElements(By.xpath("//div[@id='SIvCob']/a"));

			// Print each language
			for (WebElement lang : languages) {
				System.out.println(lang.getText());
			}

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			ChromeDriver driver2 = new ChromeDriver();
			// Close the browser
			driver2.quit();
		}
	}
}
