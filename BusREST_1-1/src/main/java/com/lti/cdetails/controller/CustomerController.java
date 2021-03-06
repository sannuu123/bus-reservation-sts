package com.lti.cdetails.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.cdetails.pojo.Customer;
import com.lti.cdetails.service.CustomerService;

@RestController
@RequestMapping("/rest/api/")
@CrossOrigin("http://localhost:4200")

public class CustomerController {
	
	@Autowired
	CustomerService cService;
	
	@GetMapping("/customer")
	public List<Customer> addCustomer()
	{
		return cService.addCustomer();
	}
	@PostMapping("/customer")
	public boolean addCustomer(@RequestBody Customer customer)
	{
		return cService.addCustomer(customer);
	}
	@DeleteMapping("/customer/{custId}")
	public boolean deletebooking(@PathVariable ("custId")String CustId)
	{
		return cService.deletebooking(CustId);
	}
}
