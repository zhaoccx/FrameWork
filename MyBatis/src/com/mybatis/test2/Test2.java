package com.mybatis.test2;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.mybatis.bean.User;
import com.mybatis.util.MyBatiesUtil;

public class Test2 {

	/**
	 * 测试一下Util
	 */
	@Test
	public void testSelect() {
		String statement = "com.mybatis.test2.userMapper.selectUser";
		SqlSession openSession = MyBatiesUtil.getSessionFactory().openSession();
		// 执行查询返回一个唯一user对象的sql
		User user = openSession.selectOne(statement, 1);
		System.out.println(user + "sssssssssssss");
		SqlSession openSession2 = MyBatiesUtil.getSessionFactory().openSession();
		User user2 = openSession2.selectOne(statement, 1);
		System.out.println(user2 + "bbbbbbbbbbbb");
	}

	@Test
	public void testSelect1() {
		SqlSession openSession = MyBatiesUtil.getSqlSessionFactory().openSession(true);
		String statement = "com.mybatis.test2.userMapper" + ".selectUser";
		// 执行查询返回一个唯一user对象的sql
		User user = openSession.selectOne(statement, 2);
		System.out.println(user);
	}

	@Test
	public void testInsertUser() {
		SqlSession openSession = MyBatiesUtil.getSqlSessionFactory().openSession(true);
		String statement = "com.mybatis.test2.userMapper" + ".insertUser";
		User user = new User(0, "李三", 8);
		// 执行查询返回一个唯一user对象的sql
		int insert = openSession.insert(statement, user);
		System.out.println(insert);
	}

	@Test
	public void testDeleteUser() {
		SqlSession openSession = MyBatiesUtil.getSessionFactory().openSession(true);
		String statement = "com.mybatis.test2.userMapper.deleteUser";
		int delete = openSession.delete(statement, 9);
		System.out.println(delete);
	}

	@Test
	public void testUpdateUser() {
		SqlSession openSession = MyBatiesUtil.getSessionFactory().openSession(true);
		Object user = new User(4, "Thank you", 78);
		String statement = "com.mybatis.test2.userMapper.updateUser";
		int update = openSession.update(statement, user);
		System.out.println(update);
	}

	@Test
	public void testSelectAllUser() {
		SqlSession openSession = MyBatiesUtil.getSqlSessionFactory().openSession(true);
		String statement = "com.mybatis.test2.userMapper.selectAllUsers";
		List<User> list = openSession.selectList(statement);
		System.out.println(list);
	}
}
