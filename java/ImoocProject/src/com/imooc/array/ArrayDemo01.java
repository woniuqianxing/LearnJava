package com.imooc.array;

import java.util.Scanner;

public class ArrayDemo01 {

	public static void main(String[] args) {
		// 求整型数组的累加和
		int[] intArray = new int[5];
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < intArray.length; i++) {
			System.out.println("请输入要加的5个数字：");
			int s = sc.nextInt();
			intArray[i] = s;
			sum = sum + intArray[i];
		}
		System.out.println("增强型for循环输出数据:");
		for (int n : intArray) {
			System.out.println(n + "  ");

		}
		System.out.println("和为:" + sum);

	}

}
