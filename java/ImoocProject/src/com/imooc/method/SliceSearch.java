package com.imooc.method;

import java.util.Scanner;

public class SliceSearch {

	public boolean arraySearch(int n, int[] sn) {
		boolean flag = false;
		for (int i = 0; i < sn.length; i++) {
			if (sn[i] == n) {
				flag = true;
				break;
			}
		}
		return flag;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 10, 23, 56, 75, 89 };
		System.out.println("������Ҫ��ѯ��ֵ��");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		SliceSearch sliceSearch = new SliceSearch();
		boolean flag = sliceSearch.arraySearch(n, arr);
		if (flag) {
			System.out.println("�ҵ���");
		} else {
			System.out.println("û�ҵ�");
		}
	}

}
