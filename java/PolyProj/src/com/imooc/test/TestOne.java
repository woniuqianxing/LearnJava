package com.imooc.test;

interface One {
	static int x = 11;
}

interface Two {
	final int x = 22;
}

class Three {
	public int x = 33;
}

public class TestOne implements One, Two {
	public void test() {
		System.out.println(One.x);
		System.out.println(Two.x);

	}

	public static void main(String[] args) {
		new TestOne().test();
	}
}
