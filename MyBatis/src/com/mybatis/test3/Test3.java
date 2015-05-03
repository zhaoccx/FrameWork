package com.mybatis.test3;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.mybatis.bean.User;
import com.mybatis.test3.inter.UserMapper;
import com.mybatis.util.MyBatiesUtil;

public class Test3 {

	@Test
	public void selectListUser() {
		SqlSession openSession = MyBatiesUtil.getSessionFactory().openSession(true);
		UserMapper mapper = openSession.getMapper(UserMapper.class);
		List<User> allUser = mapper.getAllUser();
		System.out.println(allUser);
	}

	@Test
	public void selectUser() {
		SqlSession openSession = MyBatiesUtil.getSessionFactory().openSession(true);
		UserMapper mapper = openSession.getMapper(UserMapper.class);
		User user = mapper.getUserById(1);
		System.out.println(user);
	}

	@Test
	public void insertUser() {
		SqlSession openSession = MyBatiesUtil.getSessionFactory().openSession(true);
		UserMapper mapper = openSession.getMapper(UserMapper.class);
		User user = new User(0, "sb", 8);
		int insertUser = mapper.insertUser(user);
		System.out.println(insertUser);
	}

	@Test
	public void updateUser() {
		SqlSession openSession = MyBatiesUtil.getSessionFactory().openSession(true);
		UserMapper mapper = openSession.getMapper(UserMapper.class);
		User user = new User(10, "sssssssssss", 9);
		int updateUser = mapper.updateUser(user);
		System.out.println(updateUser);
	}

	@Test
	public void deleteUser() {
		SqlSession openSession = MyBatiesUtil.getSessionFactory().openSession(true);
		UserMapper mapper = openSession.getMapper(UserMapper.class);
		int deleteUserById = mapper.deleteUserById(14);
		System.out.println(deleteUserById);
	}
}
