package test;


import java.util.concurrent.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.testng.annotations.*;
import pages.*;

public class TestLoginPage {
	WebDriver driver;
	LoginPage objLogin;
	@Test (priority=50)
	public void testLogin() {
		objLogin=new LoginPage(driver);
		objLogin.toLogin("kolia", "empl");
	}
	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://86.57.161.116:10008/#/login");
	}
	@AfterTest
	public void afterTest() {
		driver.close();
		driver.quit();
	}
}
