package com.sunqc.javacore.base;

/**
 * 测试自动包装类
 */
public class TestWarp {
    public static void fun(Integer integer) {
        integer =  2 * integer;
    }

    public static void fun2(int x) {
        x =  2 * x;
    }

    public static void main(String[] args) {
        Integer tInteger = 200;
        int tInt = 200;
         fun2(tInt);
        System.out.println("tInt: "+tInt);
        fun(tInteger);
        System.out.println("tInteger: "+tInteger);
    }
}
