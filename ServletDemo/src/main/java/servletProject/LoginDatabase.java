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

@WebServlet("/qwerty")
public class LoginDatabase extends GenericServlet
{
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException 
	{
		String id = req.getParameter("id");
		String name = req.getParameter("name");
		String mobNo = req.getParameter("mobNo");
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		String age = req.getParameter("age");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital", "root", "Samrat@007");
			PreparedStatement ps = con.prepareStatement("insert into user(id,name,mobNo,email,password,age) values(?,?,?,?,?,?)");
			ps.setInt(1, Integer.parseInt(id));
			ps.setString(2, name);
			ps.setLong(3, Integer.parseInt(mobNo));
			ps.setString(4, email);
			ps.setString(5, password);
			ps.setInt(6, Integer.parseInt(age));
			
			ps.execute();
			
			PrintWriter out = res.getWriter();
			out.println("<h1>Data Saved Successfully</h1> <br>");
			
			
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}
}
