package com.imooc.reflect;

import com.imooc.reflect.entity.Employee;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 利用Method方法类调用
 */
public class MethodSample {
    public static void main(String[] args) {
        try {
            Class employeeClass=Class.forName("com.imooc.reflect.entity.Employee");
            Constructor constructor=employeeClass.getConstructor(new Class[]{
                    Integer.class,String.class,Float.class,String.class
            });
            Employee employee=(Employee)constructor.newInstance(new Object[]{
                    100,"李磊",3000f,"研发部"
            });
            Method updateSalaryMethod=employeeClass.getMethod("updateSalary", new Class[]{
                    Float.class
            });
            Employee employee1=(Employee)updateSalaryMethod.invoke(employee,new Object[]{1000f});
            System.out.println(employee1);
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
        }
    }
}
