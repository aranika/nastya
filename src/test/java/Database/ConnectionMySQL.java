package Database;

import java.sql.*;

public class ConnectionMySQL {
private static String idUser= "id_user=5";

	private static Statement getStatement() {
		// TODO Auto-generated method stub
		try {
			Connection connection = DriverManager.getConnection("jdbc:mysql://86.57.161.116:13306", "aqa", "qwe123");
			System.out.println("Connection success");
			return connection.createStatement();
			//			
		} catch (Exception e) {
			// TODO: handle exception
			System.err.print(e);
			return null;
		}
	}

	public static ResultSet getElement(String el, String where) {
		String query="select "+el+" from danco_rmt_vacation.user "+where;
		ResultSet resultSet = null;
		try {
			resultSet = getStatement().executeQuery(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return resultSet;
	}
	
	
	public static ResultSet getEmployee_fk() {
		return getElement("employee_fk", "where user_id=5");
	}
}
