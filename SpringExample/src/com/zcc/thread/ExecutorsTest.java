/**
 * 
 */
package com.zcc.thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author zhaocc
 *
 */
public class ExecutorsTest {
	public static void main(String[] args) {
		ExecutorsTest test = new ExecutorsTest();
		List<Future<List<String>>> test2 = test.test(10, 100);
		List<String> list = new ArrayList<String>();
		for (Future<List<String>> future : test2) {
			try {
				List<String> list2 = future.get();
				list.addAll(list2);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(list.size());
	}

	public List<Future<List<String>>> test(int y, int num) {
		ExecutorService pool = Executors.newFixedThreadPool(y);
		List<Future<List<String>>> fList = new ArrayList<Future<List<String>>>();
		for (int i = 0; i < y; i++) {
			fList.add(pool.submit(new ExecutorsTest.ExecutorsMain(i, num)));
			System.err.println("sssssssssssssssssssssssssssssssssssssssss");
		}
		System.err.println("hhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhhh");
		pool.shutdown();
		return fList;
	}

	public List<String> getList(int indexi, int indexj) {
		List<String> list = new ArrayList<String>();
		for (int i = 0; i < indexj; i++) {
			System.out.println(String.valueOf(indexi) + String.valueOf(i));
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

		@Override
		public List<String> call() throws Exception {
			return getList(indexi, indexj);
		}

	}
}
