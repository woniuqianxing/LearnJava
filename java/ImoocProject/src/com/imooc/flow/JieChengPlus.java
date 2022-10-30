package com.imooc.flow;

public class JieChengPlus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s = 1, sum = 0;
		for (int j = 1; j <= 4; j++) {
			s = 1;
			for (int i = 1; i <= j; i++) {
				s = s * i;
			}
			sum = sum + s;
		}
		System.out.println("1!+2!+3!+4...+10!=" + sum);
	}

}
