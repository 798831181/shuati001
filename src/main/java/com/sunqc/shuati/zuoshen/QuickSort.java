package com.sunqc.shuati.zuoshen;

import java.util.Arrays;

/**
 * 随机快速排序
 * @author sunqc
 */
public class QuickSort {
    public static void sort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        sort(arr, 0, arr.length - 1);
    }

    public static void sort(int[] arr, int l, int r) {
        if (l < r) {
            swap(arr, l + (int) (Math.random() * (r - l + 1)), r);
            int[] partition = partition(arr, l, r);
            sort(arr, l, partition[0] - 1);
            sort(arr, partition[1] + 1, r);
        }
    }

    public static int[] partition(int[] arr, int left, int right) {
        int low = left - 1;
        int high = right;
        int cur = left;
        while (cur < high) {
            if (arr[cur] < arr[right]) {
                swap(arr, ++low, cur++);
            } else if (arr[cur] > arr[right]) {
                swap(arr, --high, cur);
            } else {
                cur++;
            }
        }
        swap(arr, high, right);
        return new int[]{low + 1, high};

    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] testArr = {1, 3, 2, 4, 1, 2, 5, 6, 7};
        System.out.println("Arrays.toString(testArr): " + Arrays.toString(testArr));
        sort(testArr);
        System.out.println("Arrays.toString(sortedArr): " + Arrays.toString(testArr));

    }
}
