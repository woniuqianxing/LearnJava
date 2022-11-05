package com.imooc.animal;

public class Anaimal {
	/**
	 * private 只允许在本类中进行访问 public:允许在任意位置访问 protected:当前类、同包子类/非子类、挎包子类调用、挎包非子类不允许
	 * 默认：允许当前类，同包子类调用正常，挎包子类不允许调用
	 */
//	 动物共性：昵称，月份、品种
	private String name;
	protected int month;
	String species;
	public int temp = 15;
	private static int st1 = 22;
	public static int st2 = 23;

	static {
		System.out.println("我是父类的静态代码块");
	}
	{
		System.out.println("我是父类的构造代码块");
	}

	// 父类的构造方法不允许被继承，不允许重写，但是会影响子类对象的实例化
	public Anaimal() {
		System.out.println("我是父类的无参构造方法");
	}

	public Anaimal(String name, int month) {
		this.name = name;
		this.month = month;
		System.out.println("我是父类的有参构造方法");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}

	public void eat() {
		System.out.println(this.getName() + "吃东西");
	}

	public void eat(String name) {
		System.out.println(name + "吃东西");
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}
		Anaimal temp = (Anaimal) obj;
		if (this.getName().equals(temp.getName()) && (this.getMonth() == temp.getMonth()))
			return true;
		else
			return false;
	}

	public boolean equals(Anaimal obj) {
		if (obj == null) {
			return false;
		}
		if (this.getName().equals(obj.getName()) && (this.getMonth() == obj.getMonth()))
			return true;
		else
			return false;
	}

	@Override
	public String toString() {
		return "昵称" + this.getName() + "年龄" + this.getMonth();
	}

	public void jump() {
		System.out.println("跳跃是一种本能");
	}
}
