package com.jsp.Customer;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Customer
 *
 */
@Entity
@Table(name="customer_detailes")
public class Customer implements Serializable {

	@Id
	@Column(name="customer_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int customerId;
	@Column(name="customer_name",length=40,nullable=false)
	private String customerName;
	@Column(name="customer_email",length=40,unique=true,nullable=false)
	private String customerEmail;
	@Column(name="customer_password",length=40,nullable=false)
	private String customerPassword;
	@Column(name="customer_number",length=10,unique=true,nullable=false)
	private String customerNumber;
	private static final long serialVersionUID = 1L;

	public Customer() {
		super();
	}   
	public int getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}   
	public String getCustomerName() {
		return this.customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}   
	public String getCustomerEmail() {
		return this.customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}   
	public String getCustomerPassword() {
		return this.customerPassword;
	}

	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}   
	public String getCustomerNumber() {
		return this.customerNumber;
	}

	public void setCustomerNumber(String customerNumber) {
		this.customerNumber = customerNumber;
	}
   
}
