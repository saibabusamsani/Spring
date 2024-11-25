package com.bank.DAO;

import com.bank.model.UserInformation;

public interface UserDao {
	public void userLogin(String email,String passowrd);
	public void registration(UserInformation user);

}
