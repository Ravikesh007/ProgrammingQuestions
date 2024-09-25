package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class PateintTable 
{

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital", "root", "Samrat@007");
		Statement st= con.createStatement();
		st.execute("insert into pateint(slno,name,age) values(104,'Devi',24)");
		st.execute("insert into pateint(slno,name,age) values(105,'Ajit',23)");
		st.execute("insert into pateint(slno,name,age) values(106,'Ram',22)");
		st.execute("insert into pateint(slno,name,age) values(107,'Rani',21)");
		
		System.out.println("inserted successfully");
	}

}
