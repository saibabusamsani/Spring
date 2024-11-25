package com.shopping.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.shopping.entity.Cart;
import com.shopping.repository.CartRepository;
@Component
public class CartDaoImp implements CartDao{
	@Autowired
	CartRepository cartRepository;
	@Override
	public void addProduct(Cart cart) {
		Cart c=cartRepository.save(cart);
		System.out.println(c.getProductname()+" product is added to cart scuccssfully");
		
		
		
		
	}
	@Override
	public List<Cart> getCustomerCartDetailesByID(int id) {
		return cartRepository.findByCustomerid(id);
		
	}
	@Override
	public void deleteCart(int id) {
		
		cartRepository.deleteById(id);
	}
	
}
