package com.imooc.lambda;

public class LambdaSample {
    public static void main(String[] args) {
        //1.标准使用方式
        //约束条件：lambda表达式只能实现有且只有一个抽象方法的接口，java称为"函数式接口"
        MathOperation addition=(Integer a,Integer b)->{
            System.out.println("加法运算");
            return a+b+0f;
        };
        System.out.println(addition.operate(5,3));

        //2.Lambda允许忽略参数类型
        MathOperation substraction=(a,b)->{
            return a-b+0f;
        };
        System.out.println(substraction.operate(5,3));

        //3.单行实现代码可以省略大括号和return
        MathOperation multiplication=(a,b)->a*b+0f;
        System.out.println(multiplication.operate(5,3));
    }
}
