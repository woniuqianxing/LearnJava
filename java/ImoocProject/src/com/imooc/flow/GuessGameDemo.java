package com.imooc.flow;

import java.util.Scanner;
public class GuessGameDemo {

	public static void main(String[] args) {
		// ��������Ϸ
		int s =(int)(Math.random()*10+1);
		int guess=0;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("������1-10������:");
			guess = sc.nextInt();
			if (guess <s) {
				System.out.println("��С�ˣ������");
			}else if(guess > s) {
				System.out.println("�´��ˣ���С��");
			}
		}while(guess != s);
		System.out.println("�¶���"+guess);
	}

}
