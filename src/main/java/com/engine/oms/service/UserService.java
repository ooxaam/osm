package com.engine.oms.service;

import com.engine.oms.auth.User;

public interface UserService {
	
	void save(User user);
	User findByUsername(String username);
}