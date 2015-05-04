package cn.javass.chapter2.web.controller;

import java.util.Date;

public class Student {

	private int age;
	private String name;
	private Date date;
	private int hight;
	private int weight;

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getHight() {
		return hight;
	}

	public void setHight(int hight) {
		this.hight = hight;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public Student() {
		super();
	}

	public Student(int age, String name, Date date, int hight, int weight) {
		super();
		this.age = age;
		this.name = name;
		this.date = date;
		this.hight = hight;
		this.weight = weight;
	}

	@SuppressWarnings("deprecation")
	@Override
	public String toString() {
		return "Student [age=" + age + ", name=" + name + ", date=" + date.toLocaleString() + ", hight=" + hight + ", weight=" + weight + "]";
	}
	// public static void main(String[] args) {
	// Student aStudent = new Student(34, "zhao", new Date(), 175, 56);
	// List<String> list = new ArrayList<String>();
	// list.add("aaaaaaaaaaaaaaaa");
	// list.add("bbbbbbbbbbbbbb");
	// System.out.println(list.toString());
	// System.out.println(aStudent);
	// list.toString();
	// }
}
