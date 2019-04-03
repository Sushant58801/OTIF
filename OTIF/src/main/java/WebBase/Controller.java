package WebBase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Controller {
	
	public static WebDriver driver = null;

	public static WebDriver InvokeWebDriver() {
		if (driver != null) {
			return driver;
		}

		System.setProperty("webdriver.chrome.driver",
				"Driver\\chromedriver.exe");
		driver = (WebDriver) new ChromeDriver();
		System.out.println("Driver Created");

		driver.get("http://otif.mutlp.test.pointp.saint-gobain.net");

		System.out.println("Website Open");

		driver.manage().window().maximize();
		driver.manage().timeouts();
		return driver;
	}

	// @AfterSuite
	// public void stop() {
	// if (driver != null) {
	// driver.quit();
	//
	// }

	
}
