package utility;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.concurrent.TimeUnit;
import java.util.regex.*;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Source.*;
import Database.*;
import PageFactory.HomePage;
import PageFactory.LoginPage;
import PageFactory.ProfilePage;

public class proverkaFunk {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		ProfilePage objProfile=new ProfilePage(driver);
		LoginPage objLogin=new LoginPage(driver);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(objLogin.getUrlLoginPage());
		(new ValidationElements()).ValidationPageURL(driver, objLogin.getUrlLoginPage());
		objLogin.toLogin("kolia", "empl");
		HomePage  objHome= new HomePage(driver);
		objHome.goToProfile();  
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		objProfile.goToSettings();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				
		System.out.print(" "+
					objProfile.getSkype()
				+" ")		;


	}

}
//while (resultSet.next()) {
//System.out.println(resultSet.toString());	
//}