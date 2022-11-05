package com.imooc.animal;

public class Master {
	/**
	 * 喂宠物 喂猫咪：吃完东西后，主人会带着去玩线球 喂狗狗：吃完东西后，主人会带着狗狗去睡觉
	 */

	// 方案1：传入不同类型的动物，调用各自的方法
//	public void feed(Cat cat) {
//		cat.eat();
//		cat.playball();
//	}
//
//	public void feed(Dog dog) {
//		dog.eat();
//		dog.sleep();
//	}

	// 方案2：编写方法穿入动物的父类，然后通过类型转换，调用指定子类的方法
	public void feed(Animal obj) {
		if (obj instanceof Cat) {
			Cat temp = new Cat();
			temp.eat();
			temp.playball();
		} else if (obj instanceof Dog) {
			Dog temp = new Dog();
			temp.eat();
			temp.sleep();
		}
	}

	/**
	 * 饲养何种动物 空闲时间多：养狗狗 空闲时间不多：养猫咪
	 */
	// 方案1
//	public Dog hasManyTime() {
//		System.out.println("主任休闲时间比较充足，适合养狗狗");
//		return new Dog();
//	}
//
//	public Cat hasLittleTime() {
//		System.out.println("主任比较忙碌，适合养猫咪");
//		return new Cat();
//	}

	// 方案2
	public Animal raise(boolean isManyTime) {
		if (isManyTime) {
			System.out.println("主人休息时间比较充足，适合养狗狗");
			return new Dog();
		} else {
			System.out.println("主任比较忙碌，适合养猫咪");
			return new Cat();
		}
	}
}
