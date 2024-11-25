package com.shopping.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer productid;
	private String name;
	private double price;
	private int quantity;
	private Date expiredata;
	private String brand;
	private String review;
	private String category;
	public Product()
	{
		
	}
	public Product(int productid, String name, double price, int quantity, Date expiredata, String brand, String review,
			String category) {
		super();
		this.productid = productid;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.expiredata = expiredata;
		this.brand = brand;
		this.review = review;
		this.category = category;
	}
	public Integer getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public Date getExpiredata() {
		return expiredata;
	}
	public void setExpiredata(Date expiredata) {
		this.expiredata = expiredata;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getReview() {
		return review;
	}
	public void setReview(String review) {
		this.review = review;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	@Override
	public String toString() {
		return "Product [productid=" + productid + ", name=" + name + ", price=" + price + ", quantity=" + quantity
				+ ", expiredata=" + expiredata + ", brand=" + brand + ", review=" + review + ", category=" + category
				+ "]";
	}
	

}
