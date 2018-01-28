package home1.a;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Home {

	public static String logPas[][];
	static int r;

	public static boolean LogIn(String login, String password) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); 
		driver.get("https://forum.grodno.net/index.php?action=login"); Thread.sleep(5000);
		driver.manage().window().maximize();
		WebElement log=driver.findElement(By.cssSelector("input[name='user']"));
		log.click(); 	        log.sendKeys(login);Thread.sleep(5000);
		WebElement pas=driver.findElement(By.cssSelector("input[name='passwrd']"));
		pas.click(); 	        pas.sendKeys(password); Thread.sleep(5000);
		WebElement sub=driver.findElement(By.cssSelector("input[value='Войти']"));
		sub.click(); 	   
		Thread.sleep(5000);
		boolean res= (driver.getCurrentUrl().toString().equals("https://forum.grodno.net/index.php"));
		driver.close();
		driver.quit();
		return res;
	}
	public static String getRandomWord(int length) {
		StringBuilder sb = new StringBuilder(Math.max(length, 16));
		String alphabet = "QWERTYUIOPLKJHGFDSZXCVNMЙЦУКЕНГШЩЗДЛОРПАВЫЯЧСМТЬЬБЮЖЭХЪqwertyuiop[]asdfghjkl;'zxcvbnm,.1234567890-=`йцукенгшщзхъэждлорпавыфячсмитьбю.!№;%:?)_Э\f";
		for (int i = 0; i < length; i++) {
			int len = alphabet.length();
			int random = (int) (len*(Math.random()));
			char c = alphabet.charAt(random);
			sb.append(c);
		}
		return sb.toString();
	}

	public static String[][] Acc() {
		r=(int)(Math.random()*10+8);
		String[][]logPas=new String [r][2];
		logPas[0][0]="12_12_1991@list.ru"; logPas[0][1]="100k7273";
		logPas[1][0]="";logPas[1][1]="";
		logPas[2][0]="12_12_1991@list.ru"; logPas[2][1]="";
		logPas[3][0]="";logPas[3][1]="100k7273";
		logPas[4][0]="12_12_1991@list.ru"; logPas[4][1]="dww";
		logPas[5][0]="dwdwdw";logPas[5][1]="100k7273";
		logPas[6][0]="dwdwdw";logPas[6][1]="dwww";
		logPas[7][0]=""+(Math.random()*100);logPas[7][1]=""+(Math.random()*100);
		for(int i=6; i<r; i++) {
			logPas[i][0]=getRandomWord((int)(Math.random()*50+3)); logPas[i][1]=getRandomWord((int)(Math.random()*50+3));		
		}
		return logPas;
	}


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		logPas=Acc();
		String s="";
		for(int i=0; i<1;i++) {
			s=s+" №"+i+": "+LogIn(logPas[i][0], logPas[i][1]+";");
		}
		System.out.print(s);
	}

}
