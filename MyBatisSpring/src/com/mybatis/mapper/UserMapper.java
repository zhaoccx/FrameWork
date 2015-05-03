package com.mybatis.mapper;

import java.util.List;

import com.mybatis.bean.User;

public interface UserMapper {

	public void save(User user);

	public void update(User user);

	public void delete(int id);

	public User findById(int id);

	public List<User> findAll();
}
