package com.imooc.factory.computershop;

public class Customer {
    public static void main(String[] args) {
        ShopAssistant sbopAssistant = new ShopAssistant();
        Computer c=sbopAssistant.suggest("游戏");
        System.out.println(c.describe());
    }
}
