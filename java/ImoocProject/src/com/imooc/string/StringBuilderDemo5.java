package com.imooc.string;

public class StringBuilderDemo5 {

	public static void main(String[] args) {
		// 定义一个字符串,"你好"
		StringBuilder str = new StringBuilder("你好");
		// 在你好后面添加内容，将字符串变成"你好，imooc"
//		str.append(',');
//		str.append("imooc");
//		System.out.println("str=" + str);
		System.out.println("str=" + str.append(',').append("imooc"));

		// 将字符串变成"你好，IMOOC"
		/**
		 * 两种方法： 1.先用delete删除mooc,然后再插入MOOC 2.使用replace直接替换
		 */
//		System.out.println("替换后" + str.delete(4, 8).insert(4, "MOOC"));
		System.out.println("替换后" + str.replace(4, 8, "MOOC"));
		// 在字符串,"你好，imooc"中取出你好并输出
		System.out.println("替换后" + str.substring(0, 2));
	}

}
