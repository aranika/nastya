package home1.a;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Vacation {


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

	public static String[][] ArrayEl() {
		String[][]Elements= {{"a[class='navbar-brand']","RMT"},
				{	"ul[class='nav navbar-nav']>li>a","отпуска"},
				{"a[data-i18n='navbar.orgChart']","Диаграмма"},
				{"ul[class='nav navbar-nav']>li>a[data-i18n='navbar.orgChart']","Отчеты"},
				{"a[class='dropdown-toggle']", "язык"},
				{"span[class*='glyphicon glyphicon-user']", "авка"},
				{"a[class='dropdown-toggle']>span[class='ng-binding']","имя"},
				{"a>b","выпадающее"},
				{"a[ng-click='profileURL()']","Профиль"},
				{"a[ng-click=\"logout()\"]","Выйти"},
				{"a[href='#vacations']","общая"},
				{"a[href*='#histo']","история отпусков"},
				{"a[href*='#to']", "калькулятор"},
				{"input[class*='search ']","поле ввода поиска"},
				{"span[class*='glyphicon glyphicon-search']","кнопка поиска"},
				{"div[class='col-xs-8 accordion-toggle']","запросы на отпуска"},
				{"button[data-i18n='Vacation.button.reqOvertime']",	"запрос сверурочных"},
				{"button[class='btn btn-sm btn-success']","запрос на отпуск"},
				{"table[class='table table-condensed table-hover'] th[ng-click*='id']","#"},	
				{"table[class='table table-condensed table-hover'] th[data-i18n='Vacation.startDate']","Дата начала"},
				{"table[class='table table-condensed table-hover'] th[data-i18n='Vacation.endDate']","Дата конца"},
				{"table[class='table table-condensed table-hover'] th[data-i18n='Vacation.vacType']","Тип"},
				{"table[class='table table-condensed table-hover'] th[data-i18n='Vacation.vacStatus']",	"Статус"},
				{"table[class='table table-condensed table-hover'] th[data-i18n='Vacation.comment']","Комментарий"},
				{"table[class='table table-condensed table-hover'] th[data-i18n='Vacation.actions']","Действия"},
				{"table[class='table table-condensed table-hover'] tbody", "данные в таблице"},
				{"label[data-i18n='Vacation.vacBalance']","Баланс Отпусков"},
				{"div [id='vacationBalance'] table[class='table table-condensed table-hover'] th","Type"},
				{"div [id='vacationBalance'] table[class='table table-condensed table-hover'] th:nth-of-type(2)","Count"},
				{"tr[class='tableContent ng-scope']:nth-of-type(1)>td[class='col-md-6 ng-binding']:nth-of-type(1)","Плановый"},	
				{"tr[class='tableContent ng-scope']:nth-of-type(1)>td[class='ng-binding']:nth-of-type(2)","-15"},
				{"tr[class='tableContent ng-scope']:nth-of-type(2)>td[class='col-md-6 ng-binding']:nth-of-type(1)","Сверхурочные"},
				{"tr[class='tableContent ng-scope']:nth-of-type(2)>td[class='ng-binding']","45"},
				{"label[data-i18n='Vacation.button.vacCalendar']","Календарь отпусков"},
				{"label[data-i18n='calendar.legend']","Легенда"},
				{"div[class='calendar-event ui-draggable vt-ovt']","Сверхурочные"},
				{"div[class='calendar-event ui-draggable vt-ill']","По болезни"},
				{"div[class='calendar-event ui-draggable vt-exp']","По исключению"},
				{"div[class='calendar-event ui-draggable vt-vac']","Плановый"},
				{"div[class='calendar-event ui-draggable vt-pov']","Без Оплаты"},
				{"label[data-i18n='calendar.excDays']","Исключительные дни"},
				{"div[class='calendar-event ui-draggable vt-nat_hol']","Нац. праздник"},
				{"div[class='calendar-event ui-draggable vt-int_hol']","Межд. праздник"},
				{"div[class='calendar-event ui-draggable vt-transfer']","Перенос"},
				{"td[class='fc-header-left'] a[class='btn btn-primary fc-corner-left']","влево"},
				{"td[class='fc-header-left'] a[class='btn btn-primary fc-corner-right']","вправо"},
				{"span[class='fc-header-title']","январь"},
				{"td[class='fc-header-right'] a[class='btn btn-primary fc-corner-left']","месяц"},
				{"td[class='fc-header-left'] a[class='btn btn-primary fc-corner-left fc-corner-right']","сегодня "},
				{"td[class='fc-header-right'] a[class='btn btn-primary fc-corner-right']","день"},
				{"div[class*='month']", "Календарь"},
				{"div[class='col-md-3']:nth-child(1)>ul[class='list-unstyled']:nth-child(1)>li:nth-child(1)","Company"},
				{"div[class='col-md-3']:nth-child(1)>ul[class='list-unstyled']:nth-child(1)>li:nth-child(3)","About us"},
				{"div[class='col-md-3']:nth-child(1)>ul[class='list-unstyled']:nth-child(1)>li:nth-child(4)","Contact & support"},
				{"div[class='col-md-3']:nth-child(2)>ul[class='list-unstyled']:nth-child(1)>li:nth-child(1)","Applications"},
				{"div[class='col-md-3']:nth-child(2)>ul[class='list-unstyled']:nth-child(1)>li:nth-child(3)","Product for Mac"},
				{"div[class='col-md-3']:nth-child(2)>ul[class='list-unstyled']:nth-child(1)>li:nth-child(4)","Product for Windows"},
				{"div[class='col-md-3']:nth-child(2)>ul[class='list-unstyled']:nth-child(1)>li:nth-child(5)","Product for Eclipse"},
				{"div[class='col-md-3']:nth-child(2)>ul[class='list-unstyled']:nth-child(1)>li:nth-child(6)","Product mobile apps"},
				{"div[class='col-md-3']:nth-child(3)>ul[class='list-unstyled']>li:nth-child(1)","Services"},
				{"div[class='col-md-3']:nth-child(3)>ul[class='list-unstyled']>li:nth-child(3)","Vacation"},
				{"div[class='col-md-3']:nth-child(3)>ul[class='list-unstyled']>li:nth-child(4)","Org Chart"},
				{"div[class='col-md-3']:nth-child(3)>ul[class='list-unstyled']>li:nth-child(5)","Reports"},
				{"div[class='col-md-3']:nth-child(4)>ul[class='list-unstyled']>li:nth-child(1)","Documentation"},
				{"div[class='col-md-3']:nth-child(4)>ul[class='list-unstyled']>li:nth-child(3)","Product Help"},
				{"div[class='col-md-3']:nth-child(4)>ul[class='list-unstyled']>li:nth-child(4)","Developer API"},
				{"div[class='col-md-3']:nth-child(4)>ul[class='list-unstyled']>li:nth-child(5)","Product Pages"},
				{"p[class='muted pull-right']","© 2014 Senla. All rights reserved"}
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
		String [][] arrayEl=ArrayEl();
		int n=arrayEl.length;
		for (int i=45;i<n;i++) {
			System.out.println(i+ " result of search  = " + FindEl(arrayEl[i][0], driver)+ " for "+ arrayEl[i][1]+"; ");
		}
		driver.close();
		driver.quit();
		System.out.print("finish");
	}
}
