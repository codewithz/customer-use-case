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

}
