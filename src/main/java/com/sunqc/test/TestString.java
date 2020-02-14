package com.sunqc.test;

public class TestString {
    private static String string = "test";
    public static void main(String[] args) {
        System.out.println(string);
        string = "123";
        string = "new test";
        System.out.println(string);
    }
}
