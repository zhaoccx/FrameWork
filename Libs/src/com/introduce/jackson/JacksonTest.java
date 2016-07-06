/**
 * 
 */
package com.introduce.jackson;

import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.introduce.bean.Person;

/**
 * @author zhaocc 处理JSON
 */
public class JacksonTest {

	public static void main(String[] args) throws JsonProcessingException {
		// test jackson
		ObjectMapper mapper = new ObjectMapper();

		Person person = new Person("颖儿", "vb r dfdf");
		String asString = mapper.writeValueAsString(person);
		System.out.println(asString);

		List<Person> asList = Arrays.asList(person, new Person("sdfdfdfd", "sssssssssss"));
		String asString2 = mapper.writeValueAsString(asList);
		System.out.println(asString2);
	}

	public static void main2(String[] args) {
		// test fastjson
		// new JSONObject(new HashMap<>())
	}
}
