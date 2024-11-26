package browserlaunch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testing {

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("(//a[@class='_1krdK5 _3jeYYh'])[2]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//a[@class='sd-header-link'])[6]")).click();
		driver.quit();
	}

}
