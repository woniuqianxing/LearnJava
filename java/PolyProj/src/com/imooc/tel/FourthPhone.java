package com.imooc.tel;

public class FourthPhone extends ThreePhone implements IPhoto, INet {
	@Override
	public void photo() {
		System.out.println("手机可以拍照");
	}

	public void netWork() {
		System.out.println("手机可以上网");
	}

	public void game() {
		System.out.println("手机可以玩游戏");

	}

	@Override
	public void network() {
		// TODO Auto-generated method stub

	}

}
