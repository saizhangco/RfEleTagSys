package com.saizhang.rfsys.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.saizhang.rfsys.domain.User;

@Repository
public interface UserDao extends JpaRepository<User, Long>{
	public User findById(long id);
	public User findByUsername(String username);
}
