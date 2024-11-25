package com.shopping.dao;

import java.util.List;

import com.shopping.entity.Orders;

public interface OrdersDao {
	public List<Orders> addOrder(List<Orders> order);

}
