package com.xinpaninjava.inheritance;

/**
 * 继承体系的第二层：人 第一层默认是Object
 * 
 * 在这个类中定义简单的方法：sleep、eat
 * 
 * 以及4个基本属性：年龄-age、身份证号-id、名字-name、性别-gender
 * 
 */
public class Person {
	private int age;
	private int id;
	private String name;
	private String gender;

	public void sleep() {
		System.out.println("sleep……");
	}

	public void eat() {
		System.out.println("eat...");
	}

	// 空参构造方法
	public Person() {
		super();
	}

	// --------------------getter&setter---------------
	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

}
