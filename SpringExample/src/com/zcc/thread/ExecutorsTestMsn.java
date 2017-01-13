package com.zcc.thread;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * @author zhaocc
 *
 */
public class ExecutorsTestMsn {
	public static void main(String[] args) {
		long timone = System.currentTimeMillis();
		ExecutorsTestMsn test = new ExecutorsTestMsn();
		Map<String, SearchBuilder> map = new HashMap<>();
		for (int i = 0; i < 100; i++) {
			map.put("string" + i, new SearchBuilder());
		}
		Map<String, Future<EntityBeanSet>> mapsss = test.testMap(map);
		Set<Entry<String, Future<EntityBeanSet>>> entrySet = mapsss.entrySet();
		List<EntityBeanSet> list = new ArrayList<>();
		for (Entry<String, Future<EntityBeanSet>> entry : entrySet) {
			try {
				list.add(entry.getValue().get());
			} catch (InterruptedException e) {
				e.printStackTrace();
			} catch (ExecutionException e) {
				e.printStackTrace();
			}
		}

		System.out.println(list.size());
		System.err.println(System.currentTimeMillis() - timone);
	}

	public Map<String, Future<EntityBeanSet>> testMap(Map<String, SearchBuilder> map) {
		ExecutorService pool = Executors.newFixedThreadPool(map.size());
		Map<String, Future<EntityBeanSet>> set = new HashMap<>();
		Set<Entry<String, SearchBuilder>> entrySet = map.entrySet();

		for (Entry<String, SearchBuilder> entry : entrySet) {
			set.put(entry.getKey(), pool.submit(new ExectMan(entry.getValue())));
		}

		pool.shutdown();
		return set;
	}

	public EntityBeanSet getResult(SearchBuilder builder) {
		if (null != builder) {
			System.out.println("ssssssssssssssssss");
			System.err.println(new Date());
			return new EntityBeanSet();
		}
		return null;
	}

	class ExectMan implements Callable<EntityBeanSet> {
		private SearchBuilder builder;

		public ExectMan(SearchBuilder buildersss) {
			this.builder = buildersss;
		}

		@Override
		public EntityBeanSet call() throws Exception {
			// TODO Auto-generated method stub
			return getResult(builder);
		}

	}

}
