package com.lti.boot.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.lti.boot.pojo.Product;

@Service
public class ProductService 
{
	List<Product> prodList;
	
	public ProductService()
	{
		this.prodList=new ArrayList<Product>();
		Product p=new Product();
		p.setProdId("P001");p.setProdName("MAgicpen");p.setPrice(100);
		 prodList.add(p);
	}
    public List<Product> getProduct()
    {
    	return this.prodList;
    }
    public void addProduct(Product prod)
    {
    	this.prodList.add(prod);
    }
	
}
