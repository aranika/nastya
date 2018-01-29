package home1.a;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Аuthorization {

	public static String logPas[][];
	static int r;

	public static boolean LogIn(String login, String password) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
		driver.get("http://86.57.161.116:10008/#/login"); Thread.sleep(10000);
		driver.manage().window().maximize();
		WebElement log=driver.findElement(By.cssSelector("input[name='userName']"));Thread.sleep(10000);
		log.click(); 	        log.sendKeys(login);;
		WebElement pas=driver.findElement(By.cssSelector("input[name='password']"));Thread.sleep(10000);
		pas.click(); 	        pas.sendKeys(password);
		WebElement sub=driver.findElement(By.cssSelector("button[id='buttonLogin']"));Thread.sleep(10000);
		sub.click(); 	   
		Thread.sleep(20000);
		boolean res= (driver.getCurrentUrl().toString().equals("http://86.57.161.116:10008/#/vacation"));
		driver.close();
		driver.quit();
		return res;
	}
	
	public static String getRandomWord(int length) {
		StringBuilder sb = new StringBuilder(Math.max(length, 16));
		String alphabet = "QWERTYUIOPLKJHGFDSZXCVNMЙЦУКЕНГШЩЗДЛОРПАВЫЯЧСМТЬЬБЮЖЭХЪqwertyuiop[]asdfghjkl;'zxcvbnm,.1234567890-=`йцукенгшщзхъэждлорпавыфячсмитьбю.!№;%:?)_Э\f";
		for (int i = 0; i < length; i++) { 
			int random = (int) (alphabet.length()*(Math.random()));
			char c = alphabet.charAt(random);
			sb.append(c);
		}
		return sb.toString();
	}

	public static String[][] Acc() {
		r=(int)(Math.random()*10+10);
		String[][]logPas=new String [r][2];
		logPas[0][0]="kolia"; logPas[0][1]="empl";
		logPas[1][0]="";logPas[1][1]="";
		logPas[2][0]="12_12_1991@list.ru"; logPas[2][1]="";
		logPas[3][0]="";logPas[3][1]="100k7273";
		logPas[4][0]=logPas[0][0]; logPas[4][1]="dww";
		logPas[5][0]="dwdwdw";logPas[5][1]=logPas[0][1];
		logPas[6][0]="dwdwdw";logPas[6][1]="dwww";
		logPas[7][0]=""+(Math.random()*100);logPas[7][1]=""+(Math.random()*100);
		logPas[8][0]=logPas[0][1]; logPas[8][1]=logPas[0][0];
		for(int i=9; i<r; i++) {
			logPas[i][0]=getRandomWord((int)(Math.random()*50+3)); logPas[i][1]=getRandomWord((int)(Math.random()*50+3));		
		}
		return logPas;
	}


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		logPas=Acc();
		String s="";
		String a="";
		for(int i=0; i<r;i++) {
			a=" №"+i+": "+LogIn(logPas[i][0], logPas[i][1])+";";
			s=s+a;
			System.out.println(a);
		}
		System.out.print(s);
	}

}
