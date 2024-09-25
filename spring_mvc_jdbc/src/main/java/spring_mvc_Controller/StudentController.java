package spring_mvc_Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import spring_mvc_Dao.StudentDao;
import spring_mvc_Entity.Student0;

@Controller
public class StudentController 
{
	@Autowired
	StudentDao dao;
	
	@RequestMapping("/addstudent")
	public ModelAndView addStudent()
	{
		Student0 s = new Student0();
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("studentobj", s);
		mav.setViewName("Studentform");
		
		return mav;
	}
	@RequestMapping("/saveStudent")
	public ModelAndView saveStudent(@ModelAttribute("studentobj") Student0 s)
	{
		dao.saveStudent(s);
		ModelAndView mav = new ModelAndView();
		mav.setViewName("menu");
		return mav;
		
	}
	@RequestMapping("/fetchdata")
	public ModelAndView fetchData()
	{
		List<Student0> students = dao.fetchAllStudents();
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("studentslist", students);
		mav.setViewName("fetchallstudents");
		return mav;
	}
	@RequestMapping("/deletestudent")
	public ModelAndView deleteData(@RequestParam("id") int id)
	{
		dao.deleteStudentById(id);
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("msg", "data deleted Successfully");
		mav.setViewName("redirect://fetchdata");
		
		return mav;
	}
	
}
