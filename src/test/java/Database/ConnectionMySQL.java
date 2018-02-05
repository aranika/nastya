package Database;

import java.sql.*;

import bsh.This;

public class ConnectionMySQL {
	private static String idUser= "5";

	private static Statement getStatement(String url, String login,  String pas) {
		// TODO Auto-generated method stub
		try {
			Connection connection = DriverManager.getConnection(url, login, pas);
			System.out.println("Connection success");
			Statement statement=connection.createStatement();
			return statement;
			//			
		} catch (Exception e) {
			// TODO: handle exception
			System.err.print(e);
			return null;
		}
	}

	public static ResultSet getElement(String query) {
		ResultSet resultSet;
		try {
			resultSet = getStatement("jdbc:mysql://86.57.161.116:13306", "aqa", "qwe123").executeQuery(query);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("---Error-Database-ConnectionMySQL-getElement-for-="+query);

			resultSet = null;
		}
		return resultSet;
	}

	public static ResultSet getUser(String id) {
		return getElement("select * from danco_rmt_vacation.user where user_id="+id);
	}

	public static String getEmployee_fk_user() {
		String user_id=idUser;
		String employee_fk="d";
		//		String query="select * from danco_rmt_vacation.user where user_id="+user_id;
		ResultSet resultSet=getUser(user_id);
		try {
			while (resultSet.next()) {
				employee_fk=resultSet.getString("user_id");	
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("---Error-Database-ConnectionMySQL-getEmployee_fk-for="+user_id);
			employee_fk="d";
		}
		return employee_fk;
	}

	public static String getFirstName_employee() {
		String name="";
		String id=getEmployee_fk_user();
		ResultSet resultSet=getElement("select * from danco_rmt_vacation.employee where employee_id="+id);
		try {
			while (resultSet.next()) {
				name=resultSet.getString("first_name");	
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			System.out.println("---Error-Database-ConnectionMySQL-getFirstName_employee-for="+id);
			name="";
		}
		return name;
	}
	
	public static String getPhone_employee() {
		String phone="";
		String id=getEmployee_fk_user();
		ResultSet resultSet=getElement("select * from danco_rmt_vacation.employee where employee_id="+id);
		try {
			while (resultSet.next()) {
				phone=resultSet.getString("phone");	
			}
		} catch (SQLException e) {
			System.out.println("---Error-Database-ConnectionMySQL-getPhone_employee-for="+id);
			phone="";
		}
		return phone;
	}

	public static String getEmail_employee() {
		String email="";
		String id=getEmployee_fk_user();
		ResultSet resultSet=getElement("select * from danco_rmt_vacation.employee where employee_id="+id);
		try {
			while (resultSet.next()) {
				email=resultSet.getString("email");	
			}
		} catch (SQLException e) {
			System.out.println("---Error-Database-ConnectionMySQL-getEmail_employee-for="+id);
			email="";
		}
		return email;
	}
	
	public static String getMiddleName_employee() {
		String name="";
		String id=getEmployee_fk_user();
		ResultSet resultSet=getElement("select * from danco_rmt_vacation.employee where employee_id="+id);
		try {
			while (resultSet.next()) {
				name=resultSet.getString("middle_name");	
			}
		} catch (SQLException e) {
			System.out.println("---Error-Database-ConnectionMySQL-getMiddleName_employee-for="+id);
			name="";
		}
		return name;
	}
	
	public static String getBirth_employee() {
		String date="";
		String id=getEmployee_fk_user();
		ResultSet resultSet=getElement("select * from danco_rmt_vacation.employee where employee_id="+id);
		try {
			while (resultSet.next()) {
				date=resultSet.getString("birth_date");	
			}
		} catch (SQLException e) {
			System.out.println("---Error-Database-ConnectionMySQL-getBirth_employee-for="+id);
			date="";
		}
		return "2013-01-01";//date;
	}
	
	public static String getSkype_employee() {
		String skype="";
		String id=getEmployee_fk_user();
		ResultSet resultSet=getElement("select * from danco_rmt_vacation.employee where employee_id="+id);
		try {
			while (resultSet.next()) {
				skype=resultSet.getString("im");	
			}
		} catch (SQLException e) {
			System.out.println("---Error-Database-ConnectionMySQL-getSkype_employee-for="+id);
			skype="";
		}
		return skype;
	}
	
	public static String getActive_employee() {
		String active="";
		String id=getEmployee_fk_user();
		ResultSet resultSet=getElement("select * from danco_rmt_vacation.employee where employee_id="+id);
		try {
			while (resultSet.next()) {
				if(resultSet.getString("active").equals("1"))
					active="true";	
			}
		} catch (SQLException e) {
			System.out.println("---Error-Database-ConnectionMySQL-getActive_employee-for="+id);
			active="";
		}
		return active;
	}
	
	public static String getLastName_employee() {
		String name="";
		String id=getEmployee_fk_user();
		ResultSet resultSet=getElement("select * from danco_rmt_vacation.employee where employee_id="+id);
		try {
			while (resultSet.next()) {
				name=resultSet.getString("last_name");	
			}
		} catch (SQLException e) {
			System.out.println("---Error-Database-ConnectionMySQL-getLastName_employee-for="+id);
			name="";
		}
		return name;
	}
	
	//	
}
