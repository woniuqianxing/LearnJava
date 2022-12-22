package com.imooc.spring.ioc.bookshop.dao;

public class BookDaoImpl implements BookDao{

    @Override
    public void insert() {
        System.out.println("向Mysql book表插入一条数据");
    }
}
