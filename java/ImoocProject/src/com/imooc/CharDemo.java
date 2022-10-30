package com.imooc;

public class CharDemo {

	public static void main(String[] args) {
		// 字符定义
		char c = 'a';
		System.out.println(c);
		char f = 65;
		//如果字面值超出char类型所表示的数据范围，需要进行强制类型转换
		char ch1=(char)65536;
		System.out.println(f);
		System.out.println(ch1);
		//定义变量存放unicode编码标识字符
		char ch2 ='\u005d';
		System.out.println(ch2);
		

	}

}
