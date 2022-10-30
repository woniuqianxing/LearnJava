package com.imooc.operator;

public class ComditionDemo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=4,b=7;
		int max;
		if(a >b) {
			max=a;
		}else {
			max=b;
		}
		System.out.println(max+"=max");
		max=a>b?a:b;
		System.out.println(max+"=max");
	}

}
