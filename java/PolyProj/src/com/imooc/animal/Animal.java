package com.imooc.animal;

public class Animal {
	// 属性：昵称、年龄
	private String name;
	private int month;

	public Animal() {
	}

	public Animal(String name, int month) {
		this.name = name;
		this.month = month;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	// 方法：吃东西
	public void eat() {
		System.out.println("动物都有吃东西的能力");
	}
}
