package tester;

import java.sql.Connection;
import java.sql.DriverManager;

public class connection 
{
	static Connection cn;
	public static Connection createconnection() throws ClassNotFoundException
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");	
			// create connection
			String user="root";
			String password="Gayatri7665@";
			String url="jdbc:mysql://localhost:3306/dac22";
			cn=DriverManager.getConnection(url, user, password);
		}
				catch( Exception e) {
					e.printStackTrace();
				}
		return cn;
	}
}
