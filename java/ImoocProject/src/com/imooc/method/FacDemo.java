package com.imooc.method;

public class FacDemo {
	// 带参有返回值的方法
	public int fac(int n) {
		int s = 1;
		for (int i = 1; i <= n; i++) {
			s *= i;
		}
		return s;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FacDemo facDemo = new FacDemo();
		int fac = facDemo.fac(3);
		System.out.println(fac);
		int sum = 0;
		for (int i = 1; i <= 5; i++) {
			fac = facDemo.fac(i);
			sum = sum + fac;
		}
		System.out.println("1!+2!+3!...+5!=" + sum);
	}

}
