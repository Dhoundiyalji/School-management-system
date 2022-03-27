package tester;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import com.studendent.manage.student;

public class start 
{
	public static void main(String[] args) throws Throwable, Throwable 
	{
		System.out.println("Welcome to Student Management App");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		while(true) 
		{
			System.out.println("Press 1 to Add student");
			System.out.println("Press 2 to Delete Student");
			System.out.println("Press 3 to display Student");
			System.out.println("Press 4 to Exit");
			
			System.out.println("Enter your choice");
			int c=Integer.parseInt(br.readLine());
			
			if (c==1)
			{
				System.out.println("Enter student name ");
				String name=br.readLine();
				System.out.println("Enter student phone ");
				String phone=br.readLine();
				System.out.println("Enter student city ");
				String city=br.readLine();
				
				// Create student object
				student st=new student(name,phone,city);
				boolean ans=StudentDao.insertStudentToDB(st);
				if (ans) System.out.println("Added sucessfully");
				else System.out.println("something wrong");
				
				
			}
			else if(c==2)
			{
				System.out.println("Enter student id");
				int id=Integer.parseInt(br.readLine());
				boolean ans=StudentDao.deletestudent(id);
				if (ans) System.out.println("deleted sucessfully");
				else System.out.println("something wrong");
				
				
			}
			else if (c==3)
			{
				// display
			}
			else if (c==4)
			{
				break;
			}
			else
			{
				
			}
		}  System.out.println("Thank u for using my app");
	} 
	
}
