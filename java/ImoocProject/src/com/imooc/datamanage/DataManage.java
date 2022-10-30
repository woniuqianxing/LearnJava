package com.imooc.datamanage;

import java.util.Scanner;

public class DataManage {
	/*
	 * 从键盘接收数据存放到数组中，并对数据中的数据进行管理 功能： 1.插入数据 2.显示所有数据 3.在指定位置处插入数据 4.查询被3整除的数据
	 */
	public int[] insertDate() {
		// 数组长度不能动态变化，所以必须指定数组长度
		int[] s = new int[10];
		Scanner sc = new Scanner(System.in);
		// 少接收一个数据，为在指定位置处插入数据做准备
		for (int i = 0; i < s.length - 1; i++) {
			System.out.println("请输入第:" + (i + 1) + "个数据：");
			try {
				s[i] = sc.nextInt();
			} catch (java.util.InputMismatchException e) {
				System.out.println("输入的数据格式有问题，不得有非数字");
				sc.next();
				i--;
			}

		}
		return s;

	}

	// 显示数组中元素的内容
	public void showData(int[] a, int length) {
		for (int i = 0; i < length; i++) {
			System.out.println(a[i] + "  ");
		}
		System.out.println();
	}

	// 从键盘接收一个数据插入到数据的指定位置处，a要插入的数组，n要插入的数据，k要插入的位置从0开始
	public void insertAtArray(int[] a, int n, int k) {
		for (int i = a.length - 1; i > k; i--) {
			a[i] = a[i - 1];
		}
		a[k] = n;
	}

	// 输出数组中能被3整除的元素
	public void divThree(int[] a) {
		String str = "";
		int count = 0;
		for (int n : a) {
			if (n % 3 == 0) {
				str = str + n + " ";
				count++;
			}
		}
		if (count == 0) {
			System.out.println("数组中没有被3整除的元素");
		} else {
			System.out.println("数组中能被3整除的元素" + str);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataManage dm = new DataManage();
		int[] a = dm.insertDate();
		dm.showData(a, a.length - 1);
		dm.showData(a, a.length);
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入要插入的数据:");
		int n = sc.nextInt();
		System.out.println("请输入要插入的位置:");
		int k = sc.nextInt();
		dm.insertAtArray(a, n, k);
		dm.showData(a, a.length);
		dm.divThree(a);
	}
}