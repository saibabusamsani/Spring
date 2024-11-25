package com.shopping.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.shopping.entity.Payment;
import com.shopping.repository.PaymentRepository;
@Component
public class PaymentDaoImp  implements PaymentDao{
	@Autowired
	PaymentRepository paymentRepository;
	@Override
	public Payment savePayment(Payment payment) {
		// TODO Auto-generated method stub
		return paymentRepository.save(payment);
		
	}

}
