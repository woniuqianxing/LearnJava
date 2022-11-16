package com.imooc.people;

//外部类
public class Person {
	public int age;

	public Heart getHeart() {
		return new Heart();
	}

	public void eat() {
		System.out.println("人会吃东西");
	}

	/*
	 * 成员内部类: 1.内部类在外部使用时，无法直接实例化，需要借由外部类信息才能完成实例化 2.内部类的访问修饰符，可以任意，但是访问范围会受到影响
	 */
	public class Heart {
		int age = 13;

		public String beat() {
			eat();
			return age + "心脏在跳动";
		}
	}
}
