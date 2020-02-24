package com.sunqc.javacore.base;

import java.util.TreeMap;

/**
 * 测试实例域初始化方式
 */
public class TestBlockInit {
    private int age;
    private String name = "first";
    private static boolean flag ;
    {
        System.out.println("before");
        System.out.println(this.getName() + this.getAge());
        age  = 10;
        name = "test";
        System.out.println("使用块初始化");
        System.out.println(this.getName() + this.getAge());
    }
    static {
        System.out.println("静态初始化块");
        flag = true;
    }

    public TestBlockInit(int age, String name) {
        this.age = age;
        this.name = name;
        System.out.println("使用构造器初始化");
    }

    public TestBlockInit() {
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        TestBlockInit testBlockInit = new TestBlockInit(18,"second");
        System.out.println(testBlockInit.getName()+": "+testBlockInit.age);


    }
}
