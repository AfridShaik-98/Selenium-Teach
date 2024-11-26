package browserlaunch;

import java.io.File;
import java.time.Duration;
import java.time.Instant;
import java.util.concurrent.TimeUnit;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class browserlaunch {
	static WebDriver driver;

	@SuppressWarnings("static-access")
	browserlaunch(WebDriver driver) {
		this.driver = driver;
	}

	public static void main(String[] args) throws Throwable {
		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://www.google.com");
		browserlaunch obj = new browserlaunch(driver);

		obj.locators_8types();
		obj.textboxes();

		obj.handle_basi_html();
		obj.dropdwn();
		obj.navigation_Methods();
		obj.alerts();
		obj.handeling_frames();
		obj.capture_Screenshot();
		obj.pageload_timeout();
		obj.implicitwait();
		obj.explicitwait();
		obj.maximunbrowsering();
		obj.get_url_Title_Pagesource();
		obj.webelement_properties();
		obj.mouse_actions();
		obj.handling_calenders();
		obj.javascripexecutor_test();
		obj.types_of_xpath();

		driver.quit();
	}

	public void locators_8types() throws Throwable {
		Thread.sleep(4000);
		driver.navigate().to("https://github.com/login?return_to=https%3A%2F%2Fgithub.com%2Ftopics%2Flogin"); // navigating
																												// to
																												// the
																												// git-hub
		// 1. id----locator
		driver.findElement(By.id("login_field")).sendKeys("testdata1");// username
		Thread.sleep(4000);

		// 2. name----locator
		driver.findElement(By.name("password")).sendKeys("testdata1");// password
		Thread.sleep(4000);

		// 3. classname----locator
		WebElement classnamevalue = driver.findElement(By.className("header-logo"));// logo button
		if (classnamevalue.isDisplayed()) {
			System.out.println("Logo has been displayed");
		}

		Thread.sleep(4000);

		// 4. linktext----locator
		driver.findElement(By.linkText("Forgot password?")).click();// forgot password
		Thread.sleep(4000);
		driver.navigate().back();
		Thread.sleep(4000);

		// 5. partiallinktext----locator
		driver.findElement(By.partialLinkText("Create an")).click();// create an
		Thread.sleep(4000);
		driver.navigate().back();
		Thread.sleep(4000);

		// 6. Tagname----locator
		driver.findElement(By.id("login_field")).clear();
		Thread.sleep(4000);
		WebElement tagnamevalue = driver.findElement(By.tagName("label"));// logo button
		if (tagnamevalue.isDisplayed()) {
			System.out.println("username text has been displayed");
		}

		// 7. css----locator
		Thread.sleep(4000);
		driver.findElement(By.cssSelector("input[name='commit']")).click();// signbutton
		Thread.sleep(4000);

		// 8. xpath----locator
		driver.findElement(By.xpath("//input[@name='commit']")).click();// signbutton ---->relative xpat
		Thread.sleep(4000);
	}

	public void textboxes() throws Throwable {

		Thread.sleep(4000);
		driver.navigate().to("https://github.com/login?return_to=https%3A%2F%2Fgithub.com%2Ftopics%2Flogin"); // navigating
																												// to
																												// the
																												// git-hub
		// 1. id----locator
		driver.findElement(By.id("login_field")).sendKeys("testdata1");// username
		Thread.sleep(4000);

		// 2. name----locator
		driver.findElement(By.name("password")).sendKeys("testdata1");// password
		Thread.sleep(4000);

	}

	public void handle_basi_html() throws Throwable {
		// link, buttons, radio buttons and checkboxes

		Thread.sleep(4000);
		driver.navigate().to("https://www.hyrtutorials.com/p/basic-controls.html"); // navigating
																					// to
																					// the hyr totorials

		Thread.sleep(4000); // hyr tutorls page
		// radio button
		driver.findElement(By.id("femalerb")).click();
		Thread.sleep(4000);

		// checkboxes
		driver.findElement(By.id("spanishchbx")).click();
		Thread.sleep(4000);

		// button
		driver.findElement(By.id("registerbtn")).click();
		Thread.sleep(4000);
		System.out.println(driver.findElement(By.xpath("//label[@id='msg']")).getText());

		// link
		driver.findElement(By.linkText("Click here to navigate to the home page")).click();
		Thread.sleep(4000);

	}

	public void dropdwn() throws Throwable {

		Thread.sleep(4000);
		driver.navigate().to("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html"); // navigating
																										// to
																										// the
																										// dropdown page
		// single dropdown
		WebElement course = driver.findElement(By.id("course"));// dropdown
		Select value = new Select(course);
		value.selectByIndex(1);// java
		Thread.sleep(4000);
		value.selectByValue("net");// dot net
		Thread.sleep(4000);
		value.selectByVisibleText("Python");// python
		Thread.sleep(4000);

		// multiple select dropdown
		WebElement course1 = driver.findElement(By.id("ide"));// multiselect dropdown
		Select value1 = new Select(course1);
		value1.selectByIndex(0);
		Thread.sleep(4000);
		value1.selectByValue("ij");// IntelliJ IDEA
		Thread.sleep(4000);
		value1.selectByVisibleText("Visual Studio");// Visual Studio
		Thread.sleep(4000);
		value1.deselectByVisibleText("Visual Studio");
		Thread.sleep(4000);
	}

	public void navigation_Methods() throws Throwable {

		// submit, to , refresh back, forward
		driver.navigate().to("https://www.google.com");
		driver.findElement(By.name("q"))
				.sendKeys("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");
		Thread.sleep(4000);
		driver.findElement(By.name("q")).submit(); // enter button click operation

		// browser buttons
		Thread.sleep(4000);
		driver.navigate().to("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html"); // navigating
																										// to
																										// the
																										// dropdown page
																										// for
																										// navigation
																										// testing

		Thread.sleep(4000);
		driver.navigate().back();

		Thread.sleep(4000);
		driver.navigate().forward();
		Thread.sleep(4000);
		// single dropdown
		WebElement course = driver.findElement(By.id("course"));// dropdown
		Select value = new Select(course);
		value.selectByIndex(1);// java
		Thread.sleep(4000);
		driver.navigate().refresh();

	}

	public void alerts() throws Throwable {
		// alert box, confirm box, prompt box

		driver.navigate().to("https://www.hyrtutorials.com/p/alertsdemo.html");

		// Alert box
		driver.findElement(By.id("alertBox")).click();
		Thread.sleep(4000);
		driver.switchTo().alert().accept();
		Thread.sleep(4000);

		// confirm box
		driver.findElement(By.id("confirmBox")).click();
		Thread.sleep(4000);
		driver.switchTo().alert().accept();
		Thread.sleep(4000);
		driver.findElement(By.id("confirmBox")).click();
		Thread.sleep(4000);
		driver.switchTo().alert().dismiss();

		// prompt box
		driver.findElement(By.id("promptBox")).click();
		Thread.sleep(4000);
		driver.switchTo().alert().sendKeys("test automation");
		Thread.sleep(4000);
		driver.switchTo().alert().accept();
		Thread.sleep(4000);

		driver.findElement(By.id("promptBox")).click();
		Thread.sleep(4000);
		driver.switchTo().alert().sendKeys("test automation dismiss");
		Thread.sleep(4000);
		driver.switchTo().alert().dismiss();
		Thread.sleep(4000);
	}

	public void handeling_frames() throws Throwable {

		Thread.sleep(4000);
		driver.navigate().to("https://www.hyrtutorials.com/p/frames-practice.html"); // navigating
																						// to
																						// the
																						// Iframe page

		driver.findElement(By.id("name")).sendKeys("text1");// texting
		Thread.sleep(4000);

		// switching to the frame 1
		WebElement frame1 = driver.findElement(By.id("frm1"));

		driver.switchTo().frame(frame1);

		WebElement course = driver.findElement(By.id("course"));// dropdown
		Select value = new Select(course);
		value.selectByIndex(1);
		Thread.sleep(4000);

		driver.switchTo().defaultContent();
		// switch back to default frame and perform operation
		driver.findElement(By.id("name")).sendKeys("text2");// texting
		Thread.sleep(4000);

		WebElement frame2 = driver.findElement(By.id("frm2"));
		driver.switchTo().frame(frame2);

		WebElement basiccontrol = driver.findElement(By.id("selectnav1"));// dropdown
		Select value2 = new Select(basiccontrol);
		value2.selectByIndex(1);
		Thread.sleep(4000);

	}

	public void capture_Screenshot() throws Throwable {

		// Note = need to ad dependency for performing the
		// screenshot,,,,,,,,,,,,,,,commons io file in mvn repository

		Thread.sleep(4000);
		driver.navigate().to("https://www.hyrtutorials.com/p/frames-practice.html");
		ChromeDriver driver1 = (ChromeDriver) driver; // upcasting & downcasting the driver instance to the chromedriver

		File sourcefile = driver1.getScreenshotAs(OutputType.FILE); // file to be take in format

		File sourceplace = new File("D:\\screen shot\\image1.png");// make sure change the path
		Thread.sleep(4000);
		FileUtils.copyFile(sourcefile, sourceplace);

	}

	public void pageload_timeout() throws Throwable {

		// default timeout exception 300sec
		// driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS); to set a
		// time for loading a page at this much time only
		// time out exception
		// invalid argument exception

		Instant starttime = Instant.now();
		driver.navigate().to("https://www.hyrtutorials.com/p/alertsdemo.html");

		Instant endtime = Instant.now();
		System.out.println(driver.getTitle());

		Duration duration = Duration.between(starttime, endtime);
		System.out.println(starttime.toString() + "\n" + endtime.toString() + "\n" + duration.toMillis() + " secounds");
	}

	@SuppressWarnings("deprecation")
	public void implicitwait() {

		// max time, it need to wait to identify

		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

		driver.navigate().to("https://www.hyrtutorials.com/p/waits-demo.html");

		driver.findElement(By.id("btn1")).click();

		driver.findElement(By.id("txt1")).sendKeys("test1");

		driver.findElement(By.id("btn2")).click();

		driver.findElement(By.id("txt2")).sendKeys("test1");

	}

	public void explicitwait() {

		// max time, it need to wait to identify

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

		driver.navigate().to("https://www.hyrtutorials.com/p/waits-demo.html");

		driver.findElement(By.id("btn1")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("txt1")));

		driver.findElement(By.id("txt1")).sendKeys("test1");

		driver.findElement(By.id("btn2")).click();

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("txt2")));

		driver.findElement(By.id("txt2")).sendKeys("test1");

	}

	public void maximunbrowsering() throws Throwable {

		driver.navigate().to("https://www.hyrtutorials.com/p/waits-demo.html");

		driver.manage().window().minimize();

		Thread.sleep(4000);

		driver.manage().window().maximize();

		Thread.sleep(4000);

	}

	public void get_url_Title_Pagesource() throws Throwable {

		driver.navigate().to("https://www.selenium.dev/");

		// url
		String currenturl = driver.getCurrentUrl();
		System.out.println(currenturl);

		// Title
		String currenttitle = driver.getTitle();
		System.out.println(currenttitle);

		// page source
		String currentpagesource = driver.getPageSource();
		System.out.println(currentpagesource);// returns the html code

		driver.manage().window().maximize();

		Thread.sleep(4000);

	}

	public void webelement_properties() throws Throwable {
		Thread.sleep(4000);
		driver.navigate().to("https://github.com/login?return_to=https%3A%2F%2Fgithub.com%2Ftopics%2Flogin"); // navigating
																												// to
																												// the
																												// git-hub

		Thread.sleep(4000);
		driver.findElement(By.cssSelector("input[name='commit']")).click();// signbutton
		Thread.sleep(4000);

		WebElement tagname = driver.findElement(By.name("commit"));

		System.out.println(tagname.getTagName());// returns tag name

		System.out.println(tagname.getAttribute("type")); // returns attribute value

		driver.findElement(By.id("login_field")).sendKeys("testdata1");// username
		Thread.sleep(4000);
		System.out.println(driver.findElement(By.id("login_field")).getAttribute("value")); // text fiel entered output
		System.out.println(driver.findElement(By.cssSelector("input[name='commit']")).getCssValue("background-color"));

	}

	public void mouse_actions() throws Throwable {

		// mouse hover
		// click
		// double click
		// right click or context click

		Thread.sleep(4000);
		driver.navigate().to("https://www.flipkart.com/"); // navigating
															// to
															// the
															// flipkart

		WebElement moveelement = driver.findElement(By.xpath("//img[@class='-dOa_b L_FVxe']"));
		Actions action = new Actions(driver);
		action.moveToElement(moveelement).perform(); // mouse hover
		Thread.sleep(4000);
		action.moveToElement(driver.findElement(By.className("_3pKU-e"))).perform(); // mouse hover
		Thread.sleep(4000);
		driver.findElement(By.className("_3pKU-e")).click(); // click

		driver.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("myvalues");

		action.doubleClick().perform(); // double click
		WebElement doubleclickvalue = driver.findElement(By.xpath("//input[@class='_2IX_2- _3umUoc VJZDxU']"));
		action.contextClick(doubleclickvalue).perform(); // right click

		Thread.sleep(10000);
	}

	public void handling_calenders() throws Throwable {

		driver.navigate().to("https://jqueryui.com/datepicker/");

		driver.switchTo().frame(0);

		WebElement datePickerInput = driver.findElement(By.id("datepicker"));
		datePickerInput.click();

		WebElement desiredDate = driver
				.findElement(By.xpath("//td[@class=' ui-datepicker-days-cell-over  ui-datepicker-today']"));
		desiredDate.click();
		Thread.sleep(4000);
		String selectedDate = datePickerInput.getAttribute("value");
		System.out.println("Selected Date: " + selectedDate);

	}

	public void javascripexecutor_test() throws Throwable {

		// scroll 2 ways
		driver.navigate().to("https://www.selenium.dev/");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement image1 = driver.findElement(By.xpath("//small[@class='text-white']"));
		Thread.sleep(3000);
		js.executeScript("arguments[0].scrollIntoView()", image1);
		Thread.sleep(3000);
		js.executeScript("window.scroll(100, 100);");
		Thread.sleep(3000);
	}

	public void types_of_xpath() throws Throwable {

		// scroll 2 ways
		driver.navigate().to("https://www.selenium.dev/");

		JavascriptExecutor js = (JavascriptExecutor) driver;
		WebElement image1 = driver.findElement(By.xpath("//small[@class='text-white']"));// relative xpath

		Thread.sleep(3000);
		js.executeScript("arguments[0].scrollIntoView()", image1);
		Thread.sleep(3000);
		js.executeScript("arguments[0].scrollIntoView()", driver.findElement(By.xpath("//section/div/div/div/p[2]"))); // absolute
																														// xpath
		Thread.sleep(3000);
	}

}
