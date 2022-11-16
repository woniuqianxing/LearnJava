package com.imooc.collection.map;

import java.util.LinkedHashMap;

public class LinkedHashMapSample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<String, Object> student = new LinkedHashMap<>();
		student.put("name", "ÕÅÈı");
		student.put("age", 18);
		student.put("height", 182);
		student.put("weight", 60);
		System.out.println(student);
	}

}
