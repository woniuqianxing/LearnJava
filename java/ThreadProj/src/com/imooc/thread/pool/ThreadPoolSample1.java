package com.imooc.thread.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolSample1 {
	public static void main(String[] args) {
		// 调度器服务ExecutorService，固定长度线程池Executors.newFixedThreadPool(10)
		// Executors调度器，用来创建线程池
		// 定长线程池的特点是固定线程总数，空闲线程用于执行任务，如果如果线程都在使用，后续任务则处于等待状态
		// ExecutorService用来管理线程池
		ExecutorService threadPool = Executors.newFixedThreadPool(10);
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
