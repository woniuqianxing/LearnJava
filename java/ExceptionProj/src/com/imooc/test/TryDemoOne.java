package com.imooc.test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryDemoOne {

	public static void main(String[] args) {
		/*
		 * // ���������������������֮��
		 * 
		 * int a = 10; int b = 20; System.out.println(b / a);
		 */
		// �������������������û��ļ������룬�������֮��
		Scanner input = new Scanner(System.in);
		System.out.println("===========���㿪ʼ===========");
		try {
			System.out.print("�������һ��������");
			int one = input.nextInt();
			System.out.print("������ڶ���������");
			int two = input.nextInt();
			System.out.println(one / two);
		} catch (ArithmeticException e) {
			System.exit(1);
			System.out.println("����������Ϊ0");
			e.printStackTrace();// ����ʲôλ�ó���
		} catch (InputMismatchException e) {
			System.out.println("����������");
			e.printStackTrace();// ����ʲôλ�ó���
		} finally {
			System.out.println("===========�������===========");
		}
	}

}
