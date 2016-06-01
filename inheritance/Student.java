package com.xinpaninjava.inheritance;

/**
 * 继承体系第三层：学生类
 * 
 * 学生类多了一个方法：考试
 * 
 * 同时，学生在吃饭时还看书
 */
public class Student extends Person {
	public void exam() {
		System.out.println("考试……");
	}

	@Override
	public void eat() {

		super.eat();
		System.out.println("看书");
	}

	public Student() {
		super();
	}

}
