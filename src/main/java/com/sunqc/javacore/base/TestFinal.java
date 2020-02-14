package com.sunqc.javacore.base;

/**
 * 测试final的用法
 */
public class TestFinal {
    private static final int a = 1;
    private static final int[] testArr = new int[10];
    public static void function(){
//        cannot assign value to final variable
//        a=2;
        int[] arr = {1,2,3};
        testArr[0] = 10;
        testArr[0] = 11;
//        testArr = arr;
    }

    public static void main(String[] args) {
        function();
        System.out.println("a = " + a);
        System.out.println("testArr[0]= " + testArr[0]);
    }
}
