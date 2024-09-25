package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class BatchExecutingPreparedStatement 
{

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital","root","Samrat@007");
		PreparedStatement ps = con.prepareStatement("insert into user (id,name,mobNo,email,password,age) values(?,?,?,?,?,?)");
		Scanner scn = new Scanner(System.in);
		for(int i=0;i<3;i++)
		{
			System.out.println("Enter id :- ");
			int id = scn.nextInt();
			
			System.out.println("Enter name :- ");
			String name = scn.next();
			
			System.out.println("Enter mobile number :-");
			Long mobNo = scn.nextLong();
			
			System.out.println("Enter email : ");
			String email = scn.next();
			
			System.out.println("Enter password : ");
			String password = scn.next();
			
			System.out.println("Enter age : ");
			int age = scn.nextInt();
			
			ps.setInt(1, id);
			ps.setString(2, name);
			ps.setLong(3, mobNo);
			ps.setString(4, email);
			ps.setString(5, password);
			ps.setInt(6, age);
			
			ps.addBatch();
			
		}
		ps.executeBatch();
		System.out.println("Batch Executed Successfully");
	}

}
