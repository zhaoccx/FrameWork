package com.mybatis.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatiesUtil {

	public static SqlSessionFactory getSqlSessionFactory() {
		String resource = "config.xml";
		// 加载mybatis的配置文件（它也加载关联的映射文件）
		Reader reader;
		try {
			reader = Resources.getResourceAsReader(resource);
			// 构建sqlSession的工厂
			SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
			// 创建能执行映射文件中sql的sqlSession
			return sessionFactory;
		} catch (IOException e) {
			return null;
		}
	}

	public static SqlSessionFactory getSessionFactory() {
		String resource = "config.xml";
		InputStream inputStream = MyBatiesUtil.class.getClassLoader().getResourceAsStream(resource);
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(inputStream);
		return factory;
	}
}
