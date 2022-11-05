package com.imooc.model;

public class Student {
	// 成员属性：学号、姓名、年龄、性别、专业
	private String studentNo;
	private String studentName;
	private int studentAge;
	private String studentSex;
	private Subject studentSubject;

	// 无参构造
	public Student() {
	}

	// 带参构造，实现对学号、性别、姓名、年龄的赋值
	public Student(String studentNo, String studentName, int studentAge, String studentSex) {
		this.setStudentNo(studentNo);
		this.setStudentName(studentName);
		this.setStudentAge(studentAge);
		this.setStudentSex(studentSex);
	}

	// 带参构造，实现对全部属性的赋值
	public Student(String studentNo, String studentName, int studentAge, String studentSex, Subject studentSubject) {
		this.setStudentNo(studentNo);
		this.setStudentName(studentName);
		this.setStudentAge(studentAge);
		this.setStudentSex(studentSex);
		this.setStudentSubject(studentSubject);
	}

	/**
	 * 获取专业对象，如果没有实例化，先实例化后再返回
	 * 
	 * @return 专业对象信息
	 */
	public Subject getStudentSubject() {
		if (this.studentSubject == null) {
			this.studentSubject = new Subject();
		}
		return studentSubject;
	}

	public void setStudentSubject(Subject studentSubject) {
		this.studentSubject = studentSubject;
	}

	public String getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentAge() {
		return studentAge;
	}

	// 限制年龄大于10，小于100否则强制赋值为18
	public void setStudentAge(int studentAge) {
		if (studentAge < 10 || studentAge > 100) {
			this.studentAge = 18;
		} else {
			this.studentAge = studentAge;
		}
	}

	public String getStudentSex() {
		return studentSex;
	}

	// 限制性别，否则强制赋值为男
	public void setStudentSex(String studentSex) {
		if (studentSex != "男" && studentSex != "女") {
			this.studentSex = "男";
		} else {
			this.studentSex = studentSex;
		}

	}

	/**
	 * 学生自我介绍的方法
	 * 
	 * @param subjectName     所学专业名称
	 * @param subjectLife学制年限
	 * @return
	 */
	public String introduction() {
		String str = "学生信息如下：\n名称：" + this.getStudentName() + "+\n学号：" + this.getStudentNo() + "\n性别："
				+ this.getStudentSex() + "\n年龄：" + this.getStudentAge() + "\n专业："
				+ this.getStudentSubject().getSubjectName() + "\n年限：" + this.getStudentSubject().getSubjectLife();
		return str;
	}

	public String introduction(String subjectName, int subjectLife) {
		String str = "学生信息如下：\n名称：" + this.getStudentName() + "+\n学号：" + this.getStudentNo() + "\n性别："
				+ this.getStudentSex() + "\n年龄：" + this.getStudentAge() + "\n所报专业名称：" + subjectName + "\n专业年限："
				+ subjectLife;
		return str;
	}

	public String introduction(Subject mySubject) {
		String str = "学生信息如下：\n名称：" + this.getStudentName() + "+\n学号：" + this.getStudentNo() + "\n性别："
				+ this.getStudentSex() + "\n年龄：" + this.getStudentAge() + "\n所报专业名称：" + mySubject.getSubjectName()
				+ "\n专业年限：" + mySubject.getSubjectLife() + "\n学科编号：" + mySubject.getSubjectNo();
		return str;
	}

}
