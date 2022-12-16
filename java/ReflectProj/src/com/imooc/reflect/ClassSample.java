package com.imooc.reflect;

import com.imooc.reflect.entity.Employee;

public class ClassSample {
    public static void main(String[] args) {
        try {
            //Class.forName()方法将指定的类加载到jvm,并返回对应Class对象
            Class employeeClass=Class.forName("com.imooc.reflect.entity.Employee");
            System.out.println("Employee已被加载到jvm");
            //newInstance通过默认的构造方法创建新的对象
            Employee emp=(Employee)employeeClass.newInstance();
            System.out.println(emp);

        } catch (ClassNotFoundException e) {
            //ClassNotFoundException类不存在异常
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            //￿InstantiationException对象无法被实例化，抛出实例化异常（类使用abstract修饰）
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            //IllegalAccessException非法访问异常，当在作用域外访问对象方法或成员变量时抛出
            throw new RuntimeException(e);
        }

    }
}
