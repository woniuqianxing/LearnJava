package com.imooc.thread.pool;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ThreadPoolSample4 {

	public static void main(String[] args) {
		// ����������ExecutorService
		// Executors�����������������̳߳�
		// ExecutorService���������̳߳�
		// newScheduledThreadPool�ɵ����̳߳�
		ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(5);
		// �ӳ�1��ִ�У�ÿ3��ִ��һ��(ʹ�ù̶�Ƶ��ִ����Ӧ����)
		scheduledThreadPool.scheduleAtFixedRate(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println(new Date() + "�ӳ�1��ִ�У�ÿ3��ִ��һ��");
			}
		}, 1, 3, TimeUnit.SECONDS);
	}
}
