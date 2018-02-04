package Source;

import utility.RandomWord;

public class Users {

	public Object[][] getUsers() {
		int r=(int)(Math.random()*10+17);
		Object[][]logPas=new String [3][2];
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
	public Object[][] getShortUsers() {
		Object[][]logPas=new String [2][2];
		logPas[0][0]="kolia"; logPas[0][1]="empl";
		logPas[1][0]="tes"; logPas[1][1]="empl";
		return logPas;
	}

	public static Object getPhone() {
		Object ob="8-029-7854142";
		return ob;
	}
	public static  Object getEmail() {
		Object ob="kolia@mail.ru";
		return ob;
	}
	public static  Object getFirstName() {
		Object ob="Nikolaj";
		return ob;
	}
	public static  Object getMiddleName() {
		Object ob="";
		return ob;
	}
	public static  Object getLastName() {
		Object ob="Nikolaev";
		return ob;
	}
	public static  Object getBirth() {
		Object ob=null;
		return ob;
	}
	public static  Object getSkype() {
		Object ob="sdf";
		return ob;
	}
	public static  Object getActive() {
		Object ob="true";
		return ob;
	}
	
	
	
	public static String[] userFields() {
		String[] fields = {"user_id", "login", "password", "last_login_time", "activ", "employee_fk"};
		return fields;
	}
}