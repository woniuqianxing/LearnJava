package com.imooc.jdk9;

//˽�нӿڷ���
public interface Sample01 {
	default  void showInfo() {
		System.out.println("������Ϣ");
		System.out.println("IP��ַ��"+getIp());
	}
	default  void showDetail() {
		System.out.println("��ϸ��Ϣ");
		System.out.println("IP��ַ��"+getIp());
	}
	
	2 usages
	private String getIp() {
		return "192.168.1.30";
	}
}
