package com.shopping.dao;

import java.util.List;

import com.shopping.entity.Cart;

public interface CartDao {
	public void addProduct(Cart cart);
	public List<Cart> getCustomerCartDetailesByID(int id);
	public void deleteCart(int id);
	
	
}
