package com.imooc.model;

public class Student {
	// ��Ա���ԣ�ѧ�š����������䡢�Ա�רҵ
	private String studentNo;
	private String studentName;
	private int studentAge;
	private String studentSex;
	private Subject studentSubject;

	// �޲ι���
	public Student() {
	}

	// ���ι��죬ʵ�ֶ�ѧ�š��Ա�����������ĸ�ֵ
	public Student(String studentNo, String studentName, int studentAge, String studentSex) {
		this.setStudentNo(studentNo);
		this.setStudentName(studentName);
		this.setStudentAge(studentAge);
		this.setStudentSex(studentSex);
	}

	// ���ι��죬ʵ�ֶ�ȫ�����Եĸ�ֵ
	public Student(String studentNo, String studentName, int studentAge, String studentSex, Subject studentSubject) {
		this.setStudentNo(studentNo);
		this.setStudentName(studentName);
		this.setStudentAge(studentAge);
		this.setStudentSex(studentSex);
		this.setStudentSubject(studentSubject);
	}

	/**
	 * ��ȡרҵ�������û��ʵ��������ʵ�������ٷ���
	 * 
	 * @return רҵ������Ϣ
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

	// �����������10��С��100����ǿ�Ƹ�ֵΪ18
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

	// �����Ա𣬷���ǿ�Ƹ�ֵΪ��
	public void setStudentSex(String studentSex) {
		if (studentSex != "��" && studentSex != "Ů") {
			this.studentSex = "��";
		} else {
			this.studentSex = studentSex;
		}

	}

	/**
	 * ѧ�����ҽ��ܵķ���
	 * 
	 * @param subjectName     ��ѧרҵ����
	 * @param subjectLifeѧ������
	 * @return
	 */
	public String introduction() {
		String str = "ѧ����Ϣ���£�\n���ƣ�" + this.getStudentName() + "+\nѧ�ţ�" + this.getStudentNo() + "\n�Ա�"
				+ this.getStudentSex() + "\n���䣺" + this.getStudentAge() + "\nרҵ��"
				+ this.getStudentSubject().getSubjectName() + "\n���ޣ�" + this.getStudentSubject().getSubjectLife();
		return str;
	}

	public String introduction(String subjectName, int subjectLife) {
		String str = "ѧ����Ϣ���£�\n���ƣ�" + this.getStudentName() + "+\nѧ�ţ�" + this.getStudentNo() + "\n�Ա�"
				+ this.getStudentSex() + "\n���䣺" + this.getStudentAge() + "\n����רҵ���ƣ�" + subjectName + "\nרҵ���ޣ�"
				+ subjectLife;
		return str;
	}

	public String introduction(Subject mySubject) {
		String str = "ѧ����Ϣ���£�\n���ƣ�" + this.getStudentName() + "+\nѧ�ţ�" + this.getStudentNo() + "\n�Ա�"
				+ this.getStudentSex() + "\n���䣺" + this.getStudentAge() + "\n����רҵ���ƣ�" + mySubject.getSubjectName()
				+ "\nרҵ���ޣ�" + mySubject.getSubjectLife() + "\nѧ�Ʊ�ţ�" + mySubject.getSubjectNo();
		return str;
	}

}
