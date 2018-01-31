package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

public class FindEl {	

	public static boolean FindElByCss(String el, WebDriver driver) {
		try {
			driver.findElement(By.cssSelector(el)).isDisplayed();
			return true;
		} 
		catch (NoSuchElementException e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public static boolean FindElByXPath(String xpathExpression, WebDriver driver) {
		try {
			driver.findElement(By.xpath(xpathExpression)).isDisplayed();
			return true;
		} 
		catch (NoSuchElementException e) {
			// TODO: handle exception
			return false;
		}
	}
}
