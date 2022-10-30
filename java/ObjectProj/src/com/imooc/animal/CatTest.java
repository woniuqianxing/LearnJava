package com.imooc.animal;

public class CatTest {
	public static void main(String[] args) {
		// 对象实例化
		Cat one = new Cat("花花");
		Cat two = new Cat();
		Cat three = new Cat("花花", 2, 10, "英国短毛猫");
		// 测试
		one.eat();
		one.run();
		one.setMonth(-13);
		one.setName("花花");
		System.out.println("年龄" + one.getMonth());
		System.out.println("名称" + one.getName());
		System.out.println("品种" + one.getSpecies());
		System.out.println("体重" + one.getWeigth());
		one.run(one.getName());
		System.out.println("年龄" + three.getMonth());
		System.out.println("名称" + three.getName());
		System.out.println("品种" + three.getSpecies());
		System.out.println("体重" + three.getWeigth());
	}
}
