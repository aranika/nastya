package home1.a;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Profile {
	public static boolean FindEl(String el) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
		driver.get("http://86.57.161.116:10008/#/profile"); Thread.sleep(10000);
		driver.manage().window().maximize();
		WebElement elmnt=driver.findElement(By.cssSelector(el));Thread.sleep(10000); 	   
		Thread.sleep(20000);
		boolean res= (driver.getCurrentUrl().toString().equals("http://86.57.161.116:10008/#/vacation"));
		driver.close();
		driver.quit();
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
