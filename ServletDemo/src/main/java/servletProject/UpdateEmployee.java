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

@WebServlet("/update")
public class UpdateEmployee extends GenericServlet
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
			PreparedStatement ps = con.prepareStatement("update user set name=?,mobNo=?,email=?,password=?,age=? where id=?");
			ps.setString(1, name);
			ps.setLong(2, Integer.parseInt(mobNo));
			ps.setString(3, email);
			ps.setString(4, password);
			ps.setInt(5, Integer.parseInt(age));
			ps.setInt(6, Integer.parseInt(id));
			
			ps.execute();
			
			PrintWriter out = res.getWriter();
			out.println("<h1>Data Updated Successfully</h1> <br>");
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
