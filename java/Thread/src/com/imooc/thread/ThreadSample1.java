package com.imooc.thread;

import java.util.Random;

//通過繼承Thread類繼承線程
public class ThreadSample1 {
    //创建内部类
    class Runner extends Thread{
        //Code->Override Methods(快捷键Ctrl+O),重写方法，选择run()自动生成
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
                System.out.println("第"+i+"秒:"+this.getName()+"已跑到"+(i*speed)+"米("+speed+"米/秒)");
            }
        }
    }

    public void start(){
        Runner threadA= new Runner();
        threadA.setName("参赛者A");
        Runner threadB = new Runner();
        threadB.setName("参赛者B");
        Runner threadC = new Runner();
        threadC.setName("参赛者C");
        threadA.start();
        threadB.start();
        threadC.start();
    }
    public static void main(String[] args) {
//        System.out.println("参观者A 10秒跑了100米");
//        System.out.println("参观者B 10秒跑了60米");
//        System.out.println("参观者C 10秒跑了80米");
        new ThreadSample1().start();
    }
}
