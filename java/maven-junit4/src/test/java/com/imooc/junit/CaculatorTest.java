package com.imooc.junit;

import org.junit.Test;

import static org.junit.Assert.*;

public class CaculatorTest {

    private Caculator cac=new Caculator();

    @Test
    public void add() {
        int result=cac.add(1,2);
        System.out.println(result);
    }

    @Test
    public void subtract() {
        int result=cac.subtract(9,2);
        System.out.println(result);
    }

    @Test
    public void multiply() {
        int result=cac.multiply(2,3);
        System.out.println(result);
    }

    @Test
    public void divide() {
        float result = cac.divide(2,3);
        System.out.println(result);
    }
}