package com.imooc.string;

public class StringDemo2 {

	public static void main(String[] args) {
		// ����һ���ַ�����JAVA��̻�������ϲ��java���"
		String str = new String("JAVA��̻�������ϲ��java���");
		// �����ַ�A�ڵ�һ�γ��ֵ�λ��
		System.out.println("A�ڵ�һ�γ��ֵ�λ��" + str.indexOf('A'));
		// �����Ӵ�"���"�е�һ�γ��ֵ�λ��
		System.out.println("�Ӵ�\"���\"�е�һ�γ��ֵ�λ��" + str.indexOf("���"));
		// �����ַ�A�����һ�γ��ֵ�λ��
		System.out.println("�ַ�A�����һ�γ��ֵ�λ��" + str.lastIndexOf('A'));
		// �����Ӵ�"���"�����һ�γ��ֵ�λ��
		System.out.println("�Ӵ�\"���\"�����һ�γ��ֵ�λ��" + str.lastIndexOf("���"));
		// ���ַ���indexֵΪ8��λ�ÿ�ʼ�������Ӵ�"���"�ڵ�һ�γ��ֵ�λ��
		System.out.println("�ַ���indexֵΪ8��λ�ÿ�ʼ�������Ӵ�\"���\"�ڵ�һ�γ��ֵ�λ��" + str.indexOf("���", 8));
	}

}
