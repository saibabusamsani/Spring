package com.customer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.customer.entity.CustomerInformation;

public interface CustomerRepository extends JpaRepository<CustomerInformation, Integer>{

}
