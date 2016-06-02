package com.xinpaninjava.datatype;

/**
 * 默认数据类型转换的测试类
 */
public class DataTypeTest {

	public static void main(String[] args) {
		// 在范围内
		byte byte1 = 100;

		// 在范围外，编译器报错，要求强制转换
		// byte byte2 = 128;

		// int to char
		// 在范围内
		char c1 = 65535;

		// 在范围外,报错
		// char c2=65536;
		// char c3=-1;

		// int to long
		// 在范围内 1 billion
		long long1 = 1000000000;

		// 在范围外 10 billion
		// long long2=10000000000;

		// 修改后再范围外：
		long long3 = 10000000000L;

		// long的取值范围
		System.out.println("long的取值范围为： " + Long.MIN_VALUE + " ~ "
				+ Long.MAX_VALUE);
		// float的表示范围
		System.out.println("float的取值范围为： " + Float.MIN_VALUE + " ~ "
				+ Float.MAX_VALUE);

		// 把long赋值给float
		float f1 = long3;

		// 把float赋值给long,编译出错
		// long long4=f1;

	}

}

