package com.yuankang.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yuankang.dao.UserDao;
import com.yuankang.model.User;

@Service
public class LoginService {
	@Autowired
	private UserDao userDao;
	public boolean validateUser(String username, String password) {
		User user = userDao.getUser(username, password);
		return (user!=null);
	}
}