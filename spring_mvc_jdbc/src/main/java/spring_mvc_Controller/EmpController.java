package spring_mvc_Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import spring_mvc_Dao.EmpDao;
import spring_mvc_Entity.Employee;


@Controller
public class EmpController 
{
	@Autowired
	EmpDao ed;
	
	@RequestMapping("/addEmployee")
	public ModelAndView addEmployee()
	{
		Employee emp = new Employee();
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("empobj", emp);
		mav.setViewName("employeeform1");
		
		return mav;
	}
	@RequestMapping("/saveemployee")
	public ModelAndView saveEmployeeInfo(@ModelAttribute("empobj") Employee emp)
	{
		ed.saveEmployee(emp);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("menu1");
		return mav;
	}
}
