package test;


import java.util.concurrent.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.testng.annotations.*;

import PageFactory.*;
import Source.Users;

public class TestLoginPage {
	WebDriver driver;
	LoginPage objLogin;
	
	@DataProvider(name="dp")
	public static Object[][]	testData() {
		return (new Users().getUsers());
	}

	@Test (groups= {"A"}, priority=20, dataProvider = "dp", timeOut=1000)
	@Parameters(value= {"name","password"})
	public void testLogin(String name, String password) {
			objLogin=new LoginPage(driver);
			objLogin.toLogin(name, password);
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
