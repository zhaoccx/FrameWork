/**
 * 
 */
package com.zcc.thread;

/**
 * @author zhaocc
 *
 */
public class ThreadTest implements Runnable {

	public static void main(String[] args) {
		for (int i = 0; i < 3; i++) {
			ThreadTest test = new ThreadTest("" + i);
			Thread thread = new Thread(test);
			thread.start();
		}
	}

	private String tString;

	/**
	 * 
	 */
	public ThreadTest(String tString) {
		this.tString = tString;
	}

	public String getLis(String string) {
		System.out.println(string);
		return string;
	}

	@Override
	public void run() {
		getLis(tString);
	}
}
