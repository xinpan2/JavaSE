package com.xinpaninjava.inheritance;

/**
 * �̳���ϵ�����㣺ѧ����
 * 
 * ѧ�������һ������������
 * 
 * ͬʱ��ѧ���ڳԷ�ʱ������
 */
public class Student extends Person {
	public void exam() {
		System.out.println("���ԡ���");
	}

	@Override
	public void eat() {

		super.eat();
		System.out.println("����");
	}

	public Student() {
		super();
	}

}
