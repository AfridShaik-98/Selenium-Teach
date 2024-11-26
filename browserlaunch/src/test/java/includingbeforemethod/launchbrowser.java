package includingbeforemethod;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;

public class launchbrowser {
	WebDriver driver;

	launchbrowser(WebDriver driver) {
		this.driver = driver;
	}

	public void launchbrowser_github() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://github.com/login");
	}

	
}
