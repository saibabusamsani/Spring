package com.shopping.dao;

import java.util.List;
import java.util.Optional;

import com.shopping.entity.Product;

public interface ProductDao {
	public void productRegistration(Product product);
	public void findProductsByPrice(int price);
	public List<Product> productDetailes();
	public void updateQuantity(Product product);
	public Optional<Product> productByid(int id);
	

}
