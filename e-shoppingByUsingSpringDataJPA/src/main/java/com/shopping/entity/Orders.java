package com.shopping.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Orders {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer orderid;
	private Date date;
	private String time;
	private String status;
	private int productid;
	private int customerid;
	private int quantity;
	private  double price;
	private String address;
	public Orders()
	{
		
	}
	public Orders(int orderid, Date date, String time, String status, int productid, int customerid, int quantity,
			double price, String address) {
		super();
		this.orderid = orderid;
		this.date = date;
		this.time = time;
		this.status = status;
		this.productid = productid;
		this.customerid = customerid;
		this.quantity = quantity;
		this.price = price;
		this.address = address;
	}
	public Integer			 getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public int getProductid() {
		return productid;
	}
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Order [orderid=" + orderid + ", date=" + date + ", time=" + time + ", status=" + status + ", productid="
				+ productid + ", customerid=" + customerid + ", quantity=" + quantity + ", price=" + price
				+ ", address=" + address + "]";
	}
	
	

}
