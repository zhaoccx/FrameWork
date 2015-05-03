package com.mybatis.test4;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.mybatis.bean.Order;
import com.mybatis.util.MyBatiesUtil;

public class Test4 {

	@Test
	public void selectOrder() {
		SqlSession openSession = MyBatiesUtil.getSessionFactory().openSession(true);
		String statement = "com.mybatis.test4.orderMapper.selectOrder";
		Order one = openSession.selectOne(statement, 1);
		System.out.println(one);
	}

	@Test
	public void selectOrderList() {
		SqlSession openSession = MyBatiesUtil.getSessionFactory().openSession(true);
		String statement = "com.mybatis.test4.orderMapper.selectAllOrder";
		List<Order> list = openSession.selectList(statement);
		System.out.println(list);
	}

	@Test
	public void inserOrder() {
		SqlSession openSession = MyBatiesUtil.getSessionFactory().openSession(true);
		Order order = new Order(0, "dddddddddd", 89.9f);
		String statement = "com.mybatis.test4.orderMapper.insertOrder";
		int insert = openSession.insert(statement, order);
		System.out.println(insert);
	}

	@Test
	public void deleteOrder() {
		SqlSession openSession = MyBatiesUtil.getSessionFactory().openSession(true);
		String statement = "com.mybatis.test4.orderMapper.deleteOrder";
		int delete = openSession.delete(statement, 4);
		System.out.println(delete);
	}

	@Test
	public void updateOrder() {
		SqlSession openSession = MyBatiesUtil.getSessionFactory().openSession(true);
		Order order = new Order(4, "dddfffdddd", 89.9f);
		String statement = "com.mybatis.test4.orderMapper.updateOrder";
		int insert = openSession.update(statement, order);
		System.out.println(insert);
	}

	@Test
	public void selectOrder2() {
		SqlSession openSession = MyBatiesUtil.getSessionFactory().openSession(true);
		String statement = "com.mybatis.test4.orderMapper.selectOrder2";
		Order one = openSession.selectOne(statement, 1);
		System.out.println(one);
	}

	@Test
	public void selectOrderList2() {
		SqlSession openSession = MyBatiesUtil.getSessionFactory().openSession(true);
		String statement = "com.mybatis.test4.orderMapper.selectAllOrder2";
		List<Order> list = openSession.selectList(statement);
		System.out.println(list);
	}

	@Test
	public void inserOrder2() {
		SqlSession openSession = MyBatiesUtil.getSessionFactory().openSession(true);
		Order order = new Order(0, "dddddddddd", 89.9f);
		String statement = "com.mybatis.test4.orderMapper.insertOrder2";
		int insert = openSession.insert(statement, order);
		System.out.println(insert);
	}

	@Test
	public void deleteOrder2() {
		SqlSession openSession = MyBatiesUtil.getSessionFactory().openSession(true);
		String statement = "com.mybatis.test4.orderMapper.deleteOrder2";
		int delete = openSession.delete(statement, 4);
		System.out.println(delete);
	}

	@Test
	public void updateOrder2() {
		SqlSession openSession = MyBatiesUtil.getSessionFactory().openSession(true);
		Order order = new Order(4, "dddfffdddd", 89.9f);
		String statement = "com.mybatis.test4.orderMapper.updateOrder2";
		int insert = openSession.update(statement, order);
		System.out.println(insert);
	}
}
