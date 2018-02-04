package utility;

import java.util.regex.*;
import Source.*;
import Database.*;
import PageFactory.ProfilePage;

public class proverkaFunk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConnectionMySQL.getElement("*");
//		ProfilePage page=new ProfilePage(driver)
		
		
		System.out.print(" "+
				ValidationElements.ValidationPhone("8-029-8869478")
		+" ")		;

	}

}
//while (resultSet.next()) {
//System.out.println(resultSet.toString());	
//}