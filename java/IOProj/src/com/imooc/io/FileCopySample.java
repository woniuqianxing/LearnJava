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
		// 涉及到文件操作，首先要获取File对象
		File source = new File("d:/demo.jpg");
		File target = new File("d:/demo1.jpg");
		// 放到外面的原因是，"流"有开才有关
		InputStream fis = null;
		OutputStream fos = null;
		try {
			// 实例化InputStream对象
			fis = new FileInputStream(source);
			// 实例化outputStream对象
			fos = new FileOutputStream(target);
			// 保存字节信息的数组
			byte[] bs = new byte[1024];
			// 用于保存数组的数据长度
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
			// 通过finally快确保fis对象执行close方法
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
