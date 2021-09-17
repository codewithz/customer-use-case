package com.sc.pioneers.services;

import java.util.ArrayList;
import java.util.List;

import com.sc.pioneers.bean.Customer;

public class CustomerServiceListImpl implements CustomerService
{
	List<Customer> customerList=new ArrayList<>();
	@Override
	public void addCustomer(Customer c) {
		// TODO Auto-generated method stub
		customerList.add(c);
		
	}

	@Override
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return customerList;
	}

	@Override
	public Customer getCustomerById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteCustomer(int id) {
		// TODO Auto-generated method stub
		
	}

}
