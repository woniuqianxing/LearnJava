package com.imooc.flow;

public class StarDemo {

	public static void main(String[] args) {
		// 嵌套循环
		int m = 1;
		int n = 1;
		System.out.println("输出4行4列的型号：");
		while (m <= 4) {
			n = 1;
			while (n <= 4) {
				System.out.print("*");
				n++;
			}
			System.out.println();
			m++;
		}

	}

}
