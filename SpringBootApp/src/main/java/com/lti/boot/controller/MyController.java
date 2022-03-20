package com.lti.boot.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.boot.pojo.Product;
import com.lti.boot.service.ProductService;

@RestController
@RequestMapping("/rest/api/")
public class MyController 
{
	@Autowired
	private ProductService pso;
	
	@GetMapping("/products")     //For fetching data
	public List<Product> getProduct()
	{
		return pso.getProduct();
	}
	@PostMapping("/products")    // For inserting data
	public boolean addProduct(@RequestBody Product prod)
	{
	pso.addProduct(prod);
     return true;	
	}
	
}
