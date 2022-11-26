package com.imooc.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileCopySample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// �漰���ļ�����������Ҫ��ȡFile����
		File source = new File("d:/demo.jpg");
		File target = new File("d:/demo1.jpg");
		// �ŵ������ԭ���ǣ�"��"�п����й�
		InputStream fis = null;
		OutputStream fos = null;
		try {
			// ʵ����InputStream����
			fis = new FileInputStream(source);
			// ʵ����outputStream����
			fos = new FileOutputStream(target);
			// �����ֽ���Ϣ������
			byte[] bs = new byte[1024];
			// ���ڱ�����������ݳ���
			int len;
			try {
				while ((len = fis.read(bs)) != -1) {
					System.out.println(len);
					fos.write(bs, 0, len);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			// ͨ��finally��ȷ��fis����ִ��close����
			if (fis != null) {
				try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

}
