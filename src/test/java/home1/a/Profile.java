package home1.a;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Profile {


	public static String FindEl(String el, WebDriver driver) {
		try {driver.findElement(By.cssSelector(el)).isDisplayed();
		return "FOUND "+el+"; ";
		} catch (NoSuchElementException e) {
			// TODO: handle exception
			return "NOT FOUND "+el+"; ";
		}

	}

	public static void LogIn(String login, String password, WebDriver driver) throws InterruptedException {
		WebElement log=driver.findElement(By.cssSelector("input[name='userName']"));Thread.sleep(5000);
		log.click(); 	        log.sendKeys(login);;
		WebElement pas=driver.findElement(By.cssSelector("input[name='password']"));Thread.sleep(5000);
		pas.click(); 	        pas.sendKeys(password);
		WebElement sub=driver.findElement(By.cssSelector("button[id='buttonLogin']"));Thread.sleep(5000);
		sub.click();

		System.out.println("Login Ok");
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://86.57.161.116:10008/#/login"); 
		//		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
				LogIn("kolia", "empl", driver);
				driver.get("http://86.57.161.116:10008/#/profile");

		System.out.print(FindEl("nput[name='userName']", driver));

		driver.close();
		driver.quit();
	}

}
