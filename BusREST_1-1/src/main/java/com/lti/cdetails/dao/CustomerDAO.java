package com.lti.cdetails.dao;

import java.util.List;

import com.lti.cdetails.pojo.Customer;

public interface CustomerDAO {
	public boolean addCustomer(Customer customer);
	public List<Customer> addCustomer();
	
	public boolean deletebooking(String CustId);

}
