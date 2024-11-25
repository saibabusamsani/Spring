package com.shopping.entity;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Payment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer paymentid;
	private Date date;
	private String time;
	private String type;
	private double amout;
	public Payment()
	{
		
	}
	public Payment(int paymentid, Date date, String time, String type, double amout) {
		super();
		this.paymentid = paymentid;
		this.date = date;
		this.time = time;
		this.type = type;
		this.amout = amout;
	}
	public Integer getPaymentid() {
		return paymentid;
	}
	public void setPaymentid(int paymentid) {
		this.paymentid = paymentid;
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getAmout() {
		return amout;
	}
	public void setAmout(double amout) {
		this.amout = amout;
	}
	@Override
	public String toString() {
		return "Payment [paymentid=" + paymentid + ", date=" + date + ", time=" + time + ", type=" + type + ", amout="
				+ amout + "]";
	}
	

}
