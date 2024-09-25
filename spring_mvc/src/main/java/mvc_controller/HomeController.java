package mvc_controller;

import javax.servlet.ServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController 
{
	@RequestMapping("/hello")
	public String m1()
	{
		return "index";
	}
	
	@RequestMapping("/hello1")
	public String m2()
	{
		return "NewFile";
	}
	
	@RequestMapping("/add")
	public ModelAndView add(ServletRequest request)
	{
		String num1 = request.getParameter("num1");
		String num2 = request.getParameter("num2");
		
		int sum = Integer.parseInt(num1) + Integer.parseInt(num2);
		
		ModelAndView mav = new ModelAndView();
		//ModelAndView is used when we need to send model and view at the same point of time to the client.
		//Model is the data which has to be displayed to the user.
		
		mav.addObject("answer", sum);
		//addObject is used to store the data in ModelAndView.
		
		mav.setViewName("Output");
		//setViewName is used to set the view
		return mav;
	}
	
	@RequestMapping("/prod")
	public ModelAndView product(ServletRequest request)
	{
		String num1 = request.getParameter("num1");
		String num2 = request.getParameter("num2");
		int product = Integer.parseInt(num1) * Integer.parseInt(num2);
		
		ModelAndView mav1 = new ModelAndView();
		mav1.addObject("ans", product);
		mav1.setViewName("Output");
		
		return mav1;
		
	}
}
