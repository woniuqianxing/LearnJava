package com.imooc.array;

import java.util.Scanner;

public class ArrayDemo01 {

	public static void main(String[] args) {
		// ������������ۼӺ�
		int[] intArray = new int[5];
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < intArray.length; i++) {
			System.out.println("������Ҫ�ӵ�5�����֣�");
			int s = sc.nextInt();
			intArray[i] = s;
			sum = sum + intArray[i];
		}
		System.out.println("��ǿ��forѭ���������:");
		for (int n : intArray) {
			System.out.println(n + "  ");

		}
		System.out.println("��Ϊ:" + sum);

	}

}
