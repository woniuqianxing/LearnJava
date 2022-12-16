package com.imooc.thread.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolSample2 {

	public static void main(String[] args) {
		// ����������ExecutorService
		// Executors�����������������̳߳�
		// ExecutorService���������̳߳�
		ExecutorService threadPool = Executors.newCachedThreadPool();// ����һ���ɻ�����̳߳�
		// �ɻ����̳߳ص��ص������޴�����̳߳���û�п��õ��߳��򴴽����п����߳�����������
		for (int i = 0; i < 1000; i++) {
			final int index = i;
			// new Runnable()�Զ�ʵ����һ��������ӿ�
			// ����Ҫ����ֵ��ʱ��ʹ��execute����ִ��Runnable����
			threadPool.execute(new Runnable() {

				@Override
				public void run() {
					// TODO Auto-generated method stub
					System.out.println(Thread.currentThread().getName() + ":" + index);
				}

			});
		}
		threadPool.shutdown();

	}

}