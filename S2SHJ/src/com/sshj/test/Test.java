/**
 * 
 */
package com.sshj.test;

import java.util.Calendar;

/**
 * @author zhaocc
 *
 */
public class Test {

	public static void main(String[] args) {
		Calendar instance = Calendar.getInstance();
		System.out.println(instance.getMinimalDaysInFirstWeek());
		System.out.println(instance.get(Calendar.WEEK_OF_YEAR));
	}

}
