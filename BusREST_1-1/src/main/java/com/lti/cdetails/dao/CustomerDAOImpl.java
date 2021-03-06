package com.lti.cdetails.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lti.cdetails.pojo.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO
{
@Autowired
EntityManager eMan;
	@Override
	public boolean addCustomer(Customer customer) {
		eMan.persist(customer);
		return true;
	}

	@Override
	public List<Customer> addCustomer() {
		return eMan.createQuery("from Customer").getResultList();
	}

	@Override
	public boolean deletebooking(String CustId) {
		Customer obj=eMan.find(Customer.class,CustId);
		eMan.remove(obj);
		return true;
	}
	

}
