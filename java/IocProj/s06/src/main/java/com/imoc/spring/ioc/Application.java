package com.imoc.spring.ioc;

import com.imoc.spring.ioc.context.ApplicationContext;
import com.imoc.spring.ioc.context.ClassPathXmlApplicationContext;
import com.imoc.spring.ioc.entity.Apple;

public class Application {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext();
        Apple apple =(Apple)context.getBean("sweetApple");
        System.out.println(apple);
    }
}
