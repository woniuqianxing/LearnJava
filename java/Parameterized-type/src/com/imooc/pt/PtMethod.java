package com.imooc.pt;

import java.util.ArrayList;
import java.util.List;

public class PtMethod {

	// 作为当前的泛型方法，范围修饰符后增加对应的泛型，在需要使用泛型的地方进行替代，尤其是作为参数输入的地方，规定了泛型的类型
	// 尤其是返回值的地方和泛型保持一致
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
