package includingbeforemethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class storage_methods {

	public WebDriver driver;

	storage_methods(WebDriver driver) {
		this.driver = driver;
	}

	By username = By.id("login_field");
	By password = By.id("password");
	By loginbtn = By.name("commit");

	public void name() {
		driver.findElement(username).sendKeys("kiuhgfd");
		driver.findElement(password).sendKeys("fdghjk");
		driver.findElement(loginbtn).click();
	}

}
