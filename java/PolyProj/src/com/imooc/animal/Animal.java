package com.imooc.animal;

public class Animal {
	// ���ԣ��ǳơ�����
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

	// �������Զ���
	public void eat() {
		System.out.println("���ﶼ�гԶ���������");
	}
}
