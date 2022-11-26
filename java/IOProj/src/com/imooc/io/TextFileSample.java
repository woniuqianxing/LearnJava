package com.imooc.io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.Writer;

public class TextFileSample {

	public void readTextFile() {
		Reader reader = null;
		try {
			File file = new File("d:/test.txt");
			reader = new FileReader(file);
			int ch = 0;
			while ((ch = reader.read()) != -1) {
				System.out.print((char) ch);// UTF-8编码集
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

	public void writeTextFile() {
		Writer writer = null;
		try {
			File file = new File("d:/test.txt");
			if (file.exists()) {
				file.createNewFile();
			}
			writer = new FileWriter(file);
			writer.write("这是一个新文件new");
			writer.append(":Append内容");
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		} finally {
			if (writer != null) {
				try {
					writer.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}
	}

	public void isrSample() {
		FileInputStream fis = null;
		InputStreamReader isr = null;
		try {
			File file = new File("d:/test.txt");
			fis = new FileInputStream(file);
			isr = new InputStreamReader(fis, "UTF-8");
			StringBuffer buffer = new StringBuffer();
			// isr.ready()判断后面还有可以读的内容
			while (isr.ready()) {
				buffer.append((char) isr.read());
			}
			System.out.println(buffer.toString());
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (isr != null) {
				try {
					isr.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
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

	public void readBuffer() {
		Reader reader = null;
		BufferedReader br = null;
		try {
			File file = new File("d:/FileSample.java");
			reader = new FileReader(file);
			br = new BufferedReader(reader);
			String line = null;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TextFileSample sample = new TextFileSample();
//		sample.writeTextFile();
//		sample.readTextFile();
//		sample.isrSample();
		sample.readBuffer();
	}

}
