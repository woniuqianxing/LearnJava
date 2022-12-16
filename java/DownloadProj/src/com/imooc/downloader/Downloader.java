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
	 * ���ص����ļ����浽����
	 * 
	 * @param sourceԭͼƬ�ĵ�ַ
	 * @param              targetDirĿ��Ŀ¼��Ҫȷ���Ѵ���
	 */
	public void download(String source, String targetDir) {
		InputStream is = null;
		OutputStream os = null;
		try {
			// ��/+1���濪ʼ��ȡ�ļ���
			String fileName = source.substring(source.lastIndexOf("/") + 1);
			// ����Ŀ���ļ�
			File targetFile = new File(targetDir + "/" + fileName);
			if (targetFile.exists()) {
				targetFile.createNewFile();
			}
			// ��ֵ��ַ
			URL url = new URL(source);
			// ������
			URLConnection connection = url.openConnection();
			// ������
			is = connection.getInputStream();
			// �����
			os = new FileOutputStream(targetFile);
			byte[] bs = new byte[1024];
			int len = 0;
			while ((len = is.read(bs)) != -1) {
				os.write(bs, 0, len);
			}
			System.out.println("[INFO]ͼƬ������ϣ�" + source + "\n\t ->" + targetFile.getPath() + "("
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
	 * ��ָ���ļ���ȡ���ص�ַ����������������Դ
	 * 
	 * @param targetDir   �����ļ��Ĵ洢Ŀ¼
	 * @param downloadTxt download.txt����·��
	 */
	public void multiDownloadFromFile(String targetDir, String downloadTxt) {
		File dir = new File(targetDir);
		// �½�Ŀ��Ŀ¼
		if (!dir.exists()) {
			dir.mkdirs();
			System.out.println("[INFO]��������Ŀ¼[" + dir.getPath() + "]�����ڣ����Զ�����");
		}
		// ��ȡdownload.txt����resources����
		List<String> resources = new ArrayList<>();
		BufferedReader reader = null;
		ExecutorService threadPool = null;
		try {
			reader = new BufferedReader(new FileReader(downloadTxt));
			String line = null;
			// ��ȡÿһ����ַ������resources����
			while ((line = reader.readLine()) != null) {
				resources.add(line);
				System.out.println(resources);
			}
			// �����̳߳أ�ͬʱ����{threadNum}���߳���������ͼƬ���浽����
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
			// ִ����ϣ��ر��̳߳�
			if (threadPool != null) {
				threadPool.shutdown();
			}
			if (reader != null) {
				try {
					// �ر��ֽ�������
					reader.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	/**
	 * ��ʼ���߳�����
	 * 
	 * @param propDir config.properties����Ŀ¼
	 */
	public void start(String propDir) {
		// ָ��config.properties����·��
		File propFile = new File(propDir + "\\config.properties");
		// ʵ����config.properties������
		Properties properties = new Properties();
		Reader reader = null;
		try {
			// ʵ����FileReader����
			reader = new FileReader(propFile);
			// properties�����ȡ�����ļ�
			properties.load(reader);
			// ͨ��getProperty�����õ���Ӧ��ѡ��ֵ
			String threadNum = properties.getProperty("thread-num");
			this.threadNum = Integer.parseInt(threadNum);
			String targetDir = properties.getProperty("target-dir");
			// ��ӡ���
//			System.out.println(threadNum);
//			System.out.println(targetDir);
			// ��ȡdownload.txt���ж��߳�����
			this.multiDownloadFromFile(targetDir, propDir + "\\download.txt");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (reader != null) {
				try {
					// �ر���
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