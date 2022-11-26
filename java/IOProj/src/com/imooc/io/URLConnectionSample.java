package com.imooc.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class URLConnectionSample {

	public static void main(String[] args) {
		InputStream is = null;
		OutputStream os = null;
		try {
			URL url = new URL("https://www.baidu.com/weixin.jpg");
			URLConnection connection = url.openConnection();
			is = connection.getInputStream();
			os = new FileOutputStream("d:/weixin.jpg");
			byte[] bs = new byte[1024];
			int len = 0;
			while ((len = is.read(bs)) != -1) {
				System.out.println(len);
				os.write(bs, 0, len);
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if (os != null) {
				try {
					os.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (is != null) {
				try {
					is.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

}
