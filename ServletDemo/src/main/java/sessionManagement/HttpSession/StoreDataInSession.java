package sessionManagement.HttpSession;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/StoreInSession")
public class StoreDataInSession extends HttpServlet
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		HttpSession h1 = req.getSession();
		HttpSession h2 = req.getSession();
		
		h1.setAttribute("id", 1);
		h1.setAttribute("name", "rajesh");
		h1.setAttribute("age", 20);
		
		Integer id = (Integer) h1.getAttribute("id");
		String name = (String) h1.getAttribute("name");
		Integer age = (Integer) h1.getAttribute("age");
		String dob = (String) h1.getAttribute("dob");
		
		System.out.println(id);
		System.out.println(name);
		System.out.println(age);
		System.out.println(dob);
		 
		h1.removeAttribute("id");
		
		System.out.println(h1.getAttribute("id"));
		h1.invalidate();
	}
}
