package servletProject;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/groot")
public class Servlet03 extends GenericServlet 
{
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException 
	{
		String slno = req.getParameter("slno");
		String name = req.getParameter("name");
		String age = req.getParameter("age");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital", "root", "Samrat@007");
			PreparedStatement ps = con.prepareStatement("insert into pateint(slno,name,age) values(?,?,?)");
			ps.setInt(1, Integer.parseInt(slno));
			ps.setString(2, name);
			ps.setInt(3, Integer.parseInt(age));
			
			ps.execute();
			
			PrintWriter out = res.getWriter();
			out.println("<h1>Data Saved Successfully</h1> <br>");
			out.println("<a href='user.html'>click here to save again</a>");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
