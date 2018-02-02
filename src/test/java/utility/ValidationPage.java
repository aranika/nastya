package utility;

import org.openqa.selenium.WebDriver;

public class ValidationPage {

	public void ValidationURL(WebDriver driver, String URL) {
		if (!driver.getCurrentUrl().toString().equals(URL)) {
			System.out.println("не та страница");
			driver.close();
		}
	}

	public void ValidationByCss(WebDriver driver, String el) {
		if (!(FindEl.FindElByCss(el, driver)))
				{
			System.out.println("не та страница");
			driver.close();
		}
	}
	
	public void ValidationByXPath(WebDriver driver, String el) {
		if (!(FindEl.FindElByXPath(el, driver)))
				{
			System.out.println("не та страница");
			driver.close();
		}
	}
}
