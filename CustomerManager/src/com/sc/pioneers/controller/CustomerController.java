package com.sc.pioneers.controller;

import java.util.List;
import java.util.Scanner;

import com.sc.pioneers.bean.Customer;
import com.sc.pioneers.services.CustomerService;
import com.sc.pioneers.services.CustomerServiceListImpl;

public class CustomerController 
{
	Scanner sc=new Scanner(System.in);
	
	CustomerService service=new CustomerServiceListImpl();
	
	public void addCustomer()
	{
		System.out.println("Please Enter the Customer Details");
		
		int id;
		String name;
		String email;
		long phone;
		String accountType;
		
		System.out.print("Enter ID:");
		id=sc.nextInt();
		
		System.out.print("Enter Name:");
		name=sc.next();
		
		System.out.print("Enter Email:");
		email=sc.next();
		
		System.out.print("Enter Phone Number:");
		phone=sc.nextLong();
		
		System.out.print("Enter Account Type[Current|Savings]:");
		accountType=sc.next();
		
		Customer c=new Customer(id, name, email, phone, accountType);
		
		service.addCustomer(c);
		
		System.out.println("Customer Added Successfully");
		
		
	}
	
	public void listCustomers()
	{
		List<Customer> list=service.getAllCustomers();
		
		for(Customer c:list)
		{
			System.out.println(c.getName()+"-"+c.getEmail());
		}
	}
	

}
