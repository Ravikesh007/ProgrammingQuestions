package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class UpdatingDynamically {

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital", "root", "Samrat@007");
		PreparedStatement ps = con.prepareStatement("update user set name=? where id=?");
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter name : ");
		String name = scn.next();
		System.out.println("Enter Id : ");
		int id = scn.nextInt();
		
		ps.setString(1, name);
		ps.setInt(2, id);
		
		ps.execute();
		
		System.out.println("values updated");
	}

}
