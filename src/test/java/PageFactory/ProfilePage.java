package PageFactory;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;

import Source.*;
import utility.*;
public class ProfilePage {
	WebDriver driver;
	String [][]arrayElEdidProfile=(new ElementsProfileSettings()).ArrayElProfEdit();

	By name=By.cssSelector("[class='dropdown-toggle'] span[class='ng-binding']");
	By profile=By.cssSelector("[ng-click='profileURL()']");
	By logout=By.cssSelector("[ng-click='logout()']");
	By settings=By.cssSelector("a[ng-click='setSettings()']");
	By contactInfo =By.cssSelector("th[data-i18n='profile.contactInfo']");
	By email=By.cssSelector("td[data-i18n='profile.field.email']");
	By emailVal=By.cssSelector("table[class='table table-condensed table-hover']:nth-child(1) tr:nth-child(1) td[class='ng-binding']");
	By phone =By.cssSelector("td[data-i18n='profile.field.phone']");
	By phoneVal =By.cssSelector("table[class='table table-condensed table-hover']:nth-child(1) tr:nth-child(2) td[class='ng-binding']");
	By skype=By.cssSelector("td[data-i18n='profile.field.skype']");
	By skypeVal=By.cssSelector("a[class=ng-binding]");
	By generalInfo=By.cssSelector("th[data-i18n='profile.generalInfo']");
	By unit=By.cssSelector("td[data-i18n='profile.field.unit']");
	By unitVal=By.cssSelector("table[class='table table-condensed table-hover']:nth-child(2) tr:nth-child(1) td[class='ng-binding']");
	By location=By.cssSelector("td[data-i18n='profile.field.location']");
	By locationVal=By.cssSelector("table[class='table table-condensed table-hover']:nth-child(2) tr:nth-child(2) td[class='ng-binding']");
	By country=By.cssSelector("td[data-i18n='profile.field.country']");
	By countryVal=By.cssSelector("table[class='table table-condensed table-hover']:nth-child(2) tr:nth-child(3) td[class='ng-binding']");
	By city=By.cssSelector("td[data-i18n='profile.field.city']");
	By cityVal=By.cssSelector("table[class='table table-condensed table-hover']:nth-child(2) tr:nth-child(4) td[class='ng-binding']");
	By office=By.cssSelector("td[data-i18n='profile.field.office']");
	By officeVal=By.cssSelector("table[class='table table-condensed table-hover']:nth-child(2) tr:nth-child(5) td[class='ng-binding']");
	By calendar=By.cssSelector("td[data-i18n='profile.field.calendar']");
	By showCalendar=By.cssSelector("span[data-i18n='profile.showCalendar']");
	By active=By.cssSelector("td[data-i18n='profile.field.active']");
	By activeVal=By.cssSelector("span[ng-if*='value']");
	By additionalInfo=By.cssSelector("th[data-i18n='profile.additionalInfo']");
	By birth=By.xpath("/html/body/div[@id='main']/section[@class='container contentContainer ng-scope']/div[@class='ng-scope'][2]/div[@class='pageContent panel panel-default ng-scope']/div[@class='panel-body']/div[@class='row']/div[@class='col-md-9 profileContent']/table[@class='table table-condensed table-hover'][3]/tbody/tr[1]/td[@class='col-md-4']");
	By birthVal=By.xpath("/html/body/div[@id='main']/section[@class='container contentContainer ng-scope']/div[@class='ng-scope'][2]/div[@class='pageContent panel panel-default ng-scope']/div[@class='panel-body']/div[@class='row']/div[@class='col-md-9 profileContent']/table[@class='table table-condensed table-hover'][3]/tbody/tr[1]/td[2]");
	By specialization=By.xpath("/html/body/div[@id='main']/section[@class='container contentContainer ng-scope']/div[@class='ng-scope'][2]/div[@class='pageContent panel panel-default ng-scope']/div[@class='panel-body']/div[@class='row']/div[@class='col-md-9 profileContent']/table[@class='table table-condensed table-hover'][3]/tbody/tr[2]/td[1]");
	By specializationVal=By.xpath("/html/body/div[@id='main']/section[@class='container contentContainer ng-scope']/div[@class='ng-scope'][2]/div[@class='pageContent panel panel-default ng-scope']/div[@class='panel-body']/div[@class='row']/div[@class='col-md-9 profileContent']/table[@class='table table-condensed table-hover'][3]/tbody/tr[2]/td[2]");
	By hireDate=By.xpath("/html/body/div[@id='main']/section[@class='container contentContainer ng-scope']/div[@class='ng-scope'][2]/div[@class='pageContent panel panel-default ng-scope']/div[@class='panel-body']/div[@class='row']/div[@class='col-md-9 profileContent']/table[@class='table table-condensed table-hover'][3]/tbody/tr[3]/td[1]");
	By hireDateVal=By.xpath("/html/body/div[@id='main']/section[@class='container contentContainer ng-scope']/div[@class='ng-scope'][2]/div[@class='pageContent panel panel-default ng-scope']/div[@class='panel-body']/div[@class='row']/div[@class='col-md-9 profileContent']/table[@class='table table-condensed table-hover'][3]/tbody/tr[3]/td[2]"	);
	By probationTillDate=By.xpath("/html/body/div[@id='main']/section[@class='container contentContainer ng-scope']/div[@class='ng-scope'][2]/div[@class='pageContent panel panel-default ng-scope']/div[@class='panel-body']/div[@class='row']/div[@class='col-md-9 profileContent']/table[@class='table table-condensed table-hover'][3]/tbody/tr[4]/td[1]");
	By probationTillDateVal=By.xpath("/html/body/div[@id='main']/section[@class='container contentContainer ng-scope']/div[@class='ng-scope'][2]/div[@class='pageContent panel panel-default ng-scope']/div[@class='panel-body']/div[@class='row']/div[@class='col-md-9 profileContent']/table[@class='table table-condensed table-hover'][3]/tbody/tr[4]/td[2]");
	By probationApproved=By.xpath("/html/body/div[@id='main']/section[@class='container contentContainer ng-scope']/div[@class='ng-scope'][2]/div[@class='pageContent panel panel-default ng-scope']/div[@class='panel-body']/div[@class='row']/div[@class='col-md-9 profileContent']/table[@class='table table-condensed table-hover'][3]/tbody/tr[5]/td[1]");
	By probationApprovedVal=By.xpath("/html/body/div[@id='main']/section[@class='container contentContainer ng-scope']/div[@class='ng-scope'][2]/div[@class='pageContent panel panel-default ng-scope']/div[@class='panel-body']/div[@class='row']/div[@class='col-md-9 profileContent']/table[@class='table table-condensed table-hover'][3]/tbody/tr[5]/td[2]");
	By workstation=By.xpath("/html/body/div[@id='main']/section[@class='container contentContainer ng-scope']/div[@class='ng-scope'][2]/div[@class='pageContent panel panel-default ng-scope']/div[@class='panel-body']/div[@class='row']/div[@class='col-md-9 profileContent']/table[@class='table table-condensed table-hover'][3]/tbody/tr[6]/td[1]");
	By workstationVal=By.xpath("/html/body/div[@id='main']/section[@class='container contentContainer ng-scope']/div[@class='ng-scope'][2]/div[@class='pageContent panel panel-default ng-scope']/div[@class='panel-body']/div[@class='row']/div[@class='col-md-9 profileContent']/table[@class='table table-condensed table-hover'][3]/tbody/tr[6]/td[2]");
	By comment=By.xpath("/html/body/div[@id='main']/section[@class='container contentContainer ng-scope']/div[@class='ng-scope'][2]/div[@class='pageContent panel panel-default ng-scope']/div[@class='panel-body']/div[@class='row']/div[@class='col-md-9 profileContent']/table[@class='table table-condensed table-hover'][3]/tbody/tr[7]/td[1]");	
	By commentVal=By.xpath("/html/body/div[@id='main']/section[@class='container contentContainer ng-scope']/div[@class='ng-scope'][2]/div[@class='pageContent panel panel-default ng-scope']/div[@class='panel-body']/div[@class='row']/div[@class='col-md-9 profileContent']/table[@class='table table-condensed table-hover'][3]/tbody/tr[7]/td[2]");		

