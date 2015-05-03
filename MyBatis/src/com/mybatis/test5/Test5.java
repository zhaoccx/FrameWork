package com.mybatis.test5;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.mybatis.bean.Classes;
import com.mybatis.util.MyBatiesUtil;

public class Test5 {

	@Test
	public void selectClasses() {
		SqlSession openSession = MyBatiesUtil.getSessionFactory().openSession(true);
		String statement = "com.mybatis.test5.classMapper.classBeanOne";
		Classes one = openSession.selectOne(statement, 3);
		System.out.println(one);
	}

	@Test
	public void selectClassesTwo() {
		SqlSession openSession = MyBatiesUtil.getSessionFactory().openSession(true);
		String statement = "com.mybatis.test5.classMapper.classBeanTwo";
		Classes one = openSession.selectOne(statement, 1);
		System.out.println(one);
	}
}
