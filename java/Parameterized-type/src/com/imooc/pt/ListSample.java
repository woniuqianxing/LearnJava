package com.imooc.pt;

import java.util.ArrayList;

public class ListSample {

	public void sample1() {
		ArrayList bookList = new ArrayList();
		bookList.add("��������");
		bookList.add("ˮ䰴�");
		bookList.add(3.1415926f);
		Object o1 = bookList.get(0);
		String obj = (String) o1;
		System.out.println(obj.substring(0, 1));
		String obj2 = obj;
		System.out.println(obj2.substring(0, 1));
	}

	public void sample2() {
		ArrayList<String> bookList = new ArrayList();
		bookList.add("��������");
		bookList.add("ˮ䰴�");
//		bookList.add(3.1415926f);
		String bookname1 = bookList.get(0);
		System.out.println(bookname1.substring(0, 1));
		Object o2 = bookList.get(2);
		String bookname2 = (String) o2;
		System.out.println(bookname2.substring(0, 1));
	}

	public static void main(String[] args) {
		ListSample listSample = new ListSample();
		listSample.sample1();
	}

}