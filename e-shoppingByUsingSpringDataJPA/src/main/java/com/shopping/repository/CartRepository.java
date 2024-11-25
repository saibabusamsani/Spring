package com.shopping.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.shopping.entity.Cart;
import java.util.List;
public interface CartRepository extends JpaRepository<Cart, Integer>
{
	 List<Cart> findByCustomerid(int customerid);
}
