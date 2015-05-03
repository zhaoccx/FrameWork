package com.mybatis.test8;

import java.util.HashMap;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import com.mybatis.util.MyBatiesUtil;

public class Test8 {

	@Test
	public void selectClassesProduce() {
		SqlSession openSession = MyBatiesUtil.getSessionFactory().openSession(true);
		String statement = "com.mybatis.test8.userMapper.getCounts";
		Map<String, Integer> paramMap = new HashMap<String, Integer>();
		paramMap.put("set_id", 0);
		openSession.selectOne(statement, paramMap);
		Integer userCount = paramMap.get("set_count");
		System.out.println(userCount);
	}
	/*
	 * 
	 * delimiter $ create procedure mybatis.ges_user_count(in sex_id int, out user_count int) begin if sex_id=0 then select count(*) from mybatis.p_user where
	 * p_user.sex='女' into user_count; else select count(*) from mybatis.p_user where p_user.sex='男' into user_count; end if; end $
	 */
}
