package com.imooc.spring.ioc.entity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApplication {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
        Apple sweetApple=context.getBean("sweetApple",Apple.class);
        System.out.println(sweetApple.getTitle());
//        context.getBean("sweetApple");
//        context.getBean("sweetApple");
    }
}
