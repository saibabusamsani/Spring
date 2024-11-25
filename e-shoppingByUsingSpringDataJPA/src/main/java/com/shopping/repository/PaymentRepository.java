package com.shopping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shopping.entity.Customer;
import com.shopping.entity.Payment;

public interface PaymentRepository  extends JpaRepository<Payment, Integer>{

}
