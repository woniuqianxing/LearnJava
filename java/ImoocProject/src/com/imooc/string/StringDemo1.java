package com.imooc.string;

public class StringDemo1 {

	public static void main(String[] args) {
		// ����һ���ַ�����JAVA��̻���"
		String str = "JAVA ��� ����";
		// ��ӡ����ַ����ĳ���
		System.out.println("�ַ����ĳ����ǣ�" + str.length());

		// charAt(int index),ȡ���ַ��̲����
		System.out.println("�ַ���" + str.charAt(6));

		// ȡ���ִ�"��̻���"�����
		System.out.println("�ַ���" + str.substring(5));

		// ȡ���ִ�"���"�����
		System.out.println("�ַ���" + str.substring(5, 7));
	}

}