package com.imooc.people;

//�ⲿ��
public class Person {
	public int age;

	public Heart getHeart() {
		return new Heart();
	}

	public void eat() {
		System.out.println("�˻�Զ���");
	}

	/*
	 * ��Ա�ڲ���: 1.�ڲ������ⲿʹ��ʱ���޷�ֱ��ʵ��������Ҫ�����ⲿ����Ϣ�������ʵ���� 2.�ڲ���ķ������η����������⣬���Ƿ��ʷ�Χ���ܵ�Ӱ��
	 */
	public class Heart {
		int age = 13;

		public String beat() {
			eat();
			return age + "����������";
		}
	}
}
