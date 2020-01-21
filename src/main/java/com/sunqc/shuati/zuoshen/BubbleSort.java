package com.sunqc.shuati.zuoshen;

import com.sunqc.shuati.utils.Swap;

import java.util.Arrays;

/**
 * 冒泡排序
 *
 * @author sqc
 */
public class BubbleSort {
    public static int[] bSort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return arr;
        }
        for (int end = arr.length - 1; end > 0; end--) {
            for (int i = 0; i < end; i++) {
                if (arr[i] > arr[i + 1]) {
                    Swap.swap(arr, i, i + 1);
//                    int temp = arr[i];
//                    arr[i] = arr[i+1];
//                    arr[i+1] = temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] testArr = new int[]{
                1, 3, 2, 4, 5, 1, 3, 9, 45, 23
        };
        System.out.println(Arrays.toString(BubbleSort.bSort(testArr)));
    }
}
