package com.imooc.flow;

public class CharDemo {

	public static void main(String[] args) {
		// 循环输出26个英文字母，分两行输出
		char ch = 'a';
		int count = 1;
		while (ch <= 'z') {
			System.out.print(ch);

			if (count % 13 == 0) {
				System.out.println();
			}
			count++;
			ch++;
		}

	}

}
