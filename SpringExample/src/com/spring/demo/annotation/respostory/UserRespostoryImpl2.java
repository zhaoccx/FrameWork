/**
 * 
 */
package com.spring.demo.annotation.respostory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.spring.demo.annotation.res.Resu;

/**
 * @author zhaocc
 *
 */
@Repository
public class UserRespostoryImpl2 implements UserRespostory {

	@Autowired(required = false)
	private Resu resu;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.spring.demo.annotation.respostory.UserRespostory#respostor()
	 */
	@Override
	public void respostor() {
		System.out.println("UserRespostoryImpl2 respostor  ...........");
		System.out.println(resu);
	}

}
