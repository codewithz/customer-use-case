package com.sc.pioneers.helper;
import java.sql.*;

public class DatabaseConnector {
	
	
	public Connection getConnection()
	{
	
		String url="jdbc:postgresql://localhost:5432/scb-pioneers-2021";
		String username="postgres";
		String password="admin";
		Connection con=null;
		
		try
		{
			Class.forName("org.postgresql.Driver");  //Step 2
			System.out.println("Driver Loaded Successfully");
			
			con=DriverManager.getConnection(url,username,password); //Step 3
			System.out.println("Connection Established Successfully");
			
			
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return con;
		
	}

}
