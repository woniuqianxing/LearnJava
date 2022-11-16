package com.imooc.test;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryDemoOne {

	public static void main(String[] args) {
		/*
		 * // 定义两个整数，输出两数之商
		 * 
		 * int a = 10; int b = 20; System.out.println(b / a);
		 */
		// 定义两个整数，接受用户的键盘输入，输出两数之商
		Scanner input = new Scanner(System.in);
		System.out.println("===========运算开始===========");
		try {
			System.out.print("请输入第一个整数：");
			int one = input.nextInt();
			System.out.print("请输入第二个整数：");
			int two = input.nextInt();
			System.out.println(one / two);
		} catch (ArithmeticException e) {
			System.exit(1);
			System.out.println("除数不允许为0");
			e.printStackTrace();// 告诉什么位置出错
		} catch (InputMismatchException e) {
			System.out.println("请输入整数");
			e.printStackTrace();// 告诉什么位置出错
		} finally {
			System.out.println("===========运算结束===========");
		}
	}

}