	By editFirstName=By.cssSelector(arrayElEdidProfile[21][0]);
	By editMidName=By.cssSelector(arrayElEdidProfile[22][0]);
	By editLastName=By.cssSelector(arrayElEdidProfile[23][0]);
	By editEmail=By.cssSelector(arrayElEdidProfile[29][0]);
	By editPhone=By.cssSelector(arrayElEdidProfile[31][0]); 
	By back=By.cssSelector(arrayElEdidProfile[11][0]);

	public ProfilePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public void goToSettings() {
		driver.findElement(settings).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}
	public void goToProfFroSet() {
		driver.findElement(back).click();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
	}

	public String getEmail() {
		return FindEl.getValueByCss(arrayElEdidProfile[29][0], driver);// driver.findElement(editEmail).getAttribute("value");
	}
	public String getPhone() {
		return FindEl.getValueByCss(arrayElEdidProfile[31][0], driver);
	}	
	public String getFirstName() {
		return FindEl.getValueByCss(arrayElEdidProfile[15][0], driver);
	}
	public String getMidName() {
		return FindEl.getValueByCss(arrayElEdidProfile[16][0], driver);
	}
	public String getLastName() {
		return FindEl.getValueByCss(arrayElEdidProfile[17][0], driver);
	}
	public String getBirth(){
		return "2013-01-01";//FindEl.getValueByCss(arrayElEdidProfile[18][0], driver);
	}
	public String getSkype() {
		return FindEl.getValueByCss(arrayElEdidProfile[32][0], driver);
	}	
	public String getValueActive() {
		String s=""+FindEl.FindElByCss("[ng-if=\"value == 'true'\"]", driver);
		return s;
	}	
}