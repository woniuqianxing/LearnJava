package com.imooc.animal;

/**
 * 宠物猫类
 * 
 * @author W050000287
 *
 */
public class Cat {
	// 属性(成员属性)：昵称，年龄，体重，品种
	// 修改属性的可见性--private限定只能在当前类内访问
	private String name;
	private int month;
	private double weigth;
	private String species;

	public Cat() {
		System.out.println("我是无参构造方法");
	}

	// 创建get/set方法
	// 在get/set方法当中添加 对属性的限定
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return "我是一只名叫：" + this.name + "的宠物猫";
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if (month <= 0) {
			System.out.println("输入信息错误，宠物猫的年龄必须大于0");
		} else {
			this.month = month;
		}

	}

	public double getWeigth() {
		return weigth;
	}

	public void setWeigth(double weigth) {
		this.weigth = weigth;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public Cat(String name) {
		System.out.println("我是带参构造方法");
	}

	public Cat(String name, int month, double weigth, String species) {
		this.name = name;
		this.month = month;
		this.weigth = weigth;
		this.species = species;

	}

	// 方法(成员方法)：跑动，吃东西
	public void run() {
		System.out.println("小猫会跑");
	}

	public void run(String name) {
		System.out.println(name + "小猫会跑");
	}

	public void eat() {
		System.out.println("小猫吃鱼");
	}

}
