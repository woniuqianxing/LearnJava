package com.imooc.collection.set;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetSample {
	class IntegerComparator implements Comparator<Integer> {

		@Override
		public int compare(Integer o1, Integer o2) {
			// TODO Auto-generated method stub
			return o1 - o2;// ÉýÐò
		}
	}

	public void sort() {
		Set<Integer> mobileSet = new TreeSet<Integer>(new IntegerComparator());
		mobileSet.add(11111);
		mobileSet.add(22222);
		mobileSet.add(3333);
		System.out.println(mobileSet);
	}

	public static void main(String[] args) {

		new TreeSetSample().sort();

	}

}
