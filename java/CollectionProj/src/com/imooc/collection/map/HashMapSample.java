package com.imooc.collection.map;

import java.util.HashMap;

public class HashMapSample {

	public static void main(String[] args) {
		HashMap<String, Object> student = new HashMap();
		student.put("name", "����");
		String name = (String) student.put("name", "����");
		System.out.println(student);
		student.put("age", 18);
		student.put("height", 182);
		student.put("weight", 60);
		System.out.println(student);
		String n = (String) student.get("name");
		System.out.println(n);

		boolean r1 = student.containsKey("name");
		boolean r2 = student.containsValue(60);
		System.out.println(r1);
		System.out.println(r2);

		int count = student.size();
		System.out.println(count);

		Integer w = (Integer) student.remove("weight");
		System.out.println(w);
		System.out.println(student);

	}

}
