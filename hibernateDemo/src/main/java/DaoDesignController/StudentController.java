package DaoDesignController;

import java.util.Scanner;

import DaoDesignPattern.StudentDao;
import hibernateDemo.Student;

public class StudentController 
{
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter ID:");
		int id = scn.nextInt();
		
		System.out.println("Enter Name:");
		String name = scn.next();
		
		System.out.println("Enter Age:");
		int age = scn.nextInt();
		
		System.out.println("Enter yop:");
		int yop = scn.nextInt();
		
		Student st = new Student();
		st.setId(id);
		st.setName(name);
		st.setAge(age);
		st.setYop(yop);
		
		StudentDao dao = new StudentDao();
		dao.saveStudent(st);
		
	}
}
