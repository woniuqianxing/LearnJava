package com.imooc.flow;

public class PlusDemo {

	public static void main(String[] args) {
		// 求1-5的累加和
		int n = 1;
		int sum =0;
		while(n<6) {
			sum=sum+n;
			n++;
		}
		System.out.println("1-5的和是"+sum);

	}

}
