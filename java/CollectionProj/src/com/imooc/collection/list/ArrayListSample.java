package com.imooc.collection.list;

import java.util.ArrayList;

public class ArrayListSample {
	public static void main(String[] args) {
		ArrayList<String> str = new ArrayList<String>();
		// ctrl+shift+�س��Զ����ӽ�β�ֺţ��еĻ��Զ�����
		str.add("���μ�");
		str.add("��������");
		System.out.println(str);
		String bookname = str.get(1);
		System.out.println(bookname);
//		System.out.println(str.get(10));
		str.add(1, "��¥��");
		System.out.println(str);
		boolean result = str.add("ˮ䰴�");
		System.out.println(result);
		String before = str.set(3, "ˮ䰴���");
		System.out.println(str);
		System.out.println(before);
		boolean result2 = str.remove("ˮ䰴���");
		System.out.println(result2);
		String result3 = str.remove(0);
		System.out.println(str);
		System.out.println(result3);
		System.out.println(str.size());
		str.set(str.size() - 1, "��������");
		System.out.println(str);
	}

}