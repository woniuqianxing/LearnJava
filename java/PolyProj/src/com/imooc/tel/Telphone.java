package com.imooc.tel;

/**
 * 原始手机
 * @author Lenovo
 *
 */
public class Telphone {
	private String brand;
	private int price;
	
	public Telphone() {
		
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	public void call() {
		System.out.println("打电话");
	}

}
