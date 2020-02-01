package com.sunqc.shuati.zuoshen;

import java.util.Arrays;

/**
 *  插入排序
 * @author sunqc
 *
 */
public class InsertSort {
    public static int[] insertSort(int[] arr){
        if (arr == null || arr.length < 2) {
            return arr;
        }
        for (int i = 1; i < arr.length; i++) {
            for (int j = i-1; j >= 0; j--) {
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
    // for test
    public static int[] generateRandomArray(int maxSize, int maxValue) {
        int[] arr = new int[(int) ((maxSize + 1) * Math.random())];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) ((maxValue + 1) * Math.random()) - (int) (maxValue * Math.random());
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = generateRandomArray(8, 7);
        System.out.println(Arrays.toString(insertSort(arr)));
    }


}
