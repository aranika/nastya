package utility;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class ValidationElements {

	public boolean ValidationPageURL(WebDriver driver, String URL) {
		if (!driver.getCurrentUrl().toString().equals(URL)) {
			System.out.println("не та страница");
			driver.close();
			return false;
		}
		return true;
	}

	public static boolean ValidationPageByCss(WebDriver driver, String el) {
		if (!(FindEl.FindElByCss(el, driver)))
				{
			System.out.println("не та страница");
			driver.close();
			return false;
		}
		return true;
	}
	
	public boolean ValidationPageByXPath(WebDriver driver, String el) {
		if (!(FindEl.FindElByXPath(el, driver)))
				{
			System.out.println("не та страница");
			driver.close();
			return false;
		}
		return true;
	}
	
	public static boolean ValidationEmail(String actual) {
		final Pattern pattern = Pattern.compile("^[A-Za-z0-9.%+\\-]+@[A-Za-z0-9.\\-]+\\.[A-Za-z]{2,4}");
		final Matcher matcher = pattern.matcher(actual);
        return matcher.find();
	}
	
	public static boolean ValidationPhone(String actual) {
		final Pattern pattern = Pattern.compile("^[8]+\\-[0-9]{3}+\\-[0-9]{7}$");
		final Matcher matcher = pattern.matcher(actual);
        return matcher.find();
	
	}
}
