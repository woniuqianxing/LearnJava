package com.imooc.method;

public class MethodDemo {

	public static void main(String[] args) {
		// 创建一个MethodDemo类的对象myMethodDemo
		MethodDemo myMethodDemo = new MethodDemo();
		// 使用对象名.方法名()去调用方法
		myMethodDemo.printStar();
		System.out.println("欢迎来到java的世界");
		myMethodDemo.printStar();
	}

	// 无参无返回值方法， 打印输出星号的方法
	public void printStar() {
		System.out.println("*******************");
	}

}
