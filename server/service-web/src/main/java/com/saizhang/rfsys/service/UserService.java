package com.saizhang.rfsys.service;

import java.util.List;

import com.saizhang.rfsys.domain.User;

public interface UserService {
	//CRUD
	void createUser(User user);
	void deleteUser(long id);
	void updateUser(User user);
	User findByUserId(long id);
	User findByUserName(String username);
	List<User> findAll();
}
