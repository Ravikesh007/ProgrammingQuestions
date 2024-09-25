package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class FetchingDynamically {

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital", "root", "Samrat@007");
		PreparedStatement ps = con.prepareStatement("select * from user where id=?");
		System.out.println("Enter Id : ");
		int id = new Scanner(System.in).nextInt();
		
		ps.setInt(1, id);
		
		ResultSet rs = ps.executeQuery();
		if(rs.next())
		{
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getLong(3));
			System.out.println(rs.getString(4));
			System.out.println(rs.getString(5));
			System.out.println(rs.getInt(6));
		}
		else
		{
			System.out.println("Invalid Id...................");
		}
	}

}
