package com.sunqc.shuati.zuoshen;

/**
 * 快速排序
 */
public class QuickSort {
    public static void sort(int[] arr){
        if (arr == null || arr.length < 2) {
            return;
        }

    }
    public static void partition(int[] arr, int num,int left, int right){
        while(left<right){

            while (arr[left]<num){
                left++;
            }
            while (arr[right]>num){
                right--;
            }
            swap(arr,left,right);

        }

    }
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
