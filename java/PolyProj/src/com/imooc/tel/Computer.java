package com.imooc.tel;

public abstract class Computer implements INet {
	public void game() {
		System.out.println("���Կ�������Ϸ");
	}

	public void vedio() {
		System.out.println("���Կ����濴��Ƶ");
	}

	public void music() {
		System.out.println("���Կ���������");
	}

	@Override
	public void network() {
		// TODO Auto-generated method stub
		System.out.println("���Կ�������");
	}
}
