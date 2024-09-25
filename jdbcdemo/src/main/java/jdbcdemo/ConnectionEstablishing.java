package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionEstablishing 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "Samrat@007");
		System.out.println("connection established");
		Statement st=con.createStatement(); //non-static method present in connection interface.
		st.execute("create database hospital");
		System.out.println("database created successfully");
		
	}

}
