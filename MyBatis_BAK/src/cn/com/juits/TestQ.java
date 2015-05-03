package cn.com.juits;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import cn.com.bean.User;
import cn.com.utils.MyBatisUtil;

public class TestQ {

	@Test
	public void selectUser() {
		SqlSessionFactory factory = MyBatisUtil.getSessionFactory();
		SqlSession session = factory.openSession();
		String statement = "cn.com.test2.userMapper.getUserAll";
		List<User> list = session.selectList(statement);
		System.out.println(list);
	}
}
