package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DeletingDynamically {

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital", "root", "Samrat@007");
		PreparedStatement ps = con.prepareStatement("delete from user where name=?");
		System.out.println("Enter Name : ");
		Scanner scn = new Scanner(System.in);
		String name = scn.next();
		
		ps.setString(1, name);
		ps.execute();
		System.out.println("Deleted Successfully");
	}

}
