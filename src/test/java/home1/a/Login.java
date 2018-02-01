package home1.a;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.*;

import utility.FindEl;

public class Login {

	public static boolean LogIn(String login, String password, WebDriver driver) throws InterruptedException {
		boolean res=true;
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 

		driver.get("http://86.57.161.116:10008/#/login"); 
		driver.manage().window().maximize();
		
		if (FindEl.FindElByCss("input[name='userName']", driver)){
			WebElement log=driver.findElement(By.cssSelector("input[name='userName']")); 
			log.click(); 	   
			log.sendKeys(login);

			if (FindEl.FindElByCss("input[name='password']", driver)){
				WebElement pas=driver.findElement(By.cssSelector("input[name='password']"));
				pas.click(); 	      
				pas.sendKeys(password);

				if (FindEl.FindElByCss("button[id='buttonLogin']", driver)){
					driver.findElement(By.cssSelector("button[id='buttonLogin']")).click(); 	  		

					try {
						(new WebDriverWait(driver, 30)).until(ExpectedConditions.presenceOfElementLocated(By.id("vacationsTab")));
						res = true;//driver.getCurrentUrl().toString().equals("http://86.57.161.116:10008/#/vacation");
					}

					catch (Exception e) {
						// TODO: handle exception
						res=false;
					}
				}
			}
		}

		return res;
	}
}
