package com.sunqc.javacore.ch06;

import java.util.Scanner;

/**
 * 测试局部内部类
 */
public class JuBuInnerClass {
    public void testMethod(){
        class AnInnerClass{
            public void myPrint(){
                System.out.println("this is a jubu inner class");
            }
        }
        AnInnerClass anInnerClass = new AnInnerClass();
        anInnerClass.myPrint();
    }
    public void testMethod2(boolean beep){
        class AnInnerClass{
//            public void myPrint(){
//                System.out.println("this is a jubu inner class");
//            }
            public void beep(){
                if (beep){
                    System.out.println("staring beeping");
                }
            }
        }
        AnInnerClass anInnerClass = new AnInnerClass();
        anInnerClass.beep();
    }

    public static void main(String[] args) {
//        boolean beep ;
        System.out.println("input beep: true or false");
        Scanner scanner = new Scanner(System.in);
        boolean beep = scanner.nextBoolean();
        JuBuInnerClass juBuInnerClass = new JuBuInnerClass();
        juBuInnerClass.testMethod();
        juBuInnerClass.testMethod2(beep);
    }
}
