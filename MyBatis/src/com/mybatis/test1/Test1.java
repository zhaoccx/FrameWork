package com.mybatis.test1;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;

import com.mybatis.bean.User;

public class Test1 {

	@Test
	public void testSelect() {
		String resource = "config.xml";
		// 加载mybatis的配置文件（它也加载关联的映射文件）
		Reader reader;
		try {
			reader = Resources.getResourceAsReader(resource);
			// 构建sqlSession的工厂
			SqlSessionFactory sessionFactory = new SqlSessionFactoryBuilder().build(reader);
			// 创建能执行映射文件中sql的sqlSession
			SqlSession session = sessionFactory.openSession();
			// 映射sql的标识字符串
			String statement = "com.mybatis.test1.userMapper" + ".getUser";
			// 执行查询返回一个唯一user对象的sql
			User user = session.selectOne(statement, 1);
			System.out.println(user);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
