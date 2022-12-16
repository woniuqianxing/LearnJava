package com.imooc.lambda;

import java.util.function.Consumer;

/**
 * Consumer接口的使用
 */
public class ConsumerSample {
    public static void main(String[] args) {
        output(s -> System.out.println("向控制台打印："+s));
        output(s -> {
            System.out.println("向xxx网站发送数据包:"+s);
        });
    }
    public static void output(Consumer<String> consumer){
        String text="天将大人于斯人也";
        consumer.accept(text);
    }
}
