package com.imooc.string;

public class StringBuilderDemo5 {

	public static void main(String[] args) {
		// ����һ���ַ���,"���"
		StringBuilder str = new StringBuilder("���");
		// ����ú����������ݣ����ַ������"��ã�imooc"
//		str.append(',');
//		str.append("imooc");
//		System.out.println("str=" + str);
		System.out.println("str=" + str.append(',').append("imooc"));

		// ���ַ������"��ã�IMOOC"
		/**
		 * ���ַ����� 1.����deleteɾ��mooc,Ȼ���ٲ���MOOC 2.ʹ��replaceֱ���滻
		 */
//		System.out.println("�滻��" + str.delete(4, 8).insert(4, "MOOC"));
		System.out.println("�滻��" + str.replace(4, 8, "MOOC"));
		// ���ַ���,"��ã�imooc"��ȡ����ò����
		System.out.println("�滻��" + str.substring(0, 2));
	}

}