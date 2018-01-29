package home1.a;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Profile {


	public static boolean FindEl(String el, WebDriver driver) {
		try {driver.findElement(By.cssSelector(el)).isDisplayed();
		return true;
		} catch (NoSuchElementException e) {
			// TODO: handle exception
			return false;
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

	public static String[] ArrayEl() {
		String[]Elements= {"a[class='navbar-brand']",//RMT
				"ul[class='nav navbar-nav']>li>a",//отпуска
				"a[data-i18n='navbar.orgChart']",//Диаграмма
				"ul[class='nav navbar-nav']>li>a[data-i18n='navbar.orgChart']",//ОТчеты
				"a[class='dropdown-toggle']",//язык
				"span[class*='glyphicon glyphicon-user']",//авка
				"a[class='dropdown-toggle']>span[class='ng-binding']",//имя
				"a>b",//выпадающее
				"a[ng-click='profileURL()']",
				"a[ng-click=\"logout()\"]",
				"a[href='#vacations']",//общая
				"a[href*='#histo']",	//история отпусков
				"a[href*='#to']",				//калькулятор
				"input[class*='search ']",				//поле ввода поиска
				"span[class*='glyphicon glyphicon-search']",				//кнопка поиска
				"div[class='col-xs-8 accordion-toggle']",				//запросы на отпуска
				"button[class='btn btn-sm btn-success xh-highlight']",			//запрос сверурочных
				"button[class='btn btn-sm btn-success']",//запрос на отпуск
				"table[class='table table-condensed table-hover'] th[ng-click='sort('id')']",//#	
				"table[class='table table-condensed table-hover'] th[data-i18n='vacation.startDate']",//Дата начала	
				"table[class='table table-condensed table-hover'] th[data-i18n='vacation.endDate']",	//		Дата конца	
				"table[class='table table-condensed table-hover'] th[data-i18n='vacation.vacType']",//Тип	
				"table[class='table table-condensed table-hover'] th[data-i18n='vacation.vacStatus']",				//Статус	
				"table[class='table table-condensed table-hover'] th[data-i18n='vacation.comment']",				//Комментарий	
				"table[class='table table-condensed table-hover'] th[data-i18n='vacation.actions']",				//Действия
				//#	
				//Дата начала	
				//		Дата конца	
				//Тип	
				//Статус	
				//Комментарий	
				//Действия
				//Баланс Отпусков
				//Type	
				//Count
				//				Плановый	
				//-15
				//				Сверхурочные	
				//45
				//				Календарь отпусков
				//				Легенда
				//				Сверхурочные
				//				По болезни
				//				По исключению
				//				Плановый
				//				Без Оплаты
				//				Исключительные дни
				//				Нац. праздник
				//				Межд. праздник
				//				Перенос
				//				влево
				//				вправо
				//				январь
				//				месяц
				//				сегодня 
				//				день
				"div[class*='month']" //каленарь
				//				Company
				//				About us
				//				Contact & support
				//				Applications
				//				Product for Mac
				//				Product for Windows
				//				Product for Eclipse
				//				Product mobile apps
				//				Services
				//				Vacation
				//				Org Chart
				//				Reports
				//				Documentation
				//				Product Help
				//				Developer API
				//				Product Pages
				//				© 2014 Senla. All rights reserved
		};

		return Elements;
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

		String [] arrayEl=ArrayEl();
		int n=arrayEl.length;
		for (int i=0;i<n;i++) {
			System.out.println("result of search  = " + FindEl(arrayEl[i], driver)+ " for "+ arrayEl[i]+" ; ");
		}
		driver.close();
		driver.quit();


	}

}
