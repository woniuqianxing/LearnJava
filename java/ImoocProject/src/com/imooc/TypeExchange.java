package com.imooc;

public class TypeExchange {

	public static void main(String[] args) {
		// ǿ������ת��
		char c = (char)65536;
		int n;
		n=c;//��ʽ����ת��
		c=(char)n;
		
		int x=100;
		long y = x;
		x=(int)y;
		float f=10000000000000L;
		System.out.println(f);

	}

}
