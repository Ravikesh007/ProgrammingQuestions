package jdbc_CallableStatement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CallProcedure 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital", "root", "Samrat@007");
		CallableStatement cs = con.prepareCall("{call fetch_all()}");
		ResultSet rs = cs.executeQuery();
		while (rs.next())
		{
			System.out.print(rs.getInt(1)+" ");
			System.out.println(rs.getString(2));
		}
	}
}
