package com.sunqc.javacore.string;

public class TestString {
    public static void main(String[] args) {
        String str1 = "test001";
        String str2 = new String("001");
        boolean b1 = str1.substring(4) == "001";
        System.out.println(str1.substring(4));
        System.out.println("str1.substring(4) == 001: "+ b1);
        boolean b = str1 == "test001";
        System.out.println("str1 == \"test001\"): "+b);
        System.out.println(str1.codePointCount(0, str1.length()));
    }
}
