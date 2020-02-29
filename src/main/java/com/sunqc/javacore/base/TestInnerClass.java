package com.sunqc.javacore.base;

/**
 * 测试内部类
 */
public class TestInnerClass {
    private String string = "test";
    private static final  int anINT = 0;

    public TestInnerClass() {
    }


    public class InnerClass{
//        private final static String innerString = "innerString";
        private final static int index = 0;
        public void fun(){
            System.out.println(string);
        }

        public InnerClass() {
        }

    }
    public void testFun(){
//        anINT = 1;
        InnerClass innerClass = new InnerClass();
        innerClass.fun();
    }

    public static void main(String[] args) {
        TestInnerClass testInnerClass = new TestInnerClass();
//        InnerClass innerClass = new InnerClass();

        testInnerClass.testFun();
    }
}
