package com.sunqc.shuati.utils;

/**
 * 交换两个数
 *
 * @author SQC
 */
public class Swap {
    public static void swap(int[] arr,int  v1, int v2) {
        int temp =arr[v1];
        arr[v1] = arr[v2];
        arr[v2] = temp;
    }
}
