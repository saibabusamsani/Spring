package com.shopping.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.shopping.entity.Product;
import com.shopping.repository.ProductRepository;
@Component
public class ProductDaoImp  implements ProductDao{
	@Autowired
	ProductRepository productRepository;
	@Override
	public void productRegistration(Product prodcut) {
		Product product=productRepository.save(prodcut);
		System.out.println(product);
	
		
	}
	@Override
	public void findProductsByPrice(int price) {
		List<Product> products=productRepository.findByPriceLessThanEqual(price);
		products.forEach(i->{
			System.out.println(i);
		});
		
		
	}
	@Override
	public List<Product> productDetailes() {
		return productRepository.findAll();
		
			
	}
	@Override
	public void updateQuantity(Product product) {
		// TODO Auto-generated method stub
		productRepository.save(product);
		
	}
	@Override
	public Optional<Product> productByid(int id) {
		return productRepository.findById(id);
		
	}
	

}
