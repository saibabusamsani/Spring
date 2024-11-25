package com.jsp.product;

public class Product implements Comparable<Product> {
	private int productId;
	private String productName;
	private int productPrice;
	private int productQuantity;
	private String productBrand;
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	public int getProductQuantity() {
		return productQuantity;
	}
	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}
	public String getProductBrand() {
		return productBrand;
	}
	public void setProductBrand(String productBrand) {
		this.productBrand = productBrand;
	}
	@Override
	public String toString() {
		return "Product \n[productId=" + productId + ", productName=" + productName + ", productPrice=" + productPrice
				+ ", productQuantity=" + productQuantity + ", productBrand=" + productBrand + "]";
	}
	@Override
	public int compareTo(Product o) {
		if(o.productPrice>this.productPrice)
		{
			return -1;
		}
		else if(o.productPrice<this.productPrice)
		{
			return 1;
		}
		return 0;
	}
	

}
