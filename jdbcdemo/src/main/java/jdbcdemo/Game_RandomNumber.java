package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Game_RandomNumber 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		int chances = 3;
		int [] system_generated_numbers = new int[chances];
		int [] user_entered_numbers = new int[chances];
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter Id :");
		int id = scn.nextInt();
		System.out.println("Enter name :");
		String name = scn.next();
		Timestamp start = new Timestamp(System.currentTimeMillis());
		
		int score = 0;
		System.out.println("Enter number between 0-9");
		for(int i=0;i<3;i++)
		{
			Random r = new Random();
			int gen_num = r.nextInt();
			System.out.println("guess the number");
			int guess_num = scn.nextInt();
			system_generated_numbers[i] = gen_num;
			user_entered_numbers[i] = guess_num;
			if(gen_num == guess_num )
			{
				score = score+10;
			}
		}
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital", "root", "Samrat@007");
		PreparedStatement ps = con.prepareStatement("insert into guessGame(id , name , system_generated_numbers , user_entered_numbers , score , start) values(?,?,?,?,?,?)");
		ps.setInt(1, id);
		ps.setString(2, name);
		ps.setString(3, Arrays.toString(system_generated_numbers));
		ps.setString(4, Arrays.toString(user_entered_numbers));
		ps.setInt(5, score);
		ps.setTimestamp(6, start);
		
		ps.execute();
		
		System.out.println("values inserted.............");
	}
}
