package com.imooc.collection.map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class LoopSample {
	public void doForLoop(Map map) {
		Set<String> key = map.keySet();
		for (String k : key) {
			System.out.println(map.get(k));
		}
	}

	public void doForEach(Map map) {
		map.forEach((key, value) -> {
			System.out.println(key);
		});
	}

	public void doIterator(Map map) {
		Iterator<Map.Entry<String, Object>> itr = map.entrySet().iterator();
		while (itr.hasNext()) {
			Map.Entry<String, Object> entry = itr.next();
			System.out.println(entry.getKey() + entry.getValue());
		}
	}

	public static void main(String[] args) {
		Map<String, Object> student = new HashMap<>();
		student.put("A1", "����");
		student.put("C3", 18);
		student.put("B5", 182);
		student.put("X1", 60);
		System.out.println(student);

		LoopSample loopSample = new LoopSample();
		loopSample.doForLoop(student);
		loopSample.doForEach(student);
	}

}
