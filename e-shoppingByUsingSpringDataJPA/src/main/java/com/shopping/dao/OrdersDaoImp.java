package com.shopping.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.shopping.entity.Orders;
import com.shopping.repository.OrdersRepository;
@Component
public class OrdersDaoImp implements OrdersDao{
	@Autowired
	OrdersRepository ordersRepository;
	@Override
	public List<Orders> addOrder(List<Orders> order) {
		return ordersRepository.saveAll(order);	
	}

	

}
