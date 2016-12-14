package com.yuankang.dao;

import org.apache.ibatis.annotations.Param;

import com.yuankang.model.User;

public interface UserDao {
	public User getUser(@Param("username")String username, @Param("password")String password);
}
