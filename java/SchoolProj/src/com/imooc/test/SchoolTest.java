package com.imooc.test;

import com.imooc.model.Student;
import com.imooc.model.Subject;

public class SchoolTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 测试Subject
		Subject sub1 = new Subject("计算机科学应用", "S0001", 4);
		System.out.println(sub1.info());
		System.out.println("===================");

		Student stu1 = new Student("张三", "J0001", 18, "同性", sub1);
		System.out.println(stu1.introduction());
		System.out.println("===================");

		Student stu2 = new Student("李四", "J0002", 20, "女");
		System.out.println(stu2.introduction("计算机科学与应用", 4));
		System.out.println("===================");

		Student stu3 = new Student("王五", "J0003", 24, "男");
		System.out.println(stu3.introduction(sub1));
		System.out.println("===================");
//测试指定到底有多少学生报名
		sub1.addStudent(stu1);
		sub1.addStudent(stu2);
		sub1.addStudent(stu3);
		System.out.println(sub1.getSubjectName() + "的专业中有已有" + sub1.getStudentNum() + "学生进行了报名");
	}

}
