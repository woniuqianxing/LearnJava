package com.imooc.pt;

import java.util.ArrayList;
import java.util.List;

public class PtMethod {

	// ��Ϊ��ǰ�ķ��ͷ�������Χ���η������Ӷ�Ӧ�ķ��ͣ�����Ҫʹ�÷��͵ĵط������������������Ϊ��������ĵط����涨�˷��͵�����
	// �����Ƿ���ֵ�ĵط��ͷ��ͱ���һ��
	public <T> List<T> transferToList(T[] array) {
		List<T> list = new ArrayList();
		for (T item : array) {
			list.add(item);
		}
		return list;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PtMethod ptMethod = new PtMethod();
		String[] array = new String[] { "A", "B", "C", "D", "E" };
		List<String> list = ptMethod.transferToList(array);
		System.out.println(list);
	}

}