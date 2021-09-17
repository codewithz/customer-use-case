package com.sc.pioneers.services;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;
import com.sc.pioneers.bean.Customer;
import com.sc.pioneers.helper.DatabaseConnector;

public class CustomerServiceDBImpl implements CustomerService{
	
	DatabaseConnector connector=new DatabaseConnector();

	@Override
	public void addCustomer(Customer c) {
		
		Connection con=null;
		
		try
		{
			con=connector.getConnection();
			
			String query="Insert into customer(name,email,phone,acounttype) values (?,?,?,?);";
			
			PreparedStatement pstmt=con.prepareStatement(query);
			
			pstmt.setString(1,c.getName());
			pstmt.setString(2, c.getEmail());
			pstmt.setLong(3, c.getPhone());
			pstmt.setString(4, c.getAccountType());
			
			int rowAffected=pstmt.executeUpdate();
			
			if(rowAffected==1)
			{
				System.out.println("Customer Added Successfully");
			}
			
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
	}

	@Override
	public List<Customer> getAllCustomers() {
		
		ArrayList<Customer> list=new ArrayList<>();
		Connection con=null;
		
		try
		{
			con=connector.getConnection();
			String query="Select id,name,email,phone,acounttype from customer";
			
			PreparedStatement pstmt=con.prepareStatement(query);
			
			ResultSet rs=pstmt.executeQuery();
			while(rs.next())
			{
				int id=rs.getInt("id");
				String name=rs.getString("name");
				String type=rs.getString("acounttype");
				String email=rs.getString("email");
				int phone=rs.getInt("phone");
				
				Customer c=new Customer(id, name, email, phone,type);
				list.add(c);
			}
			
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return list;
		
	}

	@Override
	public Customer getCustomerById(int id) {
		Customer c=null;
		Connection con=null;
		
		try
		{
			con=connector.getConnection();
			String query="Select id,name,email,phone,acounttype from customer where id=?";
			
			PreparedStatement pstmt=con.prepareStatement(query);
			
			pstmt.setInt(1,id);
			
			ResultSet rs=pstmt.executeQuery();
			while(rs.next())
			{
				int cid=rs.getInt("id");
				String name=rs.getString("name");
				String type=rs.getString("acounttype");
				String email=rs.getString("email");
				int phone=rs.getInt("phone");
				
				c=new Customer(cid, name, email, phone,type);
			
			}
			
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return c;
	}

	@Override
	public void deleteCustomer(int id) {
		
		Connection con=null;
		
		try
		{
			con=connector.getConnection();
			String query="Delete from customer where id=?";
			PreparedStatement pstmt=con.prepareStatement(query);
			pstmt.setInt(1,id);
			
			int rowDeleted=pstmt.executeUpdate();
			
			if(rowDeleted==1)
			{
				System.out.println("Customer with ID:"+id+" is deleted successully");
			}
			else
			{
				System.err.println("Customer with ID:"+id+" doesn't exists");
			}

			
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

}
