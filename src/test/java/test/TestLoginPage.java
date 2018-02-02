package test;


import java.util.concurrent.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.*;

import PageFactory.*;
import Source.Users;
import utility.ValidationElements;

public class TestLoginPage {
	WebDriver driver;
	LoginPage objLogin;

	@DataProvider(name="dp")
	public static Object[][] testData() {
		Object[][] s=(new Users()).getShortUsers();
		return s;
	}

	@Test (groups= {"A"}, dataProvider = "dp", priority=20)
	@Parameters(value= {"name","password"})
	public void testLogin(String name, String password) {

		objLogin=new LoginPage(driver);
		objLogin.toLogin(name, password); 

		try {
			(new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(By.id("vacationsTab")));
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("fail for log "+name +" pass "+password);
		}
		(new ValidationElements()).ValidationPageURL(driver, "http://86.57.161.116:10008/#/vacation");		
	}

	@BeforeMethod
	public void before() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver=new ChromeDriver();
		objLogin=new LoginPage(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(objLogin.getUrlLoginPage());
		(new ValidationElements()).ValidationPageURL(driver, objLogin.getUrlLoginPage());

	}

	@AfterMethod
	public void after() {
		driver.close();
		driver.quit();
	}
}
