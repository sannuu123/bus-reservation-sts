package com.lti.boot.pojo;

public class Product 
{
	private String prodId;
	private String prodName;
	private int price;
	
	@Override
	public String toString() {
		return "Product [prodId=" + prodId + ", prodName=" + prodName + ", price=" + price + "]";
	}
	public String getProdId() {
		return prodId;
	}
	public void setProdId(String prodId) {
		this.prodId = prodId;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	

}
