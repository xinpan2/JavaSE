package com.xinpaninjava.inheritance;

/**
 * �̳���ϵ�ĵڶ��㣺�� ��һ��Ĭ����Object
 * 
 * ��������ж���򵥵ķ�����sleep��eat
 * 
 * �Լ�4���������ԣ�����-age�����֤��-id������-name���Ա�-gender
 * 
 */
public class Person {
	private int age;
	private int id;
	private String name;
	private String gender;

	public void sleep() {
		System.out.println("sleep����");
	}

	public void eat() {
		System.out.println("eat...");
	}

	// �ղι��췽��
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
