package com.lti.cdetails.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.cdetails.pojo.Customer;
import com.lti.cdetails.dao.CustomerDAO;

@Service
@Transactional
public class CustomerServiceImpl implements CustomerService
{
@Autowired
CustomerDAO cdao;

	@Override
	public boolean addCustomer(Customer customer) {
		return cdao.addCustomer(customer);
	}

	@Override
	public List<Customer> addCustomer() {
		return cdao.addCustomer();
	}

	@Override
	public boolean deletebooking(String CustId) {
		return cdao.deletebooking(CustId);
	}
}
