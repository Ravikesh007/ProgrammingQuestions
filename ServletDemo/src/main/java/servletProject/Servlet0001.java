package servletProject;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/fetchdata")
public class Servlet0001 extends GenericServlet
{
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException 
	{
		String id = req.getParameter("id");
		String name = req.getParameter("name");
		String age = req.getParameter("age");
		
		PrintWriter out = res.getWriter();
		out.println(id);
		out.println(name);
		out.println(age);
		
		/*
		 * System.out.println(id); System.out.println(name); System.out.println(age);
		 */
	}
}
