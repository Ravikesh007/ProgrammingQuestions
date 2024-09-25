package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;


public class LoginValidation 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("enter Email :");
		String email = scn.next();
		
		System.out.println("Enter Password :");
		String password = scn.next();
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital", "root", "Samrat@007");
		PreparedStatement ps = con.prepareStatement("select * from user where email=? and password=?");
		
		ps.setString(1, email);
		ps.setString(2, password);
		ResultSet rs = ps.executeQuery();
		if(rs.next())
			System.out.println("Logined Successfully");
		else System.out.println("Invalid Credentials");
	}
}
