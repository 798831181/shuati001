package com.sunqc.javacore.base;

/**
 * 测试变量
 */
public class TestVariable {
    public static void main(String[] args) {
        int a = 0;
        byte b = (byte) 300;
        System.out.println(a);
        System.out.println(b);
        if (args[0].equals("-g")){
            System.out.println("good bye");
        }
    }
}
