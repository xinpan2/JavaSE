package com.xinpaninjava.composition;

/**
 * 组合例子：车
 * 
 * 通过对车中其他部件的对象引用，来方便理解Car类
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
 * 组合例子：引擎
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
 * 组合例子：轮胎
 */
class Wheel {
	public void inflate(int psi) {
	}
}

/**
 * 组合例子：窗户
 */
class Window {
	public void rollup() {
	}

	public void rolldown() {
	}
}

/**
 * 组合例子：车门
 */
class Door {
	public Window window = new Window();

	public void open() {
	}

	public void close() {
	}
}