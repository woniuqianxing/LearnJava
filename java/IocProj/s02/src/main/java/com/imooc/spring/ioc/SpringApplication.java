package com.imooc.spring.ioc;

import com.imooc.spring.ioc.entity.Apple;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApplication {
    public static void main(String[] args) {
        //初始化IoC容器并实例化对象
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        Apple apple4 =context.getBean("apple4",Apple.class);
        System.out.println(apple4.getTitle());
        Apple apple3=(Apple)context.getBean("apple3");
        System.out.println(apple3.getTitle());
    }
}
