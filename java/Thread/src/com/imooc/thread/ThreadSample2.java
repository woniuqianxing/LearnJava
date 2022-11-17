package com.imooc.thread;

import java.util.Random;

//通過实现Runnable接口模拟10秒短跑程序
public class ThreadSample2 {
    class Runner implements Runnable{

        //run的重写方法
        @Override
        public void run() {
            //随机生成一个每秒的速度
            Integer speed= new Random().nextInt(10);
            for (int i = 1; i <=10 ; i++) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("第"+i+"秒:"+Thread.currentThread().getName()+"已跑到"+(i*speed)+"米("+speed+"米/秒)");
            }
        }
    }

    public void start(){
        Runner runner = new Runner();
        Thread threadA = new Thread(runner);
        threadA.setName("参赛者A");
        Thread threadB = new Thread(new Runner());
        threadB.setName("参赛者B");
        Thread threadC = new Thread(new Runner());
        threadC.setName("参赛者C");
        threadA.start();
        threadB.start();
        threadC.start();
    }

    public static void main(String[] args) {
        new ThreadSample2().start();
    }
}
