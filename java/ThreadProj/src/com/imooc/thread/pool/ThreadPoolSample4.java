package com.imooc.thread.pool;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ThreadPoolSample4 {

	public static void main(String[] args) {
		// 调度器服务ExecutorService
		// Executors调度器，用来创建线程池
		// ExecutorService用来管理线程池
		// newScheduledThreadPool可调度线程池
		ScheduledExecutorService scheduledThreadPool = Executors.newScheduledThreadPool(5);
		// 延迟1秒执行，每3秒执行一次(使用固定频率执行相应任务)
		scheduledThreadPool.scheduleAtFixedRate(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println(new Date() + "延迟1秒执行，每3秒执行一次");
			}
		}, 1, 3, TimeUnit.SECONDS);
	}
}
