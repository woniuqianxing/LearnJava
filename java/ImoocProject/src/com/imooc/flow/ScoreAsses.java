package com.imooc.flow;

import java.util.Scanner;

public class ScoreAsses {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("������ɼ�:");
		Scanner sc = new Scanner(System.in);
		int score = sc.nextInt();
		if (score >= 90) {
			System.out.println("��");
		}else if (score >= 80) {
			System.out.println("��");
		}else if (score >= 60) {
			System.out.println("��");
		}else{
			System.out.println("��");
		}

	}

}
