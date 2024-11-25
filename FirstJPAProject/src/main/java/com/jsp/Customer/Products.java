package com.jsp.Customer;

import java.io.Serializable;
import java.lang.String;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Products
 *
 */
@Entity
@Table(name="product")
public class Products implements Serializable {

	@Id
	@Column(name="product_id")
	private int product_id;
	@Column(name="product_name",length = 40)
	private String product_name;
	@Column(name="product_price")
	private int product_price;
	@Column(name="product_quantity")
	private int product_quantity;
	@Column(name="product_category",length = 40)
	private String product_category;
	private static final long serialVersionUID = 1L;

	public Products() {
		super();
	}   
	public int getProduct_id() {
		return this.product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}   
	public String getProduct_name() {
		return this.product_name;
	}

	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}   
	public int getProduct_price() {
		return this.product_price;
	}

	public void setProduct_price(int product_price) {
		this.product_price = product_price;
	}   
	public int getProduct_quantity() {
		return this.product_quantity;
	}

	public void setProduct_quantity(int product_quantity) {
		this.product_quantity = product_quantity;
	}   
	public String getProduct_category() {
		return this.product_category;
	}

	public void setProduct_category(String product_category) {
		this.product_category = product_category;
	}
   
}
