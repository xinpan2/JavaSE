package com.xinpaninjava.composition;

/**
 * ������ӣ���
 * 
 * ͨ���Գ������������Ķ������ã����������Car��
 */
public class Car {
	public Engine engine = new Engine();
	public Wheel[] wheel = new Wheel[4];
	public Door left = new Door(), right = new Door(); // 2-door

	public Car() {
		for (int i = 0; i < 4; i++)
			wheel[i] = new Wheel();
	}

	public static void main(String[] args) {
		Car car = new Car();
		car.left.window.rollup();
		car.wheel[0].inflate(72);
	}
}

/**
 * ������ӣ�����
 */
class Engine {
	public void start() {
	}

	public void rev() {
	}

	public void stop() {
	}
}

/**
 * ������ӣ���̥
 */
class Wheel {
	public void inflate(int psi) {
	}
}

/**
 * ������ӣ�����
 */
class Window {
	public void rollup() {
	}

	public void rolldown() {
	}
}

/**
 * ������ӣ�����
 */
class Door {
	public Window window = new Window();

	public void open() {
	}

	public void close() {
	}
}