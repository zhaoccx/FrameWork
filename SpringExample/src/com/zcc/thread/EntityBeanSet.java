package com.zcc.thread;

import java.util.Date;

/**
 * @author zhaocc
 * @time 2017年1月13日下午7:44:38
 * @parent
 */
public class EntityBeanSet {

	public EntityBeanSet() {

	}

	public EntityBeanSet(Integer integer) {
		System.out.println(new Date() + ":------------" + integer.toString());
	}
}
