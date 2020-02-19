package com.sunqc.javacore.string;

/**
 * 测试是否相等
 *
 * @author SQC
 */
public class TestArr {
    public static void main(String[] args) {
        String str1 = "123";
        String str2 = new String("123");
        int[] arr1 = {1, 0};
        int[] arr2 = {1, 0};
        int[] arr3 = arr2;
        Object[] obj1 = {new Object(), new Object()};
        Object[] obj2 = {new Object(), new Object()};
//        System.out.println("str1 " + str1 == str2);
        System.out.println("str1.equals(str2): " + str1.equals(str2));
        boolean b = str1 == "123";
        System.out.println("str1 == 123: " +b);
//        System.out.println("str1 == str2正确吗？: " + str1 == str2);
        System.out.println("arr1 == arr2: " + (arr1 == arr2));
        System.out.println("arr3 == arr2: " + (arr3 == arr2));
        System.out.println("arr1.equals(arr2): " + (arr1.equals(arr2)));
        System.out.println("obj1 == obj2: " + (obj1 == obj2));
        System.out.println("obj1.equals(obj2): " + (obj1.equals(obj2)));
    }
}
