package com.imooc.test;

public class TryDemoFive {

	public static void main(String[] args) {
		try {
			testThree();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void testOne() throws HotelAgeException {
		throw new HotelAgeException();
	}

	public static void testTwo() throws Exception {
		try {
			testOne();
		} catch (HotelAgeException e) {
			throw new Exception("我是新产生的异常1");
		}
	}

	public static void testThree() throws Exception {
		try {
			testTwo();
		} catch (Exception e) {
			throw new Exception("我是新产生的异常2");
		}
	}

}
