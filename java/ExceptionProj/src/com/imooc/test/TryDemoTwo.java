package com.imooc.test;

import java.util.Scanner;

public class TryDemoTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int result = test();
		System.out.println(result);
	}

	public static int test() {
		Scanner input = new Scanner(System.in);
		System.out.println("===========���㿪ʼ===========");
		try {
			System.out.print("�������һ��������");
			int one = input.nextInt();
			System.out.print("������ڶ���������");
			int two = input.nextInt();
			return one / two;

		} catch (ArithmeticException e) {
			System.exit(1);
			System.out.println("����������Ϊ0");
			e.printStackTrace();// ����ʲôλ�ó���
			return 0;
		} finally {
			System.out.println("===========�������===========");
			return -100000;
		}
	}

}
