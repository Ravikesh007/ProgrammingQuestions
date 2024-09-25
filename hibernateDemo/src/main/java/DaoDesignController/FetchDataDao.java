package DaoDesignController;

import java.util.Scanner;

import DaoDesignPattern.StudentDao;
import hibernateDemo.Student;

public class FetchDataDao 
{
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter ID:");
		int id = scn.nextInt();
		
		StudentDao dao = new StudentDao();
		Student st = dao.fetchStudentById(id);
		
		System.out.println(st.getId());
		System.out.println(st.getName());
		System.out.println(st.getAge());
		System.out.println(st.getYop());
				
	}
}
