package home1.a;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.*;

public class Аuthorization {

	public static String logPas[][];
	static int r;



	public static String[][] Acc() {
		r=(int)(Math.random()*10+17);
		String[][]logPas=new String [r][2];
		logPas[0][0]="kolia"; logPas[0][1]="empl";
		logPas[1][0]="";logPas[1][1]="";
		logPas[2][0]="kolia"; logPas[2][1]="";
		logPas[3][0]="";logPas[3][1]="empl";
		logPas[4][0]=logPas[0][0]; logPas[4][1]=RandomWord.Eng(52);
		logPas[5][0]=RandomWord.Eng(52);logPas[5][1]=logPas[0][1];
		logPas[6][0]=RandomWord.Eng(52);logPas[6][1]=RandomWord.Eng(52);
		logPas[7][0]=""+(Math.random()*100);logPas[7][1]=""+(Math.random()*100);
		logPas[8][0]=logPas[0][1]; logPas[8][1]=logPas[0][0];
		logPas[9][0]=RandomWord.Eng(52)+""+(Math.random()*100);logPas[9][1]=RandomWord.Eng(52)+""+(Math.random()*100);
		logPas[10][0]=RandomWord.Rus(66);logPas[10][1]=RandomWord.Rus(66);
		logPas[11][0]=RandomWord.Rus(66)+(Math.random()*100);logPas[11][1]=RandomWord.Rus(66)+(Math.random()*100);
		logPas[12][0]=RandomWord.Rus(66)+RandomWord.Eng(52);logPas[12][1]=RandomWord.Rus(66)+RandomWord.Eng(52);
		logPas[13][0]=RandomWord.Sym(32);logPas[13][1]=RandomWord.Sym(32);
		logPas[14][0]=" kolia"; logPas[14][1]=" empl";
		logPas[15][0]="kolia "; logPas[15][1]="empl ";
		logPas[16][0]="kol ia"; logPas[16][1]="em pl";
		for(int i=17; i<r; i++) {
			logPas[i][0]=RandomWord.All((int)(Math.random()*50+3)); logPas[i][1]=RandomWord.All((int)(Math.random()*50+3));		
		}
		return logPas;
	}

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		logPas=Acc();
		String s="";
		String a="";
		for(int i=0; i<r;i++) {
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			a=" №"+(i+1)+": result is "+Login.LogIn(logPas[i][0], logPas[i][1], driver)+" for log: ["+logPas[i][0]+"], pas: ["+logPas[i][1]+ "];";
			s=s+a;
			System.out.println(a);
			driver.close();
			driver.quit();
		}
		System.out.println(s);
		System.out.print("finish");
//		
//		
	}
}