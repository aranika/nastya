package PageFactory;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	By userName=By.id("logininput");
	By password=By.id("passwordinput");
	By login=By.id("buttonLogin");
	By reset=By.id("buttonReset");
	By chekbox=By.id("checkboxesRemember-0");
	
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void setLog(String strLog) {
		driver.findElement(userName).sendKeys(strLog);
	}
	public void setPassword(String strPassword) {
		driver.findElement(password).sendKeys(strPassword);
	}
	public void clickLogin() {
		driver.findElement(login).click();
	}
	public void clickReset() {
		driver.findElement(reset).click();
	}
	
	public void toLogin(String strLog, String strPassword) {
		this.setLog(strLog);
		this.setPassword(strPassword);
		this.clickLogin(); 
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	
	public String getUrlLoginPage() {
		return "http://86.57.161.116:10008/#/login";
	}
}