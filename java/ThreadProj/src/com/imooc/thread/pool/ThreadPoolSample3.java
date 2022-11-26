package com.imooc.thread.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolSample3 {

	public static void main(String[] args) {
		// 调度器服务ExecutorService
		// Executors调度器，用来创建线程池
		// ExecutorService用来管理线程池
		ExecutorService threadPool = Executors.newSingleThreadExecutor();// 单线程线程池
		for (int i = 0; i < 1000; i++) {
			final int index = i;
			// new Runnable()自动实现了一个匿名类接口
			// 不需要返回值的时候，使用execute方法执行Runnable对象
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
