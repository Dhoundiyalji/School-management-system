package tester;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.studendent.manage.student;

public class StudentDao 
{
	public static boolean insertStudentToDB(student st) throws ClassNotFoundException, SQLException
	{
		boolean flag=false;
		Connection conn=connection.createconnection();	// create connection
		String q="insert into students(sname,sphone,scity) values(?,?,?)";
		// Prepared Statement
		PreparedStatement pst1=conn.prepareStatement(q);
		// set the value of parameters
		
		pst1.setString(1, st.getStudentName());
		pst1.setString(2, st.getStudentphone());
		pst1.setString(3, st.getStudentcity());
		
		// execute ..
		
		pst1.executeUpdate();
		flag=true;
		return flag;
	}

	public static boolean deletestudent(int id) throws ClassNotFoundException, SQLException 
	{
		boolean flag=false;
		Connection conn=connection.createconnection();	// create connection
		String q="delete from students where sid=?";
		// Prepared Statement
		PreparedStatement pst1=conn.prepareStatement(q);
		// set the value of parameters
		
		
		pst1.setInt(1, id);
	
		// execute ..
		
		pst1.executeUpdate();
		flag=true;
		return flag;
	}
}
