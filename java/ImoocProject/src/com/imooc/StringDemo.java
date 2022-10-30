package com.imooc;

public class StringDemo {

	public static void main(String[] args) {
		// 字符串变量
		String s="";
		System.out.println(s);
		String s2="abc";
		System.out.println(s2);
		//定义包含unicode字符的字符串
		String s3="\u005d\u005f";
		System.out.println(s3);
		//定义包含unicode+字符的字符串
		String s4="A\u005d\u005fB";
		System.out.println(s4);

	}

}
