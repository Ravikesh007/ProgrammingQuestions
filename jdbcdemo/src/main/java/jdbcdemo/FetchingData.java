package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class FetchingData {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital", "root", "Samrat@007");
		Statement st= con.createStatement();
		ResultSet rs= st.executeQuery("select * from pateint where slno=102");
		rs.next();
		System.out.println(rs.getInt("slno"));
		System.out.println(rs.getString("name"));
		System.out.println(rs.getInt("age"));
		
	}

}
