package com.imooc.reflect;

import com.imooc.reflect.entity.Employee;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

/**
 * 利用field对成员变量赋值/取值
 */
public class FieldSample {
    public static void main(String[] args) {
        try {
            Class employeeClass=Class.forName("com.imooc.reflect.entity.Employee");
            Constructor constructor=employeeClass.getConstructor(new Class[]{
                    Integer.class,String.class, Float.class, String.class
            });
            Employee employee=(Employee) constructor.newInstance(new Object[]{
                    100,"李磊",3000f,"研发部"
            });
            Field enameField=employeeClass.getField("ename");
            enameField.set(employee,"李雷");
            String ename=(String)enameField.get(employee);
            System.out.println("ename:"+ename);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
    }
}
