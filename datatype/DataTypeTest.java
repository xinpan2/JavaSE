package com.xinpaninava.datatype;

/**
 * 默认数据类型转换的测试类
 */
public class DataTypeTest {

	public static void main(String[] args) {
		// 在范围内
		byte byte1 = 100;

		// 在范围外，编译器报错，要求强制转换
		// byte byte2 = 128;

		// int to long
		// 在范围内 1 billion
		long long1 = 1000000000;

		// 在范围外 10 billion
		// long long2=10000000000;

		// 修改后再范围外：
		long long3 = 10000000000L;
	}

}
