package com.imooc.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListLoopSample {

	public static void main(String[] args) {
		List<String> bookList = new ArrayList<String>();
		bookList.add("��������");
		bookList.add(0, "ˮ䰴�");
		bookList.add("���μ�");
		bookList.add("��¥��");

		for (String book : bookList) {
			System.out.println(book);
		}
		bookList.forEach(book -> {
			System.out.println(book);
		});

		Iterator<String> itr = bookList.iterator();
		while (itr.hasNext()) {
			String book = itr.next();// ��ȡ����һ��Ԫ�أ�ͬʱ��ָ��������ƶ�
			System.out.println(book);
		}

	}

}