package com.sc.pioneers.services;

import java.util.List;

import com.sc.pioneers.bean.Customer;

public interface CustomerService 
{
	
	public void addCustomer(Customer c);
	public List<Customer> getAllCustomers();
	public Customer getCustomerById(int id);
	public void deleteCustomer(int id);

}
