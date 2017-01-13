package com.zcc.thread;

import java.util.Date;

/**
 * @author zhaocc
 * @time 2017年1月13日下午7:43:19
 * @parent
 */
public class SearchBuilder {

	public SearchBuilder() {
		System.out.println(new Date());
	}

	public SearchBuilder(Date date, Integer integer) {
		System.err.println(integer + "-----------" + date);
	}
}
