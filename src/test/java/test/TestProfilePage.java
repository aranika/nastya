package test;

import PageFactory.*;
import Source.Users;
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

	//	@DataProvider (name="dpPhone")
	//	public static Object[] testData() {
	//		return  Users.getPhone() ;
	//	}

	@Test (groups= {"Profile", "Email", "Valid"}, enabled=false)
	public void testEmail() {
		ValidationElements.ValidationEmail(objProfile.getEmail());
	}

	@Test (groups={"Profile", "Phone", "Valid"}, enabled=false)
	public void testPhone() {
		ValidationElements.ValidationPhone(objProfile.getPhone());
	}

	@Test (groups={"Profile", "Email", "Equal"}, enabled=false)
	public void emailEqual()
	{
		objProfile.getPhone().equals(Users.getEmail());
	}
	@Test (groups={"Profile", "Phone", "Equal"})
	public void phoneEqual()
	{
		objProfile.getPhone().equals(Users.getPhone());
	} 

	@Test (groups={"Profile", "Active", "Equal"}, enabled=false)
	public void activeEqual()
	{
		objProfile.goToProfFroSet();
		System.out.println("--Value Active--<"+objProfile.getValueActive()+">");
	} 

	@Test (groups={"Profile", "FirstName", "Equal"}, enabled=false)
	public void firstNameEqual()
	{
		objProfile.getFirstName().equals(Users.getFirstName());
	}

	@Test (groups={"Profile", "MidleName", "Equal"}, enabled=false)
	public void midNameEqual()
	{
		objProfile.getMidName().equals(Users.getMiddleName());
	}

	@Test (groups={"Profile", "LastName", "Equal"}, enabled=false)
	public void lastNameEqual()
	{
		objProfile.getLastName().equals(Users.getLastName());
	}


	@Test (groups={"Profile", "Date", "Valid"}, enabled=false)
	public void birthValid()
	{
		ValidationElements.validationDate(objProfile.getBirth());
	}

	@Test (groups={"Profile", "Date", "Equal"}, enabled=false)
	public void birthEqual()
	{
		objProfile.getBirth().equals(Users.getBirth());
	}

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
