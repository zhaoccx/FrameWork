/**
 * 
 */
package com.introduce.fastjson;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.JSON;
import com.introduce.bean.Person;

/**
 * @author zhaocc
 *
 */
public class FastJsonTest {
	public static void main(String[] args) {
		Person person = new Person("fastjsonobj", "来个中文试试");
		List<Person> persons = new ArrayList<>();
		persons.add(person);
		persons.add(new Person("ssssssss", "sssssssssssssssssssssssssssssssssssssssssssss"));
		System.out.println(JSON.toJSON(persons));

	}
}
