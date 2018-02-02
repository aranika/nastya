package test;


import java.util.concurrent.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.testng.annotations.*;

import PageFactory.*;
import Source.Users;
import utility.ValidationPage;

public class TestLoginPage {
	WebDriver driver;
	LoginPage objLogin;

	@DataProvider(name="dp")
	public static Object[][]testData() 
	{
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
		objLogin=new LoginPage(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(objLogin.getUrlLoginPage());
//		(new ValidationPage()).ValidationURL(driver, objLogin.getUrlLoginPage());
	}

	@AfterSuite
	public void afterTest() {
		driver=new ChromeDriver();
		driver.close();
		driver.quit();
	}
}
