package com.mybatis.test6;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.mybatis.bean.Classes;
import com.mybatis.util.MyBatiesUtil;

public class Test6 {

	@Test
	public void selectClasses() {
		SqlSession openSession = MyBatiesUtil.getSessionFactory().openSession(true);
		String statement = "com.mybatis.test6.classMapper.getBeanClassesAndStudentsOne";
		Classes one = openSession.selectOne(statement, 1);
		System.out.println(one);
	}

	@Test
	public void selectClassesTwo() {
		SqlSession openSession = MyBatiesUtil.getSessionFactory().openSession(true);
		String statement = "com.mybatis.test6.classMapper.getBeanClassesAndStudentsTwo";
		Classes one = openSession.selectOne(statement, 1);
		System.out.println(one);
	}
}
