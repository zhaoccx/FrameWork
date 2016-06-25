/**
 * 
 */
package com.spring.demo.annotation.respostory;

import org.springframework.stereotype.Repository;

/**
 * @author zhaocc
 *
 */
@Repository()
public class UserRespostoryImpl implements UserRespostory {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.spring.demo.annotation.respostory.UserRespostory#respostor()
	 */
	@Override
	public void respostor() {
		System.out.println("UserRespostoryImpl respostor  ...........");
	}

}
