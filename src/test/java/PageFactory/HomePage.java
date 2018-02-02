package PageFactory;

import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	By name=By.cssSelector("[class='dropdown-toggle'] span[class='ng-binding']");
	By profile=By.cssSelector("[ng-click='profileURL()']"); 
	By logout=By.cssSelector("[ng-click='logout()']");

	public HomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getName() {
		return driver.findElement(name);
	}

	public void nameClick() {
		this.getName().click();
	}

	public void goToProfile() {
		// TODO Auto-generated method stub
		this.nameClick();
		driver.findElement(profile).click();
	}

	public void logOut() {
		this.nameClick();
		driver.findElement(logout);
	}
}
