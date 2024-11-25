package com.jsp.model;

import org.springframework.stereotype.Component;

@Component
public class NonVeg implements Alpha{

	@Override
	public String foodItem() {
		
		return "thandhuri chhicken";
	}

}
