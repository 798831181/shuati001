package com.sunqc.shuati.zuoshen;

import com.sunqc.shuati.utils.Swap;

import java.util.Arrays;

/**
 * 堆排序
 *
 * @author sunqc
 */
public class HeapSort {
    public static void sort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        }
        for (int i = 0; i < arr.length; i++) {
            heapInsert(arr, i, arr[i]);
        }
        int size = arr.length;
        Swap.swap(arr, 0, --size);
        while (size > 0) {
            heapify(arr, 0, size);
            Swap.swap(arr, 0, --size);
        }
    }

    public static void heapInsert(int[] arr, int index, int value) {
        while (index != 0) {
            int parent = (index - 1) / 2;
            if (arr[index] > arr[parent]) {
                Swap.swap(arr, index, parent);
            }
            index = parent;
        }
    }

    public static void heapify(int[] arr, int index, int size) {
        int left = index * 2 + 1;
        while (left < size) {
            int largest = left + 1 < size && arr[left] < arr[left + 1] ? left + 1 : left;
            if (arr[largest] < arr[index]) {
                break;
            }
            Swap.swap(arr, index, largest);
            index = largest;
            left = index * 2 + 1;
        }
    }

    /**
     * for test
     */
    public static void testHeapInsert() {
        int[] testArr = {1, 2, 3, 4, 5};
        for (int i = 0; i < testArr.length; i++) {
            heapInsert(testArr, i, testArr[i]);
        }
        System.out.println(Arrays.toString(testArr));
    }

    public static void main(String[] args) {
//        testHeapInsert();
        int[] testArr = {1, 12, 3, 14, 5};
        sort(testArr);
        System.out.println(Arrays.toString(testArr));
    }
}
