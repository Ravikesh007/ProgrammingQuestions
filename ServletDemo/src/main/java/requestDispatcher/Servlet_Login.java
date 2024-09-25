package requestDispatcher;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("")
public class Servlet_Login extends GenericServlet
{
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException 
	{
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		
		if(email.equals("ravikeshraj02@gmail.com") && password.equals("qwerty1234"))
		{
			RequestDispatcher rd = req.getRequestDispatcher("PrintDp1.html");
			rd.forward(req, res);
		}
		else
		{
			PrintWriter pout = res.getWriter();
			pout.print("<h1>Invalid credentials</h1>");
			
			RequestDispatcher rd = req.getRequestDispatcher("LoginForm.html");
			rd.include(req, res);
		}
		
	}
}
