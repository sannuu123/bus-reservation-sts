package com.lti.cdetails.service;

import java.util.List;

import com.lti.cdetails.pojo.Customer;

public interface CustomerService {
	
	public boolean addCustomer(Customer customer);
	public List<Customer> addCustomer();

	public boolean deletebooking(String CustId);
}
