package com.imooc.downloader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.Reader;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Downloader {
	private Integer threadNum = 10;

	/**
	 * 下载单个文件保存到本地
	 * 
	 * @param source原图片的地址
	 * @param              targetDir目标目录，要确保已存在
	 */
	public void download(String source, String targetDir) {
		InputStream is = null;
		OutputStream os = null;
		try {
			// 从/+1后面开始截取文件名
			String fileName = source.substring(source.lastIndexOf("/") + 1);
			// 定义目标文件
			File targetFile = new File(targetDir + "/" + fileName);
			if (targetFile.exists()) {
				targetFile.createNewFile();
			}
			// 赋值地址
			URL url = new URL(source);
			// 打开连接
			URLConnection connection = url.openConnection();
			// 输入流
			is = connection.getInputStream();
			// 输出流
			os = new FileOutputStream(targetFile);
			byte[] bs = new byte[1024];
			int len = 0;
			while ((len = is.read(bs)) != -1) {
				os.write(bs, 0, len);
			}
			System.out.println("[INFO]图片下载完毕：" + source + "\n\t ->" + targetFile.getPath() + "("
					+ Math.floor(targetFile.length() / 1024) + "kb)");
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (os != null) {
					os.close();
				}
				if (is != null) {
					is.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * 从指定文件读取下载地址，批量下载网络资源
	 * 
	 * @param targetDir   下载文件的存储目录
	 * @param downloadTxt download.txt完整路径
	 */
	public void multiDownloadFromFile(String targetDir, String downloadTxt) {
		File dir = new File(targetDir);
		// 新建目标目录
		if (!dir.exists()) {
			dir.mkdirs();
			System.out.println("[INFO]发现下载目录[" + dir.getPath() + "]不存在，已自动创建");
		}
		// 读取download.txt存入resources集合
		List<String> resources = new ArrayList<>();
		BufferedReader reader = null;
		ExecutorService threadPool = null;
		try {
			reader = new BufferedReader(new FileReader(downloadTxt));
			String line = null;
			// 读取每一行网址，存入resources集合
			while ((line = reader.readLine()) != null) {
				resources.add(line);
				System.out.println(resources);
			}
			// 利用线程池，同时开启{threadNum}个线程批量下载图片保存到本地
			threadPool = Executors.newFixedThreadPool(this.threadNum);
			Downloader that = this;
			for (String res : resources) {
				threadPool.execute(new Runnable() {

					@Override
					public void run() {
						that.download(res, targetDir);

					}
				});
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// 执行完毕，关闭线程池
			if (threadPool != null) {
				threadPool.shutdown();
			}
			if (reader != null) {
				try {
					// 关闭字节输入流
					reader.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	/**
	 * 开始多线程下载
	 * 
	 * @param propDir config.properties所在目录
	 */
	public void start(String propDir) {
		// 指定config.properties完整路径
		File propFile = new File(propDir + "\\config.properties");
		// 实例化config.properties属性类
		Properties properties = new Properties();
		Reader reader = null;
		try {
			// 实例化FileReader对象
			reader = new FileReader(propFile);
			// properties对象读取配置文件
			properties.load(reader);
			// 通过getProperty方法得到相应的选项值
			String threadNum = properties.getProperty("thread-num");
			this.threadNum = Integer.parseInt(threadNum);
			String targetDir = properties.getProperty("target-dir");
			// 打印输出
//			System.out.println(threadNum);
//			System.out.println(targetDir);
			// 读取download.txt进行多线程下载
			this.multiDownloadFromFile(targetDir, propDir + "\\download.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (reader != null) {
				try {
					// 关闭流
					reader.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	public static void main(String[] args) {

		Downloader downloader = new Downloader();
		downloader.start("V:\\java\\DownloadProj\\src");
//		downloader.download("https://www.baidu.com/xyz.jpg", "d:/a/d");
	}
}
