package utility;

import java.sql.SQLException;
import java.util.regex.*;
import Source.*;
import Database.*;
import PageFactory.ProfilePage;

public class proverkaFunk {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub

//		ConnectionMySQL.getEmployee_fk();
//		ProfilePage page=new ProfilePage(driver)
		
		
		System.out.print(" "+
				ConnectionMySQL.getEmployee_fk()//ValidationElements.ValidationPhone("8-029-8869478")
		+" ")		;

	}

}
//while (resultSet.next()) {
//System.out.println(resultSet.toString());	
//}