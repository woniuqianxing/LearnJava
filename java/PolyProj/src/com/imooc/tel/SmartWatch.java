package com.imooc.tel;

public class SmartWatch implements INet, IPhoto {
	public static final int TEMP = 30;

	public void call() {
		System.out.println("�����ֱ���Դ�绰");
	}

	public void message() {
		System.out.println("�����ֱ���Է�����");
	}

	@Override
	public void network() {
		System.out.println("�����ֱ��������");
	}

	@Override
	public void photo() {
		// TODO Auto-generated method stub

	}

	@Override
	public void connection() {
		System.out.println("SmartWatch�е�connection����");
	}

}
