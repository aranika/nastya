package test;

import PageFactory.*;
import Source.Users;
import utility.*;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import Database.ConnectionMySQL;

public class TestProfilePageDB {
	WebDriver driver;
	LoginPage objLogin;
	ProfilePage objProfile;
	HomePage objHome;

	//	@DataProvider (name="dpPhone")
	//	public static Object[] testData() {
	//		return  Users.getPhone() ;
	//	}

	@Test (groups= {"Profile", "Email", "Valid"}, priority=1, enabled=true)
	public void testEmail() {
		ValidationElements.ValidationEmail(objProfile.getEmail());
	}

	@Test (groups={"Profile", "Phone", "Valid"}, priority = 18, enabled=true)
	public void testPhone() {
		ValidationElements.ValidationPhone(objProfile.getPhone());
	}

	@Test (groups={"Profile", "Email", "Equal"}, priority = 50, enabled=true)
	public void emailEqual()
	{
		objProfile.getPhone().equals(ConnectionMySQL.getEmail_employee());
	}
	@Test (groups={"Profile", "Phone", "Equal"}, priority=30)
	public void phoneEqual()
	{
		objProfile.getPhone().equals(ConnectionMySQL.getPhone_employee());
	} 

	@Test (groups={"Profile", "Active", "Equal"}, priority=2000)
	public void activeEqual()
	{
		objProfile.goToProfFroSet();
		objProfile.getValueActive().equals(ConnectionMySQL.getActive_employee());
//		System.out.println("--Value Active--<"+objProfile.getValueActive()+">");
	} 

	@Test (groups={"Profile", "FirstName", "Equal"}, priority=15, enabled=true)
	public void firstNameEqual()
	{
		objProfile.getFirstName().equals(ConnectionMySQL.getFirstName_employee());
	}

	@Test (groups={"Profile", "MidleName", "Equal"},priority=20, enabled=true)
	public void midNameEqual()
	{
		objProfile.getMidName().equals(ConnectionMySQL.getMiddleName_employee());
	}

	@Test (groups={"Profile", "LastName", "Equal"},priority=30, enabled=true)
	public void lastNameEqual()
	{
		objProfile.getLastName().equals(ConnectionMySQL.getLastName_employee());
	}


	@Test (groups={"Profile", "Date", "Valid"}, enabled=true)
	public void birthValid()
	{
		ValidationElements.validationDate(objProfile.getBirth());
	}

	@Test (groups={"Profile", "Date", "Equal"}, enabled=true)
	public void birthEqual()
	{
		objProfile.getBirth().equals(ConnectionMySQL.getBirth_employee());
	}
	
	

	@Test (groups={"Profile", "Skype", "Equal"}, enabled=true)
	public void skypeEqual()
	{
		objProfile.getSkype().equals(ConnectionMySQL.getSkype_employee());
	}
	
	
	@BeforeTest
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

	@AfterTest
	public void after() {
		driver.close();
		driver.quit();
	}
}
