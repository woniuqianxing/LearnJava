package com.imooc.jdk9;

//私有接口方法
public interface Sample01 {
	default  void showInfo() {
		System.out.println("基本信息");
		System.out.println("IP地址："+getIp());
	}
	default  void showDetail() {
		System.out.println("详细信息");
		System.out.println("IP地址："+getIp());
	}
	
	2 usages
	private String getIp() {
		return "192.168.1.30";
	}
}
