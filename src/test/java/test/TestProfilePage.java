package test;

import org.testng.annotations.Test;

import PageFactory.*;
import utility.*;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

public class TestProfilePage {
	WebDriver driver;
	LoginPage objLogin;
	ProfilePage objProfile;
	HomePage objHome;

	@Test (groups= {"Profile", "Email"})
	public void testEmail() {
		ValidationElements.ValidationEmail(objProfile.getEmail());
	}

	@Test (groups={"Profile", "Phone"})
	public void testPhone() {
		ValidationElements.ValidationPhone(objProfile.getPhone());
	}

//	@Test (groups={"Profile", "Phone"})
//	public void phoneEqual(String s)
//	{
//		objProfile.getPhone().equals(s);
//	}

	@BeforeMethod
	public void before() {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver=new ChromeDriver();
		objLogin=new LoginPage(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(objLogin.getUrlLoginPage());
		(new ValidationElements()).ValidationPageURL(driver, objLogin.getUrlLoginPage());
		objLogin.toLogin("kolia", "empl");
		objProfile= new ProfilePage(driver);
		objHome= new HomePage(driver);
		objHome.goToProfile();  
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		objProfile.goToSettings();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

	}

	@AfterMethod
	public void after() {
		driver.close();
		driver.quit();
	}
}
