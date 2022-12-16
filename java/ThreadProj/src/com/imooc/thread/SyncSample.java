package com.imooc.thread;

public class SyncSample {
	// �ڲ��࣬�������4������
	class Printer {
		// ������
		Object lock = new Object();

		// synchronized�������ʾ
		public void print1() {
			synchronized (lock) {
				// ʵ�ֶ���Ч��
				try {
					Thread.sleep(500);
					System.out.print("��");
					Thread.sleep(500);
					System.out.print("��");
					Thread.sleep(500);
					System.out.print("��");
					Thread.sleep(500);
					System.out.print("��");
					System.out.println();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}

		public synchronized void print2() {
			// ʵ�ֶ���Ч��
			try {
				// Ĭ��ʹ��this�ؼ���
				Thread.sleep(500);
				System.out.print("��");
				Thread.sleep(500);
				System.out.print("��");
				Thread.sleep(500);
				System.out.print("��");
				Thread.sleep(500);
				System.out.print("��");
				System.out.println();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

		public static synchronized void print3() {
			// ʵ�ֶ���Ч��
			try {
				// ��ǰ���class�����ֽ������˭ӵ���ֽ������˭ӵ��ִ�е�Ȩ��
//				Printer.class
				Thread.sleep(500);
				System.out.print("��");
				Thread.sleep(500);
				System.out.print("��");
				Thread.sleep(500);
				System.out.print("��");
				Thread.sleep(500);
				System.out.print("��");
				System.out.println();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	class PrintTask implements Runnable {
		// ����һ����ĳ�Ա����
		public Printer printer;

		@Override
		public void run() {
			// TODO Auto-generated method stub
			printer.print2();
		}

	}

	public void start() {
		Printer printer = new Printer();
		for (int i = 0; i < 10; i++) {
			PrintTask task = new PrintTask();
			task.printer = printer;
			Thread thread = new Thread(task);
			thread.start();
		}
		printer.print2();
	}

	public static void main(String[] args) {
		SyncSample syncSample = new SyncSample();
		syncSample.start();
	}
}