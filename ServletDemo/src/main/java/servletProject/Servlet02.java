package servletProject;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/serv1")
public class Servlet02 extends GenericServlet
{
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException 
	{
		PrintWriter out = res.getWriter();
		out.println("<table><thead><tr><th>slno</th><th>name</th><th>age</th></tr></thead><tbody><tr><td>2</td><td>ravi</td><td>25</td></tr><tr><td>1</td><td>soma</td><td>25</td></tr><tr><td>3</td><td>manji</td><td>25</td></tr></tbody></table>");
	}
}
