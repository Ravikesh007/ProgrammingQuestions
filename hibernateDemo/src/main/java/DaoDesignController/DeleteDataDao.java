package DaoDesignController;

import java.util.Scanner;

import DaoDesignPattern.StudentDao;

public class DeleteDataDao 
{
	public static void main(String[] args) 
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter ID:");
		int id = scn.nextInt();
		
		StudentDao dao = new StudentDao();
		dao.deleteStudentById(id);
	}
}
