package includingbeforemethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class testlaunchclass {

	public static WebDriver driver;

	@BeforeMethod
	public void launchgit() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://github.com/login");
	}

	@Test
	public void testingapp() {
		storage_methods a = new storage_methods(driver);
		a.name();
	}

	@AfterMethod
	public void forcling() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();

	}
}
