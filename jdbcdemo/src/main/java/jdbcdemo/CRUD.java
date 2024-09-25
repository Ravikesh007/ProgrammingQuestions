package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CRUD 
{	
	public static void insertData() throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital", "root", "Samrat@007");
		Statement st = con.createStatement();
		st.execute("insert into pateint(slno,name,age) values(106, 'rohan', 23)");
		System.out.println("inserion successfully");
	}
	
	public static void fetchData() throws ClassNotFoundException, SQLException 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital", "root", "Samrat@007");
		Statement st= con.createStatement();
		ResultSet rs= st.executeQuery("select * from pateint where slno=102");
		rs.next();
		System.out.println(rs.getInt("slno"));
		System.out.println(rs.getString("name"));
		System.out.println(rs.getInt("age"));
	}
	
	public static void updateData() throws ClassNotFoundException, SQLException 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital", "root", "Samrat@007");
		Statement st= con.createStatement();
		st.execute("update pateint set name='Ravi' where slno=102");
		System.out.println("updated successfully");
	}
	
	public static void deleteData() throws ClassNotFoundException, SQLException 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital", "root", "Samrat@007");
		Statement st = con.createStatement();
		st.execute("delete from pateint where slno=107");
		System.out.println("deleted successfully");
	}
}
