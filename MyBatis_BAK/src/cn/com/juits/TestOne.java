package cn.com.juits;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import cn.com.bean.User;
import cn.com.test2.inter.UserMapper;
import cn.com.utils.MyBatisUtil;

public class TestOne {

	@Test
	public void selectUser() {
		SqlSessionFactory factory = MyBatisUtil.getSessionFactory();
		SqlSession session = factory.openSession();
		String statement = "cn.com.test1.userMapper.getUserAll";
		List<User> list = session.selectList(statement);
		System.out.println(list);
	}

	@Test
	public void selectUser2() {
		SqlSessionFactory factory = MyBatisUtil.getSessionFactory();
		SqlSession session = factory.openSession();
		UserMapper mapper = session.getMapper(UserMapper.class);
		List<User> list = mapper.getAllUser();
		System.out.println(list);
	}

	@Test
	public void selectOne() {
		SqlSessionFactory factory = MyBatisUtil.getSessionFactory();
		SqlSession session = factory.openSession();
		UserMapper mapper = session.getMapper(UserMapper.class);
		// List<User> list = mapper.getAllUser();
		User user = mapper.getUserById(1);
		System.out.println(user);
	}

	@Test
	public void addUser() {
		SqlSessionFactory factory = MyBatisUtil.getSessionFactory();
		SqlSession session = factory.openSession(true);
		UserMapper mapper = session.getMapper(UserMapper.class);
		User user = new User("春", 5);
		int user2 = mapper.insertUser(user);
		System.out.println(user2);
	}

	@Test
	public void testAdd() {
		SqlSessionFactory factory = MyBatisUtil.getSessionFactory();
		// 默认是手动提交的
		SqlSession session = factory.openSession();
		String statement = "cn.com.test1.userMapper.addUser";
		int insert = session.insert(statement, new User(-1, "KK", 23));
		// 提交
		session.commit();
		session.close();
		System.out.println(insert);
	}

	@Test
	public void testUpate() {
		SqlSessionFactory factory = MyBatisUtil.getSessionFactory();
		// 默认是手动提交的
		SqlSession session = factory.openSession(true);
		String statement = "com.atguigu.day03_mybaits.test2.userMapper.updateUser";
		int update = session.update(statement, new User(4, "KK444", 25));
		session.close();
		System.out.println(update);
	}

	@Test
	public void testDelete() {
		SqlSessionFactory factory = MyBatisUtil.getSessionFactory();
		// 默认是手动提交的
		SqlSession session = factory.openSession(true);
		String statement = "com.atguigu.day03_mybaits.test2.userMapper.deleteUser";
		int delete = session.delete(statement, 4);
		session.close();
		System.out.println(delete);
	}

	@Test
	public void testGetUser() {
		SqlSessionFactory factory = MyBatisUtil.getSessionFactory();
		// 默认是手动提交的
		SqlSession session = factory.openSession(true);
		String statement = "com.atguigu.day03_mybaits.test2.userMapper.getUser";
		User user = session.selectOne(statement, 1);
		session.close();
		System.out.println(user);
	}

	@Test
	public void testGetAll() {
		SqlSessionFactory factory = MyBatisUtil.getSessionFactory();
		// 默认是手动提交的
		SqlSession session = factory.openSession(true);
		String statement = "com.atguigu.day03_mybaits.test2.userMapper.getAllUsers";
		List<User> list = session.selectList(statement);
		session.close();
		System.out.println(list);
	}

	@Test
	public void testAdd2() {
		SqlSessionFactory factory = MyBatisUtil.getSessionFactory();
		// 默认是手动提交的
		SqlSession session = factory.openSession(true);
		UserMapper mapper = session.getMapper(UserMapper.class);
		int add = mapper.insertUser(new User(-1, "SS", 45));
		System.out.println(add);
		session.close();
	}
}
