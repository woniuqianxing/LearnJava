package com.imooc.collection.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetSample {

	public static void main(String[] args) {
		Set<String> mobileSet = new LinkedHashSet<String>();
		mobileSet.add("11111");
		mobileSet.add("22222");
		mobileSet.add("3333");
		System.out.println(mobileSet);
		boolean isChanged = mobileSet.add("3333");
		System.out.println(isChanged);

	}

}
