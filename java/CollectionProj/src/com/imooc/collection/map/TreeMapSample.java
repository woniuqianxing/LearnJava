package com.imooc.collection.map;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapSample {
	class RecordComparator implements Comparator<String> {

		@Override
		public int compare(String o1, String o2) {
			// TODO Auto-generated method stub
			return o2.compareTo(o1);
		}

	}

	public void sort() {
		Map<String, Object> student = new TreeMap<>(new RecordComparator());
		student.put("A1", "уехЩ");
		student.put("C3", 18);
		student.put("B5", 182);
		student.put("X1", 60);
		System.out.println(student);
	}

	public static void main(String[] args) {
		TreeMapSample sample = new TreeMapSample();
		sample.sort();
	}

}
