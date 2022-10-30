package com.imooc.array;

public class ArrayDemo {

	public static void main(String[] args) {
		// 数组
		int[] intArray;
		String stringArray[];
		intArray = new int[10];
		stringArray = new String[3];
		float[] floatArray = new float[2];
		char[] ch = { 'a', 'b', '3' };
		System.out.println(ch.length);
		System.out.println(intArray[1]);
		System.out.println(stringArray[2]);
		System.out.println(floatArray[floatArray.length - 1]);
		for (int i = 0; i < 10; i++) {
			intArray[i] = i + 1;
		}
		System.out.print("数组intArray的值为：");
		for (int i = 0; i < 10; i++) {
			System.out.print(intArray[i] + "  ");
		}
	}

}
