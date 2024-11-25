package com.shopping.dao;

import org.springframework.stereotype.Component;

import com.shopping.entity.Payment;
@Component
public interface PaymentDao {
	public Payment savePayment(Payment payment);

}
