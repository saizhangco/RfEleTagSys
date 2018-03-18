package com.saizhang.rfsys.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.saizhang.rfsys.dao.UserDao;
import com.saizhang.rfsys.domain.User;
import com.saizhang.rfsys.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private UserDao userDao;
	
	@Override
	public void createUser(User user) {
		userDao.save(user);
	}

	@Override
	public void deleteUser(long id) {
		userDao.delete(id);
	}

	@Override
	public void updateUser(User user) {
		userDao.save(user);
	}

	@Override
	public User findByUserId(long id) {
		return userDao.findById(id);
	}

	@Override
	public User findByUserName(String username) {
		return userDao.findByUsername(username);
	}

	@Override
	public List<User> findAll() {
		return userDao.findAll();
	}

}
