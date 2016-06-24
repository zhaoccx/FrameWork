/**
 * 
 */
package com.spring.demo.factory;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhaocc
 *
 */
public class StaticBeanFactory {

	private static Map<String, Fact> map = new HashMap<>();

	static {
		map.put("a", new Fact("a", 251));
		map.put("b", new Fact("b", 252));
		map.put("c", new Fact("c", 253));
		map.put("d", new Fact("d", 254));
	}

	public static Fact getFact(String name) {
		return map.get(name);
	}
}
