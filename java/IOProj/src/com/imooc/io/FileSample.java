package com.imooc.io;

import java.io.File;
import java.io.IOException;

public class FileSample {

	public static void main(String[] args) {
		//
		File f = new File("d:/b.txt");
		File d = new File("d:/��Ӱ/����/��½");
		try {
			boolean r1 = f.createNewFile();
			// ��ȡ��ǰ�ļ���·��
			System.out.println(f.getPath() + "�ļ������Ƿ�ɹ���" + r1);
			System.out.println(f.getPath() + "�Ƿ���ڣ�" + f.exists());
			System.out.println(f.getPath() + "�ǲ���Ŀ¼��" + f.isDirectory());
			System.out.println(f.getPath() + "�ǲ����ļ���" + f.isFile());
			System.out.println(f.getPath() + "�Ĵ�С��" + f.length());
			System.out.println(f.getPath() + "�Ĵ�С��" + f.getName());
			boolean r2 = f.delete();
			System.out.println(f.getPath() + "�ļ��Ƿ�ɾ���ɹ���" + r2);
			System.out.println(f.getPath() + "�Ƿ���ڣ�" + f.exists());
			boolean r3 = d.mkdirs();
			System.out.println("[" + d.getPath() + "]Ŀ¼�����Ƿ�ɹ���" + r3);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}