package test;

import org.testng.annotations.Test;

import PageFactory.HomePage;
import PageFactory.LoginPage;

import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestHomePage {
	WebDriver driver;
	LoginPage objLogin;
	HomePage homePage;


	@BeforeTest 
	public void beforeTest() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://86.57.161.116:10008/#/login");
		objLogin=new LoginPage(driver);
		objLogin.toLogin("kolia", "empl");

	}

	@Test (groups= {"B"})
	public void testGoToProfile() {
		homePage=new HomePage(driver);
		homePage.goToProfile();	  
	}

}
