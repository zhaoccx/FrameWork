package com.mybatis.test7;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.mybatis.bean.Classes;
import com.mybatis.bean.ConditionUser;
import com.mybatis.bean.User;
import com.mybatis.util.MyBatiesUtil;

public class Test7 {

	@Test
	public void selectClasses() {
		SqlSession openSession = MyBatiesUtil.getSessionFactory().openSession(true);
		String statement = "com.mybatis.test7.userMapper.getUserForContent";
		ConditionUser conditionUser = new ConditionUser("%null%", 0, 9);
		List<User> list = openSession.selectList(statement, conditionUser);
		System.out.println(list);
	}

	@Test
	public void selectClassesTwo() {
		SqlSession openSession = MyBatiesUtil.getSessionFactory().openSession(true);
		String statement = "com.mybatis.test6.classMapper.getBeanClassesAndStudentsTwo";
		Classes one = openSession.selectOne(statement, 1);
		System.out.println(one);
	}
}
