package com.sc.pioneers.ui;

import java.util.*;

import com.sc.pioneers.controller.CustomerController;

public class CustomerUI {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		CustomerController controller=new CustomerController();
		
		System.out.println("-------------Welcome to Standard Chartered Bank------------------");
		
		while(true)
		{
			System.out.println("Please Enter your choice");
			System.out.println("1 for Add New Customer");
			System.out.println("2 for Displaying All Customers");
			System.out.println("3 for Searching Customer");
			System.out.println("4 for Deleting a Customer");
			System.out.println("5 for Exiting the Application");
			
			int option=sc.nextInt();
			
			switch (option) {
			case 1:
				controller.addCustomer();
				
				break;
			case 2:
				System.out.println("Listing customer");
				controller.listCustomers();
				break;
			case 3:
				System.out.println("Searching customer");
				break;
			case 4:
				System.out.println("Deleting customer");
				break;
			case 5:
				System.out.println("Thanks for using our services");
				System.exit(0);
				break;
				

			default:
				System.out.println("Option Unavailable");
				break;
			}
			
		}
		
		
	}
	
	
}
