package com.imooc.collection.list;

import java.util.LinkedList;

public class LinkedListSample {

	public static void main(String[] args) {
		LinkedList<String> bookList = new LinkedList<String>();
		bookList.add("��������");
		bookList.add(0, "ˮ䰴�");
		bookList.add("���μ�");
		bookList.add("��¥��");
		System.out.println(bookList);
		bookList.addFirst("��ҵ����");
		bookList.addLast("�ƽ�ʱ��");
		System.out.println(bookList);

	}

}