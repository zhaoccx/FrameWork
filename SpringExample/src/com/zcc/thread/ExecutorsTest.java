/**
 * 
 */
package com.zcc.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author zhaocc
 *
 */
public class ExecutorsTest {

	public void test(int y, int num) {
		ExecutorService pool = Executors.newFixedThreadPool(y);
		// Future<List<String>> list = new FutureTask<List<String>>();
		List<Future<ArrayList<String>>> fList = new ArrayList<Future<ArrayList<String>>>();
		for (int i = 0; i < y; i++) {
			// list.add(pool.submit(new ExecutorsMain(i, num)));
			fList.add(pool.submit(new ExecutorsTest.ExecutorsMain(i, num)));
		}
	}

	public List<String> getList(int indexi, int indexj) {
		List<String> list = new ArrayList<String>();
		for (int i = 0; i < indexj; i++) {
			list.add(String.valueOf(indexi) + String.valueOf(i));
		}
		return list;
	}

	class ExecutorsMain implements Callable<List<String>> {
		private int indexi;
		private int indexj;

		/**
		 * @param indexi
		 * @param indexy
		 */
		public ExecutorsMain(int indexi, int indexj) {
			super();
			this.indexi = indexi;
			this.indexj = indexj;
		}

		/*
		 * (non-Javadoc)
		 * 
		 * @see java.util.concurrent.Callable#call()
		 */
		@Override
		public List<String> call() throws Exception {
			return getList(indexi, indexj);
		}

	}
}
