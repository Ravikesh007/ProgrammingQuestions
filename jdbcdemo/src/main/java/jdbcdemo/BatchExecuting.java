package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchExecuting {

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital", "root", "Samrat@007");
		Statement st = con.createStatement();
		
		st.addBatch("insert into user (id,name,mobNo,email,password,age) values(104,'amit',74521,'vbn@sm.com','uiop5898',24)");
		st.addBatch("insert into user (id,name,mobNo,email,password,age) values(105,'Ravan',52521,'ert@dm.com','uyhp5678',25)");
		st.addBatch("insert into user (id,name,mobNo,email,password,age) values(106,'Ram',95621,'fgh@fm.com','jkop4128',23)");
		st.addBatch("insert into user (id,name,mobNo,email,password,age) values(107,'Rohan',75461,'vwe@sm.com','uiyh5678',24)");
		st.addBatch("insert into user (id,name,mobNo,email,password,age) values(108,'sumi',26523,'tyu@sm.com','uklp5678',24)");
		st.addBatch("insert into user (id,name,mobNo,email,password,age) values(109,'atan',74585,'hjk@sm.com','uiqo5678',24)");
		st.addBatch("update user set name='bubu', age=24 where id=107");
		st.addBatch("update user set name='chuchu', age=24 where id=109");
		st.addBatch("update user set name='pupu', age=52 where id=104");
		
		st.executeBatch();
		System.out.println("Batch executed");
		
	}

}
