package DaoDesignController;

import java.util.Scanner;

import DaoDesignPattern.StudentDao;
import hibernateDemo.Student;

public class UpdateDataDynamically 
{
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("enter ID To Update: ");
		int id = scn.nextInt();
		System.out.println("1. UPDATE NAME \n 2. UPDATE AGE \n 3. UPDATE YOP");
		int choice = scn.nextInt();
		
		StudentDao dao = new StudentDao();
		switch(choice)
		{
		case 1:
		{
			Student s = dao.fetchStudentById(id);
			System.out.println("Enter new Name:");
			String name = scn.next();
			s.setName(name);
			dao.updateStudentById(s);
			break;
		}
		case 2:
		{
			Student s = dao.fetchStudentById(id);
			System.out.println("Enter new Age:");
			int age = scn.nextInt();
			s.setAge(age);
			dao.updateStudentById(s);
			break;
		}
		case 3:
		{
			Student s = dao.fetchStudentById(id);
			System.out.println("Enter new yop:");
			int yop = scn.nextInt();
			s.getYop();
			dao.updateStudentById(s);
			break;
		}
		default:
		{
			System.out.println("Invalid choice");
		}
		}
	}
}
