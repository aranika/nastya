package home1.a;

import home1.a.Profile;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class Аuthorization {

	public static String logPas[][];
	static int r;

	public static boolean LogIn(String login, String password) throws InterruptedException {
		boolean res=false;
		System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
		driver.get("http://86.57.161.116:10008/#/login"); Thread.sleep(10000);
		driver.manage().window().maximize();

		if (Profile.FindEl("input[name='userName']", driver)){
			WebElement log=driver.findElement(By.cssSelector("input[name='userName']"));Thread.sleep(10000);
			log.click(); 	        log.sendKeys(login);
			if (Profile.FindEl("input[name='password']", driver)){
				WebElement pas=driver.findElement(By.cssSelector("input[name='password']"));Thread.sleep(10000);
				pas.click(); 	        pas.sendKeys(password);
				if (Profile.FindEl("button[id='buttonLogin']", driver)){
					WebElement sub=driver.findElement(By.cssSelector("button[id='buttonLogin']"));Thread.sleep(10000);
					sub.click(); 	  		
					Thread.sleep(20000);
					res = (driver.getCurrentUrl().toString().equals("http://86.57.161.116:10008/#/vacation"));
				}}}
		else {
			res=false;
		}
		driver.close();
		driver.quit();
		return res;
	}

	public static String getRandomWord(int length, String lang) {
		StringBuilder sb = new StringBuilder(Math.max(length, 16));
		String alphabet;
		if(lang.equals("eng")) {
			alphabet= "ABCDEFGHIJKLMNOPQRSTUVWXYZzyxwvutsrqponmlkjihgfedcba";}//52
		else if(lang.equals("rus")) {
			alphabet= "абвгдеёжзийклмнопрстуфхцчшщъыьэюяАБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ";//66
		}
		else if(lang.equals("sym")) {
			alphabet= "!@#$%^&*()_+|-=\\{}[]:\";'<>?,./";//32
		}
		else {	
			alphabet= "ABCDEFGHIJKLMNOPQRSTUVWXYZzyxwvutsrqponmlkjihgfedcba1234567890абвгдеёжзийклмнопрстуфхцчшщъыьэюяАБВГДЕЁЖЗИЙКЛМНОПРСТУФХЦЧШЩЪЫЬЭЮЯ[];',./-=`.!№;%:?)_";
		}
		for (int i = 0; i < length; i++) { 
			int random = (int) (alphabet.length()*(Math.random()));
			char c = alphabet.charAt(random);
			sb.append(c);
		}
		return sb.toString();
	}

	public static String[][] Acc() {
		r=(int)(Math.random()*10+17);
		String[][]logPas=new String [r][2];
		logPas[0][0]="kolia"; logPas[0][1]="empl";
		logPas[1][0]="";logPas[1][1]="";
		logPas[2][0]="kolia"; logPas[2][1]="";
		logPas[3][0]="";logPas[3][1]="empl";
		logPas[4][0]=logPas[0][0]; logPas[4][1]=getRandomWord(52,"eng");
		logPas[5][0]=getRandomWord(52,"eng");logPas[5][1]=logPas[0][1];
		logPas[6][0]=getRandomWord(52,"eng");logPas[6][1]=getRandomWord(52,"eng");
		logPas[7][0]=""+(Math.random()*100);logPas[7][1]=""+(Math.random()*100);
		logPas[8][0]=logPas[0][1]; logPas[8][1]=logPas[0][0];
		logPas[9][0]=getRandomWord(52,"eng")+""+(Math.random()*100);logPas[9][1]=getRandomWord(52,"eng")+""+(Math.random()*100);
		logPas[10][0]=getRandomWord(66,"rus");logPas[10][1]=getRandomWord(66,"rus");
		logPas[11][0]=getRandomWord(66,"rus")+(Math.random()*100);logPas[11][1]=getRandomWord(66,"rus")+(Math.random()*100);
		logPas[12][0]=getRandomWord(66,"rus")+getRandomWord(52,"eng");logPas[12][1]=getRandomWord(66,"rus")+getRandomWord(52,"eng");
		logPas[13][0]=getRandomWord(32,"sym");logPas[13][1]=getRandomWord(32,"sym");
		logPas[14][0]=" kolia"; logPas[14][1]=" empl";
		logPas[15][0]="kolia "; logPas[15][1]="empl ";
		logPas[16][0]="kol ia"; logPas[16][1]="em pl";
		for(int i=17; i<r; i++) {
			logPas[i][0]=getRandomWord((int)(Math.random()*50+3),"all"); logPas[i][1]=getRandomWord((int)(Math.random()*50+3),"all");		
		}
		return logPas;
	}


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		logPas=Acc();
		String s="";
		String a="";
		for(int i=0; i<r;i++) {
			a=" №"+(i+1)+": result is "+LogIn(logPas[i][0], logPas[i][1])+" for log: ["+logPas[i][0]+"], pas: ["+logPas[i][1]+ "];";
//			a=" №"+(i+1)+": result is for log: "+logPas[i][0]+", pas: "+logPas[i][1]+ ";";
			s=s+a;
			System.out.println(a);
		}
		System.out.println(s);
		System.out.print("finish");
	}

}
