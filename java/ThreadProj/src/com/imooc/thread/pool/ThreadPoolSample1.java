package com.imooc.thread.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolSample1 {
	public static void main(String[] args) {
		// ����������ExecutorService���̶������̳߳�Executors.newFixedThreadPool(10)
		// Executors�����������������̳߳�
		// �����̳߳ص��ص��ǹ̶��߳������������߳�����ִ�������������̶߳���ʹ�ã������������ڵȴ�״̬
		// ExecutorService���������̳߳�
		ExecutorService threadPool = Executors.newFixedThreadPool(10);
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