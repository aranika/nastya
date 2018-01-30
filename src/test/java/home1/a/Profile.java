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
		WebElement log=driver.findElement(By.cssSelector("input[name='userName']"));Thread.sleep(10000);
		log.click(); 	        log.sendKeys(login);;
		WebElement pas=driver.findElement(By.cssSelector("input[name='password']"));Thread.sleep(10000);
		pas.click(); 	        pas.sendKeys(password);
		WebElement sub=driver.findElement(By.cssSelector("button[id='buttonLogin']"));Thread.sleep(10000);
		sub.click();
		System.out.println("Login Ok");
	}

	public static String[][] ArrayElProf() {
		String[][]Elements= {{"a[class='navbar-brand']","RMT"},
				{"ul[class='nav navbar-nav']>li>a","отпуска"},
				{"a[data-i18n='navbar.orgChart']","Диаграмма"},
				{"ul[class='nav navbar-nav']>li>a[data-i18n='navbar.orgChart']","Отчеты"},
				{"a[class='dropdown-toggle']", "язык"},
				{"span[class*='glyphicon glyphicon-user']", "авка"},
				{"a[class='dropdown-toggle']>span[class='ng-binding']","имя"},
				{"a>b","выпадающее"},//7
				{"a[ng-click='profileURL()']","Профиль"},//8
				{"a[ng-click=\"logout()\"]","Выйти"},
				{"span[data-i18n='profile.pageTitle']","Профиль"},
				{"span[class='glyphicon glyphicon-wrench']","настройки"},//11
				{"h4[class=ng-binding]","имя"},
				{"div[class='thumbnail']>img","фото"},
				{"th[data-i18n='profile.contactInfo']","конкт инф"},
				{"td[data-i18n='profile.field.email']","email"},
				{"table[class='table table-condensed table-hover']:nth-child(1) tr:nth-child(1) td[class='ng-binding']","знач email"},
				{"td[data-i18n='profile.field.phone']","Телефон"},
				{"table[class='table table-condensed table-hover']:nth-child(1) tr:nth-child(2) td[class='ng-binding']","Телефон знач"},
				{"td[data-i18n='profile.field.skype']","Skype"},
				{"a[class=ng-binding]","Skype знач"},
				{"th[data-i18n='profile.generalInfo']","общ инф"},
				{"td[data-i18n='profile.field.unit']","Подразделение"},
				{"table[class='table table-condensed table-hover']:nth-child(2) tr:nth-child(1) td[class='ng-binding']","Подразделение знач"},
				{"td[data-i18n='profile.field.location']","Локация"},
				{"table[class='table table-condensed table-hover']:nth-child(2) tr:nth-child(2) td[class='ng-binding']","Локация знач"},
				{"td[data-i18n='profile.field.country']","Страна"},
				{"table[class='table table-condensed table-hover']:nth-child(2) tr:nth-child(3) td[class='ng-binding']","Страна знач"},
				{"td[data-i18n='profile.field.city']","Город"},
				{"table[class='table table-condensed table-hover']:nth-child(2) tr:nth-child(4) td[class='ng-binding']","Город знач"},
				{"td[data-i18n='profile.field.office']","Офис"},
				{"table[class='table table-condensed table-hover']:nth-child(2) tr:nth-child(5) td[class='ng-binding']","Офис знач"},
				{"td[data-i18n='profile.field.calendar']","Календарь"},
				{"span[data-i18n='profile.showCalendar']","Календарь знач"},
				{"td[data-i18n='profile.field.active']","Активный"},
				{"span[ng-if*='value']","Активный знач"},
				{"th[data-i18n='profile.additionalInfo']","доп инф"},
				{"table[class='table table-condensed table-hover']:nth-child(3) tr:nth-of-type(1) td:nth-of-type(1)","Дата Рождения"},
				{"table[class='table table-condensed table-hover']:nth-child(3) tr:nth-of-type(1) td:nth-of-type(2)","Дата Рождения знач"},
				{"table[class='table table-condensed table-hover']:nth-child(3) tr:nth-of-type(2) td:nth-of-type(1)","Специализация"},
				{"table[class='table table-condensed table-hover']:nth-child(3) tr:nth-of-type(2) td:nth-of-type(2)","Специализация знач"},
				{"table[class='table table-condensed table-hover']:nth-child(3) tr:nth-of-type(3) td:nth-of-type(1)","Дата приема"},
				{"table[class='table table-condensed table-hover']:nth-child(3) tr:nth-child(3) td[class='ng-binding']","Дата приема знач"},
				{"table[class='table table-condensed table-hover']:nth-child(3) tr:nth-of-type(4) td:nth-of-type(1)","Дата ИС"},
				{"table[class='table table-condensed table-hover']:nth-child(3) tr:nth-of-type(4) td:nth-of-type(2)","Дата ИС знач"},
				{"table[class='table table-condensed table-hover']:nth-child(3) tr:nth-of-type(5) td:nth-of-type(1)","ИС пройден"},
				{"table[class='table table-condensed table-hover']:nth-child(3) tr:nth-of-type(5) td:nth-of-type(2)","ИС пройден знач"},
				{"table[class='table table-condensed table-hover']:nth-child(3) tr:nth-of-type(6) td:nth-of-type(1)","Рабочая станция"},
				{"table[class='table table-condensed table-hover']:nth-child(3) tr:nth-of-type(6) td:nth-of-type(2)","Рабочая станция знач"},
				{"table[class='table table-condensed table-hover']:nth-child(3) tr:nth-of-type(7) td:nth-of-type(1)","Комментарий"},
				{"table[class='table table-condensed table-hover']:nth-child(3) tr:nth-of-type(7) td:nth-of-type(2)","Комментарий знач"},
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

	public static String[][] ArrayElProfEdit() {
		String[][]Elements= {{"a[class='navbar-brand']","RMT"},
				{"ul[class='nav navbar-nav']>li>a","отпуска"},
				{"a[data-i18n='navbar.orgChart']","Диаграмма"},
				{"ul[class='nav navbar-nav']>li>a[data-i18n='navbar.orgChart']","Отчеты"},
				{"a[class='dropdown-toggle']", "язык"},
				{"span[class*='glyphicon glyphicon-user']", "авка"},
				{"a[class='dropdown-toggle']>span[class='ng-binding']","имя"},
				{"a>b","выпадающее"},//7
				{"a[ng-click='profileURL()']","Профиль"},//8
				{"a[ng-click=\"logout()\"]","Выйти"},
				{"span[data-i18n='profile.settings']","Настройки"},
				{"span[class='glyphicon glyphicon-circle-arrow-left']","Back"},//11
				{"div[class='thumbnail']>img","фото"},
				{"span[class='btn btn-primary']>input[type='file']","смена фото"},
				{"[data-i18n='profile.accountInfo']","Информация профиля"},
				{"[data-i18n='profile.field.firstName']","имя"},
				{"[data-i18n='profile.field.middleName']","Отчество"},
				{"[data-i18n='profile.field.lastName']","Фамилия"},
				{"[data-i18n='profile.field.birth']","Дата Рождения"},
				{"form>table>tbody:nth-child(2)>tr:nth-child(5) td:nth-child(1)","Password"},
				{"[valign='middle'] [class='form-control']","input password"},
				{"tr [class='form-control']","input password"},
				{"form>table:nth-of-type(1)>tbody:nth-of-type(1) tr:nth-of-type(2) input[class='form-control']","input отчество"},
				{"form>table:nth-of-type(1)>tbody:nth-of-type(1) tr:nth-of-type(3) input[class='form-control']","input фамилия"},
				{"input[id='reqStartDate']","календарь"},
				{"[class='input-group-addon']","значок календаря"},
				{"[data-target='#changePasswordModal']","change Password"},		
				{"th[data-i18n='profile.contactInfo']","конкт инф"},
				{"td[data-i18n='profile.field.email']","email"},
				{"form>table:nth-of-type(2)>tbody:nth-of-type(1) tr:nth-of-type(1) input[class='form-control']","знач email"},
				{"td[data-i18n='profile.field.phone']","Телефон"},
				{"form>table:nth-of-type(2)>tbody:nth-of-type(1) tr:nth-of-type(2) input[class='form-control']","Телефон знач"},
				{"td[data-i18n='profile.field.skype']","Skype"},
				{"form>table:nth-of-type(2)>tbody:nth-of-type(1) tr:nth-of-type(3) input[class='form-control']","Skype знач"},
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
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		LogIn("kolia", "empl", driver);
		driver.findElement(By.cssSelector(ArrayElProf()[6][0])).click();
		driver.findElement(By.cssSelector(ArrayElProf()[8][0])).click(); Thread.sleep(10000);

		for (int i=0; i<ArrayElProf().length; i++) {
			System.out.println("result of search = " + FindEl(ArrayElProf()[i][0], driver)+ " for "+ ArrayElProf()[i][1]+"; ");
		}
		System.out.println("finish 1\n");

		driver.findElement(By.cssSelector(ArrayElProf()[11][0])).click(); Thread.sleep(10000);

		for (int i=0;i<ArrayElProfEdit().length;i++) {
			System.out.println("result of search = " + FindEl(ArrayElProfEdit()[i][0], driver)+ " for "+ ArrayElProfEdit()[i][1]+"; ");
		}
		
		driver.close();
		driver.quit();
		
		System.out.print("finish 2");
	}
}
