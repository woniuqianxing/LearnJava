package com.imooc.people;

public class PeopleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person lili = new Person();
		lili.age = 12;

		// ��ȡ�ڲ������ʵ������ʽ1��new�ⲿ��.new �ڲ���
		Person.Heart myHeart = new Person().new Heart();
		System.out.println(myHeart.beat());

		// ��ȡ�ڲ������ʵ������ʽ2���ⲿ�����.new �ڲ���
		myHeart = lili.new Heart();
		System.out.println(myHeart.beat());

		// ��ȡ�ڲ������ʵ������ʽ3���ⲿ�����.��ȡ����
		myHeart = lili.getHeart();
		System.out.println(myHeart.beat());
	}

}