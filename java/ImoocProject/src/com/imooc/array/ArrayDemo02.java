package com.imooc.array;

public class ArrayDemo02 {

	public static void main(String[] args) {
		// 求数组元素的最大值
		int[] a = { 52, 36, 89, 12, 53 };
		int max = a[0];
		for (int i = 1; i < a.length; i++) {
			if (max <= a[i]) {
				max = a[i];
			}
		}

		System.out.println("最大值为：" + max);

	}

}
