package com.imooc.string;

import java.io.UnsupportedEncodingException;

public class StringDemo3 {

	public static void main(String[] args) throws UnsupportedEncodingException {
		// �ַ�����byte����֮����໥ת��
		// ����һ���ַ���
		String str = new String("JAVA ��� ����");
		// ���ַ���ת��ΪByte���飬����ӡ���
		byte[] arrs = str.getBytes("UTF-8");
		for (int i = 0; i < arrs.length; i++) {
			System.out.print(arrs[i] + "  ");
		}
		System.out.println();
		// ��Byte����ת��Ϊ�ַ���������ӡ���
		String str1 = new String(arrs, "UTF-8");
		System.out.println(str1);
	}

}