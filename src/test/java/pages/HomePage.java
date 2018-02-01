package pages;

import org.openqa.selenium.*;

public class HomePage {
	WebDriver driver;
	By name=By.cssSelector("[class='dropdown-toggle'] span[class='ng-binding']");
	By profile=By.cssSelector("[ng-click='profileURL()']");
	By logout=By.cssSelector("[ng-click='logout()']");
}
