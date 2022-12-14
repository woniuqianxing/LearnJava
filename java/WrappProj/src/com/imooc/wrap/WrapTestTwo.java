package com.imooc.wrap;

public class WrapTestTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 基本数据类型转换为字符串
		int t1 = 2;
		String t2 = Integer.toString(t1);

		// 测试
		System.out.println("int类型转换为字符串=" + t2);

		// 字符串转换为基本数据类型
		// 1.包装类的parse；
		int t3 = Integer.parseInt(t2);
		// 1.包装类的valueOf 先将字符串转换为包装类，再通过自动拆箱完成基本类型转换；
		int t4 = Integer.valueOf(t2);
		// 测试
		System.out.println("String类型转换为基本数据类型t3=" + t3);
		System.out.println("String类型转换为基本数据类型t4=" + t4);
	}

}
