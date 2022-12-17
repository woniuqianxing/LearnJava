package com.imooc.junit;

public class Caculator {
    public int add(int a,int b){
        return a+b;
    }

    public int subtract(int a,int b){
        return a-b;
    }

    public int multiply(int a,int b){
        return a*b;
    }

    public float divide(int a,int b){
        if (b==0){
            throw new ArithmeticException("除数不能为0");
        }
        return (a * 1f) / b;
    }
}
