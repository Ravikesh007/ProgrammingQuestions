package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class LoadAndRegisterDriver 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{	
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("driver registered");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "Samrat@007");
		System.out.println("connection established");
	}
}

