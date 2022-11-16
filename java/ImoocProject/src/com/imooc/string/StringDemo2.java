package com.imooc.string;

public class StringDemo2 {

	public static void main(String[] args) {
		// 定义一个字符串“JAVA编程基础，我喜欢java编程"
		String str = new String("JAVA编程基础，我喜欢java编程");
		// 查找字符A在第一次出现的位置
		System.out.println("A在第一次出现的位置" + str.indexOf('A'));
		// 查找子串"编程"中第一次出现的位置
		System.out.println("子串\"编程\"中第一次出现的位置" + str.indexOf("编程"));
		// 查找字符A在最后一次出现的位置
		System.out.println("字符A在最后一次出现的位置" + str.lastIndexOf('A'));
		// 查找子串"编程"在最后一次出现的位置
		System.out.println("子串\"编程\"在最后一次出现的位置" + str.lastIndexOf("编程"));
		// 在字符串index值为8的位置开始，查找子串"编程"在第一次出现的位置
		System.out.println("字符串index值为8的位置开始，查找子串\"编程\"在第一次出现的位置" + str.indexOf("编程", 8));
	}

}
