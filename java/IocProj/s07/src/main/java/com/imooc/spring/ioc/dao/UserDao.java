package com.imooc.spring.ioc.dao;

import org.springframework.stereotype.Repository;

//@Repository用于数据持久化，说白了就是增删改查
//组件类型注解默认beanId为类名首字母小写
//beanId=userDao
@Repository("udao")
public class UserDao implements IUserDao{
    public UserDao(){
        System.out.println("正在创建UserDao:"+this);
    }
}
