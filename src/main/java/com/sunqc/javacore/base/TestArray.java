package com.sunqc.javacore.base;

import java.util.Arrays;

/**
 * 测试多维数组
 */
public class TestArray {
    public static void main(String[] args) {
//        String s = "test sort";
        String[] strings = {"test","test12","mytest"};
        Arrays.sort(strings,String::compareToIgnoreCase);
        System.out.println(Arrays.toString(strings));
    }
}
