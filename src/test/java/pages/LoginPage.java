package pages;

import org.openqa.selenium.*;

public class LoginPage {
	WebDriver driver;
	By log=By.id("logininput");
	By password=By.id("passwordinput");
	By login=By.id("buttonLogin");
	By reset=By.id("buttonReset");
	By chekbox=By.id("checkboxesRemember-0");
	
	public LoginPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

	public void setLog(String strLog) {
		driver.findElement(log).sendKeys(strLog);
	}
	public void setPassword(String strPassword) {
		driver.findElement(password).sendKeys(strPassword);
	}
	public void clickLogin() {
		driver.findElement(login).click();;
	}
	public void clickReset() {
		driver.findElement(reset).click();;
	}
	
	public void toLogin(String strLog, String strPassword) {
		this.setLog(strLog);
		this.setPassword(strPassword);
		this.clickLogin();
	}
}
