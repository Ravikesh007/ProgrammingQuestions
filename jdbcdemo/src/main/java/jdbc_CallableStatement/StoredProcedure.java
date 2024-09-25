package jdbc_CallableStatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class StoredProcedure 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital", "root", "Samrat@007");
		Statement st = con.createStatement();
		st.execute("create procedure `fetch_all`() " + "BEGIN " + "select * from pateint; " + "END ");
		System.out.println("procedure executed");
	}
}
 