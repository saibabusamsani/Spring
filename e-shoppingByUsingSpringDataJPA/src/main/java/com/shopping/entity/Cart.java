package com.shopping.entity;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Cart {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer cartid;
	private String productname;
	private String productprice;
	private int customerid;
	private int productid;
	public Cart() {
		
	}
	public Cart(Integer cartid, String productname, String productprice, int customerid, int productid) {
		super();
		this.cartid = cartid;
		this.productname = productname;
		this.productprice = productprice;
		this.customerid = customerid;
		this.productid = productid;
	}
	public Integer getCartid() {
		return cartid;
	}
	public void setCartid(Integer cartid) {
		this.cartid = cartid;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getProductprice() {
		return productprice;
	}
	public void setProductprice(String productprice) {
		this.productprice = productprice;
	}
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	@Override
	public String toString() {
		return "Cart [cartid=" + cartid + ", productname=" + productname + ", productprice=" + productprice
				+ ", customerid=" + customerid + ", productid=" + productid + "]";
	}
	
}